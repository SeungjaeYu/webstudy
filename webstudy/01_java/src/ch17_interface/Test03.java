/**
 * -인터페이스는 객체생성이 불가능하다.
 * -자식 클래스를 이용해서 객체생성을 한다. 
 * -인터페이스를 상속하는 하위클래스는 인터페이스에 선언된 모든 추상메서드를 재정의 해야 한다.
 * 
 * 1.8버전부터 
 * -default 메서드와 정적 메서드의 선언이 가능하다
 *  default 추가적인 기능을 할 수 있다
 */
package ch17_interface;

interface AIMachine{
	void work();
	void tell();
	default void print() { }
	static void alarm() { //공통으로 사용
		System.out.println("모두 쉬세요");
	}
}

class BitAIMachine implements AIMachine {
	public void work() {
		System.out.println("일은 내가 한다");
	}
	public void tell() {
		System.out.println("AI가 최고");
	}
	
}


public class Test03 {
	public static void main(String[] args) {
		AIMachine machine = new BitAIMachine();
		machine.work();
		machine.tell();
	}

}
