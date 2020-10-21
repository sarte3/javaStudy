package ch11;

import java.util.HashSet;
import java.util.Set;

//MemberDTO_02 객체를 중복 없이 Set에 저장하는 클래스 
public class HashSet02_ex {

	public static void main(String[] args) {
		
		MemberDTO_02 m1 = new MemberDTO_02("홍길동","801123-1234567");
		MemberDTO_02 m2 = new MemberDTO_02("김길동","820123-2222222");
		//Person01 p2=new Person01("820123-2222222","김길동");
		
		//기준이 되는 m1이 매개변수 m2와 동일하니?
		System.out.println("m1.equals(m2)의 결과 = "+m1.equals(m2));
		//System.out.println("m1.equals(p2)의 결과 = "+m1.equals(p2));
		
		//조상클래스명 참조변수명 = new 자손클래스명();
		/*
		Set<MemberDTO_02> set=new HashSet<MemberDTO_02>();
		
		set.add(new MemberDTO_02("홍길동","801123-1234567"));
		set.add(new MemberDTO_02("김길동","820123-2222222"));
		set.add(new MemberDTO_02("홍길동","801123-1234567"));
		
		System.out.println("총 객체 수 = "+set.size());
		*/
	}

}
