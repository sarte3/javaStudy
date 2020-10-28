package ch07;

/*추상클래스- 교재p375
	- 추상 : 실체간의 공통되는 특성을 추출
	- 실체클래스 : 객체를 직접 생성할 수 있는 클래스
	- 추상클래스 : (실체)클래스들의 공통적인 특성(필드,메서드)을 추출해서 선언한 클래스
		=>추상클래스와 실체클래스는 상속관계.
		=>class 실체클래스  extends  추상클래스
		==> 따라서 실체클래스는 추상클래스의  모든 필드,메서드를  물려받고
						 필요시  추가적인 특성을 가질 수 있다
		추상클래스는 			실체클래스의 	 공통적인 특성만을 추출해서 만들었기 때문에
		직접 생성해서 사용할 수 없다. => new 연산자를 사용해서   인스턴스를 생성시키지 못한다.
*/
//The type Phone01 must be an abstract class to define abstract methods
public abstract class Phone01 {

	//field
	public String owner;
	
	//constructor
	public Phone01(String owner) {
		this.owner = owner;
	}
	
	//추상메서드 body {} 몸체가 없는 메서드
	//This method requires a body{구현부} instead of a semicolon
	//public abstract void a();
	
	//method 추상클래스는 일반 method를 가질 수 있다
	public void turnOn() {
		System.out.println("Phone의 전원 On");
	}
	
	public void turnOff() {
		System.out.println("Phone의 전원 Off");
	}
}
