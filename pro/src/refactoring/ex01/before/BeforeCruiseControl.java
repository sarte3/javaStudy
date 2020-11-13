package refactoring.ex01.before;

//매직 넘버를 (기호)상수로 치환
//매직 넘버란? 소스 코드에 특정한 값을 가진 숫자

//리팩토링의 기준 : 매직 넘버
//개선 방법 : 매직넘버를 기호상수로 치환

//이 클래스는 크루즈를 제어하는 기능을 가진 클래스이다 라고 가정..
class CruiseControl {
	//field
	private double targetSpeedKmh;
	
	void setPreset(int speedPreset) {
		if(speedPreset==2) {
			setTargetSpeedKmh(10940);
		}else if(speedPreset==1) {		
			setTargetSpeedKmh(10000);
		}else if(speedPreset==0) {
			setTargetSpeedKmh(15000);
		}
	}
	
	//method
	void setTargetSpeedKmh(double speed) {
		targetSpeedKmh = speed;
		System.out.println(targetSpeedKmh+"으로 선 설정 완료");
	}
}

public class BeforeCruiseControl {

	public static void main(String[] args) {

		CruiseControl cruise = new CruiseControl();
		
		cruise.setPreset(2);
		cruise.setPreset(1);
		cruise.setPreset(0);
		
	}

}
