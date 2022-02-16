/**
 * Box에서 타입제한하기
 * Box05<T extends Number> 
 * 상속관계를 주면 Number에 자식들만 사용가능
 * 
 * 인터페이스도 가능 !extends!로 받아야한다. implements(X)
 * 
 */
package ch22_collection.generic;

import java.util.Random;

interface Drink{}

class Coke implements Drink{ }
class Sprite implements Drink{ }
class IceBox<T extends Drink> { }

          //Random과 Drink 여러개의 클래스를 다 상속받고 싶을 때 &를 사용한다
class IceBox2<T extends Random & Drink> { }



public class Test05 {
	public static void main(String[] args) {
//		Box05<String> box5 = new Box05(); String 에러. Number의 자식들이 아니라서
		Box05<Integer> box = new Box05<>(); 
		
		
		
		
		
		
	}

}
