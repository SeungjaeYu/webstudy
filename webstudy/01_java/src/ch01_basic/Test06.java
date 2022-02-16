/**
 * 변수를 사용하는 이유를 이해하자
 * 
 */
package ch01_basic;

public class Test06 {
	public static void main (String [] args) {
		//i 변수에 100을 담는다.
		int i = 100;
		System.out.println(i);
		
		System.out.println(100);// 바로 100을 주는게 더 편한데??
		//화면에 100을 5번 출력하라
		System.out.println(100); //노가다
		System.out.println(100);
		System.out.println(100);
		System.out.println(100);
		System.out.println(100);
		
		// 만약, 200으로 변경되어 출력하려면 ??
		// 변수일 경우에는 손쉽게 된다. k값만 바꾸면 되니까
		// but 변수가 한 번만 사용되는 것은 선언하지 않아도 된다. 메모리만 차지하니까
		int k = 100;
		System.out.println(k); //노가다
		System.out.println(k);
		System.out.println(k);
		System.out.println(k);
		System.out.println(k);
		

		
		
	}

}
