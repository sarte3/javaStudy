package ch07;

import other.MyClass01;

//other.MyClass01에서 선언된 필드에 접근 허용 여부 체크하자

public class MyClass03 {

	void qq() {
		MyClass01 m= new MyClass01();
		m.pub=100;
		m.pro=200; //The field MyClass01.pro is not visible
		m.pack=300; //The field MyClass01.pack is not visible
		m.pri=400; //The field MyClass01.pri is not visible
		
		//메소드 접근 허용 여부 체크
		m.pubMethod();
		m.proMethod(); //The method proMethod() from the type MyClass01 is not visible
		m.packMethod(); //The method packMethod() from the type MyClass01 is not visible
		m.priMethod(); //The method priMethod() from the type MyClass01 is not visible
	}
	
}
