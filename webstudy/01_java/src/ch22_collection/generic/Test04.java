package ch22_collection.generic;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Test04 {
	public static void main(String[] args) {
		                                    //1.7부터 new 클래스이름<>  <>안의 타입을 생략가능 
		Box04<String, String> box4 = new Box04<>("peach", "복숭아"); 
		
		
		List<Map<String, List<Integer>>> map = new ArrayList<>(); 
		
		
		//문자열만 담는 리스트!
		ArrayList<String> al  = new ArrayList<>();
		
		
		
		
	}

}
