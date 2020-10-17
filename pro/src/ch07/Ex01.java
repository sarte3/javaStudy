package ch07;

/*import java.util.Date;
import java.util.Random; util 패키지 안의 Random 클래스만을 import한다
*/
//import 패키지명.클래스명;
import java.util.*; //util 패키지에 속한 모든 클래스를 import
//util패키지 안의 하위 패키지의 클래스는 제외한다
//java.util.concurrent 패키지 안의 클래스는 제외
//모든 패키지를 가져오는 게 아님

//package와 import
//import 단축키 : ctrl+shift+o

//상위클래스=부모클래스=조상클래스=super클래스
//하위클래스=자식클래스=자손클래스=sub클래스

//상속문법> 하위클래스명 extends 상위클래스
//public class Ex01 extends Object
public class Ex01 {
//묵시적으로 Object 클래스를 상속받고 있다
	public static void main(String[] args) {
		
		//import를 하지 않으면 컴파일 에러 발생
		Date today = new Date();
		//java.util.Date today = new java.util.Date();
		
		System.out.println("today = "+today);
		
		System.out.println(new Random().nextInt());
		
		//모든 클래스의 최고조상클래스는 Object클래스이다
		//따라서 모든 클래스는 Object클래스가 가진 method를 사용할 수 있다
		//equals()메소드의 문법 > 참조변수명.equals(Object obj);
		//Ex01클래스를 각 각 new 해서 참조변수 e1과 e2에 주소를 할당하였다
		//객체는 new 할 때 마다 서로 다른 주소지가 생기므로
		//참조변수 e1과 e2에 저장된 주소는 다르므로
		//2개의 참조변수의 주소가 같은지(equals)비교 하니 false가 나왔다
		//이 때 주소지를 비교하는 equals()는 Object 클래스로부터 상속받은 메소드를 사용
		//equals() 는 원래 주소지 비교, Object 클래스로부터 상속 받음
		Ex01 e1 = new Ex01();
		Ex01 e2 = new Ex01();
		System.out.println(e1.equals(e2)); //false
	}

}
