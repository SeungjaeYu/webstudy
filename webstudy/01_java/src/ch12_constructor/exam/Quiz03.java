/**
	실행결과>
	
	2013/07/26
	2016/02/29
	해당월에 29일은 존재하지 않은 날짜입니다. 일자를 1일로 설정합니다.
	2015/02/01
 */
package ch12_constructor.exam;

public class Quiz03 {
	public static void main(String[] args) {
		
		MyDate m1 = new MyDate(2013, 7, 26);
		System.out.println(m1.toString());

		MyDate m2 = new MyDate(2016, 2, 29);
		System.out.println(m2.toString());

		MyDate m3 = new MyDate(2015, 2, 29);
		System.out.println(m3.toString());
		
	
		
	}
}
