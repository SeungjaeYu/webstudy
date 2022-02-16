/**
 * 목표
 * 자바에서 제공되는 클래스(API) 중에서 Random 클래스를 활용하자
 * 
 */
package ch02_operator;//연산자

import java.util.Random;
import ch01_basic.exam.Quiz01;

public class Test01 {
	public static void main(String[] args) {
		//나와 다른 위치(패키지)의 클래스를 사용하기 위해서는 import를 해야한다 
		Random r = new Random(); //type에 대문자로 시작하는 클래스라면,, 나오면 값을 주기 어렵다.
		                         //값에 new 다음에 클래스이름을 써준다. Random r = new Random() 메소드의 형태로 와야한다
		//선언된 클래스 변수인 r을 통해서 Random 클래스 안에 있는 변수 또는 메서드에 접근한다.
		//메서드 : 동작을 해 주는 것
		//Random 클래스의 method 중에서 nextInt(num) 메서드 사용 / num = 범위
		//Random 클래스에 있는 nextInt 메서드를 호출한다.
		int num = r.nextInt(3); //0~2(3-1)까지 나온다.
//	    System.out.println(num);
//	    
//	    //Random에 있는 nextInt를 다시 사용한다
//	    num = r.nextInt(10);
//	    System.out.println(num);
//	    
	    num = r.nextInt(10)+1;
	
	    System.out.println(num); // 1~10
	}

}
