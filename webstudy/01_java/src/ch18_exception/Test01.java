/**
 * 
 * 목표
 * 
 * 예외의 개념을 이해하자
 * 예외 : Exception
 * 
 * <직접처리 방식>
 * -try, catch, finally : 직접처리와 연관 
 * 
 * 
 * -throws : 간접처리와 연관
 * -throw : 예외를 내가 직접 발생시킬 때 사용
 * <간접처리 방식>
 * 
 * 
 * 
 * 
 * <발생시점>
 *  : 컴파일시에 발생 (checked exception)
 *     - 코드를 작성했을 때 알 수 있다
 *  : 런타임시에 발생 (unchecked exception)
 *     - 실행을 했을때 알 수 있다. 개발자가 선택적으로 작업
 * 
 * 
 * 
 * -발생가능한 예외들을 클래스로 정의
 *                     Object(예외X)
 *                        |       
 *                   Throwable 최상위
 *                  ______|_______
 *                 |              | 
 *              Exception         Error => 프로그램에서 처리 불가능 심각쓰           
 *              =>모든 에러들은 Exception의 자식들.              
 *           _________|__________
 *          |                    | 
 *   IOException                 RuntimeException(권장)
 *  FileNotFoundException            _________|_________
 *          ....                    |                   | 
 *                                  NullPointerException
 *                                  ....
 *                                  
 *                                  
 *                             
 *     
 * 
 */


package ch18_exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new File(""));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//컴파일시 예외처리.
		
		
	}
	
	
	

}
