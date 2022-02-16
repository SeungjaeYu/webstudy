package ch21_date;

import java.util.Calendar;
import java.util.Date;

public class Test04 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		/*
		c.set(Calendar.MONTH, 1); //2월로 변경
		            //현재 해당 월의 마지막 날짜 가지고오기
		int val = c.getActualMaximum(Calendar.DAY_OF_MONTH); 
		System.out.println(val);//28
		       //해당하는 날짜의 최대값 :
		val = c.getMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(val); //31
		
		c.add(Calendar.MONTH, 1); // 뒤의 값은 1을 주면 한 달 후 
		c.add(Calendar.MONTH, -1); // 뒤의 값은 -1 한 달 전
		*/
		//Calendar -> Date
		Date d = c.getTime();
		System.out.println(d);
	
//		setDate(c.getTime());
		
		//Date 의 정보를 Calendar로 사용하고플때
		Date d2 = new Date();
        //변환1	
	 	c.setTime(d2);
		//변환2
		c.setTimeInMillis(d2.getTime());
		System.out.println(d2);
		
		
		
	}
	
	private static void setDate(Date d) {
		System.out.println(d);
	}

}
