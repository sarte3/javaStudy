package test.exam.LeeJeongSam;

import java.sql.*;

public class SelectCompany {

	public static void main(String[] args) {

		String driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="scott";
		String password="tiger";
		
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		try {
			
			Class.forName(driver);
			
			conn=DriverManager.getConnection(url,user,password);
			
			String sql="select cno,cname,ceo,tel,dam from company";
			
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				/*
				 * int cno=rs.getInt("cno"); String cname=rs.getString("cname"); String
				 * ceo=rs.getString("ceo"); String tel=rs.getString("dam"); String
				 * dam=rs.getString("dam");
				 * 
				 * System.out.printf("%d %s %s %s %s\n",cno,cname,ceo,tel,dam);
				 */
				CompanyDTO cDTO=new CompanyDTO(rs.getInt("cno"), rs.getString("cname"), rs.getString("ceo"), rs.getString("tel"), rs.getString("dam"));
				
				System.out.println(cDTO);
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}finally {
			
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
