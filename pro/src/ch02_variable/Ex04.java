package ch02_variable;

//char 타입 변수
/*자바는 모든 문자를 유니코드(Unicode)로 처리. 
유니코드는 세계 각국의 문자들을 코드값으로 매핑한 국제표준규약이다
유니코드는 하나의 문자에 대해 하나의 코드값을 부여하기 때문에 'A', '가'에도 하나의 코드값을 갖는다
유니코드는 16진수로 저장할 경우에 '\\u+16진수값'
*/
public class Ex04 {

	public static void main(String[] args) {
		//ctrl+m 전체화면
		char c1 = 'A'; //문자로 저장
		char c2 = 65; //10진수로 저장
		char c3 = '\u0041'; //16진수로 저장 \\u16진수 - 유니코드
		
		System.out.println("c1 = "+c1); //A
		System.out.println("c2 = "+c2); //A
		System.out.println("c3 = "+c3);
		System.out.println("(int)c2 = "+(int)c2);

	}

}
