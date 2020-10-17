package ch07;

//Person01 클래스로부터 객체를 생성하여 실행하는 클래스
public class Person01_ex01 {

	public static void main(String[] args) {
		
		//객체 생성
		//Person01 p=new Person01(); x
		//Person01클래스에는 String 타입 2개를 파라미터로 가진 생성자가 존재하므로
		//기본생성자는 사용할 수 없다
		Person01 p1=new Person01("870817-2135456", "홍길동");
		
		//필드 3개의 값 출력
		System.out.println("p1.nation = "+p1.nation);
		System.out.println("p1.ssn = "+p1.ssn);
		System.out.println("p1.name ="+p1.name);
		
		//필드 3개의 값 변경
		//여기에서 nation은 변수를 선언하면서 초기값이 저장되었고
		//여기에서 ssn은 객체를 생성하면서 생성자의 argument값으로 초기값이 저장되었으므로
		//프로그램을 실행하는 도중에 변경 x
		//p1.nation="대한민국"; //The final field Person01.nation cannot be assigned
		//p1.ssn="880609-1030413"; //The final field Person01.nation cannot be assigned
		p1.name="홍의적";
		 
		
	}

}
