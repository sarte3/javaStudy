package jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//PreparedStatement 객체 이용 : 쿼리문을 미리 전달하여 나중에 실행
public class SelectTest02 {

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
			String sql="select mno,mname,mid,mpwd,mdate "
					+ "from member "
					+ "order by mno desc";			
			pstmt = conn.prepareStatement(sql);
			
			//3-2.쿼리문실행 - executeUpdate(): insert,update,delete
			//				executeUpdate()의 리턴형태는 int
			//				executeQuery() : select
			//				executeQuery()의 리턴형태는 ResultSet
			rs = pstmt.executeQuery();
			
			//4. 추가작업
			if(rs!=null) {
				while(rs.next()) {
					MemberDTO mDTO = new MemberDTO();
					
					//여기에서는 member테이블의 mno컬럼의 값을 가져와서
					//MemberDTO 클래스의 setmNO()메서드 파라미터로 제공하면
					//MemberDTO 클래스의 필드에 데이터가 세팅된다
					mDTO.setmNo(rs.getInt("mno"));
					mDTO.setmName(rs.getString("mname"));
					mDTO.setmId(rs.getString("mid"));
					mDTO.setmPwd(rs.getString("mpwd"));
					mDTO.setmDate(rs.getDate("mdate"));
					
					System.out.println(mDTO.toString());
					
				}
			}
			
			
			
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
