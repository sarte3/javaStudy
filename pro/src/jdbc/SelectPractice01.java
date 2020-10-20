package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectPractice01 {

	public static void main(String[] args) {

		String driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="scott";
		String password="tiger";
		
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		try {
			//오라클 jdbc 드라이버 로드
			Class.forName(driver);
			
			int i=25;
			System.out.println(++i);
			i+=5;
			System.out.println(i);
			
			//connection 객체 얻기
			conn = DriverManager.getConnection(url,user,password);
			
			//sql 준비
			String sql="select mNo, mName from member";
			
			//PreparedStatement 객체 준비
			pstmt = conn.prepareStatement(sql);
			
			//쿼리 실행
			rs = pstmt.executeQuery();
			
			//결과값 출력
			if(rs!=null) {
				
				while(rs.next()) {
					MemberDTO m = new MemberDTO();
					
					m.setmNo(rs.getInt("mno"));
					m.setmName(rs.getString("mname"));
					
					System.out.println(m.getmNo()+"\t"+m.getmName());

				}
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {
				
			}
		}
		
	}

}
