/**
 * 증감연산자
 * 1을 증가시키거나 1을 감소시킨다. ( ++ 1을 증가, -- 1을 감소);
 * 혼자 사용 가능하다.변수에 대입하지 않아도..
 * 
 */
package ch02_operator;

public class Test10 {
	public static void main(String[] args) {
		int a = 5;
		++a; // a = a + 1;  
		System.out.println(a);  // 6
		--a; // a = a - 1;
		System.out.println(a);  // 5
		a++; // a = a + 1;
		System.out.println(a);  // 6
		a--; // a = a - 1;
		System.out.println(a);  // 5
	}

}
