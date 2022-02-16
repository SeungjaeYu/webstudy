package ch22_collection02.clazz.exam;

import java.util.HashMap;
import java.util.Map;

public class Quiz02 {
	public static void main(String[] args) {
		Map<String, String> m = new HashMap<>();
		m.put("name", "복숭아");
		m.put("alias", "과일");
		m.put("addr", "과일나무");
		m.put("dangdo", "높다");
		System.out.println(m.get("name"));
		System.out.println(m.get("alias"));
		System.out.println(m.get("addr"));
		System.out.println(m.get("dangdo"));

		
		//VO클래스로 위의 맵을 표현한다
		Board b = new Board();
		b.setName("복숭아");
		b.setAlias("과일");
		b.setAddr("과일나무");
		b.setDangdo("높다");
		System.out.println("-----VO-----");
		System.out.println(b.getName());
		System.out.println(b.getAlias());
		System.out.println(b.getAddr());
		System.out.println(b.getDangdo());
		
		
		
	}

}
