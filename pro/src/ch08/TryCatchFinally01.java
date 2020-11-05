package ch08;

//TryCatchFinally -
/* try 블록에는 예외 발생 가능성이 있는 코드를 위치시킨다
 *  - try 블럭에서 예외가 발생하면, 발생할 예외를 처리할 catch 블럭을 찾는다
 *  
 */
//일반 예외 처리 : 컴파일 과정에서 예외를 처리할 수 있다
public class TryCatchFinally01 {

	public static void main(String[] args) {

		try {
			Class.forName("java.lang.String123");
			// Unhandled exception type ClassNotFoundException
		} catch (ClassNotFoundException e) {
			// e.printStackTrace();
			// System.out.println("해당 클래스가 존재하지 않아요 e = "+e);
			System.out.println("e.getMessage = "+e.getMessage());
		}//catch
		System.out.println("catch 블럭 밖");
	}//main
	

}
