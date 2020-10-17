package ch06;

//자동차 클래스를 사용하게 되는 실행 클래스
//main method를 가진 클래스
public class Car01_ex01 {

	public static void main(String[] args) {
		
		//데이터타입 변수명;
		//new 클래스명();
		
		//클래스명타입 참조변수명 = new 클래스명();
		//new 키워드를 사용해서 생성되는 것은 heap 영역에 저장되고
		//heap 영역에 접근하려면 변수가 필요하다
		//이러한 변수를 담는다 해서 참조변수라고 하고
		//데이터타입 부분은 heap영역에 생기는 것을 기본적으로 나타내므로
		//heap타입이라고도 함
		
		//자동차 클래스(Car01)로부터 객체를 생성
		Car01 car01 = new Car01();
		System.out.println("car01 = "+car01);
		
		
		//필드값 가져와서 출력
		//변수의 자동초기화
		System.out.println("변경전 기본 car01.color = "+car01.color);
		System.out.println("car01.maker = "+car01.maker);
		System.out.println("car01.maxSpeed = "+car01.maxSpeed);
		System.out.println("car01.price = "+car01.price);
		System.out.println("car01.makeDay = "+car01.makeDate);
		System.out.println("car01.maxKGM = "+car01.maxKGM);
		System.out.println("car01.speed = "+car01.speed);
		
		//색상 변경
		//필드값 변경 - 객체에 접근할 때는 반드시 주소를 참조해야 한다
		//참조변수명.필드명 = 새값;
		car01.color="black";
		
		//메소드호출
		//참조변수명.메소드명();
		car01.move();
		
		System.out.println("변경후 car01.color = "+car01.color);
		
		System.out.println();
		System.out.println("-------------------------------");
		System.out.println();
		
		Car01 car02 = new Car01();
		System.out.println("car02 = "+car02);
		
		System.out.println("car02.color = "+car02.color);
		System.out.println("car02.maxSpeed = "+car02.maxSpeed);
		System.out.println("car02.makeDay = "+car02.makeDate);
		System.out.println("car02.maxKGM = "+car02.maxKGM);
		
		
	}

}
