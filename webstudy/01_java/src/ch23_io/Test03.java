package ch23_io;

import java.io.File;
import java.io.IOException;

public class Test03 {
	public static void main(String[] args) {
		File f = new File("data/ch23");//디렉토리
		
		
		File child = new File(f, "a.txt");//현재 만들려고하는게 f를 부모로 디렉토리 개념, a.txt가 자식 
		                                   //f를 가르키고 있는 것에 뒤의 것을 만들어라..
		
		if(child.exists()) {
			System.out.println("존재한다");
		}else {
			System.out.println("  ^--^");
			System.out.println("< oㅅo >");
			System.out.println("  |><|");
			
		}
		//파일 만들어보기
		try {
			if(child.createNewFile()) {
				System.out.println("파일 생성 성공 :>");
				
			}else {
				System.out.println("파일생성 실패");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
