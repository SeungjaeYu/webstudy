/*
반복해서 처리하도록 Quiz06번의 프로그램을 이용하여 작성합니다.
	
	>> 출력형식
	수를 입력 : 2
	수를 입력 : 4
	2부터 4까지의 합은 9입니다.
	더 할까요?(1-계속  2-끝내기) : 1
	수를 입력 : 3
	수를 입력 : 2
	2부터 3까지의 합은 5입니다.
	더 할까요?(1-계속  2-끝내기) : 2
	프로그램이 종료됩니다.
	*/
package ch04_repetition.exam;
import java.util.Scanner;
public class Quiz10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		while(true) {
		System.out.print("수를 입력하세요 : ");
		int num1 = sc.nextInt();
		
		System.out.print("수를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		int sum = 0;
		
		for(int i = num1; i <= num2; i++) 
		{
			sum += i;
			}
	
		System.out.printf("%d부터 %d까지의 합은 %d입니다 %n", num1, num2, sum);
		System.out.print("더 할까요? (1-계속 2-끝내기)");
		int loop = sc.nextInt();
		 if(loop == 2)
			
//			for(  ; loop == 2 ;)
			break;
		}
		
		System.out.print("종료합니다");
		
		
		
		
		
		
		
	}

}
