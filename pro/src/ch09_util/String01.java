package ch09_util;

public class String01 {

	public static void main(String[] args) {

		//==비교 : 주소 비교
		String str1 = "김좌진";
		String str2 = "김좌진";
		System.out.println("str1 = "+str1);
		//Object 클래스의 toString()을 오버라이딩한 String 클래스의 메소드가 호출됨
		System.out.println("str1 = "+str1.toString());
		System.out.println("str2 = "+str2);
		//==의 결과가 true인 것은 str1과 str2 변수가 동일한 주소를 참조하고 있다는 것
		//문자열 리터럴이 동일하다면 동일한 String 객체를 참조하도록 하였다
		System.out.println("str1==str2 결과"+(str1==str2)); //true
		
		//하지만 new 연산자로 생성되면 서로 다른 String 객체를 참조한다.
		String str3 = new String("김좌진");
		String str4 = new String("김좌진");
		
		System.out.println("str3==str4 결과"+(str3==str4));	//false
		
		//문자열 비교(equals()) : 값 비교
		System.out.println("str1.equals(str2) 결과"+(str1.equals(str2)));
		System.out.println("str3.equals(str4) 결과"+(str3.equals(str4)));
		
	}

}
