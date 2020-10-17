package ch04_if_for;

//switch문 : ==비교연산자만 사용. 그외 다른 비교연산은 x(ex. > >= < <= !=)
//주사위를 던져서 나온 수를 출력하세요 : 1번이 나왔어요~
public class Ex03 {

	public static void main(String[] args) {
		//참고 Math.random()*(큰수-작은수+1)+작은수
		int num=(int)((Math.random()*6)+1);
		
		//switch(변수)문 바깥과 내부를 연결해주는 매개 변수
		switch(num) {
			case 1: System.out.println("1번이 나왔어요");
				break;
			case 2: System.out.println("2번이 나왔어요");
				break;
			case 3: System.out.println("3번이 나왔어요");
				break;
			case 4: System.out.println("4번이 나왔어요");
				break;
			case 5: System.out.println("5번이 나왔어요");
				break;
			case 6: System.out.println("6번이 나왔어요");
				break;
			default:
		}
	}

}
