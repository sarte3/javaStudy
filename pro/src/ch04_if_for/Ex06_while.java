package ch04_if_for;

/*while(조건) {
	//조건만족시 반복 실행 코드
}
*/

public class Ex06_while {

	public static void main(String[] args) {
		int i=0;
		while(i<5) {
			//조건만족시 반복 실행 코드
			i++;
			System.out.println("i = "+i); //1,2,3,4,5
			
		}
		System.out.println("while 밖");
		
		int i1=0;
		while(i1<5) {
			//조건만족시 반복 실행 코드
			System.out.println("i = "+i1); //0,1,2,3,4
			i1++;	
		}
		System.out.println("while 밖");
		
	}

}
