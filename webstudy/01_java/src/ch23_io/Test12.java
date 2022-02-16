package ch23_io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test12 {
	public static void main(String[] args) {
		//파일을 읽기 위한?
		FileInputStream fis = null;
		//파일의 메모리를 갖고와서 복사위한?
		FileOutputStream fos = null;
		
		
		//시간측정
		Timer t = new Timer();
		t.start();
		
		/**하나씩 옮기면 오래걸린다. 하나의 상자에 담아서 갖고가자
		 * 마지막에는 꽉채워서 갖고가지 않아도 된다.
		*/
		try {
			
			fis = new FileInputStream("data\\ch23\\exam\\A whole new world.mp3");
			fos = new FileOutputStream("data\\ch23\\exam\\A whole new world2.mp3");
			//시간측정
			
			while(true) {
				//일고
				int ch = fis.read();
				if(ch == -1) break;
				
				fos.write(ch);
			}
			//걸린시간 차이값 주기..
			System.out.println("복사 걸린 시간 : " + t.end());
			System.out.println("파일 복사가 완료되었습니다");
		
			
		}catch(Exception e){
			
			
		}finally {
			try {
			fis.close();
			fos.close();
			}catch(Exception e) {
				
			}
			
		}
		
		
		
		
		
		
		
		
	}

}
