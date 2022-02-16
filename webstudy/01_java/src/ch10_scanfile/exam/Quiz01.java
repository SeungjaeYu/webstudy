/**
 * 확장자  : java
 *        입력받기
 * java파일
 * -------------
 * A.java
 * C.java
 * 
 *
 * 확장자  : jpg
 *        입력받기
 * jpg파일
 * -------------
 * 존재하지 않습니다.
 * 
 * 
 * 
 */
package ch10_scanfile.exam;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("확장자 :");
		String extName = keyboard.nextLine();
		System.out.println();
		System.out.println(extName + "파일");
		System.out.println("------------------");
		
		File f = new File("data/ch10/exam/quiz01.txt");
		try {
			Scanner sc = new Scanner(f);
			boolean flag = false;
			while(sc.hasNextLine()) {
				String name = sc.nextLine();
				
				//이름의 끝이 입력받은 확장자명이 아니면 스킵
				if(name.endsWith(extName) == false) continue;
				//맞으면 출력
				flag = true;
				System.out.println(name);
			}
			//아니면 없습니다
			if(flag == false) System.out.println("존재하지 않습니다");
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		

	
		
		
		
		
	
	}
}
