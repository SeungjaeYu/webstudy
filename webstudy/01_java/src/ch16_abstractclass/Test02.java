/**
 * 
 * - 추상클래스는 객체 생성이 불가능하다
 * - 추상클래스 타입의 변수선언은 가능하다.
 * - 추상클래스 타입의 객체는 자식을 통해 얻을 수 있다.(묵시적 형변환)
 * - 추상클래스에서 추상메서드를 선언했다면 자식 클래스에서 오버라이딩 해야한다.
 * 
 * - 같은 패키지에서 사용된 추상클래스 이름 재사용 불가.
 * 
 */
package ch16_abstractclass;


abstract class Sub02{
	public abstract void call();
	public void test() {
		System.out.println("test중");
	}
}

class Sub02Child extends Sub02{
	public void call() {
		System.out.println("집에가고싶다");
	}
}


public class Test02 {
	public static void main(String[] args) {
//		Sub02 s = new Sub02(); 추상적 클래스는 객체생성X
		
		Sub02 s = null; //객체 변수 선언은 가능 Why?
		
		Sub02 s1 = new Sub02Child(); //추상클래스 자식클래스를 통해 사용함.
		
		s1.call(); //자식
		s1.test(); //본인
		
		
		
		
		
		
	}

}
