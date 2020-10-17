package ch06;

//계산기 클래스
//메소드 선언
public class Calculator01 {
	//field
	
	//constructor
	
	//method
	//[접근제어자] [속성] 리턴유형 메소드명(매개변수리스트)
	
	void a() {
		System.out.println("a()");
		b();
	}
	
	void b() {
		System.out.println("b()");
	}
	
	//전원켜기
	void powerOn(){
		System.out.println("powerOn() 호출 성공 - 전원을 켭니다");
	}
	
	//전원끄기
	void powerOff(){
		System.out.println("powerOff() 호출 성공 - 전원을 끕니다");
	}
	
	//정수 더하기
	int add(int x, int y) {
		//return 값;
		//return x+y; return 계산식;
		//return 변수명;
		int result=0;
		result=x+y;
		return result;
	}
	
	//실수 더하기
	double add(double x, double y) {
		double result=0.0;
		result=x+y;
		return result;
	}
	
	//나누기 divide 정수 2개를 받아서 첫번째 파라미터값을 2번째 파라미터값으로 나눈 몫을 리턴하는 함수
	double divide(int num1, int num2) {
		double result=0.0;
		result = num1/num2;
		return result;
	}
	
	//method overloading 교재 p.283 참고
	//원칙적으로 동일 클래스 내 메소드명이 동일할 수 없다
	//하지만 매개변수의 타입,개수,순서가 다르면 선언 가능
	double divide(int num1, double num2) {
		double result=0.0;
		result = num1/num2;
		return result;
	}
	
	//method overloading
	//앞에서 선언한 divide와는 매개변수의 순서가 다르다
	double divide(double y, int x) {
		return 0.0;
	}
}
