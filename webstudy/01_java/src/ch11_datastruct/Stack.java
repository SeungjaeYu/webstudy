package ch11_datastruct;

import java.util.Arrays;
import java.util.Scanner;

public class Stack {
	/**
	 * stack 해보자
	 * top으로 위치 구분해보자
	 */
	int[] stack = new int[5];
	Scanner sc = new Scanner(System.in);
	int top = -1;
	
	
	public boolean full() {
		return top == stack.length-1;
					
	}
	
	public boolean empty() {
		return top == -1;
	}
	

	public void add(int val) {
		if (full()) {
			System.out.println("공간이 없습니다");
			return;
		}
		stack[++top] = val;

	}
	
//	int pop() {
//		System.out.println("꺼낸 값 : " + stack[top]);
//		return stack[top--] = 0;
//		
//	}
	
	
	public void peek() {
		if (empty()) {
			System.out.print("입력된 데이터가 없습니다");
			return;
		}
		
		
	}

	
	public void del() {
		if (empty()) {
			System.out.print("입력된 데이터가 없습니다");
			return;
		}

		
	}
	
	public void showQueue() {
		
		System.out.println(Arrays.toString(stack));
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		Stack t4 = new Stack();

		
	}

}
