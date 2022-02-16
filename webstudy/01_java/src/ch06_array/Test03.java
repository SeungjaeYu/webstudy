/**
 * 목표
 * 
 * 특정한 값을 대입하자
 * 
 */
package ch06_array;

public class Test03 {
	public static void main(String[] args) {
		//1. 
		//생성된 공간에 0으로 자동초기화 상태
		int[] arr = new int[3];
		
		//값의 설정
		arr[0] = 10; //10의 값으로 초기화
		arr[1] = 20; 
		arr[2] = 30; 

		
		//배열의 값 확인
		for(int i = 0; i < arr.length ; i++)
		System.out.println(arr[i]);
		
		
		
		
		
		
		
		
	}

}
