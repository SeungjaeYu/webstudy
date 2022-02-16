package ch11_datastruct;

public class IntArrayList {
	final int CAPACITY = 10;
	int[] arr = new int[CAPACITY];
	int pos = 0;

	
	boolean isFull() {
		return pos == arr.length;
		
	}
	
	boolean isEmpty() {
		return pos == 0;
		
	}
	
	void add(int val) {
		if (isFull()) {
			return;
		}
		arr[pos++] = val;

	}
	boolean wrong(int index) {
		return index < 0 || index > pos-1;

	}

	void add(int index, int val) {
		//들어갈 위치
		int num = pos - index;
		if(num>0) {
			System.arraycopy(arr, index, arr, index+1 , num);
		}
		System.out.print("입력값 :");
		arr[index] = val;
		
	}
	
	
	
	
	
	int remove(int index) {
		
		int val = arr[index];


		int num = pos-index-1;
		if(num > 0) 
			{System.arraycopy(arr, index+1 , arr, index , num);
		//마지막 자리값에 0주기
			}
		arr[--pos] = 0;
		return val;
	}

}
