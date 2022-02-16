/**
 * 목표
 * 
 * 문자열 상수 : 자바 실행 환경에서 문자열 내에서 사용할 때 고정된(상수) 의미로 사용되는 문자열
 * \ :☆ 뒤에는 반드시 지정된 문자중에 하나가 와야한다.
 *   : t, n, r, f,\,'," 이 올 수 있다
 * n, r, " 이 가장많이 사용 된다
 * 
 */
package ch01_basic;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test14 {
	public static void main(String[] args) {
		System.out.println("나의 이름은\n 홍길동 \n입니다.");
		
		String path = "c:\\test"; //\t 공간을 띄어라
		 // \ fmf 일반문자로 바꾸고싶으면
		 // \\ fmf 두 번쓰면 역슬래시가 문자그대로 나온다
				System.out.println("path : " + path);
				
		String path2 = "c\\test";
		
		String msg = "\"홍길동\" 님에게...";
		System.out.println(msg);
		
//		System.out.println("수업 루트 폴더 : c:\java"); \jave 오류나는 이유는 역슬래시 뒤에 j가 올 수 없어서
		System.out.println("수업 루트 폴더 : c:\\java");
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
	}

}
