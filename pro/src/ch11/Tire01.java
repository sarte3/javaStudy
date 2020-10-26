package ch11;

//이 클래스의 direct subclass로 HankookTire, KumhoTire가 있다
public class Tire01 {
	
	//field
	public int maxRotation; //최대회전수(=>타이어의 수명)
	public int accumulatedRotation; //누적회전수
	public String location; //타이어의 위치 1:앞왼쪽 2:앞오른 3:뒤왼 4:뒤오른
	
	//constructor
	public Tire01() {}

	public Tire01(String location, int maxRotation) {
		this.location=location;
		this.maxRotation=maxRotation;
	}
	
	//method
	public boolean roll() {
		++accumulatedRotation; //호출될 때마다 1씩 회전수 누적 증가
		if(accumulatedRotation<maxRotation) {
			//누적회전수<최대회전수 : 정상적으로 타이어가 roll 상태
			System.out.println(location+" Tire 수명 : "+(maxRotation-accumulatedRotation));
			return true;
		}else { //누적회전수==최대회전수 : 펑크났어요
			System.out.println("** "+location+"Tire가 펑크 **");
			return false;
		}
	}
	
}
