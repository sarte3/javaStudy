package ch03_operator;

//논리연산자 - 옳고 그름을 평가
//연산자 우선순위 산술 > 비교 > 논리 > 대입
// T &  T  -> 결과 T
// F &  T  -> & 연산자는 앞의 결과가 false이더라도 뒤의 결과를 살펴본다
// T && T -> 결과 T
// F && T -> && 앞의 결과가 false이면 결과는 false이므로 뒤의 결과를 보지 않음(절삭연산자)
//			=>더 효율적

public class Ex07 {

	public static void main(String[] args) {
		int charCode='Q';
		
		//& | -> 비트 연산자
		if((charCode >= 65) & (charCode <= 90)) {
			System.out.println("대문자야~");
		}
		
		if(charCode >= 97 && charCode <= 122) {
			System.out.println("소문자야~");
		}
		
		if(charCode >= 48 & charCode <= 57) {
			System.out.println("숫자야~");
		}
		
		int num = 6;
		
		if(num%2==0 | num%3==0) {
			System.out.println(num+"은 2 또는 3의 배수이군요");			
		}
		
		if(num%2==0 || num%3==0) {
			System.out.println(num+"은 2 또는 3의 배수이군요");			
		}
		
	}

}
