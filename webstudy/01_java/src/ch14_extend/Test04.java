/**
 * 목표
 * 
 * Object 클래스와 오버라이딩(Overriding)을 이해하자
 * 
 * 1. 모든 자바의 클래스는 Object 클래스를 상속받는다
 *     - 구현하는 클래스가 명시적으로 extends를 하지 않았다면 컴파일 시에 자동으로 
 *     - 클래스명 extends java.lang.Object 코드가 추가되어진다.
 *       ex).toString을 d1에서 선언하지 않았지만 사용가능. Object에 선언되어있다. 16진수. 
 *       
 *       
 * 
 *       
 * 2. 오버라이딩(재정의)
 *    - 부모 클래스의 제공되는 메서드를 그대로 사용하는 것이 아니라 자식클래스에서 메서드의 내용을
 *      다시 정의해서 사용하고 싶다때. 
 *       
 *    - 부모 메서드의 선언부와 동일하게 선언해야한다.
 *     Object -> public String to String()
 *     Dog    -> public String to String()
 *     
 *    - 오버라이딩과 오버로딩의 차이점
 *      : 라이딩은 반드시 상속관계에 있어야한다. 매개변수가 같아야한다  
 *        오버로딩은 매개변수가 달라야한다   
 *    - 오버라이딩과 오버로딩의 공통점
 *      :이름이 같아야한다
 *      
 *      -     오버로딩     오버라이딩
 *      이름     같다         같다
 *     매개변수  다르다       같다
 *     반환타입  상관X      같다  
 *    접근제한자 상관X      자식 >= 부모  
 *      
 *     
 *      
 *      
 *      
 */
package ch14_extend;

import java.util.Arrays;
import java.util.Random;

public class Test04 {
	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.setName("봉달희");
		d1.setAge(3);
		
		Dog d2 = new Dog("달리", 6);
		
	    // 주소값
		System.out.println(d1); //객체변수(d1)를 출력하면 d1.toString() 자동호출
		System.out.println(d1.toString()); //Dog 클래스에 없다면. Object에 있는게 호출되었다
		System.out.println(d2);
		System.out.println(d2.toString());
		
		StringBuilder sb = new StringBuilder("hello");
		System.out.println(sb); //hello    StringBuilder 에서 toString을 재정의
		
		String str = "hello";
		System.out.println(str); //hello
		
		Random r = new Random();
		System.out.println(r); //java.util.Random@22f71333  toString 재정의X
		
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println(arr.toString()); //주소값.. toString 재정의X
		
		
		
		
		
	}

}
