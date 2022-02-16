/**
 * 목표
 * 
 * finally 블럭에 대해 이해하자
 * 
 * 
 * 
 */
package ch18_exception;

public class Test09 {
	public static void main(String[] args) {
		System.out.println(1);
		
		try {
			String s = null;
//			s = "a";
			System.out.println(s.length());
			System.out.println(2);
			
		}
		catch(Exception e ) {
			System.out.println(3);
//			return;
			System.exit(0);
			
		}
		//return을 줘도 finally를 실행하고 끝낸다
		//exit는 완전종료라 종료된다.
		finally {
			System.out.println(4);
		}
		System.out.println("main end");
		
		
		//여기까지가 직접처리
		
		
	}

}
