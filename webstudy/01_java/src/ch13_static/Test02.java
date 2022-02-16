/**
 * static 영역에서는 nonStatic 영역을 직접 볼 수 없다.
 * 먼저 만들어진다     나중에 만들어진다
 * 
 * 
 */
package ch13_static;

public class Test02 {
	//인스턴스인 msg변수가 있을 때 static 영역에서 어디에 들어있는지 알고싶으면
	String msg; //메모리 인스턴스에 잡힘
	public static void main(String[] args) {
		Test02 a = new Test02();
		a.msg = "hello";
		Test02 b = new Test02();
		b.msg = "welcome";
//		System.out.println(msg); msg가 어디 msg인지 알지 못한다
		System.out.println(b.msg);
		
		
		
	}
 
}
