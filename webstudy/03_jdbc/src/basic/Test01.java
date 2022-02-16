/**
 * java에서 DBMS 연결하기
 * 
 * 
 * JDBC 프로그래밍 필수 단계
 * 1. 드라이버 로딩하기(API : Class.forName())
 * 2. 연결하기(Connection, DriverManager.getConnection())
 * 3. SQL 작성하기
 * 4. SQL 실행객체 얻기
 * 5. SQL 실행하기
 * 6. 실행된 결과 처리하기
 * 7. 연결된 객체 닫기 
 * 
 */
package basic;

import java.sql.Connection;
import java.sql.DriverManager;

public class Test01 {
	public static void main(String[] args) {
//		Class.forName("드라이버명");
		// ClassNotFoundException error :
//	    1. builed path 설정이 제대로 됐는지, 
//		2. 오타가 났는지 확인

//		1단계. 드라이버 로딩하기
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공");

//		 2단계. 연결하기
//		 sql 틀에서 필요한 것 : 
//	           사용자 이름(hr), 패스워드(hr), 포트번호(1521), 호스트(주소) (localhost), 서비스아이디(xe)
//		 jdbcurl 형식
//		 프로토콜명(jdbc), 데이터베이스 드라이버 타입(orcle:thin), 데이터베이스주소(@localhost)
//		포트번호(1521), 서비스아이디(xe) 구분은 ':' 로 해준다
			Connection con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr"
			);
			System.out.println("con : " + con);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
