package ch15_network;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

//UDF 통신
/* TCP 소켓 프로그래밍에서는 Socket과 ServerSocket을 사용하지만
 * UDP 소켓 프로그래밍에서는 DatagramSocket과 DatagramPacket을 사용
 * UDP는 연결지향적이지 않으므로 연결요청을 받아줄 서버 소켓이 필요없다
 * DatagramSocket간에 데이터(DatagramPacket)를 주고 받는다.
 */

//데이터를 주로 받는 쪽 => Server 역할을 하는 클래스
public class ServerUDP extends Thread {

	public static void main(String[] args) throws Exception {

		DatagramSocket datagramSocket = new DatagramSocket(7777);
		
		Thread thread = new Thread() {

			@Override
			public void run() {
				System.out.println("[서버입니다 : 수신 시작..]");
				
				try {
					while(true) { //수신자는 항상 데이터를 받을 준비가 되어 있어야 하므로 반복문을 사용
						//DatagramPacket(읽은 패킷 데이터를 저장할 바이트배열, int 읽을 수 있는 최대 바이트 수)
						//두번째 아규먼트는 첫 번째 배열의 크기와 같거나 또는 작아야 한다
						//일반적으로 첫 번째 바이트배열의 크기를 준다
						DatagramPacket packet = new DatagramPacket(new byte[100], 100);
						
						datagramSocket.receive(packet); //패킷 받기
						
						//읽어들인 bytes를 문자열로 변환
						//byte[] packet.getData(); : Returns the data buffer. The data received or the data to be sent starts from the offset in the buffer, and runs for length long.
						
						String data = new String(packet.getData(), 0 , packet.getLength(),"UTF-8");
						
						//콘솔에 출력
						System.out.println("[클라이언트로부터 받은 내용 : "+data+"]");
						
					}//while
					
				} catch (Exception e) {
					System.out.println("[서버입니다: 수신 종료]");
					
				}	
					
			}//run
			
		};
		
		
		thread.start(); //스레드 시작 - run() 호출
		
		Thread.sleep(10000);//10초가 지나면
		
		datagramSocket.close(); //수신 종료
		
		
	}

}
