package ch03_operator;

//비교연산자 - 슬라이드 21 참고
/* a>b a는 b보다 크다 			초과
 * a>=b a는 b보다 크거나 같다		이상
 * a<b a는 b보다 작다			미만
 * a<=b a는 b보다 작거나 같다		이하
 * a==b a는 b와 같다, 동일
 * a!=b a는 b와 같지 않다 
 */
//비교 연산자에서는 연산을 하기 전에 피연산자의 타입을 일치시킨다
public class Ex05 {

	public static void main(String[] args) {
				
		char c1 = 'A';
		char c2 = 'B';
		//'A'가 int 타입 65로 변환
		//'B'가 int 타입 66으로 변환 후 비교 연산 수행
		System.out.println("c1<c2의 결과 "+(c1<c2)); //true
	}

}
