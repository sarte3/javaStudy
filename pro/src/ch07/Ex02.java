package ch07;

//final 클래스
//[접근제어자] [속성] class 클래스명 [extends 부모클래스명]{}
public class Ex02 extends Object{

	public static void main(String[] args) {
		
		Father02 f = new Father02();
		f.abc();
		Son02 s = new Son02();
		s.qqq(); //Son02.qqq()
		s.abc(); //Father02의 abc()함수야. 
		//상속받은 Father02 클래스의 메소드 abc()를 호출할 수 있다
		
		//Son022 s2 = new Son022();
		//s2.aaa(); 
	}

}

final class Father022{
	
	void aaa() {
		System.out.println("Father022의 aaa()");
	}
}

/*
 * class Son022 extends Father022{ //The type Son022 cannot subclass the final
 * class Father022
 * 
 * }
 */

class Father02 {
	int a = 10;
	
	void abc(){
		System.out.println("Father02의 abc()함수야");
	}
}

//Son02 클래스는 부모 클래스인 Father02의 필드와 메서드를 상속받았다
class Son02 extends Father02{
	
	void qqq() {
		System.out.println("Sun02의 qqq()");
	}
	
}

