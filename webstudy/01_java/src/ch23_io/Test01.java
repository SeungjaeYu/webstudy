/**
 * io = input output
 * 입출력 패키지
 * 
 * File : 파일 자체의 정보(data of data)
 * 
 * 디렉토리 만들기
 * 
 */
package ch23_io;

import java.io.File;

public class Test01 {
	public static void main(String[] args) {
		/**
		 * 특정위치의 디렉토리 또는 확장자를 가진 파일을 접근
		*/
		File f = new File("data/ch23/exam/aaa"); 
		//f가 가르키는 경로가 존재하는지 체크 boolean 형
		 boolean b = f.exists();
		System.out.println(b == true ? "존재" : "존재하지않음");
		
		if(b) {
			System.out.println("존재하는 경로입니다");
		}else {
			//f가 없으면 만들기
			//f.mkdir는 디렉토리를 생성 하나만 한다. 부모가 있으면 가능. 여러개의 디렉토리를 주면 생성안된다
			//여러개를 만들고 싶으면 f.mkdirs
//			System.out.println(f.mkdir()? "생성성공" : "생성실패");
			System.out.println(f.mkdirs()? "생성성공" : "생성실패");
			
		}
		
		
		
		
	}

}
