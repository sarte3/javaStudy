package ch08;

//이 클래스는 잔고 부족 예외를 처리하기 위한 사용자정의 예외클래스이다
//예외클래스 선언
/*접근제어자 class xxxException extends Exception {
	//field
	
	//constructor
	public default생성자(){}
	//매개변수 message는 예외 발생 원인(예외메시지)을 전달하기 위함이다
	//String 타입의 매개변수를 갖는 생성자는
	public 생성자(String message){
		//상위 클래스의 생성자를 호출하여 예외메시지를 넘겨준다
		super(message);
		//이러한 예외메시지의 용도는 catch(){}의 예외처리코드에서 사용된다
		// e.getMessage() 또는 e.printStackTrace();
	}
	
	//method
}
*/
public class BalanceInsufficientException extends Exception {

	public BalanceInsufficientException() {}
	
	public BalanceInsufficientException(String message) {
		super(message);
	}
	
}
