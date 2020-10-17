package ch06;

//계산기 기능을 실행하는 클래스
//메소드의 선언과 구현 - 교재 p.252
//메소드의 호출 - 교재 p.254
//return문 - 교재 p.258
public class Calculator01_ex01 {

	public static void main(String[] args) {
		//Calculator01 클래스의 객체를 생성 및 변수에 할당
		Calculator01 c1=new Calculator01();
		
		c1.a();
		
		//계산기 전원을 켜세요
		c1.powerOn();
		
		//Calculator01 클래스의 divide() 호출하여
		//메소드의 리턴값을 받아 result에 저장
		double result=c1.divide(10, 3); //3.0
		
		//출력
		System.out.println("result = "+result);
		
		//임의 숫자 더하기 기능을 수행하세요
		byte x = 10;
		byte y = 90;
		int r1 = 0;
		r1 = c1.add(x, y);
		System.out.println("r1 = "+r1);
		
		//실수끼리의 더하기 연산 수행
		double r2=c1.add(10.9, Math.PI);
		
		System.out.println("r2 = "+r2);
		
		//전원을 끄세요
		c1.powerOff();
	}

}
