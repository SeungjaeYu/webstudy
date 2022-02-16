/**
 *  입력된 배열의 요소를 꺼꾸로 저장하는 프로그램을 작성
 * 
 *  조건 
 *  1. 랜덤한 수(1 - 10) 5개를 생성해서 배열에 입력함(arr 이름으로 선언)
 *  2. 생성된 배열의 요소 내용을 꺼꾸로 변경해서 저장합니다.
 *  3. arr 배열 이외의 배열은 생성하지 않습니다.
 *  4. 코드 구현 시 배열 요소의 크기가 변경되더라도 실행될 수 있도록 작성합니다.
 *  
 *  출력형식> 
 * 
 *  변경전 배열 : [5, 6, 7, 5, 2]
 *  변경후 배열 : [2, 5, 7, 6, 5]
 */
package ch06_array.exam;

import java.util.Arrays;
import java.util.Random;

public class Quiz08 {
	public static void main(String[] args) {
		int [] arr = new int[5];
		Random r = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(10) + 1;
		}
		
		System.out.print("변경전 배열 : " + Arrays.toString(arr));
		for (int i = 0; i < arr.length / 2; i++) {
			int loc = arr.length - i - 1;
			int temp = arr[i];
			arr[i] = arr[loc];
			arr[loc] = temp;
		}
		System.out.print("변경후 배열 : " + Arrays.toString(arr));
	}
}