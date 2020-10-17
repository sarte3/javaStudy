package ch03_operator;

public class Ex03 {

	public static void main(String[] args) {
		//Math.round(double a) 소수점 첫째 자리 기준 반올림
		double pi = 3.14;
		pi = 1.123;
		pi = -1.12;
		
		//고정된 변수 - final 변수 - 상수 (모두 대문자로)
		System.out.println("Math.PI = "+Math.PI);
		//Math.PI=1.123; //The final field(클래스가 가지는 변수) Math.PI cannot be assigned
		long r1 = Math.round(Math.PI);
		System.out.println("r1 = "+r1);
	}

}
