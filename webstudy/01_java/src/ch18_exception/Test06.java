package ch18_exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		try {
			int num = new Random().nextInt(2);
			System.out.println(100 / num); // runtime오류,, 일단 예외로 두고 찍고싶다
			Scanner sc = new Scanner(new File("a.txt"));
			int num2 = new Random().nextInt(2);
			System.out.println(100 / num2); // runtime오류,, 일단 예외로 두고 찍고싶다
			
			/**
			 * 다중 exception 처리
			 * 
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
			// TODO Auto-generated catch block
		}
		
		System.out.println(1);


		
	}
}
