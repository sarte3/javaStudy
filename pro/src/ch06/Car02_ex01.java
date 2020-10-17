package ch06;

//자동차 클래스로부터 객체를 생성하여 실행하는 클래스
public class Car02_ex01 {

	public static void main(String[] args) {

		//자동차 클래스로부터 객체를 생성(인스턴스화)
		Car02 car1=new Car02();
		
		//field 값 가져오기 => 참조변수명.필드명 
		//company 변수는 인스턴스 변수이므로 
		//인스턴스 생성 후 '참조변수명.인스턴스변수명'으로 접근해야 한다
		System.out.println("car1.company = "+car1.company);
		System.out.println("car1.model = "+car1.model);
		//자동초기화에 의해 char 타입은 공백
		System.out.println("car1.color = "+car1.color);
		System.out.println("car1.maxSpeed = "+car1.maxSpeed);
		
		//field값 변경하기 => 참조변수명.필드명 = 값;
		car1.color='R';
		
		System.out.println("car1.color 변경 후 = "+car1.color);
		
		
		//Math.PI는 Math클래스의 클래스변수(=static 변수)이다
		//static으로 선언된 필드와 메소드는 객체를 생성하지 않고도
		//클래스명.필드명(메소드명) 으로 접근할 수 있다
		//참고 Math클래스의 모든 field와 method는 static
		System.out.println(Math.PI);
		
		//Math.random()은 Math클래스의 static 메소드이다.
		System.out.println(Math.random());
		
		//(실행클래스에서 선언한)메소드 호출 -> 메소드명();
		//인스턴스 메소드호출 -> 참조변수명.메소드명();
		car1.abc();
		car1.qwe();
		
		//-----------------------------------------
		//static 변수 호출 : 클래스명.변수명;
		System.out.println("Car02.wheel="+Car02.wheel);
		
		
	}

}
