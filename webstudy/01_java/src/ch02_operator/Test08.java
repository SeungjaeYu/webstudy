/**
 * 목표
 * 
 * 비교연산자(>, <, >=, <=, == !=)를 이해하자
 * 결과는 참 또는 거짓이 된다
 * > = : 공백이 들어가면 안된다
 * =<순서가 바뀌면 안된다
 * 같다 비교는 "="가 아니다
 * 
 */
package ch02_operator;

public class Test08 {
	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 10;
		
		System.out.println(num1 > num2); //false 거짓이 나온다
		
		
		//boolean : 참(true) 거짓(false)의 값을 담기위한 데이터 타입	
//		num1 < num2;// 비교 연산을 했으면 무언갈 해야한다
		boolean bool = num1 < num2;
		System.out.println(bool); //true
		/*
		bool = false;
		bool = true;
		*/
		
		
		System.out.println(num1 >= num2); //false
		System.out.println(num1 <= num2); //true
		System.out.println(num1 == num2); //false
		System.out.println(num1 != num2); //true
		
		
	}

}
