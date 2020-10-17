package ch04_if_for;

//반복문 for
public class Ex06 {

	public static void main(String[] args) {
		//구구단 2단 출력 2 * 1 = 2 ... 2 * 10 = 20
		for(int i=1;i<=10;i++) {
			int dan = 2;
			int result = 2*i;
			System.out.println(dan+" * "+i+" = "+result);
		}

		//5, 4, 3 ...1
		for(int i=5;i>0;i--) {
			System.out.println("i = "+i);
		}
		
		//1,2,3...8,9,10까지 출력
		for(int i=1;i<11;i++) {
			System.out.println("i = "+i);
		}
		
		int sum = 0; //누적된 합을 저장하기 위해 선언한 변수
		//1+2+3+4+5+...+100 합출력
		for(int i=1;i<=100;i++) {
			//sum = sum+i; //대입연산자
			sum += i; 
			//+= -= *= /= %=
			//System.out.println("i = "+i);
		}
		System.out.println("sum = "+sum);
		
		int j=0;
		for(;;) { 
			if(j<5) {
				System.out.println(j);//반복실행 코드
				j++;
			}else {
				System.out.println("조건 x");
				break; //반복문 종료
			}
			//if밖 for안
		}
	}
}
