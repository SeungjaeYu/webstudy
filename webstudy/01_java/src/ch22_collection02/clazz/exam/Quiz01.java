package ch22_collection02.clazz.exam;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Quiz01 {
	public static void main(String[] args) {
		//set을 이용해서 중복되지 않는 번호 6개의 로또 출력
		Set<Integer> set = new HashSet<>();
		Random r = new Random();
		
		
		
		Iterator<Integer> ite = set.iterator();	
		
		while(set.size() != 6) {
			set.add(r.nextInt(45)+1);
		}
		System.out.println(set);
		
		
		
	}

}
