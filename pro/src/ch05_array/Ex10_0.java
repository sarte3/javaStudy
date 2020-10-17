package ch05_array;

public class Ex10_0 {

	public static void main(String[] args) {
		
		int s0=100;
		int s1=90;
		int tmp=0; //임시변수 선언
		
		System.out.println("s0 = "+s0); //100
		System.out.println("s1 = "+s1); //90
		
		//s0의 값과 s1의 값 교환
		/*
		 * tmp=s1; s1=s0; s0=tmp;
		 */
		tmp=s0; //temp=100;
		s0=s1; //s0=90;
		s1=tmp; //s1=100;
		
		System.out.println("변경 후 -------------------");
		
		
		System.out.println("s0 = "+s0); //90
		System.out.println("s1 = "+s1); //100
		
		
	}

}
