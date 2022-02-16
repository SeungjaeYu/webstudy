package ch18_exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		try {
			int num = new Random().nextInt(2);
			System.out.println(100 / num); //runtime오류,, 일단 예외로 두고 찍고싶다
			Scanner sc = new Scanner(new File("a.txt"));
			   /**try 문에서 발생할 수 있는 모든 예외를 처리하겠다 Exception
			    * 모든 예외에 대해서 동일한 처리가 진행된다
			   */
		} catch (Exception e) {
		
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
}
