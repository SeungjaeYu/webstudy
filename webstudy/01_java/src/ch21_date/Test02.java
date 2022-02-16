/**
 * 
 * API에서 제공하는 캘린더
 * 
 * 1.8이후
 * Calendar 클래스 기능 이해..
 * 
 * -추상클래스 > 객체생성X
 * ex) Calendar c = new Calendar(); (X)
 *                  자식클래스가 와야한다.
 *                 
 *                  
 *                  
 *                  
 */
package ch21_date;

import java.util.Calendar;

public class Test02 {
	public static void main(String[] args) {
		
//		Calendar c = new GregorianCalendar(); 밑에 겟인스턴스에서 알아서 받아준다
                             //시스템에 적합한 인스턴스를 넘겨준다		
		Calendar c = Calendar.getInstance();
 		//현재시간에 대한 정보를 관리하고있다.
 		System.out.println(c); //toString으로 뜬다.
 		
 		/*
 		//캘린더에서 내가원하는 시간정보를 뽑아보자
	    //날짜정보 추출 :int  get (매개변수) 
 		int year = c.get(1);
 		System.out.println("year : " + year);
 		System.out.println(c.get(2)); // month
 		System.out.println(c.get(3)); //wee of year
 		
 	    //클래스를 만들어줘서 불러왔따
 		System.out.println(c.get(MyCalendar.YEAR));
 		System.out.println(c.get(MyCalendar.MONTH));
 		System.out.println(c.get(MyCalendar.WEEK_OF_YEAR));
 	
 		//캘린더 자체에 이미 정의되어있따.
 		System.out.println(c.get(Calendar.DATE)); // of day of month
 		System.out.println(c.get(Calendar.MONTH));
 		System.out.println(c.get(Calendar.HOUR));
 		System.out.println(c.get(Calendar.MINUTE));
 		System.out.println(c.get(Calendar.SECOND));
 		*/
		
 		int week = c.get(Calendar.DAY_OF_WEEK);
 		String[] arr = {"일","월","화","수","목","금","토"};
 		System.out.println(arr[week - 1] + "요일"); //오늘 기준 금욜일.. 6이 찍힌다
 		System.out.println("일월화수목금토일".charAt(week-1) + "요일");
 		
 		
	}
	static class MyCalendar{
		public static final int YEAR = 1;
		public static final int MONTH = 2;
		public static final int WEEK_OF_YEAR = 3;
		
		
		
		
		
		
	}
}
