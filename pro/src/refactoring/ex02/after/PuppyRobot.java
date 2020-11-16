package refactoring.ex02.after;

/*소스 코드에 특정한 숫자, 매직 넘버(Masic Number)를 직접 사용하는 코드 스타일은 바람직하지 않다
 *  이유1. 매직 넘버의 의미를 파악하기 힘들다
 *  		0 			매직 넘버
 *  		ORDER_EATS	기호상수
 *  이유2. 매직넘버는 수정하기 힘들다
 *  		유지 보수시 시간, 비용이 많이 든다
 *  해결법 : 매직 넘버를 기호 상수로 치환
 *  
 *  방법:
 *  1. 기호 상수 선언
 *  	1-1. 기호 상수 선언	static final
 *  	1-2. 매직 넘버를 기호 상수로 치환
 *  	1-3. 기호 상수에 의존하는 다른 매직 넘버를 찾아서 기호상수를 사용한 표현식으로 변환
 *  	1-4. 컴파일
 *  2. 테스트
 *  	2-1. 모든 기호 상수 치환이 끝나면 컴파일해서 테스트
 *  	2-2. 가능하다면 기호 상수값을 변경한 후 컴파일해서 테스트
 */

public class PuppyRobot {

	//field
	private String _name;
	
	// 기호 상수 선언
	public static final int ORDER_EAT = 10;
	public static final int ORDER_STOP = 11;
	public static final int ORDER_JUMP = 12;
	
	//constructor
	public PuppyRobot() {
		
	}
	
	public PuppyRobot(String name) {
		_name = name;
	}

	
	//method
	public void order(int order) {
		
		switch(order) {
			case ORDER_EAT:
				System.out.println(_name+" eats");
				break;
			case ORDER_STOP:
				System.out.println(_name+" stop");
				break;
			case ORDER_JUMP:
				System.out.println(_name+" jumping");
				break;
			default:
				System.out.println("error code");
				break;
		}
	}
	
	
}
