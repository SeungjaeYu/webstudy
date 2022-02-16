package dataQueue;

import java.util.Arrays;

public class Queue {
	//DAO

	 /**
	  * QueueVO 불러오기
	  */
	 QueueVO vo = new QueueVO();

	 
	 
	 boolean isFull() {
		 return vo.getQue().length == vo.getSize();			 
	 }
	 
	 boolean isEmpty() {
		 return vo.getTail() == -1;
	 }
	 
	 void add(int val) {
		 /**
		  * tail은 배열만큼 있어야한다.
		  */
		 int[] arr = vo.getQue(); 
		 int pos = vo.getSize();
		 vo.setTail((vo.getTail() + 1) % vo.getQue().length); 
		 vo.setSize(pos++); 
		arr[vo.getTail()] = val;
		 
		 vo.setQue(arr); 
	 }
	 
	 int remove() {
		 int[] arr = vo.getQue();
		 /**
		  * r은 꺼낸값
		  */
		 int r = arr[vo.getHead()];
		 arr[vo.getHead()] = 0;
		 vo.setHead((vo.getHead()+1)%vo.getQue().length);
		 vo.setSize(vo.getSize()-1);
		 //que[head] = 0 초기값
		 //head = (head + 1) % capi; 
 
		 return r; 
	 }
	 
	public String toString() {
		return Arrays.toString(vo.getQue());
	}
	 
	 
	 
	 
	
	 
	 
	
	
	

}
