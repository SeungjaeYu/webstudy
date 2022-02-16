package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jdbc.board.vo.Board;

public class Test08 {
	public static void main(String[] args) {
		/**
		 * 
		 * 결과가 하나인것 
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
			sql.append(" select * ");
			sql.append("   from  tb_board ");
			sql.append("  where  no = ? ");
			
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setInt(1, 6);
			
			//ResultSet을 해주면 이전 칸을 가르킨다
			//next를 해줘야한다
			//rs.next는 boolean 형을 반환
			
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) { //존재한다면
				Board b = new Board();
				b.setNo(rs.getInt("no"));
				b.setTitle(rs.getString("title"));
				b.setContent(rs.getString("content"));
				b.setWriter(rs.getString("writer"));
				b.setViewCnt(rs.getInt("view_cnt"));
				b.setRegDate(rs.getDate("reg_date"));
				
				System.out.println(b.getNo());
				System.out.println(b.getTitle());
				System.out.println(b.getContent());
				System.out.println(b.getWriter());
				System.out.println(b.getViewCnt());
				System.out.println(b.getRegDate());
			} 
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {pstmt.close();} catch (Exception e2) {};
			try {con.close();} catch (Exception e3) {};
		}
	}

}
