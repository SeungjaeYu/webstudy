/**
 * 목표
 * 
 * 객체의 형변환을 이해하자
 * 
 * 1. 묵시적 형변환(UpCasting)
 *     
 * 2. 명시적 형변환(DownCasting)
 * 
 * 형변환의 조건 :
 * 
 * 객체관 상속관계에 있는 클래스끼리
 * 
 * 
 * 1. 묵시적 형변환(부모 = 자식)
 *  A a = new B();
 *  A와 B는 상속관계이여만한다.
 *  A가 B의 부모클래스일때 가능하다.
 *  => 부모타입은 자식타입을 받을 수 있다. 
 *  형변환 a객체 변수가 사용할 수 있는 것은 A클래스에서 선언된 변수 또는 메서드.
 *  부모는 자식의 것을 가져다 사용할 수 없다.
 *  
 *  But! 자식 클래스를 부르는 방법
 *  a의 타입이 아닌 자식클래스의 메서드를 부른다.
 *  오버라이딩이 되어있는 경우는 자식 메서드를 호출한다.
 *  
 * 
 */

package ch15_casting;

public class Test01 {
	public static void main(String[] args) {
		
         /**묵시적 형변환 애니멀(부모) 캣(자식)*/
		Animal a = new Cat();
		System.out.println(a.name);
		System.out.println(a.age);
		//오버라이딩 되어있어 자식것이 호출 된다.
		a.eat();

//		System.out.println(a.owner); Animal에 없으니..X
		
//		Cat의 eat은 호출할 수 없다. A에 없어서 
//		a.eat(); 
		
//		Animal a = new Random(); 상속관계가 아니라서 오류
	    	
		
		
		/*
		Animal a = new Animal();
		System.out.println(a.name);
		System.out.println(a.age);
		*/
		
		
		
		
		
		
		
	}

}
