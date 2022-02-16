package ch22_collection02.clazz;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test03 {
	/**
	 * Set : 중복을 허용하지 않는다. 순서관리가 안된다. Index로 접근X (몇 번째에 뭐가있는지 모른다)
	 * 
	 */
	
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		System.out.println(set.add("One"));
		System.out.println(set.add("Two"));
		System.out.println(set.add("Three"));
		
		//크기확인
		System.out.println(set.size());
		
		System.out.println(set);
         //더했지만 false. 중복을 허용하지 않는다		
		System.out.println(set.add("Two"));
		//3
		System.out.println(set.size());
		
		
		set.remove(1); //set.remove(new Integer(1)); 변화가 없다
		set.remove("One");
		System.out.println(set);
		
		
		
		//set 의 데이터를 반복하기
		/*
		for(int i = 0; i < set.size() ; i++) {
			System.out.println(set.get());
		}
		인덱스로 접근하는게 없다*/
		
		//향상된 for문
		System.out.println("1.------------");
		for(String data : set) {
			System.out.println(data);
		}
		
		//이터레이터
		System.out.println("2.------------");
		Iterator<String> ite = set.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		
		//toArray
		System.out.println("3.------------");
		//set의 데이터 배열로
		Object[] arr = set.toArray();
		System.out.println(Arrays.toString(arr));
		
		
		
		
	}

	
}
