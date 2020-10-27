package ch11.polymorphism;

public class HankookTire extends Tire01 {

	//field
	/*
	 * public int maxRotation; //최대회전수(=>타이어의 수명) 
	 * public int accumulatedRotation; //누적회전수
	 * public String location; //타이어의 위치 1:앞왼쪽 2:앞오른 3:뒤왼 4:뒤오른
	 */
	
	//constructor
	public HankookTire() {}
	
	public HankookTire(String location, int maxRotation) {
		//this() 자기 자신을 가리키는 생성자를 호출
		//super() 조상클래스의 생성자를 호출, 
		//반드시 생성자의 첫번째 라인에서 작성해야 함
		super(location, maxRotation);
		//super.location=location;
		//super.maxRotation=maxRotation;
	}
	
	//method
	@Override
	public boolean roll() {
		++accumulatedRotation; //호출될 때마다 1씩 회전수 누적 증가
		if(accumulatedRotation<maxRotation) {
			//누적회전수<최대회전수 : 정상적으로 타이어가 roll 상태
			System.out.println(location+" 한국Tire 수명 : "+(maxRotation-accumulatedRotation));
			return true;
		}else { //누적회전수==최대회전수 : 펑크났어요
			System.out.println("** "+location+" 한국Tire가 펑크 **");
			return false;
		}
	}
	
}
