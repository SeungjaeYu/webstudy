package ch11_datastruct;

import java.util.Arrays;
import java.util.Scanner;

public class Test02 {
	Scanner sc = new Scanner(System.in);
	final int CAPACITY = 10;
	int[] queue = new int[CAPACITY];
	// 관리할 값들의 저장 변수
	int head = 0, tail = -1, size = 0;

	//스태틱 classname. ~
	//없으면 메인쪽에서 객체를 만들고 . ~ 해야한다
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

		while (true) {
			switch (menu()) {
			case 1: add(); break;
			case 2: del(); break;
			case 3:	showQueue(); break;
			case 0: return;
				
			}
		}
	}
	
	void add() {
		 if (size == CAPACITY) {
				System.out.println("비어있는 공간이 없습니다.\n");
		 }	 
				System.out.print("입력 값 : ");
				tail = (tail + 1) % CAPACITY;
				size++;
				queue[tail] = Integer.parseInt(sc.nextLine());
				
	 }
		 
		 void del() {
			 if (size == 0) {
					System.out.println("입력된 데이터가 없습니다.\n");
					return;
				}
				int val = queue[head];
				queue[head] = 0;
				System.out.println("꺼낸값 : " + val);
				head = (head + 1) % CAPACITY;
				size--;
		 }
		 
		 
		 
		 void showQueue() {
			 System.out.println(Arrays.toString(queue));
			 
		 }
		 
		 
		 
			 
		 
	
	
	
	
	
		public static void main(String[] args) {
//			Test02 t = new Test02();
//			t.service(); 한번만 사용하기 때뮨에
			new Test02().service();
			
			
			
			
			
			
}

}
