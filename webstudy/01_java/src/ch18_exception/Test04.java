package ch18_exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		try {
			System.out.println(1);
			Scanner sc = new Scanner(new File("a.txt"));
	     	//fnfe는 변수명
	     	System.out.println(2);
		} //캐치(묵시적 형변환. 부모가 올 수 있다)
		  //catch(Object  fnfe) Object는 올 수 없다. 예외타입이 아니라서.
		catch(Throwable fnfe) { 
			System.out.println(3);
		}
		 System.out.println(4);
		
		
		
		
	
	}

}
