package ch02_operator.exam;

import java.util.Random;

public class Quiz03 {
	public static void main(String[] args) {
		//두 개의 랜덤한 숫자(1~10)를 생성해서 변수 num1, num2에 대입합니다
		//다음과 같이 출력하는 프로그램을 작성하시오
		//만약, num1, 7, num2가 2 라면
		
		//출력형식>
		//생성된 수(7, 2) 중에서 큰 수는 7입니다.
		
//		Random r = new Random();
//		int num1 = r.nextInt(10)+1;
//		int num2 = r.nextInt(10)+1;
//	
//		System.out.printf("생성된 수(%d, %d) 중에서 큰 수는 %d입니다.", num1, num2, (num1 > num2) ? num1 : num2);
		
		Random r = new Random();
		int num1 = r.nextInt(10)+1;
		int num2 = r.nextInt(10)+1;
		
		System.out.printf("생성된 수 (%d, %d) 중에서 큰 수는 %d입니다", num1, num2, (num1> num2)? num1 : num2);
		
		
	}

}
