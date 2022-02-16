/**
 * Data 의 처리 클래스
 * 
 * CRUD -> 
 * CREATE  : insert + 기능
 * READ    : select + 기능,  selectOne + 기능
 * UPDATE  : update + 기능
 * DELETE  : delete + 기능
 */
package jdbc.board.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import jdbc.board.vo.Board;
import util.ConnectionFactory;
import util.ConnectionPool;
import util.SqlExecutor;

public class BoardDAO {
	
	public List<Board> selectBoard() {
		List<Board> list = new ArrayList<>(); // while이 끝나면 없어지니 담아라
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = ConnectionPool.getConnection();
			

			StringBuffer sql = new StringBuffer();
			sql.append(" select * ");
			sql.append("   from  tb_board ");
			sql.append("  order by  no desc "); // 정렬 최신글

			pstmt = con.prepareStatement(sql.toString());

			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) { // 존재한다면
				Board b = new Board();
				b.setNo(rs.getInt("no"));
				b.setTitle(rs.getString("title"));
				b.setContent(rs.getString("content"));
				b.setWriter(rs.getString("writer"));
				b.setViewCnt(rs.getInt("view_cnt"));
				b.setRegDate(rs.getDate("reg_date"));
				list.add(b);

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ConnectionFactory.close(pstmt);
			ConnectionPool.releaseConnection(con);
		}
		return list;
	}
	
	
	public Board selectOneBoard(int no) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {		
			con = ConnectionFactory.getConnection();
			StringBuffer sql = new StringBuffer();
			sql.append("select * ");
			sql.append("  from tb_board ");
			sql.append(" where no = ? ");

			pstmt = con.prepareStatement(sql.toString());
			pstmt.setInt(1, no);

			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				Board board = new Board();
				board.setNo(no);
				board.setWriter(rs.getString("writer"));
				board.setContent(rs.getString("content"));
				board.setTitle(rs.getString("title"));
				board.setRegDate(rs.getDate("reg_date"));
				return board;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ConnectionFactory.close(pstmt);
			ConnectionPool.releaseConnection(con);

		}

		return null; // rs.next가 false일때
	}
	
	public void insertBoard(Board board) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
               SqlExecutor.update( //sql 문을 넣어준다
					"insert into tb_board(  "
					+ "no, title, writer, content  ) "
					+ "values ( "
					+ "seq_board_no.nextval, ?, ?, ? ) " //이후에는 넣어줄 값
					, board.getTitle(), board.getWriter(), board.getContent()
	
		     );
	
		} catch (Exception e) {
			e.printStackTrace();
			
		}

		
	}

	public void updateBoard(Board board) {
       /*
		Connection con = null;
		PreparedStatement pstmt = null;
		*/
		try {
			SqlExecutor.update( // sql 문을 넣어준다
					"update tb_board set title = ?, content = ? where no = ? ", 
					board.getTitle(), board.getContent(),board.getNo()
					);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int deleteBoard(int no) {

		try {
			return SqlExecutor.update(
					" delete  from tb_board  where no = ?", no
					);

		} catch (Exception e) {

		}
		return 0;

	}
}












