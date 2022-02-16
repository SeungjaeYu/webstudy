package ch22_collection02.clazz;

import java.util.Stack;

public class Test04 {
	public static void main(String[] args) {
		Stack<String> s = new Stack<>();
		s.push("정윤오");
		s.push("이민형");
		s.push("황인준");
		s.push("박지성");
		s.push("이동혁");
		System.out.println(s);
		
		
		//뒤에서 부터
		System.out.println("pop - > " + s.pop());
		System.out.println("pop - > " + s.pop());
		System.out.println(s);
		
		
		//삭제하지 않고 꺼내서 보여주기만 하기
		System.out.println(s.peek());
		System.out.println(s);
		
		
	}

}
