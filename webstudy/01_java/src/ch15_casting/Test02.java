/**
 * 
 * 목표
 * 
 * 명시적 형변환 이해하기
 * 
 * 자식 클래스가 부모타입 객체를 받는다
 * 자식 = (타입)부모    타입 > 클래스이름
 * 
 * 타입 자리에 올 수 있는 것.
 * 
 * 
 * 
 *     object
 *       |
 *      Food 
 *     |    |
 *   Cake   Fruit
 *   
 *     cake 와 fruit는 아무런 관계가 X
 * 
 */
package ch15_casting;

public class Test02 {
	public static void main(String[] args) {
		Cake c = new Cake();
		Fruit f = new Fruit();
		
		Fruit f2 = f;
//		서로 다른 타입이지만 상속관계가X 불가능
//		Fruit f3 = c;  
		
		
		//Object도 직접부모는 아니지만 부모의 부모라서 받을 수 있다
		Object o = f; 
		//묵시적 형변환
		Food food = f;
		
		//자식 = 부모(X)
//		Fruit f5 = food;
		
		//자식이 부모를 받는 것
		Fruit f4 = (Fruit)food;
		
		//문법적으로는 맞지만 위에서 Food에 Fruit를 집어넣었기 때문에 Cake로 꺼낼 수 없다
//		Cake c2 = (Cake)food; 런타임 에러. 실행시 오류
		
		Food food2 = new Food();
//		Cake c3 = food2;  컴파일 에러. 실행하기도 전에 오류
		
		//아무것도 집어넣지 않았는데 케이크를 꺼내라고해서 런타임 오류난다.
//		Cake c4 = (Cake)food2;
		
		/*
		food2 = new Fruit();(x)
		food 2 = new Food();(x)
		food 2 = new Cake();(O)
		*/
		
		
		//Food에 케이크를넣어주고 케이크를 꺼낸다.
		Food f6 = new Cake();
		Cake ca = (Cake)f6;
		
		
		
		
		
		
		
	}

}
