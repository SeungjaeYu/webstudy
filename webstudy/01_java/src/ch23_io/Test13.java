package ch23_io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test13 {
	public static void main(String[] args) {
		//파일을 읽기 위한?
		FileInputStream fis = null;
		//파일의 메모리를 갖고와서 복사위한?
		FileOutputStream fos = null;
		
		
		//시간측정
		Timer t = new Timer();
		t.start();
		
		try {
			
			fis = new FileInputStream("data\\ch23\\exam\\A whole new world.mp3");
			fos = new FileOutputStream("data\\ch23\\exam\\A whole new world2.mp3");
			/**하나씩 옮기면 오래걸린다. 하나의 상자에 담아서 갖고가자
			 * 마지막에는 꽉채워서 갖고가지 않아도 된다.
			 */
			
			//바구니 준비 : 버퍼
			//byte를 담는 버퍼라는 이름의 배열 준다
			byte[] buffer = new byte[1024 * 16];
			
			while(true) {
				//읽고 바구니에 넣어줘~
				//int는 실제 읽어들인 것의 크기.
				int ch = fis.read(buffer);
				if(ch == -1) break;
				
				//읽어들인 배열의 크기를 0번째부터 실제 읽어들인것 만큼
				fos.write(buffer, 0, ch);
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
