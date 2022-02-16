/**
 * 목표
 * 
 * 생성자의 이해 -1
 * - 메서드인데 특정 시점에만 호출이 가능한 메서드
 * - 인스턴스 객체를 만들땐만 호출이 가능(new 클래스명()) 객체변수.생성자() 호출이 불가능하다
 * - 생성자가 되기 위한 2가지 필수조건
 *    :1. 메서드의 이름이 클래스명과 동일해야한다
 *     2. 반환타입 자체가 없다.(void 클래스명() { } -> 생성자가 아니다. 반환타입이 void가 붙으면.. 일반 메서드 ) 
 */

package ch12_constructor;

public class Test01 {
	public static void main(String[] args) {
		Member01 m = new Member01("test");
		m.Member01("test2");
		
		
		
		
		
		
	}

}
