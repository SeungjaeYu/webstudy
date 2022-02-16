package ch10_scanfile.exam;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		/**
		 * 이름 검색 : 호
		 * --------------
		 * 영화      배우     
		 * --------------
		 * 알라딘    나오미호동
		 * 기생충   송강호
		 * 쿵푸허슬  강호동
 		 * 
		 */
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("이름검색");
		String name = keyboard.nextLine();
		
		System.out.print(" -------------- ");
		System.out.print(" 영화      배우 ");    
		System.out.println(" -------------- ");
		
		File f = new File("data/ch10/exam/quiz02.txt");
		try {
			Scanner sc = new Scanner(f);
			
			
			while(sc.hasNextLine()) {
		        //줄단위로 읽겠다
				String line = sc.nextLine();
				//: 을 지웠다.
				String[] arr = name.split(":");
				
			
			}
			
			System.out.println(" -------------- ");
			
			
			
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
	}
	

}
