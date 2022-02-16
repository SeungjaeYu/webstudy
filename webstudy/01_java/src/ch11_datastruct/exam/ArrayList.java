package ch11_datastruct.exam;

import java.util.Arrays;

public class ArrayList {
	
	String msg = "ArrayList";
	int length = 3;
	String [] arr = new String[length];
	int pos = 0;
	
	void isFull() {
     if(pos == arr.length) {
    	  Arrays.copyOf(arr, arr.length*2);
      }
	}
	
	
	boolean isEmpty() {
		return pos == 0;
	}
	
	void add(String name) {
		isFull();
		 arr[pos++] = name ;
		
	}
	void add(int index, String name) {
		isFull();
		int moveNum = pos - index;
		System.arraycopy(arr, index, arr, index+1, moveNum);
		arr[index] = name;
		pos++;
	}
	void remove(int index) {
		String val = arr[index];
		int moveNum = (pos - index) - 1 ;
		if(moveNum > 0) {
			System.arraycopy(arr, index+1, arr, index, moveNum);
		}
		
	}
	
	
	String get(int index) {
		return arr[index];
	}
	
	
	int size() {
		return pos;
		
	}
	
	void clear() {
		arr = new String[length];
		pos = 0;
		
	}

	public String toString() {
//		Arrays.toString()
		return arr[0];
	}
	
	
	

}
