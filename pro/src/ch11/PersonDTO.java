package ch11;

//interface를 구현하는 클래스 선언
//[접근제어자] [속성] class 클래스명 [extends 조상클래스명] implements 인터페이스명1, 인터페이스명2,...인터페이스명N
//인터페이스는 상수와 추상메서드만으로 구성된 (추상)클래스의 일종이므로
//인터페이스를 상속받은 구현클래스에서는
//인터페이스에서 선언한 추상메서드를 반드시 꼭 기필코 오버라이딩(재정의)해야 한다

//여기에서는 Comparable 인터페이스의 int compareTo(Object o)를 오버라이딩 해야 한다
public class PersonDTO implements Comparable<PersonDTO>{
	
	//field
	private String name;//이름
	private int age;//나이
	
	//constructor
	public PersonDTO(){
		
	}
	
	public PersonDTO(String name, int age){
		this.name = name;
		this.age = age;
	}

	
	//method
	//정렬 기능
	/*
	 * Compares this object with the specified object for order. 
	 * Returns a negative integer, zero, or a positive integer as
	 *  this object is less than, equal to, or greater than 
	 *  the specified object.
	 *  
	 *  기준 1   비교 100 : 음수
	 *  기준 100 비교 100 : 0
	 *  기준 100 비교 1 : 양수
	 *  
	 */
	@Override
	public int compareTo(PersonDTO obj) {
		
		if(this.age<obj.age) {
			return -1; //1
		}else if(this.age==obj.age) {
			return 0;
		}else {
			return 1; //-1
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "PersonDTO [name=" + name + ", age=" + age + "]";
	}

	/*
	 * @Override public String toString() { return "이름 : "+this.name; }
	 */
	
	
	
}
