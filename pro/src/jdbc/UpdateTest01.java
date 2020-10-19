package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

//PreparedStatement 객체 이용

public class UpdateTest01 {

	public static void main(String[] args) {
		
		String driver="oracle.jdbc.driver.OracleDriver";
		String url ="jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String password = "tiger";
		
		Connection conn=null;
		PreparedStatement pstmt=null;
		
		try {
			//1.드라이버 로딩
			Class.forName(driver);
			
			//2.Connection객체얻기
			conn = DriverManager.getConnection(url,user,password);
			
			//3-1.실행객체-PreparedStatement객체,Statement객체
			
			String sql="update emp "+ 
					"set sal=sal+100 "+ 
					"where empno=8001";
			pstmt = conn.prepareStatement(sql);
			
			//3-2.쿼리문실행 - executeUpdate(): insert,update,delete
			//				executeUpdate()의 리턴형태는 int
			//				executeQuery() : select
			//				executeQuery()의 리턴형태는 ResultSet
			int cnt = pstmt.executeUpdate();
			
			//4. 추가작업
			if(cnt>0) {
				System.out.println("업데이트 되었습니다");
			}else {
				System.out.println("업데이트 실패");
			}
			
		}catch(Exception e) {  
			System.out.println("쿼리 실행 관련 에러 발생");
		}
		finally{   /*5. 사용한 객체는 반납: 객체.close(); */ 
			
			try {
				if(pstmt!=null) {
					pstmt.close();
				}
				if(conn!=null) {
					conn.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
	 
		
	}

}
