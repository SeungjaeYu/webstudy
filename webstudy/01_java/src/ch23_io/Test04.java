package ch23_io;

import java.io.File;

public class Test04 {
	public static void main(String[] args) {
		//삭제해보자
		File f =new File("data/ch23/exam/aaa");
		
		if(f.delete()) {
			System.out.println("삭제되었습니다");
		} else {
			System.out.println("삭제실패");
		}
		
		
		
	}

}
