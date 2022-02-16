package dataQueue;

import java.util.Scanner;

public class UI {

		/**
		 * Queue 불러오기
		 */
		Queue bQue = new Queue();
		/**
		 * 값 넣을 스캐너 만들어주기
		 */
		Scanner sc = new Scanner(System.in);
		
		int menu() {
			System.out.println("------------------");
			System.out.println("1. 입력");
			System.out.println("2. 꺼내기");
			System.out.println("3. 전체데이터 확인");
			System.out.println("0. 종료");
			System.out.println("------------------");
			System.out.print("메뉴 : ");
			String s = sc.nextLine();
			if(s.equals("")) return 4;
			return Integer.parseInt(s);
		
		}
		
	public void service() {
		while (true) {
			switch (menu()) {

			case 0 : exit(); break;
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
			 if(bQue.isFull()) {
			       System.out.println("더이상 저장할 공간이 없습니다");
			       return;
				 }
			 System.out.print("입력값 :");
			 int val = Integer.parseInt(sc.nextLine());
			 bQue.add(val);
			
		}
		
		void output() {
			if(bQue.isEmpty()) {
				System.out.println("저장되어 있는값이 없습니다");
				return;
			}
			System.out.println("꺼낸값"+ bQue.remove());
			
		}
		
		void get() {
			if(bQue.isEmpty()) {
				System.out.println("저장되어 있는값이 없습니다");
				return;
			}
			System.out.println(bQue.toString());
		}
		
		void exit() {
			System.out.println("종료되었습니다");
			System.exit(0);
			
		}
		
		
		
		
		
		
		
		
		
		
	
	
		
	
}
