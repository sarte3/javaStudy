package ch07;

//자동타입변환 된 이후에는 부모클래스에 선언된 필드, 메소드만 접근가능하다
//변수가 자식 객체를 참조하지만 변수로 접근 가능한 멤버는 부모 클래스 멤버로 한정된다
//예외적으로 자식클래스에서 메소드가 오버라이딩되었다면
//자식클래스의 메소드가 (부모클래스에 선언된 메소드 대신에) 호출된다 => Child01, Parent01 참고

public class Child_ex01 {

	public static void main(String[] args) {

		Child01 child = new Child01();
		
		//자동타입 변환
		//부모클래스 참조변수 = 자식객체;
		Parent01 parent = child;
		
		//parent 변수가 자식 객체(child)를 참조하지만 
		//변수로 접근 가능한 멤버는 부모 클래스(parent) 멤버로 한정된다
		parent.m1();
		
		//예외적으로 자식클래스에서 메소드가 오버라이딩되었다면
		//자식클래스의 메소드가 (부모클래스에 선언된 메소드 대신에) 호출된다
		parent.m2();
		
		//parent.m3() //X, 컴파일 에러: 부모클래스 멤버만 참조할 수 있으므로
		//The method m3() is undefined for the type Parent01
		
		GrandChild01 grandChild = new GrandChild01();
		
		parent = grandChild; 
		//계층 추적. 자바는 단일상속만을 허용하므로 계층추적이 가능
		
		parent.m1(); //부모클래스 Parent01의 m1()
		parent.m2(); //GrandChild01에서 오버라이딩한 m2()가 출력
		//parent.m3(); //컴파일 에러
		//The method m3() is undefined for the type Parent01
		//참조변수가 부모클래스이므로 부모클래스의 멤버만 사용가능
		
	}

}
