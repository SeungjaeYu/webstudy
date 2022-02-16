package ch22_collection02.clazz;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Test05 {
	public static void main(String[] args) {
		   //key 값 value 값. key가 중복되는 것을 허용X
		Map<String, String> map = new HashMap<>();
		
		map.put("id", "trueeKim");
		
		map.put("name", "진실킴");
		
		System.out.println(map);
		
		//key가 중복되었다면 나중에 들어온 값이 덮어쓴다
//		map.put("name", "김진우");
		String prevName = map.put("name", "김진우");
		System.out.println("preName : " + prevName);
		String prevEmail = map.put("email", "h@a.com");
		System.out.println("prevEmail : " + prevEmail); //email의 기존것이 없어서 null반환
		
		//꺼내기
		String email = map.get("email");
		System.out.println("email : " + email);
		
		String address = map.get("address");
		System.out.println("address : " + address); //null값 반환. key가 없기때문에
		
	
		System.out.println(map);
		
		Map<Integer, String> testMap = new HashMap<>();
		testMap = new TreeMap<>();
		testMap.put(1, "병아리");
		testMap.put(31, "복숭아");
		testMap.put(4, "송아지");
		testMap.put(2, "말");
		testMap.put(67, "꿩");
		testMap.put(32, "샤인머스캣");
		System.out.println(testMap);
		
		
		
		
		
		
		
	}

}
