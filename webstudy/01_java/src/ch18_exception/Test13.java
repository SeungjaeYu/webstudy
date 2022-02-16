/**
 * 
 * 목표
 * 
 * 사용자 정의 예외 이해하기
 * 
 * -예외 클래스를 상속받으면 예외가 된다.
 * -RuntimeException 계열을 상속받으면 실행시 예외클래스
 * -RuntimeException 계열이 아니면 컴파일시 예외클래스
 * -throw와 같이 사용한다.
 * 
 * 
 * 
 */
package ch18_exception;

import java.util.Scanner;

public class Test13 {
	private static boolean checkJuminNo(String juminNo) throws JuminNumberException {
		//if juminNo가 잘못되어있다면 에러 발생
		juminNo = juminNo.replace("-", "");
		if(juminNo.length() != 13) {
			//강제 예외 발생 JuminNumberException
			throw new JuminNumberException(juminNo);
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호 입력 : ");
		String juminNo = sc.nextLine();
		try {
		    checkJuminNo(juminNo);
		    System.out.println("체크 성공");
		}
		catch (JuminNumberException e) {
			System.out.println("예외발생");
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
	}

}
