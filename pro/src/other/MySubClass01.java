package other;

//[접근제어자] [속성] class 클래스명 [extends 부모클래스명]{}
//동일패키지 안의 부모클래스인 MyClass01에서 선언된 필드에 접근 허용 여부 체크
class MySubClass01 extends MyClass01{
	
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
	}
	
}
