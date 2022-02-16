package ch23_io;

import java.io.File;

public class Test02 {
	public static void main(String[] args) {
		File f = new File("data/ch23");
		if(f.exists() == true) {
			System.out.println("존재하는 경로입니다");
			
			//f의 경로가 파일인지 디렉토리인지 확인하는 작업
			if(f.isDirectory()) System.out.println("디렉토리입니다");
			if(f.isFile()) System.out.println("파일입니다");
			
			
			
		}else {
			System.out.println("존재하지 않는 경로입니다");
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
