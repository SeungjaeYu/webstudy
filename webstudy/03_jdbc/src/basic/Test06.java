/**
 * 게시물
 * 
 * 
 */
package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Test06 {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr"
			);
			StringBuffer sql = new StringBuffer();
			sql.append("insert into tb_board( "); 
			sql.append("        no, title, writer, content "); 
			sql.append(" ) values (  "); 
			sql.append("   seq_board_no.nextval, ?, ?, ? ) ");
			
			
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setString(1, "w");
			pstmt.setString(2, "w");
			pstmt.setString(3, "w");
	        int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "개의 행이 추가되었습니다");
			
		} catch(Exception e) {
			
		}finally {
			try {con.close();} catch(Exception e) { };
			try {pstmt.close();} catch(Exception e) { };
			
		}
		
		
		
		
	}

}
