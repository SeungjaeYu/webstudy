/**
 * 목표
 * 
 * 생성된 배열의 요소를 확인하는 방법
 *  
 */
package ch06_array;

import java.util.Arrays;

public class Test06 {
	public static void main(String[] args) {
	int[] arr = {1, 2, 3};
	//1.4버전까지 사용
	for(int i = 0; i < arr.length ; i++) {
		System.out.println(arr[i]);
	}
		
	// 1.5부터 가능 : 향상된 for문 
	//형식 for(배열의 요소값: 반복의 대상 배열이름) 배열의 길이만큼
	for(int val : arr) { // val은 1 ,2,3이 된다
		System.out.println(val);
	
	}
	
	int index = 0;
	char[] cArr = {'a', 'b', 'c'};
	//1.5방식의 for문으로
	for(char val : cArr) {
		System.out.println(index++ + " - " + val);
	}
	
	
		boolean[] bArr = { true, false };
		for (boolean val : bArr) {
			System.out.println(val);
		}

		
		
	//API 에서 제공하는 배열의 요소값들을 확인	
	//문자열로 메서드  Stiring result = Arrays.toString(확인하고 싶은 배열의 이름)	
		String result = Arrays.toString(arr);
		System.out.println(result);
		
		System.out.println(Arrays.toString(arr));
		
	}

}
