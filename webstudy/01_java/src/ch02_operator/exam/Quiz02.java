/**
 * 다음과 같이 실행되는 프로그램을 작성하시오
 * 
 * 출력형태>
 * 
 * 수를 입력 : 10
 * 수를 입력 : 20
 * 변경 전
 * num1 : 10, num2 : 20
 * 변경 후
 * num1 : 20, num2 : 10
 * 
 */
package ch02_operator.exam;

import java.util.Scanner;


public class Quiz02 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("num1을 입력하세요 : ");
		int num1 = keyboard.nextInt();
		
		
		System.out.print("num2를 입력하세요 : ");
		int num2 = keyboard.nextInt();
		
		System.out.println("변경 전");
//		System.out.println("num1 : "+num1 +", "+ "num2 : " + num2+"입니다");
		System.out.printf("num1 : %d, num2 : %d%n", num1, num2);
		
		int num3= num1;
		    num1=num2;
		    num2=num3;
		
		System.out.println("변경 후");
		System.out.println("num1 : "+num1 +", "+ "num2 : " + num2+"입니다");

		
		
	}

}
