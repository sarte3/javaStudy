package ch11;

public class KumhoTire extends Tire01 {

	//field
	
	//constructor
	public KumhoTire() {}
	
	public KumhoTire(String location, int maxRotation) {
		super(location,maxRotation);
	}

	//method
	@Override
	public boolean roll() {
		++accumulatedRotation; //호출될 때마다 1씩 회전수 누적 증가
		if(accumulatedRotation<maxRotation) {
			//누적회전수<최대회전수 : 정상적으로 타이어가 roll 상태
			System.out.println(location+" 금호Tire 수명 : "+(maxRotation-accumulatedRotation));
			return true;
		}else { //누적회전수==최대회전수 : 펑크났어요
			System.out.println("** "+location+" 금호Tire가 펑크 **");
			return false;
		}
	}
}
