package ch15_network;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

//UDP 통신
//Client 역할을 하는 클래스
public class ClientUDP {

	public static void main(String[] args) throws Exception {
		
		DatagramSocket datagramSocket = new DatagramSocket(); //DatagramSocket 생성
		
		System.out.println("[클라이언트가 발신 시작합니다]");
		
		for(int i=0;i<5;i++) {
			String data = "서버야"+i;
			byte[] byteArr = data.getBytes("UTF-8");
			/*DatagramPacket 생성
			 * new DatagramPacket(byte[] 보낼데이터, 
			 * byte[]에서 보내고자 하는 항목 수
			 * 만약 전체 항목을 보내고 싶다면 byte[].length를 사용
			 * ,수신자 IP와 port정보를 가지고 있는 SocketAddress
			 * SocketAddress는 추상클래스이므로 
			 * 하위클래스인 InetSocketAddress 객체를 생성해서 대입);
			 */
			DatagramPacket packet = new DatagramPacket(byteArr,byteArr.length,new InetSocketAddress("localhost",7777));
			
			//생성한 DatagramPacket을 보낸다
			datagramSocket.send(packet);
			System.out.println("[보낸 byte 수 : ]"+byteArr.length+"(byte)");
		}
		System.out.println("[발신 종료]");
		
	}

}
