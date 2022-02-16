/**
 * 
 * 데이터 타입을 모를 때...???
 * 
 * 
 */
package advance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import util.ConnectionFactory;
import util.ConnectionPool;

public class Test06 {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {			
			con = ConnectionPool.getConnection();
			StringBuffer sql = new StringBuffer();
			sql.append("insert into tb_board( "); 
			sql.append("        no, title, writer, content "); 
			sql.append(" ) values (  "); 
			sql.append("   seq_board_no.nextval, ?, ?, ? ) ");
			pstmt = con.prepareStatement(sql.toString());
			
			/* 얘네는 데이터 타입을 아니까...
			int index = 1;
			pstmt.setString(index++, "안녕안녕");
			pstmt.setString(index++, "뇽안뇽안");
			pstmt.setString(index++, "코코코코");
			*/
			//타입을 모를 때는?? setObject
			int index = 1;
			pstmt.setObject(index++, "안녕안녕");
			pstmt.setObject(index++, "뇽안뇽안");
			pstmt.setObject(index++, "코코코코");
			
			
			
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
