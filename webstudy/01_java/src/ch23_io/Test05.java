package ch23_io;

import java.io.File;

public class Test05 {
	public static void main(String[] args) {
		File f = new File("data/ch23/exam/aaa");
//		f.mkdirs(); 디렉토리 만들어주기
		System.out.println(
				//이름변경하기
		f.renameTo(new File("data/ch23/exam/bbc3")) 
		       ? "이름변경 성공" : "실패"
					
				);
		
	}

}
