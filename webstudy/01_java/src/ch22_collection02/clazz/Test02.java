/**
 * List에서 data를 꺼내는 방식
 * 
 * 
 */
package ch22_collection02.clazz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test02 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
			
		list.add("a");
		list.add("b");
		list.add("c");
		
		//리스트 데이터 출력
		System.out.println("1.----------------");
		for(int i = 0; i < list.size(); i++){
			System.out.println(list.get(i));
		}
		
		//향상된 for문
		System.out.println("2.----------------");
		for(String data : list) {
			System.out.println(data);
		}
		
		System.out.println("3.----------------");
		Iterator<String> ite = list.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		
		
	}

}
