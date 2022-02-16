/**
 * 목표
 * 
 * 인스턴스와 인스턴스 변수
 * 자바 실행시(런타임)의 메모리 영역을 이해한다
 * 
 * 
 */
package ch07_class;

public class Test01 {
	public static void main(String[] args) {
		Bread b1 = new Bread(); //참조형. b1은 주소를 갖겠구나. new = 새로운 메모리의 공간
		
		
		//가르키는 주소 정보 : 클래스이름@16진수
		System.out.println(b1);
		
		
		
		System.out.println("이름"+b1.name);
		System.out.println("가격"+b1.price);
		
		
		Bread b2 = new Bread();
		
//		Bread b = null;
//		b.name = "피자빵" 주소값이 null인데 없는 값에 name으로 가라그래서 에러가난다
		b2.name = "소보로";
		b2.price = 1000;
		
		Bread b3 = b1;
		b3.name = "피자빵";
		b3.price = 3700;

		System.out.println("b1.name : " + b1.name);
		System.out.println("b1.price : " + b1.price);
		System.out.println("b2.name : " + b2.name);
		System.out.println("b2.price : " + b2.price);
		System.out.println("b3.name : " + b3.name);
		System.out.println("b3.price : " + b3.price);
		
		
		
	}

}
