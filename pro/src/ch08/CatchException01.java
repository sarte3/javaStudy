package ch08;

/*다중 catch
 * try 블럭 내부에는 다양한 종류의 예외가 발생할 수 있다
 * 예외별로 예외 처리 코드를 다르게 하려면 어떻게? 
 * 답은 다중 catch를 이용하자
 */
public class CatchException01 {

	public static void main(String[] args) {

		try {
			String data0 = args[0];
			String data1 = args[1];
			
			System.out.println("args[0] = "+data0);
			System.out.println("args[1] = "+data1);	
	
			String data11 = "100";
			String data22 = "a100";
			
			int value1 = Integer.parseInt(data11);
			int value2 = Integer.parseInt(data22);
			
			int result = value1 + value2;
			System.out.println(value1+"+"+value2+"="+result);
		}catch(ArrayIndexOutOfBoundsException | NumberFormatException e) {
			
		
		//catch(ArrayIndexOutOfBoundsException e) {
			//Unreachable catch block for ArrayIndexOutOfBoundsException. 
			//It is already handled by the catch block for Exception
			//System.out.println("배열 관련 에러 발생");
			e.printStackTrace();
		//}catch(NumberFormatException e) {
			//Unreachable catch block for NumberFormatException. 
			//It is already handled by the catch block for Exception
			//System.out.println("NumberFormatException 관련 에러");
		}catch(Exception e) {
			System.out.println("Exception e");
		}finally {
			//catch 절에 들어가든, 그렇지 않든지 무조건 실행됨
			System.out.println("finally 블럭 안이에요");
		}
	}

}
