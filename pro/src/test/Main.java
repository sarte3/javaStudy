package test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("강아지 이름을 입력하세요");
		System.out.print("입력 > ");
		
		Scanner sc=new Scanner(System.in);
		
		PuppyRobot pr=new PuppyRobot();
		
		pr.set_name(sc.nextLine());

		while(true) {
			System.out.println("명령어를 입력하세요");
			System.out.print("입력 > ");
			
			pr.order(sc.nextInt());
		}
		
	}

}
