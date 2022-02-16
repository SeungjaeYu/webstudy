package dataQueue;

public class QueueVO {
	private final int CAPI = 10;
	private int[] que = new int[CAPI];
	private int head;
	private int tail;
	private int size; 

	QueueVO() {
		
		size = 0;
		tail = -1;
		head = 0;
	}
	
	public int getHead() {
		return head;
	}
	public void setHead(int head) {
		this.head = head;
	}
	public int getTail() {
		return tail;
	}
	public void setTail(int tail) {
		this.tail = tail;
	}

	public int[] getQue() {
		return que;
	}

	public void setQue(int[] que) {
		this.que = que;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getCAPI() {
		return CAPI;
	}

}
