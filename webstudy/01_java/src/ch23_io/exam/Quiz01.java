/** 
 *   현재 시간에 대한 디렉토리 생성하기 위한 프로그램 작성
 *   
 *   현재 시간 정보를 얻어와  년 월 일 시에 해당하는 디렉토리를 data/ch23 밑에 생성한다.
 *   예> 2020-07-15 17:05:22  일 경우
 *      data/lec23/2020/07/15
 */
package ch23_io.exam;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Quiz01 {
	public static void main(String[] args) {
		//현재시간 정보
//		Calendar ca = Calendar.getInstance();
//		Date s = ca.getTime();
	   /*
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		//잘라주기
		String[] sTime = sdf.format(s).split("-");
		
		//현재시간 심플포맷으로 출력해봄
//		System.out.println(sTime);
		

		File f = new File("data/ch23/"+sTime[0] + "/" 
		                   + sTime[1] + "/" + sTime[2]);
		f.mkdirs();
		*/
		
		SimpleDateFormat sdf = new SimpleDateFormat("/yyyy/MM/dd");
		File f = new File("data/ch23"+sdf);
		f.mkdirs();
		
		
	}

}
