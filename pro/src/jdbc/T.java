package jdbc;

import java.util.Scanner;

public class T {

	public static void main(String[] args) {

		double pi = Math.PI;
		System.out.println("pi = "+pi);
		
		System.out.println(Math.round(pi));
		
		System.out.println(Math.round(pi*100)/100.0);
		//소수점 3번째 자리에서 반올림하여 2째 자리까지 출력
		
		System.out.println(Math.round(pi*1000)/1000.0);
		//소수점 4번째 자리에서 반올림하여 3째 자리까지 출력
		
		Scanner sc=new Scanner(System.in);
		System.out.print("입력 >");
		String str=sc.nextLine(); //String으로 입력값을 받음
		int n= Integer.parseInt(str); //String 타입을 int로 변환
		System.out.println((n+1));
		
		//System.out.println(str+1);
		System.out.println("--------------------------");
		System.out.print("입력 >");
		
		int s = sc.nextInt(); //입력받은 String을 int로 변환
		System.out.println((s+1));
		
	}

}
