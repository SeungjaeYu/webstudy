package ch14_extend;

import java.util.Arrays;

public class Employee01ArrayList {
	
	String msg = "ArrayList";
	int length = 3;
	Employee01 [] arr = new Employee01[length];
	int pos = 0;
	
	//board.txt 파일을 읽어서 elements 배열에 등록하는 기능

	
	
	
	void isFull() {
     if(pos == arr.length) {
    	  Arrays.copyOf(arr, arr.length*2);
      }
	}
	
	
	boolean isEmpty() {
		return pos == 0;
	}
	
	void add(Employee01 name) {
		isFull();
		 arr[pos++] = name ;
		
	}
	void add(int index, Employee01 name) {
		isFull();
		int moveNum = pos - index;
		System.arraycopy(arr, index, arr, index+1, moveNum);
		arr[index] = name;
		pos++;
	}
	void remove(int index) {
		Employee01 val = arr[index];
		int moveNum = (pos - index) - 1 ;
		if(moveNum > 0) {
			System.arraycopy(arr, index+1, arr, index, moveNum);
		}
		
	}
	
	
	Employee01 get(int index) {
		return arr[index];
	}
	
	
	int size() {
		return pos;
		
	}
	
	void clear() {
		arr = new Employee01[length];
		pos = 0;
		
	}

	public String toString() {
		if(pos == 0) return "ArrayList[]";
		
//		Arrays.toBoard()
		return msg;
	}
	
	
	

}
