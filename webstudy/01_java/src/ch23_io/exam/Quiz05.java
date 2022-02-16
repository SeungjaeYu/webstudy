package ch23_io.exam;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class FileUtil{
	
     static void copy(String s1, String s2) {
    	 FileReader fr = null;
 		FileWriter fw = null;
 		File f = new File("data/day15/a/b");
 		boolean b = f.exists();
 		
 		try {
 			fr = new FileReader(s1);
 			if(b == false) {
 				//경로 생성
 				f.mkdirs();
 			}
 			if(f.isDirectory()) {
 				//파일복사
 				fw = new FileWriter("data/day15/a/b/aa.txt");
 			}
 				fw = new FileWriter("data/day15/a/b/acopy.txt");
 			
 			while(true) {
 				int ch = fr.read();
 				if(ch == -1) break;
 				fw.write(ch);
 				System.out.println((char)ch);
 			}
 			
 		}catch (Exception e) {
 			System.out.println("파일 복사중 오류 발생");
 		} finally {
 			try {
 				fr.close();
 				fw.close();
 			} catch (Exception e) {
 				// TODO Auto-generated catch block
 				e.printStackTrace();
 			}
 		}
    	 
    	 
    	 
    	 
    	 
    	 
    	 
     }
	
    
    

	
}



public class Quiz05 {
	public static void main(String[] args) {
		
	
	
	/*
	 *  data/ch23/exam/aa.txt의 파일을 data/ch23/exam/a/b/acopy.txt로 복사한다.
	 *  만약, acopy.txt 파일이 복사될 data/ch23/exam/a/b 디렉토리가 존재하지 않는다면
	 *  디렉토리를 생성 후 파일을 복사한다.
	 */
	
		FileUtil.copy("data/ch23/exam/aa.txt", "data/ch23/exam/a/b/acopy.txt");
		System.out.println("복사성공");
	/*
			 	data/ch23/exam/aa.txt 파일의 내용을 
			 	data/day15/a/b가 존재하는 디렉토리일 경우 해당 디렉토리 아래로 복사하는 파일과 동일한 이름(aa.txt)으로 복사한다.
	 */
		
		
		
		
		
	}
}
