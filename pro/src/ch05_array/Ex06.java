package ch05_array;

//사용자 입력받기 - 커맨드라인을 이용하면
// 프롬프트창에서 실행시에는 > java Ex06 홍의장군 123 "Hello World"
// eclipse에서 실행시는 > run configuration의 arguments탭에서 
// 홍의장군 공백 123 공백 "Hello World" 입력
// 또는
// 홍의장군 enter 123 enter "Hello World" 입력
// -> 공백이 포함된 문자열은 "큰따옴표"로 묶어야 한다
//교재 p.211
public class Ex06 {

	public static void main(String[] args) { //진입함수, JVM이 호출, 프로그램 시작 용도
		
		System.out.println("args[0] = "+args[0]);
		System.out.println("args[1] = "+args[1]);
		System.out.println("args[2] = "+args[2]);
		
		System.out.println("---------------------------");
		
		//함수호출(p.254) : 함수명();
		//static 함수 안에서 또다른 함수를 호출해줄 땐 static이어야 함
		showMsg("이순신");
		showMsg();
		showMsg("유관순", "대한독립 만세~~");
		
	}
	
	//함수 선언 (p.252)
	//함수의 종류 4가지 중 2개
	//메소드 오버로딩(overloading - 교재 p.283)
	public static void showMsg(String name, String msg) {
		System.out.println(name+"님의 메세지는 "+msg);
	}
								//매개변수
	public static void showMsg(String name) {
		System.out.println(name+"님 환영해요~");
	}
	
	//메소드(함수) 선언
	public static void showMsg() {
		System.out.println("showMsg() 메소드 호출 성공");
	}
	
}
