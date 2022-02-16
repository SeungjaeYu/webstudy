/**
 * 목표
 * 
 * 추상클래스의 이해
 * 
 * 특징 : 
 *  추상 = 구체화되지 않은 것. 구현이 안됐다.
 * 
 * 
 * - 추상키워드 : abstract 
 * - abstract 사용가능 : 클래스(O), 메서드(O), 변수(X) 
 * - abstract class
 *   : 추상클래스(abstract 키워드 클래스에 선언된 클래스)
 *   : 추상메서드를 포함하는 클래스는 반드시 추상클래스로 선언되어야 한다. 
 *   : 직접적인 객체생성이 안된다. Sub01 s = new Sub01(); X   
 *   : 구현된 메서드와 추상메서드 모두 포함할 수 있다
 *   
 *   
 * 
 * ex) public static void main(String[] args)메서드 선언부 { 메서드 구현부 Body}
 * 
 * -abstract method
 *  : 추상메서드(abstract 키워드가 메서드 선언부에 있는 메서드)
 *  : 메서드에 선언부만있고 구현(바디)이 없다.
 *  ex)public abstract void call();
 *     public abstract void call(){} - 컴파일에러 추상X
 *     public void call(){} - 가능
 *     public void call(); - 컴파일 에러. 바디가 있어야한다
 *     
 *  추상클래스
 *  
 *     
 */
package ch16_abstractclass;


abstract class Sub04{ 
	abstract void call2(); //상속된 자식을 통해서 구현을 하고자한다
	void test03() {} //구현된 일반 메서드 
	
}

class Sub01{
	void test() {} //구현된 일반 메서드
	
//	abstract void call(); 클래스가 추상클래스가 아니라 에러
	
//	abstract void test02() {} 컴파일 에러 : 추상키워드를 가진 메서드는 바디를 가질 수 없다
}





public class Test01 {
	public static void main(String[] args) {
		
	}

}
