/**
 * 게시물
 * 연결 ConnectionPool
 * 
 * 
 */
package advance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import util.ConnectionFactory;
import util.ConnectionPool;

public class Test05 {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {			
			con = ConnectionPool.getConnection();
			StringBuffer sql = new StringBuffer();
			sql.append("insert into tb_board( "); 
			sql.append("        no, title, writer, content "); 
			sql.append(" ) values (  "); 
			sql.append("   seq_board_no.nextval, 'a', 'b', 'c' ) ");
			
			
			pstmt = con.prepareStatement(sql.toString());
			
	        int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "개의 행이 추가되었습니다");
			
		} catch(Exception e) {
			e.printStackTrace();
			
		}finally {
			ConnectionFactory.close(pstmt);
			 ConnectionPool.releaseConnection(con);
			
		}
		
		
		
		
	}

}
