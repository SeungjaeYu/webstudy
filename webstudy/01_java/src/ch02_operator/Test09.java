/**
 * 목표
 * 
 * 산술 연산자(+, -, *, /, %나머지)에 대해서 이해하자
 * 
 */
package ch02_operator;

public class Test09 {
	public static void main(String[] args) {
		int num1 = 6;
		int num2 = 2;
		
		System.out.println(num1 + num2);//8
		System.out.println(num1 - num2);//4
		System.out.println(num1 * num2);//12
		System.out.println(num1 / num2);//3
		//짝수 홀수 구분.
		System.out.println(num1 % num2);//0
		//짝수 홀수를 구해보자 나머지가 0이면 짝수 1이면 홀수
		int num3 = 100;
		System.out.printf("%d는 %s입니다.", num3, num3%2==0 ? "짝수" : "홀수");
		
		

		
	}

}
