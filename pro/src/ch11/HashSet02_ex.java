package ch11;

import java.util.HashSet;
import java.util.Set;

//MemberDTO_02 객체를 중복 없이 Set에 저장하는 클래스 
public class HashSet02_ex {

	public static void main(String[] args) {
		
		//조상클래스명 참조변수명 = new 자손클래스명();
		
		Set<MemberDTO_02> set=new HashSet<MemberDTO_02>();
		
		set.add(new MemberDTO_02("홍길동","801123-1234567"));
		set.add(new MemberDTO_02("김길동","820123-2222222"));
		set.add(new MemberDTO_02("홍길동","801123-1234567"));
		//인스턴스는 다르지만 내부 데이터가 동일하면 동일 객체로 판단되어
		//총 객체수는 2
		
		System.out.println("총 객체 수 = "+set.size());
		
	}

}
