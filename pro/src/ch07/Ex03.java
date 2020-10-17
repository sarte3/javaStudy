package ch07;

//상속
//조상클래스의 생성자가 자손클래스가 생성될 때 자동으로 호출된다
//super() 부모클래스의 생성자를 호출, 
//주의. 반드시 생성자 안에서 반드시 첫번째 문장으로 작성해야 한다.
//참고 this(): (자신의) 또다른 생성자를 호출
public class Ex03 {

	public static void main(String[] args) {
		
		Son03 s=new Son03(123);
		
		
	}
	
}

//할아버지 클래스
class GrandFather03 extends Object{
	
	GrandFather03() {
		System.out.println("GrandFather03의 기본생성자");
	}
	
}

//아빠클래스
class Father03 extends GrandFather03 {
	
	//메소드 오버로딩
	Father03(){
		System.out.println("Father03의 기본생성자");
	}
	
	Father03(int a){
		System.out.println("Father03의 int 1개 생성자");
	}
	
	Father03(double a){
		System.out.println("Father03의 double 1개 생성자");
	}
}

//아들클래스
class Son03 extends Father03 {
	
	Son03(){
		super(100);
		System.out.println("Son03의 기본생성자");
		//컴파일 에러
		//Constructor call must be the first statement in a constructor
	}
	
	//매개변수는 객체간의 메시지 전달 용도로 사용됨
	Son03(int x){
		super(x);
		System.out.println("Son03(int x) 생성자야");
	}
	
}
