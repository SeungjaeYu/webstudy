/**
 * 버블정렬 : 오름차순(큰 값이 뒤로)
 * 
 * 정렬 이해하기(버블, 선택, 삽입, 병합(merge), 힙(heap), 퀵(quick))
 * 
 * API를 이용한 정렬 처리방식
 * 
 * 버블정렬 : 오름차순(큰 값이 뒤로)
 *  근접한 두 개를 비교해서 큰 값을 뒤로 차례대로 보낸다
 * |0|1|2|3|4|
 * |4|2|8|6|9|
 *  0 1 비교
 *  1 2 비교 
 *  2 3 비교
 *  3 4 비교
 *  
 *  반복이 된다.
 */
package ch22_collection03.sort;

import java.util.Arrays;

public class Test01 {
	public static void main(String[] args) {
	/**버블정렬*/	
		//배열에 숫자 저장
		int[] arr = {4, 2, 8, 6, 9};
		
		//4번 돌기
		for(int i = 0; i <arr.length-1 ; i++) {
			System.out.println(i+1);
			//반복의 종료
			for(int j = 1; j < arr.length-i; j++) {
				  //0 1 자리 비교, 1 2 자리비교...
				if(arr[j-1] > arr[j]) {
					//swap
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
				System.out.printf("%d단계 (%d번째, %d번째) : %s%n", 
						i+1, j-1, j, Arrays.toString(arr) );
			}
			System.out.printf("%d단계 종료 %n", i+1);
		}
		System.out.println("정렬결과 : " + Arrays.toString(arr));
		
		
		
	}

}
