package ch03_operator;
import ch02_variable.Ex06;

//문자열 비교(중요)
//== 객체의 주소 비교
//문자열.equals(비교문자열) 문자열값 비교
public class Ex06_star {

	public static void main(String[] args) {
		//객체가 생성될 때 주소가 할당된다
		//값이 아니라 주소가 들어간다 그 주소를 참조해 값을 뽑아냄 -> 참조 변수
		//Ex06 타입의 변수
		Ex06 obj1=new Ex06();
		Ex06 obj2=new Ex06();
		System.out.println("obj1 = " + obj1);
		System.out.println("obj2 = " + obj2);
		
		//스택 안에 저장되는 리터럴 값
		String str1 = "홍길동";
		String str2 = "홍길동";
		//Class는 객체를 생성해서 사용, new 키워드 사용, new를 사용하면 주소지가 담김
		String str3 = new String("홍길동");
		String str4 = new String("홍길동");
		
		System.out.println("str1 = "+str1);
		System.out.println("str2 = "+str2);
	
		if(str1==str2) { //조건을 충족하면 실행
			System.out.println("str1과 str2는 일치한다");
		}else{ //조건이 참이 아닌 경우
			System.out.println("str1과 str2는 일치하지 않는다");
		}
		
		System.out.println("---------------------------");
		
		System.out.println("str3 = "+str3);
		System.out.println("str4 = "+str4);
		
		//==는 주소를 비교
		if(str3==str4) { //조건을 충족하면 실행
			System.out.println("str3과 str4는 주소가 일치한다");
		}else{ //조건이 참이 아닌 경우
			System.out.println("str3과 str4는 주소가 일치하지 않는다");
		}
		
		//문자열.equals(비교문자열)은 값을 비교
		if(str3.equals(str4)) { //조건을 충족하면 실행
			System.out.println("str3과 str4는 일치한다");
		}else{ //조건이 참이 아닌 경우
			System.out.println("str3과 str4는 일치하지 않는다");
		}
		
		
	}

}
