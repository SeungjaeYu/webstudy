package advance;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import util.ConnectionPool;

public class Test09 {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = ConnectionPool.getConnection();
			
			
			String tableName = "tb_board";
			StringBuffer sql = new StringBuffer();
			sql.append(" select * ");
//			sql.append("   from tb_board ");
			sql.append("   from " + tableName);
			
			pstmt = con.prepareStatement(sql.toString());
			
			ResultSet rs = pstmt.executeQuery();
			
			//동적으로 바뀌었을 때 사용 할 수 있게해야한다
			//메타데이터.. Resultset에 대한 정보 갖고오기
			ResultSetMetaData rsmd	= rs.getMetaData();
			int count = rsmd.getColumnCount();
			System.out.println("컬럼은 " + count + "개");
			//컬럼 갖고오기
			System.out.println("------------------------------------");
			for(int i = 1; i < count ; i++) {
				String columnName = rsmd.getColumnName(i); //숫자값을 주면 숫자값의 위치한 컬럼 값을 넘겨준다
				String columnType = rsmd.getColumnTypeName(i); //컬럼타입얻기
				System.out.print(columnName + "("+columnType + ") "+"\t" );
				
				
			}
			System.out.println("\n------------------------------------");
			
			
			//컬럼정보 갖고오기
		     while (rs.next()) {
		    	 for(int i = 1; i < count ; i++) {
						String columnName = rsmd.getColumnName(i); //숫자값을 주면 숫자값의 위치한 컬럼 값을 넘겨준다
						System.out.print(rs.getObject(columnName) + "\t" );
					}
		    	 System.out.println("\n-------------------------------");
			}
		     //테이블 명이 바뀌었을 때 컬럼에 대한 정보를 변경하게 하기
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
