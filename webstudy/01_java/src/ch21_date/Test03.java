package ch21_date;

import java.util.Calendar;

public class Test03 {
	private static void printCalendar(Calendar c) {
		System.out.println("----------------");
		System.out.println("YEAR :" + c.get(Calendar.YEAR));
		System.out.println("MONTH :" + (c.get(Calendar.MONTH)+1));
		System.out.println("DATE :" + c.get(Calendar.DATE));
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		//2019.7.26
		Calendar c = Calendar.getInstance();
		printCalendar(c);
		c.set(c.get(Calendar.YEAR), c.get(Calendar.MONTH), 1) ;
		printCalendar(c);
		       
		      //설정할 곳field, 설정할 값 value. 월정보 설정시 월 -1값을 줘야한다 
		c.set(Calendar.MONTH, 4); //현재 객체의 월 정보를 5월로 변경.
		printCalendar(c);
	
	
	}

}
