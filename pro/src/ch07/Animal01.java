package ch07;

// 추상클래스
// (실체)클래스들의 공통적인 특성(필드, 메서드)을 추출해서 선언한 클래스
public abstract class Animal01 {

	//field
	public String type;
	
	//constructor
	
	//abstract method
	//method - [public|protected]  abstract 리턴유형 메서드명([매개변수리스트]);
	//움직이다
	public abstract void move();
	
	//소리내다
	public abstract void sound();
	
	//일반 method
	public void breath() {
		System.out.println("숨쉬기");
	}
	
}
