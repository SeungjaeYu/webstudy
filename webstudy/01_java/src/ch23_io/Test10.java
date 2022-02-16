/**
 * 목표
 * 
 * FileInputStream, FileReader : 둘다 파일처리
 *
 */
package ch23_io;

import java.io.FileReader;
import java.io.IOException;

public class Test10 {
	public static void main(String[] args) {
		//다시 짜보자 . 한글
		FileReader fr = null;
		try {
			fr = new FileReader("");
			while (true) {
				int ch = fr.read();
				if (ch == -1)
					break;
				System.out.print((char) ch);

			}

		} catch (Exception e) {

		} finally {
			try {
				if (fr != null)
					fr.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		

		
		
		
		
		
		/*
		FileReader fr = null;
		try {
			fr = new FileReader("data/ch23/test10.txt");
			while(true) {
				int ch = fr.read();
				if(ch == -1) break;
				System.out.print((char)ch);				
			}
			
		}catch(Exception e){
			e.printStackTrace();
	
		}finally {
			try {
			fr.close();
			} catch(Exception e){
				
			}
		}
		
		*/
		
		
		
		
		
		
		
		/*
//		File f = new File("data/ch23/text10.txt");
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("data/ch23/test10.txt");
			while (true) {
				int ch = fis.read();
				// -1 읽을게 없다면 나가라
				if (ch == -1)
					break;
				System.out.print((char) ch + "☆");
			}
			// fis.close();
		} catch (Exception e) {
			// try에서만 선언해서 에러..
			// fis.close();
			e.printStackTrace();

		} finally {
			// 정상적이나 오류 있을 때나 둘 다 닫아야하니까 finally에 ..
			try {
				fis.close();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		*/
		
		

	}

}
