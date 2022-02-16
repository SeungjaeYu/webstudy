/**
 * 인터페이스 구현하기
 * API에서 제공하는 java.lang.Runnable과 java.io.Serializable을 구현하는 클래스 선언MtImp1
 * 
 */
package ch17_interface.exam;

import java.io.Serializable;



class MyImp1 implements Runnable, Serializable{
	public void run() {
		System.out.println("성공적");
	}
	
}


public class Quiz01 {
	public static void main(String[] args) {
		Runnable r = new MyImp1();
		r.run(); //성공
		Serializable s = new MyImp1();
		
		
		
		
	}
	
	

}
