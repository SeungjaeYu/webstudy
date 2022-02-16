package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Test07 {
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
					"jdbc:oracle:thin:@localhost:1521:xe","hr", "hr"
					);
			
			StringBuffer sql = new StringBuffer();
			sql.append(" update tb_board ");
			sql.append("    set title = ? ,");
			sql.append("        content = ? ");
			sql.append("  where no = ?  ");
			
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setString(1, "박하사탕");
			pstmt.setString(2, "나다시돌아갈래");
			pstmt.setInt(3, 3);
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt);
			
			
			
			//하나를 바꾸면 나머지 위치값들을 다 바꿔야 한다.. 
			// 해결
			/*
			 * int index = 1;
			 * pstmt.setString(index++, "");
			 * pstmt.setString(index++, "");
			 * pstmt.setString(index++, "");
			 * pstmt.setString(index++, "");
			 * 
			 * 
			 * 
			 * 
			 */
			
			
		}catch (Exception e) {
			
		}finally {
			try {con.close(); } catch (Exception e) { } ;
			try {pstmt.close();} catch (Exception e) { } ;
			}
		}
		
		
		
		
		
	

}
