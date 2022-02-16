/**
 * 
 * SQLExecutor를 사용해보자
 * 
 * 
 */
package advance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import util.ConnectionFactory;
import util.ConnectionPool;
import util.SqlExecutor;

public class Test08 {
	public static void main(String[] args) {
		try {
			int cnt = SqlExecutor.update( //sql 문을 넣어준다
					"insert into tb_board(  "
					+ "no, title, writer, content  ) "
					+ "values ( "
					+ "seq_board_no.nextval, ?, ?, ? ) " //이후에는 넣어줄 값
					, "ttt", "ddd", "ccc"
	
		     );

			System.out.println(cnt + "개의 행이 추가되었습니다");

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}
