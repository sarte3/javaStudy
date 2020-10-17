package ch02_variable;

// 변수의 사용범위
// 변수는 중괄호{} 블록 내에서 선언되고 사용된다
public class Ex02 { //class(클래스) 블록

	public static void main(String[] args) { //method(메소드) 블록
		//변수 v1에 정수 15 값 할당
		int v1 = 15;
		
		if(1>0) {
			int v2 = v1-10;
		}
		//System.out.println(v1+v2); //v2 cannot be resolved to a variable
		//14라인에서 컴파일 에러 발생
		//그 이유는 v2가 선언된 곳은 if블럭 내부인 12라인이므로
		//if블럭 바깥인 14라인에서는 사용할 수 없다.
		//특정 블럭 안에서만 변수를 사용할 수 있다 -> 지역 변수
		
		//변수 v1은 main 메서드 안에서는 사용할 수 있다
	}//main 메서드 끝

}
