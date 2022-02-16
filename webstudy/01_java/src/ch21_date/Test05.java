/**
 * 목표
 * 
 * 날짜 정보를 쉽게 가져오기 
 * SimpleDateFormat
 * 데이트에 관한 간단하게 갖고오는 포맷
 * 
 * 날짜 정보에서 원하는 형태의 문자열로 추출(format)
 * 문자열에서 날짜 객체 추출(parse)
 * 
 * 패턴 문자
 * y : 년도 year
 * M : 월 Month
 * d : 일
 * H : 24시 기준 
 * h : 12시 기준
 * m : 분 minute
 * s : 초
 * 
 * 2019-07-08 : yyyy-MM-dd
 * 2019.07.08 : yyyy.MM.dd
 * 11:11:10   : hh:mm:ss
 * 
 * 
 *   ^--^
 * < oㅅo > @
 *  ( =  )/
 */
package ch21_date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test05 {
	public static void main(String[] args)  {
		/*
		 *   <사이트>
		 *  2019-07-11 
		 *  2019.07.11
		 *  2019/07/11
		 *  2019.07.11 11:51:10
		 * 
		 */
		/*
		Calendar c = Calendar.getInstance();
		System.out.printf("%d-%02d-%02d%n",
				c.get(Calendar.YEAR), c.get(Calendar.MONTH)+1, c.get(Calendar.DATE) );
		*/	
		
		String pattern = "yyyy-MM-dd HH:mm:ss";
		//너는 pattern 포맷으로 사용할꺼야
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		//날짜객체 -> 문자열
		String sDate = sdf.format(new Date());
		System.out.println("sDate:" + sDate);
		
		//문자열 -> 날짜객체
		pattern = "yyyy-MM-dd";
		sdf.applyPattern(pattern); //객체의 패턴을 변경해준다
		
		
		try {
			String dStr = "2019-02-22"; // 패턴과 문자열이 동일해야한다
			Date d = sdf.parse(dStr); // parse는 나한테 date객체를 준다
			System.out.println(d);

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String str = "2018-11-12";
		String[] arr = str.split("-");
		Calendar cc = Calendar.getInstance();
		cc.set(Calendar.YEAR, Integer.parseInt(arr[0]));
		
		
		
		
		
		
		
	}

}
