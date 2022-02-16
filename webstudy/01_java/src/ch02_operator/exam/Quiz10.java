package ch02_operator.exam;
import java.util.Random;
public class Quiz10 {
	public static void main(String[] args) {
		/*
		 * 1~100 사이의 랜덤한 숫자 생성
		 * 생성된 숫자가 짝수이면서 5의 배수인지확인하는 프로그램을 작성하라
		 * 
		 * 100은(는)짝수이면서 5의 배수인 숫자입니다.
		 * 99은(는)짝수이면서 5의 배수인 숫자아닙니다.
		 */
		
		Random r = new Random();
		int a = r.nextInt(100)+1;
		
		
		System.out.printf("%d는 짝수이면서 5의 배수가 %s", a, a%2 ==0 && a%5==0 ? "맞습니다" : "아닙니다"  );
		
	}

}
