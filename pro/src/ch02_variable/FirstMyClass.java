package ch02_variable;

public class FirstMyClass {

	public static void main(String[] args) {
		// 자바 한 줄 주석문 --오라클 한 줄 주석
		/* 자바 
		 * 여러줄 
		 * 주석문
		 */
		System.out.println("출력");
		System.out.println("두번째 줄");
		
		//escape 문자, \n 줄바꿈 \t 탭 \" 큰따옴표 \' 작은따옴표
		System.out.print("세번째 줄\n");
		System.out.print("네번째 줄");
		System.out.print("\t다섯번째 줄");
		System.out.print("\n큰따옴표 \"");
		System.out.print("\n작은따옴표\'\n");
		
		//작은따옴표는 한글자만
		System.out.print('a');
	}

}
