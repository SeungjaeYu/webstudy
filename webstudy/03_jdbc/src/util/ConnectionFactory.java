package util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

public class ConnectionFactory {
	public static Connection getConnection( ) throws Exception {
		
		Properties prop = new Properties();
		prop.load(new FileReader("C:\\java\\workspace\\03_jdbc\\src\\util\\db.properties"));
		
		Class.forName(prop.getProperty("driver"));
		 return DriverManager.getConnection(
				 prop.getProperty("url"), 
				 prop.getProperty("username"), 
				 prop.getProperty("password")
		);
		
	}
	
	
	
	public static void close(Connection con, PreparedStatement pstmt) {
		
		try {pstmt.close();} catch(Exception e) { };
		try {con.close();} catch(Exception e) { };
		
		
		
	}
     /*
	public static void main(String[] args) throws Exception{
		//테스트..
		//db.properties 를 사용하기위해
		Properties prop = new Properties();
		//인식시키기
		prop.load(new FileReader("C:\\java\\workspace\\03_jdbc\\src\\util\\db.properties"));
		//데이터 꺼내기
		System.out.println(prop.getProperty("driver"));
		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
		
	}
	*/



	public static void close(PreparedStatement pstmt) {
		// TODO Auto-generated method stub
		close(null, pstmt);
	}
	
}
