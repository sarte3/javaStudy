package ch07;

//실행 클래스
//추상 클래스의 객체를 생성하지 못하므로
//추상 클래스의 기능, 필드를 사용하고 싶다면
//그것을 상속받는 실체 클래스의 객체를 생성해서 사용
public class Phone01_ex {

	public static void main(String[] args) {

		//Cannot instantiate the type Phone01
		//Phone01 ph = new Phone01("내거");
		//Phone01의 생성자를 호출해서 객체를 생성할 수 없다
		
		SmartPhone01 ph= new SmartPhone01("내거");
		ph.turnOn(); //부모(추상)Phone01 클래스의 메서드 호출
		ph.internet(); //SmartPhone01 클래스의 메서드 호출
		ph.turnOff();
		
	}

}
