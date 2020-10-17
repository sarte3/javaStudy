package ch07;


/*
 * 전체 프로그램에서 단 하나의 객체만 만들도록 보장해야 하는 경우가 있다
 * 단 하나만 생성한다고 해서 이 객체를 싱글톤(singleton)이라고 한다
 * 
 * 싱글톤 클래스가 되기 위해서는
 * 1. 필드는 private static 으로 선언되어야 한다
 * 	private static 클래스타입 참조변수명
 * 초기값으로 객체가 생성되어야 한다
 *  new 클래스명();
 * 
 * 2. 생성자는 private으로 선언되어야 한다
 * private 클래스명(){}
 * 
 * 3. 객체를 제공하는 메서드는 public static 클래스객체를 리턴해야 한다
 * 	public static 클래스타입 메소드명(){
 * 	
 * }
 * 
 *  public class 클래스명{
 * 	//field
	private static 클래스명 참조변수명 = new 클래스명();
	
	//constructor
	private 클래스명(){}
	
	//객체제공메서드
	public static 클래스타입 메서드명(){
		return 클래스참조변수명;
	}
	
 * }
 * 
 * -----------------------------
 * 싱글톤 클래스객체를 사용시에는
 * 클래스명 참조변수명 = 클래스명.메서드명();
 * 아래 예제에서는
 * Singleton s = Singleton.getInstance();
 */
public class Singleton {

	//field
	//접근제어자 클래스타입 필드명 = 초기값;
	private static Singleton s = new Singleton();;
	
	//constructor
	private Singleton(){}
	
	//객체를 제공하는 메소드
	//==> 객체가 생성된 heap영역의 주소를 반환하는 메서드
	//접근제어자 속성 클래스타입 함수명(){}
	public static Singleton getInstance() {
		//Cannot make a static reference to the non-static field s
		if(s==null) {
			s = new Singleton();
		}
		return s;
	}
	
	//method
	public void test() {
		
	}
	
}
