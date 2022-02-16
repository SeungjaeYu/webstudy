package dataStack;

import java.util.Arrays;

public class StackDAO {
	final int CAPI = 5;
	int[] stack = new int[CAPI];
	
	StackVO vo = new StackVO();
	
	boolean isFull() {
		return vo.getPos() == stack.length;
	}
	
	boolean isEmpty() {
		return vo.getPos() == -1;
	}
	
	
	void add(int val) {
		/* stack[top] = 0;
		 * top = (top + 1) % stack.length; 
		 * pos++
		 * stack[top] = val;
		 *
		 * 배열에 다시 값 주기..
		 */
		int pos = vo.getPos();
		stack[vo.getTop()] = 0;
		vo.setTop((vo.getTop() + 1) % stack.length);
		vo.setPos(pos++);
		
		
		
	}
	
	int peek() {
		return vo.getTop();	
	}
	
	void delete() {
		int pos = vo.getPos();
		vo.setPos(pos--);
	}
	
	public String toString(String s) {
		return Arrays.toString(stack);
	}
	
	

}
