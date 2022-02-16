/**
 * 
 * 다음과 같은 값을 가지고 있는 arr 이름의 배열을 선언한다
 * 
 * - 9,8,3,9,7,4
 * 
 * 선언된 arr 배열의 요소 중에서 최대값과 최소값을 출력하는 프로그램 작성
 * 
 * 출력형식 >
 * 최대값 : 9
 * 최소값 : 3
 */
package ch06_array.exam;

public class Quiz02 {
	public static void main(String[] args) {
		int[] arr = {6, 8, 3, 9, 7, 4};
		
		/*
		for(int i = 0; i < arr.length; i++) {
		if(arr[0] > arr[i]) System.out.println("최대값 : " + arr[0]);
		else if(arr[1] > arr[i]) System.out.println("최대값 : " + arr[1]);
		else if(arr[2] > arr[i]) System.out.println("최대값 : " + arr[2]);
		else if(arr[3] > arr[i]) System.out.println("최대값 : " + arr[3]);
		else System.out.println("최대값 : " + arr[4]);
		}
		 */
		
		int max = arr[0], min = arr[0];
		for(int i = 1; i < arr.length; i++) { //0을 min max로 지정해줘서 1부터 시작
			if(max < arr[i]) max = arr[i];
			if(min > arr[i]) min = arr[i];
			
		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
		
		
		
		
	
		
		
		
		
	}

}
