package ch03_operator;

// 3항연산자
// 조건 ? 참값 : 거짓값; -> if(조건){참값}else{거짓값};
// 조건1 ? 조건1참값 : (조건2) ? 조건2참값 : 거짓값
public class Ex08 {

	public static void main(String[] args) {
		//임의 숫자를 score 변수에 저장
		//100~91이면 A학점
		//90~81이면 B학점
		
		int score=1004;
		
		String result=(score>=91&&score<=100)?"A학점":(score>=81&&score<=90)?"B학점":"그 외";
		
		System.out.println(score+"점은 "+result);
		
		if(score>=91&&score<=100) {
			System.out.println("A학점!");
		}else if(score>=81&&score<91) {
			System.out.println("B학점!");
		}else if(score>=71&&score<81){
			System.out.println("C학점");
		}else {
			System.out.println("기타");
		}
		
		//(조건)?참값:거짓값
		//(조건1)?참값:(조건2)?참값:거짓값;
		
	}

}
