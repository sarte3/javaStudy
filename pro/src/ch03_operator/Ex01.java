package ch03_operator;

//부호 연산자
public class Ex01 {

	public static void main(String[] args) {
		int x = -100;
		int result = -x;
		System.out.println("result = "+result); //100
		int result1 = +x;
		System.out.println("result = "+result1); //-100
		
		short s = 100;
		//short result2 = -s; // cannot convert from int to short
		//주의 : 부호연산자의 산출타입은 int가 된다
		int result2 = -s;
		System.out.println("result2 = "+result2);
		
		System.out.println("-------------------------");
		
		//------------------------------------------------
		//논리부정연산자(!)
		//true를 false로, false를 true로
		
		boolean play = true;
		if(play){
			System.out.println("if문 안의 play = "+play); //true
		}
		
		System.out.println("play = "+play); //true
		
		play = !play;
		System.out.println("play = "+play); //false
		
		if(!play){ //false의 반대인 true가 되면서 if 조건이 충족되면
			System.out.println("if문 안의 play = "+play); //false //play 변수값을 출력하라
		}
		
		
	}

}
