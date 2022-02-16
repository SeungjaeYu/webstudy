package ch22_collection02.clazz;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Test06 {
	/**
	 * 데이터맵의 데이터 확인 방식
	 * 
	 */
	public static void main(String[] args) {
		Map<Integer, String> testMap = new HashMap<>();
		testMap = new TreeMap<>();
		testMap.put(1, "병아리");
		testMap.put(31, "복숭아");
		testMap.put(42, "샤인머스캣");
		System.out.println(testMap);
		
		//데이터 확인하기
		System.out.println("1.-----------------");
		//map에있는 key 값을 set으로 꺼낸다 키를 받는 거니까 셋도 같은 값으로 줘라
		Set<Integer> keySet = testMap.keySet();
		for(Integer key : keySet) {
			//key가 있으면 value값을 갖고올 수 있다 
			System.out.println(key + "=>" + testMap.get(key));
		}
		
		
		
		System.out.println("2.-----------------");
		//entry 하나의 키와 밸류값을 담기위한 클래스 
		Set<Map.Entry<Integer, String>> entrySet = testMap.entrySet();
		//entrySet 사이즈만큼 Map.Entry<Integer, String>가 파라미터인 ent를 돌려라
		for(Map.Entry<Integer, String> ent : entrySet) {
//			System.out.println(ent);
		   System.out.println(ent.getKey() + "-" + ent.getValue());
		}
		
		
		
		
		
	}
	

}
