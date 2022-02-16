/**
 * 데이터 자료구조
 * Queue구조
 * -배열을 이용한 연습을 할 것이다
 * -데이터를 하나 집어넣으면 
 * - FIFO(first in first out) 
 *   1, 2, 3, 4, 5를 집어넣으면 1인 앞에서부터 차례대로 빠져나온다
 *  꺼내는 위치와 집어넣는 위치 두 개를 관리하는 것이 있어야한다 
 * 
 * Stack : 메모리에서 변수가 저장되는 공간
 * 먼저 들어간 값이 가장 나중에 나온다
 * -FILO(First in Last out)
 * 
 * List : index로 접근
 * - Array(배열)
 * 
 * - Link
 * 
 * 
 * *Queue에 대해 알아보자*
 * |1 |2 |3 |  |  |  |  |
 * head : 0    tail : 2
 * 
 * |1 |2 |3 |4 |  |  |  |
 * head : 0    tail : 3
 * 
 * |  |2 |3 |4 |  |  |  |
 * head : 1    tail : 3
 * 
 * |  |  |3 |4 |5 |  |  |
 * head : 2    tail : 4
 *  만약 head == tail 이 되면 더이상 꺼낼 게 없다는 것.
 *
 * |8 |9 |3 |4 |5 |6 |7 |
 *    * head : 2    tail : 6
 * 끝까지 다 갔다면 앞에서부터 다시 채워준다 
 * 꺼내기를 했을 때 0, 1, 2, 3 했다가 다시 채워준다. 다시 꺼내기를 했을때 0에서부터가 아닌 4번부터 빼준다
 *  
 *  
 * 
 */
package ch11_datastruct;

import java.util.Scanner;

public class Test01 {
	int[] arr = new int[10];
	Scanner sc = new Scanner(System.in);
	int head = 0, tail = 0; 
	int keyboard = sc.nextInt();
	int num = 0;
	
	int menu() {
		
		System.out.println("-------------");
		System.out.println("1.입력");
		System.out.println("2.꺼내기");
		System.out.println("3.전체데이터확인");
		System.out.println("0.종료");
		System.out.println("-------------");
		System.out.print("메뉴 : ");
		return Integer.parseInt(sc.nextLine());
		}
		
		void ser() {
			while (true) {

			switch (menu()) {
			case 1: insert();break;
			case 2: printOut(); break;
			case 3: select(); break;
			case 0: return;
		
			}

		}
		}


	
	void insert() {
		System.out.print("입력값 :");
		tail = (tail+1) % arr.length;
		num++;
		arr[tail] = Integer.parseInt(sc.nextLine());
		
		
	}
	
	void select() {
		
		
	}
	
	void update() {
		
	}
	
	
	void printOut() {
		
	}
	
	void exit(){
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		
		
		
		
		
		
		
		
	}

}
