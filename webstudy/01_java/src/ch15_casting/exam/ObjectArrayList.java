package ch15_casting.exam;

import java.util.Arrays;

public class ObjectArrayList {
	
	String msg = "ArrayList";
	int length = 3;
	Object [] arr = new Object[length];
	int pos = 0;
	
	//Object.txt 파일을 읽어서 elements 배열에 등록하는 기능

	
	
	
	void isFull() {
     if(pos == arr.length) {
    	  Arrays.copyOf(arr, arr.length*2);
      }
	}
	
	
	boolean isEmpty() {
		return pos == 0;
	}
	
	void add(Object name) {
		isFull();
		 arr[pos++] = name ;
		
	}
	void add(int index, Object name) {
		isFull();
		int moveNum = pos - index;
		System.arraycopy(arr, index, arr, index+1, moveNum);
		arr[index] = name;
		pos++;
	}
	void remove(int index) {
		Object val = arr[index];
		int moveNum = (pos - index) - 1 ;
		if(moveNum > 0) {
			System.arraycopy(arr, index+1, arr, index, moveNum);
		}
		
	}
	
	
	Object get(int index) {
		return arr[index];
	}
	
	
	int size() {
		return pos;
		
	}
	
	void clear() {
		arr = new Object[length];
		pos = 0;
		
	}

	public String toString() {
		if(pos == 0) return "ArrayList[]";
		
//		Arrays.toObject()
		return msg;
	}
	
	
	

}
