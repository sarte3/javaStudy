package ch02_variable;

//타입 byte1 < short2 < int4 < long8
public class Ex05 {

	public static void main(String[] args) {
		
		int v = 10;
		long v0 = 10; //int형 10 데이터가 long 타입 변수로 자동 형변환
		
		//long 타입 변수를 초기화할 때는 정수값 뒤에 소문자 l 또는 대문자 L을 붙일 수 있다
		//4byte 정수 데이터가 아니라 8byte 정수 데이터임을 알려준다
		//int 타입의 저장 범위를 넘어서는 큰 정수에서는 l,L을 붙여야 한다
		long v1 = 10l; //long v1=10; int형이 기본이지만 long이 더 크므로 자동형변환 됨 
		long v2 = 10L;
		
		//---------------------------------
		//자동형변환 : 작은 크기타입이 큰 크기타입으로 저장될 때
		byte b1 = 10;
		int i1 = b1; //byte타입 b1이 int형으로 자동 형변환
		System.out.println("i1 = "+i1); //i1=10
		
		char c1 = '가';
		i1 = c1; //2byte인 char -> int
		System.out.println("i1 = "+i1); //i1=44032
		
		i1 = 500; 
		long l1 = i1; //int -> long
		System.out.println("i1 = "+i1); //i1=500
		
		i1 = 200;
		double d1 = i1; //int -> double
		System.out.println("i1 = "+i1); //i1=200
		System.out.println("---------------------------");
		//---------------------------------
		//강제형변환 : 큰 크기타입의 데이터를 작은 크기타입으로 강제로 저장할 때
		// 작은타입 변수=(강제형변환타입)변수
		// 값의 손실이 발생될 수 있으므로 주의
		int i2 = 44032;
		char c22=(char)i2;
		System.out.println("i2="+i2); //44032
		System.out.println("(char)i2="+c22); //가
		
		long l22 = 500;
		i2 = (int)l22;
		System.out.println("i2="+i2); //500
		
		double p = 3.14;
		float f = (float)p;
		System.out.println("f = "+f); //3.14
		
		i2 = (int)p;
		System.out.println("i2 = "+i2); //3 값의 손실이 발생
		
		float a = -10; //정수값을 float타입 변수에 할당 - 자동 형변환
		//음수 10.0을 정수에 변수에 할당
		// int a = -10.0; //Type mismatch: cannot convert from double to int
		int a2 = (int)-10.0; //강제 형변환
		double a3 = -10.0; //double 타입값을 double 형 변수에 할당
		float a4 = (float)-10.0; //double 타입값을 float 타입으로 강제 형변환
		a4 = -10.0f; //리터럴 형변환
		
	}

}
