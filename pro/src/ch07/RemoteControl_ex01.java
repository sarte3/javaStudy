package ch07;

//이 클래스는 RemoteControl 인터페이스의 구현클래스들의 객체를 생성하여 실행하는 클래스
/* 인터페이스 구현객체 사용법
 * 인터페이스 변수;
 * 변수 = 구현 객체; 
 * 또는
 * 인터페이스 변수 = 구현 객체;
 */
public class RemoteControl_ex01 {

	public static void main(String[] args) {

		//인터페이스 변수;
		RemoteControl rc=null;
		
		//변수 = 구현객체;
		//=>TV 객체를 인터페이스 타입에 대입
		rc = new TV();
		//인터페이스의 turnOn()과 turnOff() 호출 
		//=>실제 구현은 실체클래스 TV의 실체메서드가 동작
		rc.turnOn();
		rc.setMute(true);
		rc.turnOff();
		
		//인터페이스의 turnOn()과 turnOff() 호출
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(-10);
		rc.setVolume(5);
		rc.setVolume(100);
		rc.turnOff();
		System.out.println();
		
		//인터페이스에서 정의된 정적 메서드 사용
		RemoteControl.changeBattery();
		
		//디폴트 메서드 사용
		//인터페이스타입변수.메서드명();
		//디폴트 메서드가 실체클래스에서 오버라이딩 되었다면
		//실체 객체의 오버라이딩된 메서드가 호출된다
		rc.setMute(true);
		
		
	}

}
