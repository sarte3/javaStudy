package ch12_thread;

//Runnable 인터페이스를 구현해서 정의하기
public class ThreadEx02 {

	public static void main(String[] args) {
		
		//Thread(Runnable target, String name)
		YourThread your=new YourThread();
		
		Thread yourThread = new Thread(your, "너의 스레드");
		//YourThread 클래스 자체가 Thread클래스가 아니므로
		//Thread 클래스의 생성자를 이용해서
		//스레드 객체를 생성한다
		
		yourThread.start();
		
	}

}

//Runnable 인터페이스를 구현해서 정의하기
//Runnable 인터페이스에는 void run() 메서드만이 있다
//아래의 클래스는 Runnable 인터페이스를 구현하는 클래스
class YourThread implements Runnable{
	
	public YourThread() {}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=20;i++) {
			//public static Thread currentThread() : 현재 실행중인 스레드를 리턴
			//.getName() : 현재 실행중인 스레드의 이름
			System.out.print(Thread.currentThread().getName());
			try {
				Thread.sleep(300); //300밀리초동안 실행을 중지
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print(" run()~~~~");
			
			System.out.println();
		}
	}
	
}