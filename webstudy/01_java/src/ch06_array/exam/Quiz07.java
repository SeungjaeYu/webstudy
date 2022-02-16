/**
 * 조건 
 * 1. 랜덤한 수(1 - 10) 5개를 생성해서 배열에 입력함
 * 2. 사용자에게 위치를 변경할 배열요소의 인덱스를 2개 받음
 * 3. 변경된 결과를 화면에 출력
 * 
 *   출력형식>
 * 
 *   변경전 배열 : [1, 9, 9, 3, 1]
 *   바꿀 인덱스 : 0
 *   바꿀 인덱스 : 1
 *   변경후 배열 : [9, 1, 9, 3, 1]
 */
package ch06_array.exam;
import java.util.Random;
import java.util.Scanner;
public class Quiz07 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		int i;
		for(i = 0; i < arr.length ; i++)
			arr[i] = r.nextInt(10)+1;
		
		System.out.print("변경전 배열 : [");
		for(i = 0; i < arr.length -1 ; i++) {
			System.out.print(arr[i] + ", ");
		} System.out.println(arr[i]-1 + "]" );
		
		System.out.print("바꿀 인덱스 : ");
		int num1 = sc.nextInt();
		System.out.print("바꿀 인덱스 : ");
		int num2 = sc.nextInt();
		int num3 = 0;
		
		//... 배열 바꾸기...
		for(i = 0; i < arr.length ; i++) 
		num3 = arr[num1];
		arr[num1] = arr[num2];
		arr[num2] = num3;
		
		System.out.print("변경후 배열 : [");
		for(i = 0; i < arr.length -1 ; i++) {
			System.out.print(arr[i] + ", ");
		} System.out.println(arr.length-1 + "]" );
		
		
	}

}
