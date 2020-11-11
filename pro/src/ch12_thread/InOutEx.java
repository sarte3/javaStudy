package ch12_thread;

/*고객의 수가 제한된 식당 프로그램이라고 가정하자
 * 식당에서 자리가 비면 고객을 다시 채우는 작업을 구현
 * 만약에 고객의 수가 꽉 채워져있는데 고객을 더 들이면 안된다
 * 식당이 허용할 수 있는 인원이 채워지면 
 * 손님을 채우는 스레드를 wait() 메서드를 호출해서 waiting pool에 대기시키는 방법을 사용 
 */

//이 클래스는 손님이 들어오고 나가는 기능을 정의한 클래스를 사용하는 클래스
public class InOutEx {

	public static int MAX_GUEST = 5; //최대 고객 수
	int guestNum = 0; //현재 고객의 수
	
	public synchronized void inGuest() {
		System.out.println("Guest 입장하십니다");
		guestNum++;
		System.out.println("현재의 손님 수 : "+guestNum);
		if(guestNum==MAX_GUEST) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public synchronized void outGuest() {
		if(guestNum<1) {
			notify();
			return;
		}
		guestNum--;
		System.out.println("Guest, 안녕히 가세요. 또 오세요. 현재의 손님 수 : "+guestNum);
	}
	
	public static void main(String[] args) {
		
		InOutEx io = new InOutEx();
		InGuestThread igt = new InGuestThread(io);
		OutGuestThread ogt = new OutGuestThread(io);
		
		igt.start();
		ogt.start();
		
	}

}
