package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Test04 {
	public static void main(String[] args) {
		/**
		 * 게시물 수정 프로그램 작성
		 * 
		 *  존재하는 글번호 하나 선택해서
		 *  제목 ; 수정된 제목
		 *  내용 : 수정된 내용으로 변경
		 * 
		 * 
		 */
		
		
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1524:xe","hr", "hr"
					);
			
			StringBuffer sql = new StringBuffer();
			sql.append(" update tb_board ");
			sql.append("    set title = '메밀꽃필무렵' ");
			sql.append("        content = '여름장이란'");
			sql.append("  where no = 2 ");
			
			pstmt = con.prepareStatement(sql.toString());
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt);
			
			
		}catch (Exception e) {
			
		}finally {
			try {con.close(); } catch (Exception e) { } ;
			try {pstmt.close();} catch (Exception e) { } ;
			}
		}
		
		
		
		
		
	

}
