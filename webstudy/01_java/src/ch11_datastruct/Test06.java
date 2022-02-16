package ch11_datastruct;

import java.util.Arrays;
import java.util.Scanner;

public class Test06 {
	int[] arr = new int[10];
	Scanner sc = new Scanner(System.in);
	int head = 0, inser = 0;
	int pos = 0;
	
	int menu() {
		System.out.println("------------------");
		System.out.println("1. 입력(마지막)");
		System.out.println("2. 입력(위치지정)");
		System.out.println("3. 꺼내기");
		System.out.println("4. 전체데이터 확인");
		System.out.println("0. 종료");
		System.out.println("------------------");
		System.out.print("메뉴 : ");
		return Integer.parseInt(sc.nextLine());
	
	}


void service() {

	while (true) {
		switch (menu()) {
		case 1: append(); break;
		case 2: insert(); break;
		case 3:	delete(); break;
		case 4: select(); break;
		case 0: exit();
			
		}
	}
}

	void append() {
		if (pos == arr.length) {
			System.out.println("더이상 저장할 공간이 없습니다");
			return;
		}
		System.out.print("입력값 : ");
		arr[pos++] = Integer.parseInt(sc.nextLine());
		

	}

	void insert() {
		if(pos == arr.length) {
			System.out.println("빈 공간이 없습니다");
			return;
		}
		System.out.println("입력(인덱스) :");
		int index = Integer.parseInt(sc.nextLine());
		if(index < 0 || index > pos-1) {
			System.out.println("잘못된 위치입니다");
			return;
		}
		//들어갈 위치
		int num = pos - index;
		if(num>0) {
			System.arraycopy(arr, index, arr, index+1 , num);
		}
		System.out.print("입력값 :");
		arr[index] = Integer.parseInt(sc.nextLine());
		
		//값 입력 받기
		// 범위값이 아니면 범위가 아니라고 선언
		//pos-1 위치까지만 받기
		//system.arraycopy 이용해서 자리값 바꿔주기 
		
			

	}
	
	void select() {
		System.out.println(Arrays.toString(arr));
		
	}

	void delete() {
		if (pos == 0) {
			System.out.println("입력된 데이터가 없습니다.\n");
			return;
		}
		System.out.print("위치(인덱스) : ");
		int index = Integer.parseInt(sc.nextLine());
		int val = arr[index];
		System.out.println("꺼낸값 : " + val);
		//당겨오기
		int num = pos-index-1;
		if(num > 0) 
			{System.arraycopy(arr, index+1 , arr, index , num);
		//마지막 자리값에 0주기
			}
		arr[--pos] = 0;

		}
	
	 
	 
	 void exit(){
		 System.exit(0);
	 }
	 
	 
	 
	 
	 
	 
//	 void showQueue() {
//		 System.out.println(Arrays.toString(arr));
//		 
//	 }
	 
	 
	

	
	
	
	
	
	
	public static void main(String[] args) {
		new Test06().service();
		
	}

}
