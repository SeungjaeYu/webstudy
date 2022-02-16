/**
 * java에서 DBMS 연결하기
 * 
 * 
 * JDBC 프로그래밍 필수 단계
 * 1. 드라이버 로딩하기(API : Class.forName())
 * 2. 연결하기(Connection, DriverManager.getConnection())
 * 3. SQL 작성하기(StringBuffer)
 * 4. SQL 실행객체 얻기(PreparedStatement)
 * 5. SQL 실행하기(executeUpdate)
 * 6. 실행된 결과 처리하기(int)
 * 7. 연결된 객체 닫기 (close)
 * 
 * 
 * 게시물 삭제 프로그램 작성
 * 
 */
package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Test02 {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			//1단계 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2단계 드라이버 연결
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr"
				);
			
		   //3단계 SQL 작성 (StringBuffer)
			StringBuffer sql = new StringBuffer();
			sql.append("delete ");
			sql.append("  from tb_board ");
			sql.append(" where no = 9 ");
			
		  //4단계 SQL 실행객체 얻기
			pstmt = con.prepareStatement(sql.toString()); 
			                                              //스트링버퍼 스트링으로
			
		 //5단계 SQL 실행하기
	     //SQL select 절일때 : pstmt.executeQuery()
	   	 //SQL select 절이 아닌 경우 pstmt.executeUpdate()
		 // 결과를 실행했을 때 정수값을 받음. 반영된 결과 만큼.. 조건에 맞지 않으면 0
			int cnt = pstmt.executeUpdate();   //지금 실행할 문장이 select 절이 아니니까
			
			
		//6단계 결과처리	
			System.out.println(cnt + "개의 행이 삭제되었습니다");
			
		 	
			
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
		 //7단계 객체닫기
			try {pstmt.close();} catch (Exception e) {e.printStackTrace();}
			try {con.close();} catch (Exception e) {e.printStackTrace();}
			
		}
		
		
		
		
		
		
		
		
		
	}

}
