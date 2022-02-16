package ch13_static.exam;

import java.util.Arrays;

public class Bus {
	private int num;
	private int carNum;
	private int person=0;
	private int pos=0;
	private static int posNum=0;
	

	public Bus(int carNum) {
		this.carNum = carNum;
	}
	
	void ride() {this.ride(1);}
	
	void ride(int person) {
		this.person = person;
		pos += person;
		posNum += person;
//		System.out.println("승차" + person);
	}
	
	void leave() {this.leave(1);}
	
	void leave(int person) {
		this.person = person;
		pos -= person;
//		System.out.println("하차" + person);
	
	}
	
	

	

	
	public String toString() {
	 return String.format(
			 "%d번 버스의 현재 승차인원: %d명 \n 모든 버스의 누적 승차인원 : %d명", this.carNum, this.pos, this.posNum);
	}
	
	
	
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getPerson() {
		return person;
	}
	public void setPerson(int person) {
		this.person = person;
	}
	public int getPos() {
		return pos;
	}
	public void setPos(int pos) {
		this.pos = pos;
	}
	public int getPosNum() {
		return posNum;
	}
	public void setPosNum(int posNum) {
		this.posNum = posNum;
	}
	
	public int getCarNum() {
		return carNum;
	}
	public void setCarNum(int carNum) {
		this.carNum = carNum;
	}
	
	
	
	
}
