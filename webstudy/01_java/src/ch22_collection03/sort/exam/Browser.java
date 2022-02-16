package ch22_collection03.sort.exam;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Browser {
	Scanner sc = new Scanner(System.in);
	String s = null;
	Stack<String> history = new Stack<>();
	Stack<String> go = new Stack<>();
	
	
	int menu() {
		System.out.println("--------------------");
		System.out.println("1. 이동");
		System.out.println("2. 뒤로가기");
		System.out.println("3. 앞으로가기");
		System.out.println("0. 종료");
		System.out.println("--------------------");
		System.out.print("메뉴 : ");
		return Integer.parseInt(sc.nextLine()); 
	}
	
	
	void service() {
		while(true) {
			switch(menu()) {
			case 1 : move(); break;
			case 2 : back(); break;
			case 3 : forward(); break;
			case 0 : exit(); break;

			}
			
			System.out.println("현재페이지 : " + s);
			System.out.println("이전페이지" + history.toString());
			System.out.println("다음페이지" + go.toString());
		}
	}
	
	void move() {
		System.out.println("호출할 페이지 주소 : ");
		String page = sc.nextLine();
		if(s == null) {
			s = page;
			return;
		}
		history.push(s);
		s = page;
			

	}
	
	void back() {
		if(history.empty()) {
		System.out.println("이전 페이지가 없습니다");
		return;
		
		}
		go.push(s);
		s = history.pop();
		
	}
	
	void forward() {
	  if(history.empty()) {
		  System.out.println("다음페이지가 없습니다");
		  return;
	  }
	  
		
	}
	
	void exit() {
		sc.close();
		System.out.println("종료");
		System.exit(0);
	}
	
	

	public static void main(String[] args) {
		new Browser().service();
	}
	
	

}
