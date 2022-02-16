/**
 * 조건
 * 1. 랜덤한 수(1 - 20) 10개를 생성해서 배열에 입력함
 * 2. 사용자에게 수를 입력 받고 배열에서 입력받은 수보다 큰 수의 합을 구함
 * 3. 사용자가 -1을 입력할 때 까지 반복
 * 
 * 출력형식 >
 * 
 * 배열요소[5, 4, 2, 17, 20, 6, 2, 3, 5, 9]
 * 수를 입력 : 10
 * 10보다 큰 수들의 합은 37입니다. 17 + 20
 * 수를 입력 : 8
 * 8보다 큰 수들의 합은 46입니다
 * 수를 입력 : -1
 * 종료합니다.
 * 
 */
package ch06_array.exam;
import java.util.Random;
import java.util.Scanner;
public class Quiz05 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int i;

			for(i = 0; i < arr.length ; i++)
				arr[i] = r.nextInt(20)+1;
			
			System.out.print("배열요소 [");
			for (i = 0; i < arr.length - 1; i++) {
				System.out.print(arr[i] + ", ");
			}
			System.out.println(arr[arr.length - 1] + "]");
			
			
			
			System.out.print("수를 입력 : ");
			int num = sc.nextInt();
			
			if(num == -1) { 
			System.out.println("종료합니다");
			break;
			}
			
			int sum = 0;
			for(i = 0; i < arr.length ; i++) {
				if(num < arr[i]) sum += arr[i]; 
				
		}
		System.out.printf("%d보다 큰 수들의 합은 %d %n", num, sum);
		}
		
		
		
		
		
		
	}

}
