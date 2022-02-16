/**
 * 게시물
 * 
 * 
 */
package advance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import util.ConnectionFactory;

public class Test04 {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {			
			
		} catch(Exception e) {
			e.printStackTrace();
			
		}finally {
			ConnectionFactory.close(con, pstmt);
			/*
			try {con.close();} catch(Exception e) { };
			try {pstmt.close();} catch(Exception e) { };
			*/
		}
		
		
		
		
	}

}
