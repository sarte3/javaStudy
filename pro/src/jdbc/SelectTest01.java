package jdbc;

import java.sql.*;


//PreparedStatement 객체 이용 : 쿼리문을 미리 전달하여 나중에 실행
public class SelectTest01 {

	public static void main(String[] args) {

		String driver="oracle.jdbc.driver.OracleDriver";
		String url ="jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String password = "tiger";
		
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		try {
			//1.드라이버 로딩
			Class.forName(driver);
			
			//2.Connection객체얻기
			conn = DriverManager.getConnection(url,user,password);
			
			//3-1.실행객체-PreparedStatement객체,Statement객체
			String sql="select empno,ename,sal,hiredate " + 
					"from emp " + 
					"where empno>=7900 " + 
					"order by empno desc";			
			pstmt = conn.prepareStatement(sql);
			
			//3-2.쿼리문실행 - executeUpdate(): insert,update,delete
			//				executeUpdate()의 리턴형태는 int
			//				executeQuery() : select
			//				executeQuery()의 리턴형태는 ResultSet
			rs = pstmt.executeQuery();
			
			if(rs!=null) {
				while(rs.next()) {
					int empno = rs.getInt("empno");
					String ename = rs.getString("ename");
					double sal = rs.getDouble("sal");
					Date hiredate = rs.getDate("hiredate");
					
					System.out.printf("%5d %10s %7.2f %s\n",empno, ename, sal, hiredate);
					
				}
			}
			//4. 추가작업
			
			
		}catch(Exception e) { 
			System.out.println("쿼리 실행 관련 에러 발생 = "+e);
		}
		finally{  
		/*5. 사용한 객체는 반납: 객체.close(); */ 
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
