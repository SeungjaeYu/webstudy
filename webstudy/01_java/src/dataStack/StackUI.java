package dataStack;

import java.util.Arrays;
import java.util.Scanner;

public class StackUI {
	
	StackDAO dao = new StackDAO();
	
	Scanner sc = new Scanner(System.in);
	
	int menu() {
		System.out.println("------------------");
		System.out.println("1. 입력");
		System.out.println("2. 꺼내기");
		System.out.println("3. 전체데이터 확인");
		System.out.println("0. 종료");
		System.out.println("------------------");
		System.out.print("메뉴 : ");
		
		return Integer.parseInt(sc.nextLine());
	
	}
	
	void service() {
		while(true) {
			switch(menu()) {
			case 0: exit(); break;
			case 1:	insert(); break;
			case 2:	output(); break;
			case 3:	get(); break;
			default:
				System.out.println("잘못된 번호입니다 . 다시 입력해주세요");
				return;
			}
		}
	}
	

	
	void insert() {
		if(dao.isFull()) {
			System.out.println("더이상 들어갈 수 있는 공간이 없습니다");
			return;
		}
		System.out.print("수를 입력하세요 :");
		int num = sc.nextInt();
	
	}
	
	void output() {
		if(dao.isEmpty()) {
			System.out.println("데이터가 없습니다");
			return;
		}
		System.out.printf("꺼낸 값 : " + dao.peek());
		dao.delete();
		
	}
	
	
	void get() {
		if(dao.isEmpty()) {
			System.out.println("데이터가 없습니다");
			return;
		}
		System.out.println(dao.toString());
		
	}
	
	
	void exit() {
		System.out.println("종료합니다");
		System.exit(0);
	}
	
	
	
	
	
	
	
	
	
	

}
