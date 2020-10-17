package ch04_if_for;

//do while문
//블럭{}이 최소한 1번 이상 수행할 것을 보장한다.
/*
 * do{
 * 	//반복실행코드
 * }while(조건);
 */
public class Ex06_do_while {

	public static void main(String[] args) {
		//1 2 3 4 5 출력
		int i=1;
		do {
			System.out.println("i = "+i); 
			//조건충족하지 않아도 1번은 실행된다
			i++;
		}while(i<=5);
		
	}

}
