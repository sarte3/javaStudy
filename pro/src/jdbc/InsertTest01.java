package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

//PreparedStatement 객체 이용 : 쿼리문을 미리 전달하여 나중에 실행
public class InsertTest01 {

	public static void main(String[] args) {
		
		//각종 필요한 변수 선언 - 예)conn, stmt, pstmt, rs, sql
		String driver="oracle.jdbc.driver.OracleDriver";
		String url ="jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String password = "tiger";
		
		Connection conn=null;
		PreparedStatement pstmt=null;
		
		try {
			//1. 드라이버 로딩
			Class.forName(driver);
			
			//2. Connection 객체 얻기
			conn = DriverManager.getConnection(url,user,password);
			
			//3-1. 실행 객체 - PreparedStatement객체, : conn.prepareStatement(sql); 
			//Statement 객체 : conn.createStatement();
			String sql="insert into emp(empno,ename,sal,hiredate)" + 
					" values(eno_seq.nextval,'홍1',3000,sysdate)";
			pstmt= conn.prepareStatement(sql);
						
			//3-2. 쿼리문 실행 - executeUpdate() : insert,update,delete
			//					executeUpdate()의 리턴형태는 int
			//					executeQuery() : select
			//					executeQuery()의 리턴형태는 ResultSet
			int cnt= pstmt.executeUpdate();
			System.out.println("확인용 insert 실행 결과 row수 : "+cnt);
			
			//4. 추가 작업
			if(cnt>0) {
				System.out.println("입력이 되었습니다");
			}else {
				System.out.println("입력되지 않았습니다");
			}
		
		}catch(Exception e) {
			System.out.println("쿼리 실행 관련 에러 발생 ="+e);
		}finally {
			//5. 사용한 객체는 반납 : 객체.close();
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
