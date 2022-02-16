/**
 * 목표
 * 
 * 반복문을 연습 : 구구단 작성
 */
package ch04_repetition;
import java.util.Scanner;
public class Test04 {
	public static void main(String[] args) {
		/*규칙을 잡는 방법
		   먼저 써본다
		 2 * 2 = 4
		 2 * 3 = 6
		 2 * 4 = 8
		 2 * 5 = 10
		 2 * 6 = 12 9줄.. 9번 반복문이 필요해 
		*/
		//3단을 출력
	
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("원하는 단 수를 입력하세요 ");
		int dan = sc.nextInt();
		
		
			for(int num = 1; num < 10; num++ ) {
				System.out.printf("%d X %d = %d%n", dan, num, dan*num);
		}*/
		
		
		int num = 3;
		for(int i = 1; i < 10; i++)
			System.out.printf("%d X %d = %d %n", num, i, num*i);
		
		
		
		
	}

}


