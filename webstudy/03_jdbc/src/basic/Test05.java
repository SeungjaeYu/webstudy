/**
 * 게시물 삭제 프로그램 작성
 * 
 * 
 * 
 * 
 */
package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Test05 {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
		
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr"
				);
			
		   
			StringBuffer sql = new StringBuffer();
			sql.append("delete ");
			sql.append("  from tb_board ");
			sql.append(" where no = ? ");
			
			// ? 자리에 쿼리문을 실행하기 전에 값을 대입해야한다.
			//? 의 값을 설정
	
			pstmt = con.prepareStatement(sql.toString()); 
			pstmt.setInt(1, 4);
			                                             		
			int cnt = pstmt.executeUpdate();  
						
			System.out.println(cnt + "개의 행이 삭제되었습니다");
			
		 	
			
		}catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {pstmt.close();} catch (Exception e) {e.printStackTrace();}
			try {con.close();} catch (Exception e) {e.printStackTrace();}
			
		}
		
		
		
		
		
		
		
		
		
	}

}
