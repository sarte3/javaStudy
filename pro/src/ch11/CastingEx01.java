package ch11;

/* *강제타입변환(Casting)
 - 부모타입을 자식 타입으로 변환하는 것을 말한다.
 주의. 자식타입->부모타입->자식타입
 자식타입이 부모타입으로 자동 변환한 후, 부모클래스 obj = new 자식클래스();
 다시 자식클래스 타입으로 변환할 때		(자식클래스)obj
 강제 타입 변환을 사용할 수 있다.		자식클래스 참조변수=(자식클래스)obj;
 */
public class CastingEx01 {

	public static void main(String[] args) {

		//자식타입->부모타입->자식타입
		//자식타입->부모타입 : 자동형변환
		Parent02 parent= new Child02();
		
		//부모 클래스의 멤버에만 접근 가능
		parent.field = "새값";
		parent.m1(); //Parent02의 m1()
		parent.m2(); //Parent02의 m2()
		//parent.m3(); 컴파일 에러
		
		//부모타입->자식타입 : 강제타입변환
		Child02 child1 = (Child02)parent;
		//Child02 child1 = parent x
		child1.m3(); //자식클래스의 m3()
		child1.field2 = "차일드";
		
		child1.m1(); //Parent02의 m1()
		child1.field="~~~";

	}

}

class Parent02{
	
	public String field;
	
	public void m1() {
		System.out.println("Parent02의 m1()");
	}
	
	public void m2() {
		System.out.println("Parent02의 m2()");
	}
	
}

class Child02 extends Parent02{
	
	public String field2;
	
	public void m3() {
		System.out.println("자식클래스의 m3()");
	}
	
}