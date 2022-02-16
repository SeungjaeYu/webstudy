package util;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class SqlExecutor {
	// ExecuteUpdate 결과를 넘겨주기위한 , insert delete ..
	public static int update(String sql, Object... args) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = ConnectionPool.getConnection();
			pstmt = con.prepareStatement(sql);

			int index = 1;
			for (Object arg : args) { //args가 object 타입이니까 ..
				pstmt.setObject(index++, arg);
			}

			return pstmt.executeUpdate();


		} finally {
			ConnectionFactory.close(pstmt);
			ConnectionPool.releaseConnection(con);

		}

	}

}
