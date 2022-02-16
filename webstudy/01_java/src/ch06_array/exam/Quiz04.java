/**
 * 
 * 조건
 * 1. 랜덤수 (1 - 20) 3개를 생성해서 배열에 입력함
 * 2. 생성된 배열의 요소 모두가 홀수인지 아닌지 판단
 * 3. 요소가 모두 홀수일 경우 "배열의 모든 요소가 홀수입니다" 로 출력
 * 4. 생성된 요소에 짝수가 있는 경우 "배열의 모든 요소가 홀수는 아닙니다" 로 출력
 * 
 * 출력형식 >
 * 
 * 배열요소[8, 17, 8]
 * 배열의 모든 요소가 홀수는 아닙니다.
 * 
 * 출력형식>
 * 배열요소[19, 7, 13]
 * 배열의 모든 요소가 홀수입니다.
 * 
 * 
 * boolean 값을 줘보자
 */
package ch06_array.exam;
import java.util.Random;
public class Quiz04 {
	public static void main(String[] args) {
		
	/*	
		int[] arr = new int[3];
		Random r = new Random();
		int i;
		
		for(i = 0; i < arr.length; i++)
			arr[i] = r.nextInt(20)+1;
		
		String msg = "홀수 입니다";
		for(i = 0 ; i < arr.length; i++) {
			if(arr[i] % 2 == 1) continue; //홀수면 스킵
	
			msg = "홀수가 아닙니다"; //아니니까 홀수는 아닙니다로 문자열 변경
			break;
		}
		
		System.out.print("배열요소 [");
		for(i = 0; i < arr.length -1 ; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.print(arr[arr.length-1] + "]");
		*/
		
		int[] arr = new int[3];
		Random r = new Random();
		int i;
		
		for(i = 0; i < arr.length ; i++)
			arr[i] = r.nextInt(20)+1;
		
		String msg = "홀수입니다";
		
		for (i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 1) continue;

			msg = "홀수가아닙니다";
			break;
		}
		
		System.out.printf("[%d, %d, %d] %n", arr[0], arr[1], arr[2]);
		System.out.println(msg);

				
		
	
		
		
		
		
		
		
		
		
	}

}
