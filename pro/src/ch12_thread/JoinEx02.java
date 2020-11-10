package ch12_thread;

import java.util.ArrayList;

//join()
/*스레드를 여러 개 동시에 실행할 때는
 * 어떤 스레드가 실행될지 정확히 제어하기 힘들다
 * 따라서 특정한 스레드가 전부 실행된 후에 다른 스레드가 실행되게 하려면 일정한 처리를 해야 한다
 * 이럴 때 사용하는 메서드가 join()
 *  join() : join()메서드를 호출한 스레드 작업이 모두 끝날 때까지
 *  다른 스레드가 대기하게 하는 기능을 제공
 */

//이 예제에서는 객체 2개를 생성 후 동시에 실행
//join을 적용한 멀티 스레드
public class JoinEx02 {
	
	public static ArrayList<String> carList = new ArrayList<String>();

	public static void main(String[] args) {

		BeforeThread2 bt = new BeforeThread2("비포스레드");
		AfterThread2 at = new AfterThread2("에프터스레드");
		
		bt.start();
		try {
			bt.join(); //추가
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		at.start();
		
	}

}

//목록에 자동차명을 추가
class BeforeThread2 extends Thread{

	public BeforeThread2(String name) {
		super(name);
	}

	private void addCar() {
		System.out.println("addCar() 진입");
		JoinEx02.carList.add("차1");
		JoinEx02.carList.add("자동차2");
		JoinEx02.carList.add("자동차3");
		JoinEx02.carList.add("자동차4");
		JoinEx02.carList.add("자동차5");
		
	}
	
	@Override
	public void run() {
		System.out.println(currentThread().getName()+"의 run() 호출 성공");
		try {
			sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		addCar();
	}
	
}

//자동차명 목록을 출력
class AfterThread2 extends Thread{
	
	public AfterThread2(String name) {
		super(name);
	}

	@Override
	public void run() {
		System.out.println(currentThread().getName()+"의 run() 호출 성공");
		
		ArrayList<String> carList = JoinEx02.carList;
		for(int i=0;i<carList.size();i++) {
			System.out.println(carList.get(i));
		}
	}
	
}