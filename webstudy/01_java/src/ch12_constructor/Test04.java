/**
 * this의 사용법 익히기
 * 1. 필드 : this.필드명
 * 
 * 2. 메서드 : this.메서드()
 * 
 * 3. 생성자 : this(매개변수값, ...) 
 * 
 * 
 *
 * 
 */

package ch12_constructor;

public class Test04 {
	public static void main(String[] args) {
		Member04 m1 = new Member04();
		System.out.println("이름 :" +m1.getName());
		System.out.println("나이 :" +m1.getAge());
		

		
		Member04 m2 = new Member04("김혜원");
		System.out.println("이름 :" +m2.getName());
		System.out.println("나이 :" +m2.getAge());
		
		
		Member04 m3 = new Member04("노가리", 22);
		System.out.println("이름 :" +m3.getName());
		System.out.println("나이 :" +m3.getAge());
		
		
		
	}

}
