package ch18_exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		try {
			int num = new Random().nextInt(2);
			System.out.println(100 / num); 
			Scanner sc = new Scanner(new File("a.txt"));
			int num2 = new Random().nextInt(2);
			System.out.println(100 / num2); 
			
			/**
			 * 다중 exception 주의점
			 * 
			 * 부모의 예외클래스가 자식 예외클래스보다 위쪽에 catch가 되면 문제발생
			 */
		} 
		catch(FileNotFoundException f) {
			System.out.println("파일을 찾지 못했음");
		}
		
		catch (ArithmeticException e) {
			System.out.println("숫자를 0으로 나누었습니다");
		}

		catch (Exception e) {

			System.out.println("예외가 발생했습니다");
			
		}
		
		System.out.println(1);


		
	}

}
