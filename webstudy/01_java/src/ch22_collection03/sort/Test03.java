/**
 * API를 활용한 정렬방식
 * 
 */
package ch22_collection03.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test03 {
	public static void main(String[] args) {
		int[] arr = {2, 14, 3, 10};
		System.out.println(Arrays.toString(arr));
		
		//API 순서대로 정렬시켜준다.
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		
		//List
		List<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(3);
		list.add(10);
		list.add(1);
		//collection 애들을 위한 sort가 있다.Collections 라는 것을 제공
		Collections.sort(list);
		System.out.println("collection : "+ list);
		
		//반전 내림차순
		Collections.reverse(list);
		System.out.println("C.reverse : "+ list);
		
		//번호 뒤섞기
		Collections.shuffle(list);
		System.out.println("C.shuffle : "+ list);
		
		//min, max 최대값을
		System.out.println("max : " +Collections.max(list));
		System.out.println("min : " +Collections.min(list));
		
		list.add(10);
		list.add(10);
		list.add(10);
		list.add(10);
		list.add(7);
		list.add(7);
		
		
		//list의 특정값의 빈도
		System.out.println("빈도 : "+Collections.frequency(list, 10));
		
		
	}

}
