/**
 * 목표
 * 
 * 예외관련 API 활용한 예외메세지 다루기
 * 
 * 
 */

package ch18_exception;

public class Test10 {
	private static void a() {
		System.out.println(1 / 0);
		
	}
	
	
	public static void main(String[] args) {
		try {
			a();
		}
		catch(Exception e) {
			System.out.println("에러발생");
			
			//에러메세지 조작
			//StackTraceElement : 클래스명, 메서드명, 파일명, 라인번호
			StackTraceElement[] arr = e.getStackTrace();
			System.out.println("파일명\t클래스명\t메서드명\t라인번호");
			System.out.println("-------------------------------");
			for(StackTraceElement ele : arr) {
				System.out.printf("%s %s %s %d %n",
						ele.getFileName(), 
						ele.getClass(), 
						ele.getMethodName(), 
						ele.getLineNumber());
			}
			
			
			/*
			<간단 에러 메세지 확인>
			String errMeg = e.getMessage();
			System.out.println(errMeg);
			
			
			<상세한 에러 메시지 확인>
			e.printStackTrace();
			 */

		}
		
		
		
		
		
		
		
	}

}
