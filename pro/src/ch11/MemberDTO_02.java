package ch11;

//MemberDTO_02 : 회원에 대한 정보를 다루는 순수클래스
public class MemberDTO_02 {

	//field
	private String name; //이름
	private String ssn; //주민번호
	
	//constructor
	public MemberDTO_02() {
		
	}
	
	public MemberDTO_02(String name, String ssn){
		this.name=name;
		this.ssn=ssn;
	}

	//method
	//getter & setter
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSsn() {
		return ssn;
	}
	
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	//Object 클래스의 equals(Object obj)는 객체 자신과 주어진 객체(obj)를 비교
	//여기에서는 회원명과 주민번호가 동일하면 동일 객체라고
	//그렇지 않으면 동일 객체x
	@Override
	public boolean equals(Object obj) {
		//매개변수 obj 타입은 Object이므로 .. 
		//Object를 상속받은 클래스는 다 들어올 수 있다
		//따라서
		//매개변수 obj에 들어온 value가
		//MemberDTO_02 클래스의 객체이니?부터 확인하자
		//매개변수obj가 MemberDTO_02 클래스의 instance이니?
		//A instanceof B : A가 B의 instance이면 true, 그렇지 않으면 false
		if(obj instanceof MemberDTO_02) {
			return true; //회원명과 주민번호가 동일하면 동일객체이므로 true 리턴
		}else {	
			return false; //그렇지 않으면 동일객체가 아니므로 false 리턴
		}
	
	}
}
