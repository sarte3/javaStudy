package ch06;

//Korean01 클래스의 객체를 생성하여 실행하는 클래스
public class Korean01_ex01 {

	public static void main(String[] args) {
		
		//Korean01 클래스로부터 객체 생성
		Korean01 k1=new Korean01(); //기본생성자를 호출
		
		//필드값을 출력
		//System.out.println(k1.nation);
		//System.out.println(k1.age);
		
		//매개변수 1개짜리 생성자 호출
		//매개변수의 타입, 개수, 순서에 맞는 생성자가 자동으로 호출된다
		Korean01 k2=new Korean01("홍길동1");
		Korean01 k3=new Korean01(24);
		
		
		//매개변수 2개짜리 생성자 호출
		Korean01 k4=new Korean01("홍길동2", "830403-1234567");
		
		//매개변수 3개짜리 생성자 호출
		Korean01 k5=new Korean01("홍길동3", "890302-1342344", 30);
		
		//k2 객체의 이름개명하기
		k2.setName("김아무개");
		
		//k2 객체의 이름 가져오기
		String n=k2.getName();
		System.out.println(n);
	}

}
