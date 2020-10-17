package ch07;

import other.MyClass01;

//MySubClass02는 MyClass01를 상속받고 있으므로
//이 클래스에는 부모클래스로부터 상속받은 pub,pro,pack,pri가 이미 존재
public class MySubClass02 extends MyClass01 {

	void qqq() {
		//MyClass01 m = new MyClass01();
		pub = 100;
		pro = 200; 
		//서로 다른 패키지이지만 상속관계의 자식클래스에서는 접근 가능
		pack = 300;
		//The field MyClass01.pack is not visible
		
		pri = 400; 
		//pri 필드는 동일 클래스에서만 접근 가능
		//외부 클래스에서는 접근 불가
		//컴파일 에러. 
		//The field MyClass01.pri is not visible
		
		pubMethod();
		proMethod();
		packMethod(); //The method packMethod() from the type MyClass01 is not visible
		priMethod(); //The method priMethod() from the type MyClass01 is not visible
	}
}
