package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Repeat01 {
	// 삭제
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr"
					);
			StringBuffer sql = new StringBuffer();
			sql.append("  delete  ");
			sql.append("    from tb_board ");
			sql.append("   where no = ? ");
			
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setInt(1, 23);
			
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "개 실행");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
			try {
				con.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
			
		}
		
		
		
		
	}

}
