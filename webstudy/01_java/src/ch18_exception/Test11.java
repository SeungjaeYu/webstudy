/**
 * 목표
 * 
 * 간접처리방식 이해
 * 
 * throws : 메서드 선언문에 사용
 * 예외가 났을 때 발생한 메서드에서 예외한다고 선언해줘야한다
 * 
 * 런타임은 unchecked
 * ArithmeticException
 * 사용자에게 정보를 알려주기 위해 선언해놓는게 좋다 강제X
 * 
 */
package ch18_exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Test11 {
	private static void a() throws IOException, ArithmeticException{
		System.out.println(1 / 0);
		Scanner sc = new Scanner(new File("a.txt"));
		
	}
	public static void main(String[] args) {
		//throws로 나를 부른 곳으로 예외를 던졌기때문에 에러발생
		try {
			a();
			    //throws를 기준으로 받을 수 있는 것 catch >= throws 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(ArithmeticException f) {
			System.out.println("ArithmeticException 예외발생");
			f.printStackTrace();
		}
		
		
		
		
		
		
	}

}
