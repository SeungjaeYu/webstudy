/**
 * 목표
 * 
 * 메서드 선언하는 클래스 - 매개변수 중심의 예제
 * 
 * 메서드 선언 형식(1)
 * [] // 문법에서 생략할 수 있다는 뜻
 * [접근제한자]  [활용제한자] 반환타입 메서드의 이름 ( [매개변수-파라미터, 여러 개 올 수 있다] ){
 *   실행문장들...
 *   [return 반환값;]  //위의 반환타입과 []안의 반환값은 서로 연결되어있다
 *                                     -타입에 해당하는 값 설정.
 * }
 * 
 * [접근제한자]  [활용제한자] 서로 위치가 바뀔 수 있다
 * 
 * 부르지 않으면 실행 X 메인메서드는 JVM이 자동으로 실행
 * 
 */
package ch08_method;

import java.util.Random;
import java.util.Scanner;

public class Method01 {
//	public static void main(String[] args) {
 //접근제한자  활용제한자  반환타입    이름 (파라미터 변수타입배열   변수이름) return 반환값은 X
		
		
	void method01() {
//  반환타입  이름 (매개변수 지금은 없다){실행할 내용} => 매개변수 없는 메소드 선언
		System.out.println("method01 호출됨");
		
	}
	
	/**
	 * 정수형 한 개를 받는 매개변수를 선언
	 * 
	 * 선언된 매개변수의 값은 직접 값을 넣어주는 것이 아니라
	 * 메서드를 호출하는 쪽에서 주어야한다.
	 */
	void method02(int i) {
		//매개변수에 i 가 선언되어있어서 쓸 수 있다. 내가 값을 주려고 만든 것이 아니라 ,호출하는 쪽에서 값을 준다
		System.out.println("method02 ->" + i); 
	}
		
	
	/**
	 * 정수값을 두 개 받도록 매개변수 선언
	 * 여러개의 매개 변수를 받을 때는 ", " 로 각 변수를 구분한다
	 * 	
	 */
	void method03(int i, int j) {
		System.out.println("method03 ->" + (i + j));
	}
		
	
	/**
	 * 문자열을 받는 메서드 선언
	 */
	void method04(String i) {
		System.out.println("method04 ->" + i);
	}
	
	
	/**
	 * Random을 받는 메서드 선언
	 */
	void method05(Random r) {
		System.out.println("method05->" + r.nextInt(10));
	}
	
	/**
	 * 스캐너를 받는 메서드 선언
	 */
	void method06(Scanner sc) {
		System.out.println("method06->" + sc.nextInt());
	}
	
	void method07(int[] arr) {
		System.out.println("method07->" + arr);
	}
	
	
//어렵다..
	void method08(MyClass mc) {
		System.out.println("method08 ->");
		
		//호출시 화면에 성공해줘 ~ 출력될 수 있도록 구현
		mc.msg("성공해줘~~");
		
	}
		
	

		

	
		
		
		
	

}
