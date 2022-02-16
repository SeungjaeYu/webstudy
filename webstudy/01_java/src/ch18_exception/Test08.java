package ch18_exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Random;
import java.util.Scanner;

public class Test08 {
public static void main(String[] args) {
	try {
		int num = new Random().nextInt(2);
		System.out.println(100 / num); 
		
		//NullPointerException
		String s = null;
		System.out.println(s.length());
		
		int[] arr = new int[new Random().nextInt(2)];
		//ArrayIndexOutofBoundException
		System.out.println(arr[0]); 
		
		
		//FileNoFoundException
		Scanner sc = new Scanner(new File("a.txt"));
		
		
		//IOException
		FileReader fr = new FileReader("a.txt");
		fr.read();
				
		
		
		/**
		 * 다중 exception 주의점
		 * 
		 * 부모의 예외클래스가 자식 예외클래스보다 위쪽에 catch가 되면 문제발생
		 */
	} 
	
	/**1.7부터 하나의 catch문으로 여러개의 예외 클래스를 다룰 수 있게 지원함*/
	
	catch(FileNotFoundException f) {
		System.out.println("파일을 찾지 못했음");
	}

	catch (ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException n) {
		System.out.println("실행시 예외 발생");
		System.out.println("실행시 예외 발생");
		System.out.println("실행시 예외 발생");
		
	}

	
//	catch(NullPointerException n) {
//		System.out.println("실행시 예외 발생");
//	}
	
//	catch(ArrayIndexOutOfBoundsException a) {
//		System.out.println("실행시 예외 발생");
//	}

	catch (Exception e) {

		System.out.println("예외가 발생했습니다");
		
	}
	
	System.out.println(1);


	
}
}
