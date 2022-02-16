/* 
	결과출력> 
	
	data/ch23 폴더
	---------------------------
	file : a.txt(1byte)
	file : b.txt(13byte)
	directory : quiz
	file : Test01.java(1820byte)
	---------------------------
 */
package ch23_io.exam;

import java.io.File;
import java.io.FilenameFilter;

public class Quiz02 {
	public static void main(String[] args) {
		File f = new File("data/ch23");
		//목록의 리스트 배열로 저장
		File[] sf = f.listFiles();

		for(File f2 : sf) {
			if(f2.isDirectory()) {
				System.out.println("directory : " + f2.getName());
				continue;
			}
			System.out.printf("file : %s(%dbyte)%n", f2.getName(), f2.length());
		}
		
		
		
		System.out.println("------------");
		
		
		
		
		
		
	}
	
	

}
