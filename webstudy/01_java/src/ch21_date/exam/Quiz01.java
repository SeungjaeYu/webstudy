/**
 * 2019년 7월
 * 일   월   화   수   목   금   토
 * 30  1   2   3   4   5   6
 * 7   8   9   10  11  12  13
 * .....
 * 
 * 
 */
package ch21_date.exam;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Quiz01 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		
		
		String pattern = "yyyy년 M월";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String sDate = sdf.format(new Date());
		System.out.println(sDate);
		
		final int maxDate = 42;
		
		//1일로 변경하기
		c.set(Calendar.DAY_OF_MONTH, 1);
		int wDate = c.get(Calendar.DAY_OF_WEEK);
		int mDate = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		//이전달 구하기
		c.add(Calendar.MONTH, -1);
		int preMDate = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		int wpreDate = preMDate - wDate + 2 ;
		int noCnt = 0;
		
		//전달꺼 찍기
		for(int i = 1; i < wDate; i++) {
            System.out.print(wpreDate++ + "\t");
            noCnt++;
		}
		for (int j = 1; j <= mDate; j++) {
			if (j % 7 == 0) {
				System.out.println();	
			}
			System.out.print(j  + "\t");
			noCnt++;
		}
		c.add(Calendar.MONTH, +1);
		
		for(int k = 1;  noCnt++ < maxDate ; k++) {
		   if(noCnt % 7 == 1) {
			   System.out.println();
		   }
			System.out.print(k + "\t");
		}
	
		
		
		//현재달 찍기

		//다음달 찍기
			
		
		
	
		
		
		
		
		
		
		
		
	}

}
