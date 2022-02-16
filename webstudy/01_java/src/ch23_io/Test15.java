package ch23_io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class Test15 {
	public static void main(String[] args) {
		//파일을 읽기 위한?
		FileReader fr = null;
		//파일의 메모리를 갖고와서 복사위한?
		FileWriter fw = null;
		

		BufferedReader br = null;
		BufferedWriter bw = null;
		
		
		
//		
//		//시간측정
//		Timer t = new Timer();
//		t.start();
//		

		try {
			
			fr = new FileReader("data/ch23/a.txt");
			                            //(버퍼를 사용할 애의 이름) 2차 스트림 클래스 생성자의 조작할 1차스트림을 받는다
			br = new BufferedReader(fr);
			
			fw = new FileWriter("data/ch23/a2.txt");
			bw = new BufferedWriter(fw);
			
			while(true) {
				//String bfr = buffer .readLine();
				String str = br.readLine(); //줄넘김 제외
				if(str == null) break;
				
				//줄넘김 걸러준다
				bw.write(str);
				//newLine() 줄넘김을 운영체제에 맞게 처리해준다
				bw.newLine();

			}
			//걸린시간 차이값 주기..
//			System.out.println("복사 걸린 시간 : " + t.end());
			System.out.println("파일 복사가 완료되었습니다");
		
			
		}catch(Exception e){
			
			
		}finally {
			try {
				//2차 스트림을 먼저 닫아준다
				br.close();
				bw.close();
			}catch(Exception e) {
				
			}
			try {
			fr.close();
			fw.close();
			}catch(Exception e) {
				
			}
			
		}
		
		
		
		
		
		
		
		
	}

}
