package ch04_if_for;

//중첩 for문
//for 문 안에 또 다른 for 문을 포함시킬 수 있다
//for 문의 중첩횟수에는 거의 제한이 없다
public class Ex06_forInFor {

	public static void main(String[] args) {
		//2부터 9까지 출력
		for(int i=2;i<=9;i++) {
			System.out.println("i = "+i+"단");
			//1~5 alt+방향키 위아래로 코드 이동
			for(int j=1;j<=9;j++) {
				System.out.println("\t"+i+"*"+j+" = "+(i*j));
			}//내부 for문
		}//외부 for문
		
		for(int i=0;i<=4;i++) {
			
			for(int j=0;j<=2;j++) {
				System.out.print("\t["+i+","+j+"]");
			}
			System.out.println();
		}
		
	}

}
