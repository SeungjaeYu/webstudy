package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import jdbc.board.vo.Board;

public class Test09 {
	public static void main(String[] args) {
		
		/**
		 * 결과가 여러개인 것 이해하기
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
			sql.append("  order by  no desc "); //정렬 최신글
			
			pstmt = con.prepareStatement(sql.toString());

			
			//ResultSet을 해주면 이전 칸을 가르킨다
			//next를 해줘야한다
			//rs.next는 boolean 형을 반환
			
			List<Board> list = new ArrayList<>(); // while이 끝나면 없어지니 담아라
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) { //존재한다면
				Board b = new Board();
				b.setNo(rs.getInt("no"));
				b.setTitle(rs.getString("title"));
				b.setContent(rs.getString("content"));
				b.setWriter(rs.getString("writer"));
				b.setViewCnt(rs.getInt("view_cnt"));
				b.setRegDate(rs.getDate("reg_date"));
				list.add(b);
		
			} 
			for(Board b : list) {
				System.out.print(b.getNo() + "\t");
				System.out.print(b.getTitle()+ "\t");
				System.out.print(b.getContent()+ "\t");
				System.out.print(b.getWriter()+ "\t");
				System.out.print(b.getViewCnt()+ "\t");
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
