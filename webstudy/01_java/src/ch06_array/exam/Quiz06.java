/**
 * 아래와 같이 동작하는 프로그램을 작성하시오
 * 
 * - 정수 데이터를 5개 담을 수 있는 배열을 생성합니다.
 * - 배열의 초기값으로 랜덤하게 1 - 10 사이의 수를 입력합니다.
 * - 배열의 입력된 값을 화면에 출력합니다.
 * - 배열에 입력된 값들의 합을 화면에 출력합니다.
 * - 배열에 입력된 값들의 평균을 화면에 출력합니다.
 * - 배열에 입력된 값 중에서 최댓값을 화면에 출력합니다.
 * - 배열에 입력된 값 중에서 최솟값을 화면에 출력합니다.
 *  
 *  출력형식 >
 *  
 *  배열 요소 : [8, 5, 7, 3, 6]
 *	합계 : 29
 *	평균 : 5.80
 *	최댓값 : 8
 *	최솟값 : 3
 */

package ch06_array.exam;
import java.util.Random;
public class Quiz06 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		Random r = new Random();
		int sum = 0;
		
		int i;
		for(i = 0; i < arr.length ; i++)
			arr[i] = r.nextInt(10)+1;
		
		
		System.out.print("배열 요소 : [");
		for(i = 0; i < arr.length -1 ; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.println(arr[i - 1] + "]");
		
		
		for (i = 0; i < arr.length; i++)
			sum += arr[i];
		System.out.println("합계 : " + sum);
		 System.out.println("평균 : "+ sum/5); //???
		
		 int max = arr[0];
		 int min = arr[0];
		 for(i = 1; i < arr.length ; i++) {
			 if(max < arr[i]) max = arr[i];
			 if(min > arr[i]) min = arr[i];
		 }System.out.println("최대값 : " + max );
	      System.out.println("최소값 : " + min );
		
		
	}

}
