package ch23_io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test14 {
	public static void main(String[] args) {
		//파일을 읽기 위한?
		FileInputStream fis = null;
		//파일의 메모리를 갖고와서 복사위한?
		FileOutputStream fos = null;
		
		//문자열을 읽는데 inputstream 타입을 버퍼로 사용하겠다
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		
		
		
		//시간측정
		Timer t = new Timer();
		t.start();
		

		try {
			
			fis = new FileInputStream("data\\ch23\\exam\\A whole new world.mp3");
			                            //(버퍼를 사용할 애의 이름) 2차 스트림 클래스 생성자의 조작할 1차스트림을 받는다
			bis = new BufferedInputStream(fis);
			
			fos = new FileOutputStream("data\\ch23\\exam\\A whole new world3.mp3");
			bos = new BufferedOutputStream(fos);
			
			while(true) {
				//일고
				int ch = bis.read();
				if(ch == -1) break;
				
				bos.write(ch);
			}
			//걸린시간 차이값 주기..
			System.out.println("복사 걸린 시간 : " + t.end());
			System.out.println("파일 복사가 완료되었습니다");
		
			
		}catch(Exception e){
			
			
		}finally {
			try {
				//2차 스트림을 먼저 닫아준다
				bis.close();
				bos.close();
			}catch(Exception e) {
				
			}
			try {
			fis.close();
			fos.close();
			}catch(Exception e) {
				
			}
			
		}
		
		
		
		
		
		
		
		
	}

}
