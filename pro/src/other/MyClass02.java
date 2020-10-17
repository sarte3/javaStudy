package other;

//MyClass01에서 선언된 필드와 메소드에 접근할 수 있는지 살펴보고자 한다
public class MyClass02 {
	
	void qqq() {
		MyClass01 m=new MyClass01();
		m.pub = 100;
		m.pro = 200;
		m.pack = 300;
		m.pri = 400; 
		//pri 필드는 동일 클래스에서만 접근 가능
		//외부 클래스에서는 접근 불가
		//컴파일 에러. 
		//The field MyClass01.pri is not visible
		
		//메소드 접근 허용 여부 체크
		m.pubMethod();
		m.proMethod();
		m.packMethod();
		m.priMethod();
		//The method priMethod() from the type MyClass01 is not visible
	}
	
}
