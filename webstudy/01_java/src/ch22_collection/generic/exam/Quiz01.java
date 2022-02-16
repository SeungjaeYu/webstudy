package ch22_collection.generic.exam;

import java.util.Iterator;

public class Quiz01 {
	public static void main(String[] args) {
		//문자열을 받는 제너릭어레이리스트 선언
		GenericArrayList<String> list = new GenericArrayList<>();
		list.add("one");
		list.add("two");
		list.add("three");
		
		System.out.println(list.size());
		
//		String data = (String)list.get(0); 원래이렇게 썼는데 제너릭을 써서 형변환 X
		String data = list.get(0);
		System.out.println(data);
		
		
		//차례대로 찍기..
		Iterator<String> ite = list.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		
	}

}
