/**
 * 목표
 * 
 * 날짜관련 API 클래스를 이해하자
 * 
 * Date class
 * 
 * 
 * 
 */
package ch21_date;

import java.io.File;
import java.util.Date;

public class Test01 {
	public static void main(String[] args) {
		//컴퓨터 시간 설정값
		Date d = new Date();
		System.out.println(d);
		
		//특정한 시간대로 변경
		//값을 주면 지정된 시간으로 설정.. millisecond개념.. 1000을주면 1초 but 1970년 기준이다
		
		Date d2 = new Date(1000);
		System.out.println(d2);
		
		
		//1970년 이후의 시간을 밀리세컨으로 반환한다
		long time = System.currentTimeMillis();
		Date d3 = new Date(time);
		System.out.println(d3);
		
		
		//파일의 마지막 수정시간
		File f = new File("src/ch01_basic/Test01.java");
		long modTime = f.lastModified();
		Date d4 = new Date(modTime);
		System.out.println(d4);
		
		//경고 뜬다
		d = new Date();
		//어노테이션 .. @SuppressWarnings("deprecation")
		int year = d.getYear();
		
		//롱형태. 1970년부터 현재의 차를 반환
		long time5 = d.getTime();
		
		//생성된 날짜정보를 바꿔주는 것 == new Date(60000);
		d.setTime(60000);
		System.out.println(d);
		
		
		
	}

}
