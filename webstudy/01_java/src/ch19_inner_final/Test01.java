/**
 * 목표
 * 
 * final의 세가지 사용
 * 
 * -변수 : final 타입 변수명  변수가 상수가 된다  ex)final int i
 * -메서드: final 반환타입 이름(매개변수)  final 활용관련제한자. 정의하는게 마지막. 오버라이딩 금지 
 * -클래스: final class 클래스명 -> 상속금지
 * 
 */
package ch19_inner_final;

/**상속금지*/
/*final */class Parent01 {
	/**오버라이딩 금지*/
	/*final*/ void call() throws Exception {}
}

class Child01 extends Parent01 {
     void call() throws Exception{
		
	}
}

public class Test01 {
	public static void main(String[] args) {
		/**상수*/
		final int i = 10;
		
	}

}
