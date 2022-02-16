package ch11_datastruct;

import java.util.Arrays;

public class IntArrayQueue {
	//정수값만 관리하는 것.
	//문자열 하고싶으면 StringArrayQueue
	
	final int CAPACITY = 10;
	int[] queue = new int[CAPACITY];
	// 관리할 값들의 저장 변수
	int head = 0, tail = -1, size = 0;
	
	
	boolean full() {
		return size == CAPACITY; //size == CAPACITY 다면 false 값을 준다
	}

	void add(int val) {
		 if (full()) { //가득찼다면
				System.out.println("비어있는 공간이 없습니다.\n");
				return;
		 }	 
				tail = (tail + 1) % CAPACITY;
				size++;
				queue[tail] = val;
				
	 }
	
	//비어있다
	boolean empty() {
		return tail == -1;
	}
	
	

	    //값을 꺼내기만 숫자제거 X
		 int peek(){
			 if (size == 0) {
				 System.out.println("입력된 데이터가 없습니다.\n");
				 return -1;
			 }
			 return queue[head]; //데이터가 있을 때
		 }
	
		 int del() {
				int val = peek(); //peek 이 값을 뽑아줄거다
				queue[head] = 0;
				head = (head + 1) % CAPACITY;
				size--;
				return val;
		 }
		 
		 
		 //public String 이 같이 사용되어야한다. int queue가 갖고있는 배열을 보여준다
		 public String toString() {
			 return "IntArrayQueue" + Arrays.toString(queue);
			 
		 }

}
