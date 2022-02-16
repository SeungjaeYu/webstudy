/**
 * 선택정렬 : 오름차순(큰 값이 뒤로)
 *  근접한 두 개를 비교해서 작은 값을 앞으로 보낸다
 * |0|1|2|3|4|
 * |4|2|8|6|9|
 * 0번째에 최소값을 
 * 0번째와 1번째의 비교를 해서 if(min > arr[i]) min = arr[i] 최소값 1번째 
 * 최소값을 arr[0]으로보낸다
 * 1번째를 최소값으로
 * 1번째와 2번째를 비교해서 if(min > arr[i]) min = arr[i] 2,3 3,4
 * 
 * 최소값을 arr[1]으로 보낸다
 * ...
 *  
 * 
 */
package ch22_collection03.sort;

import java.util.Arrays;

public class Test02 {
	public static void main(String[] args) {
	/**선택정렬*/	
		//배열에 숫자 저장
		int[] arr = {4, 2, 8, 6, 9};
		//4단계
		for(int i = 0; i < arr.length-1 ; i++) {
			//최소값 인덱스 = i
			int minIndex = i;
			//최소 인덱스가 1이 되면 2,3,4랑 비교
			for(int j = i+1; j < arr.length; j++) {
				//가장 작은 값
				if(arr[minIndex] > arr[j]) minIndex = j;
			}
			//민인덱스와 i가 같다면 continue
			if(minIndex == i) continue;
			//i번째 요소와 minIndex요소를 swap
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];		
			arr[i] = temp;		
		}
		
		
		System.out.println("정렬결과 : " + Arrays.toString(arr));
		
		
		
	}

}
