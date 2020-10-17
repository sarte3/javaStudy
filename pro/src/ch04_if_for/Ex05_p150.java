package ch04_if_for;

import java.util.Scanner; //java.uitl패키지 안의 Scanner클래스를 임포트하겠다

//Scanner 클래스 p40, p510

/* 교재 p150 참고
 * 가위(1), 바위(2), 보(3) 게임을 구현하세요
 * 컴퓨터 : 임의 값 => Math.random() 이용
 * 유저 : 값을 입력 => Scanner 클래스 이용
 * 
 * 비교연산자, 조건문 이용
 * 예)컴퓨터는 보를 내었습니다
 * 당신은 가위를 내었습니다
 * 귀하께서 이겼어요!
 */
public class Ex05_p150 {

	public static void main(String[] args) {
		System.out.print("가위(1), 바위(2), 보(3) 중에 하나를 입력하세요 : ");
		//클래스타입 변수명 = new 클래스명(); 인스턴스를 생성
		Scanner scanner= new Scanner(System.in);
		int user = scanner.nextInt(); 
		//콘솔을 통해 입력받은 j데이터를 인트타입으로 처리하겠다
		
		int computer= (int)(Math.random()*3+1);
		//컴퓨터의 값 임의 설정
		
		System.out.println("당신은"+user+" 를 내었습니다");
		System.out.println("컴퓨터는 "+computer+"를 내었습니다");
		
		switch(user-computer) {
			case 2: 
			case -1: System.out.println("컴 WIN");break;
			case 1: 
			case -2: System.out.println("You WIN!");break;
			case 0: System.out.println("비겼어요");break;
			default:
		}
	}

}
