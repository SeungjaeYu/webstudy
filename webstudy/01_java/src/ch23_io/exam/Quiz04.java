package ch23_io.exam;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 * 
 * 파일 복사
 * data/ch23/exam/quiz04.txt 를 만들고
 * 파일의 내용으로 abcde를 입력한다.
 * 
 * 
 * quiz04 파일의 내용을 quiz04copy.txt 파일에 복사하는 프로그램 작성
 * 
 * 
 * @author bitsc-21
 *
 */


public class Quiz04 {
	public static void main(String[] args) {
	
		FileReader fr = null;	
	    FileWriter fw = null;
	
	
	try {
		fr = new FileReader("data/ch23/exam/quiz04.txt");
		fw = new FileWriter("data\\ch23\\exam\\quiz04copy.txt");
		
		while(true) {
			int ch = fr.read();
			if(ch == -1) break;
			fw.write(ch);
			System.out.print((char)ch);
		}
		
	}catch (Exception e) {
		e.printStackTrace();
	}finally {
		try {
			fw.close();
			fr.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
		
		
		
		
		
		
		
	}

}
