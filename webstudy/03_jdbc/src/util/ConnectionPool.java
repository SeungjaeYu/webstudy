package util;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {
	private static final int INIT_COUNT = 3; // 연결객체 3개만 만들겠다
	private static List<Connection> free = new ArrayList<>();// free 3개가 들어갈 것
	private static List<Connection> used = new ArrayList<>();
	
	
	//연결
	static {
		try {
			for (int i = 0; i < INIT_COUNT; i++) {
				free.add(ConnectionFactory.getConnection());
			}
		} catch (Exception e) {
			System.out.println("초기 연결풀 생성 에러 발생");
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() throws Exception {
		/*
		Connection con = free.get(0);
		free.remove(0);
		// 프리에 있던 것을 유즈드에 옮기고 프리는 없앴다.
		*/
		if(free.isEmpty()) {
			throw new Exception("사용할 수 있는 커넥션이 없습니다");
		}
		Connection con = free.remove(0);
		used.add(con);
		return con;
	}
	
	//다썼으니 정리
	public static void releaseConnection(Connection con) {
		//used 에서 커넥션을 찾아 제거
		used.remove(con);
		//다시 free 쪽으로 돌려준다
		free.add(con);
	}
	
	
	
	public static void main(String[] args) {
		// 테스트
		try {
			//사용자가 10번을 요청했다
			for(int i = 1; i <= 10; i++ ) {
				//2초씩 멈춘다음 돌아줘
				Thread.sleep(2000);
				//connection 요청하기 => 3번째가 넘어가면 사용할 수 있는 커넥션이 없어서 error 
				// 해결 : release해줘야 한다
				Connection con = ConnectionPool.getConnection();
				System.out.println(i + "번째 사용자 요청" + con);
				//3개의 주소값이 도는 것을 확인 할 수 있다.
				ConnectionPool.releaseConnection(con);
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
	}
 
	

}
