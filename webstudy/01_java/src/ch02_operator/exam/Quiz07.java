package ch02_operator.exam;
import java.util.Scanner;
public class Quiz07 {
	public static void main(String[] args) {
		/*
		 환율계산 : 1달러당 1088.1원
		 출력시 소수점 아래 2자리만 출력
		 
		 출력형식 >
		 
		 
		 달러를 입력하시오 : 30
		 원화 : 3264.30원
		 */
		
	     double dall = 1088.1;
		Scanner sc = new Scanner(System.in);
		System.out.print("달러를 입력하시오 :");
		int won = sc.nextInt();
		
		System.out.printf("원화 : %.2f", won*dall);
		
	}

}
