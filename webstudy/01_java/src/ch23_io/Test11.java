/**
 * 목표
 * 
 * OutputStream, Writer
 * 
 * write / read 차이점
 * write(int) 쓸 것을 줘야한다 int = 아스키코드 97 - 'a'
 * 
 * OutputStream
 * write(int) : 하위 1byte 사용
 * write(byte[]) 배열에 있는 것을 모두 내보내라
 * write(byte[, int1 , int2]) 배열의 int1번부터 int2번까지 출력할래
 * close();
 * 
 * 
 * Writer
 * write(int) : 하위 2byte 사용
 * write(char[]) 배열에 있는 것을 모두 내보내라
 * write(char[, int1 , int2]) 배열의 int1번부터 int2번까지 출력할래
 * close();
 * 
 * 
 */
package ch23_io;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Test11 {
	public static void main(String[] args) {
		
		FileWriter fw = null;
		try {
			                          //덮어쓰는게 아닌 더하기(    , true)    it's mean append
			fw = new FileWriter("data/ch23/test11.txt", true);
			fw.write(257);
			fw.write('a');
			fw.write('가');
			fw.write(" hey!come on "); //문자열도 가능
			fw.write(" happy "); //문자열도 가능
			fw.write("Don't worry\n"); //문자열도 가능
			fw.write(10000);
			
			System.out.println("파일쓰기 성공");
			
		} catch(Exception e) {
			
		} finally {
			try {
				fw.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		
		/*
		FileOutputStream fos = null;
		try {
			//파일이 있으면 덮, 없으면 자동생성후 써준다
			fos = new FileOutputStream("data/ch23/test11.txt");
			//파일에 내용 쓰기
			fos.write(100); //d
			fos.write(101); //e
			fos.write(102); //f
			fos.write('a'); //a
			fos.write('가'); //안써진다 한글은 2byte 처리인데 지금 1byte처리라서 ..
			

			
			
			System.out.println("파일쓰기 성공");
			
		}catch (Exception e) {
			
		} finally{
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		*/
		
		
		
	}

}
