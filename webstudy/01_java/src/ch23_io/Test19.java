package ch23_io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

class Myclose implements AutoCloseable{

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("MyClose호출 테스트");
		
	}
	
	
	
}




public class Test19 {
	public static void main(String[] args) {
		
		/**객체 자동닫기
		 * 1.7ver 부터 가능
		 * try ~ resource
		 * try 블럭이 끝나면 알아서 close 된다.
		 * 
		 * 제약사항
		 * 클래스를 불러올 때 , 클래스는 AutoCloseable을 상속받아야한다
		 * 
		*/

		try (
				Myclose mc = new Myclose();
				FileReader fr = new FileReader("data/ch23/a.txt");		
				BufferedReader br = new BufferedReader(fr);
				FileWriter fw = new FileWriter("data/ch23/a5.txt");
				BufferedWriter bw = new BufferedWriter(fw);
				
				){
			
			while (true) {

				String str = br.readLine();
				if (str == null)
					break;
				bw.write(str);
				bw.newLine();

			}

			System.out.println("파일 복사가 완료되었습니다");

		} catch (Exception e) {

		}
		System.out.println("try 블럭 밖임");

	}

}
