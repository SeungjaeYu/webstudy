/**
 * 목표
 * 
 * 배열의 복사
 * 
 * -얕은 복사 : 주소를 복사 
 * -깊은 복사 : 메모리 공간을 새로 만들어 내용을 복사
 * 
 */
package ch06_array;

import java.util.Arrays;

public class Test07 {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		
		int[] arr2 = arr; //arr2는 arr이 갖고있는 값을 공간에 넣는다 따로따로 주소만 공유
		                  //값을 바꿔도 같은 공간을 참조하기 때문에 같은 바꾼 값이 나온다 
		
		System.out.println("1. 얕은 복사");
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		
		arr [1] = 100;
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		
		
		//깊은 복사
		System.out.println("2. 깊은 복사");
		int[] arr3 = {1, 2, 3, 4, 5};
		int[] arr4 = new int[arr3.length];
		for(int i = 0; i < arr3.length ; i++)
			arr4[i] = arr3[i];
		
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
		
		//배열 숫자 변경
		arr3[1] = 100;
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4)); //배열의 값이 다르다. 공간을 만들어서 복사한 값만 갖기때문에
		
		
		
		/*
		 * API를 이용한 배열의 깊은 복사 
		 * 일부부만 복사 가능하다
		 */
		System.out.println("3. API 깊은 복사1(일부분의 복사 전체도 가능)");
		int[] arr5 = {1, 2, 3, 4, 5};
		int[] arr6 = new int[arr5.length];
		System.arraycopy(arr5, 2, arr6, 0, 3);	//arr 5 의 2번째복사해서 0번째받을게 .3 범위값만큼 복사	
		System.out.println(Arrays.toString(arr5));
		System.out.println(Arrays.toString(arr6));
		
		System.arraycopy(arr5, 0, arr6, 0, arr.length);
		System.out.println(Arrays.toString(arr5));
		System.out.println(Arrays.toString(arr6));
		
		
		
		/*깊은 전체복사*/
		System.out.println("4. API 깊은 복사2(전체)");
		int[] arr7 = {8, 9, 10, 11, 12};
		int[] arr8 = arr7.clone();
		System.out.println(Arrays.toString(arr7));
		System.out.println(Arrays.toString(arr8));
		
		
		
		
		System.out.println("5. API 깊은 복사3"); //확장
		int[] arr9 = {8, 9, 10, 11, 12};
		int[] arr10 = Arrays.copyOf(arr9, 10); //10개의 크기를 갖는 배열을 만들면서 arr9의 값을 앞에서부터 복사
		System.out.println(Arrays.toString(arr9));
		System.out.println(Arrays.toString(arr10));
		
		
		
		
		
		
		
		
		
		
		
	}

}
