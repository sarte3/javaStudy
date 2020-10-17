package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//JDBC : DB연동 여부 테스트
public class JdbcTest01 {

	//field

	//constructor
	JdbcTest01(){
		System.out.println("JdbcTest01() 기본생성자야");
	}
	
	//method
	public static void main(String[] args) {
		String url ="jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String password = "tiger";
		
		Connection conn = null;
		Statement stmt = null;
		//JdbcTest jt =new JdbcTest();
		//참조변수.필드
		//참조변수.함수();
		
		//1.JDBC 드라이버 로드
		/* JDBC 드라이버를 로드하기 위해 드라이버 클래스 파일을 로드한다.
		 * * 자바의 Class 클래스의 forName() 메소드를 이용하면 특정 클래스 파일을 읽어 들일 수 있다
		 * MySql이면 Class.forName("com.mysql.jdbc.Driver");
		 */
		//Oracle
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("정상적으로 JDBC 드라이버 로드하였어요");
		 
		
		//2. 자바 응용프로그램과 JDBC의 연결
		/*
		 * DriverManager는 자바 응용프로그램을 JDBC 드라이버에 연결시켜주는 클래스이다.
			DriverManager.getConnection() 메소드를 호출하여 데이터베이스
			에 연결하고 Connection 객체를 반환한다.
		 */
		//Connection java.sql.DriverManager.getConnection(String url, String user, String password) throws SQLException
		
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("Connection 얻기 성공");
		
		
		//3.쿼리를 실행할 객체를 생성 및 쿼리 실행
		//자바에서 SQL문을 실행하기 위해서는 Statement 클래스 필요
		//예외처리 교재 p.414
		
			//쿼리실행할 객체를 생성
			stmt = conn.createStatement();
			System.out.println("Statement 객체 생성 성공");
			
			//쿼리 실행
			//쿼리문 주의사항, 문법, 데이터타입,;포함x, 공백
			//int executeUpdate(String sql) - INSERT, UPDATE, 또는
			//DELETE과 같은 sql문을 실행하고, sql
			//문 실행으로 영향을 받은 행의 개수나 0을 반환
			//int cnt = stmt.executeUpdate("insert into DEPT values(90,'IT','서울')");
			//int cnt = stmt.executeUpdate("delete from dept where deptno=90");
			int cnt = stmt.executeUpdate("update dept set loc='독도' where deptno=90");
			
			if(cnt>0) { 
				System.out.println("쿼리가 정상적으로 실행 cnt = "+cnt); }
			else {
				System.out.println("쿼리가 실행 x cnt = "+cnt); 
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로드 실패");
			e.printStackTrace();
			
		} catch (SQLException e) {
			System.out.println("SQL관련 에러 발생");
			e.printStackTrace();
		} finally {
			//자원 반납을 반드시 하게 하려면 finally 블럭 안에 코드 작성
			System.out.println("finally 블럭 안");
			
				if(stmt!=null) {
					try {
						stmt.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}	
				}
				if(conn!=null) {
					try {
						conn.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}					
				}

		} //다중 catch절
		//주의. 하위 Exception 클래스부터 먼저 작성하고
		//상위 Exception 클래스는 뒤에 명시

	/* try ~ 다중 catch문
	 * 
	 * try{
	 * 	//코드
	 *	//위험코드
	 *	//위험코드
	 * }catch(하위Exception클래스명 참조변수명){
	 * 	//예외발생 처리 코드	
	 * }catch(상위Exception클래스명 참조변수명){
	 *	//예외발생 처리 코드
	 *
	 *	 *}catch(Exception클래스 참조변수명){
	 *	//예외발생 처리 코드
	 *}finally{
	 *	//finally 블럭에는
	 *	//catch절에 들어가든 들어가지않든
	 *	//무조건 실행해야 하는 코드를 작성한다
	 *	//예) DB연동시의 자원 반납
	 *}
	 * 	
	 */
		
		
	}//main
	
	
}//class
