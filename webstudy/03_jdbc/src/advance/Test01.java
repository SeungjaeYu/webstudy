/**
 * 트랜잭션(Transaction)
 * 
 * - 논리적으로 DML 문장들을 묶는 단위
 * - 전부 다 처리되거나 전부 다 처리되지 않아야 한다(all or nothing)
 * 
 * - commit : 데이터베이스에 완전하게 적용
 * - rollback : 이전 커밋까지 되돌리기
 * - savepoint : 중간 저장점
 * 
 * 
 * - JDBC 프로그램은 기본 설정이 autocommit 이 true인 상태이다.
 * - DDL 명령어는 autocommit(자동커밋)이 발생한다
 * 
 * 
 * 
 * cmd 명령창 2개를 띄웠다
 * 
 * 명령창 2개에 sqlplus hr/hr 로 접속해졌다
 * 
 * 명령창 1에 테이블을 만들어줬다
 * create table tb_tran (
 *  no number,
 *  data varchar2(10)
 *  
 * );
 * 
 * 명령창 1, 명령창2에서 
 * select * from tb_tran;
 * 
 * 명령창 1, 2 둘 다 no rows selected 뜬다. 
 * 
 * 명령창1에서 값을 넣어줬다
 * insert into tb_tran ( no, data) values (1, 'a');
 * 
 * 명령창 1, 2에서 테이블을 확인해봤다
 * 명령창 1에서는 잘 나왔지만 명령창2에서는 값이 없었다.
 * 
 * 명령창1에 commit; 을 시켰다. 완전한 적용. 
 * 다른 사용자에게도 공개된다
 *
 * 다시 명령창2에서 데이터를 확인했다. 잘나온다
 * 
 * 명령창1에서 데이터를 더 추가해보자
 * insert into tb_tran ( no, data) values (2, 'b');
 * insert into tb_tran ( no, data) values (3, 'c');
 * 
 * 다시 확인해보기
 * select * from tb_tran;
 * 
 * 명령창1에서 rollback을 줘보자
 * rollback : 이전 commit 전까지 돌아간다. 즉, 1, 'a' 데이터만 남아있다
 * 
 * 
 * 명령창1
 * update tb_tran set data = 'aaa' where no = 1;
 * 
 * <명1 에서 수정을 하고 data a 를 aaa로 변경했다. 
 * 명2에서 data를 abc로 또 변경하려면.. 멈춘다.. 
 * rock에 빠진다 1에서 commit을 안해줬기때문에>
 * => 해결책 : 명1에 commit을 해준다.
 * 
 * 
 */
package advance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import jdbc.board.vo.Board;

public class Test01 {
	public static void main(String[] args) {
		/**
		 * 예제 
		 * 
		 * 계좌이체 상황
		 * 
		 * a 사용자가 b 사용자에게 50,000원을 계좌이체하려고 한다
		 * 
		 * 계좌 테이블 : tb_account
		 * 컬럼 : id , money
		 *       a  , 100,000
		 *       b  , 100,000
		 *       
		 *       
		 * 계좌 이체 후 >
		 *       a  ,  50,000   -> update tb_account set money = money - 50000 where id = 'a';
		 *       b  , 150,000   -> update tb_account set money = money + 50000 where id = 'b';
		 *       
		 * => 논리적으로 같이 처리되어야한다
		 *   : 트랜젝션의 단위..
		 *  
		 */
		Connection con = null;
		PreparedStatement pstmt = null;
		PreparedStatement pstmt2 = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe","hr", "hr"					
			);
			
			StringBuffer sql = new StringBuffer();
			sql.append(" update tb_account set money = money - 50000 where id = 'a' ");
			
			pstmt = con.prepareStatement(sql.toString());
			pstmt.executeUpdate();
			

			StringBuffer sql2 = new StringBuffer();
			//에러가 날 환경 조성
			sql2.append(" update tb_account set mney = money + 50000 where id = 'b' ");
			
			pstmt2 = con.prepareStatement(sql2.toString());
			pstmt2.executeUpdate();
			
			System.out.println("계좌이체 성공");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {pstmt.close();} catch (Exception e2) {};
			try {pstmt2.close();} catch (Exception e2) {};
			try {con.close();} catch (Exception e3) {};
		}
		
		
		
		
		
		
		
		
	}

}
