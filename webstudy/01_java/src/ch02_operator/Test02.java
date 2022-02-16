/**
 * 목표
 * 
 *  Scanner 클래스를 이용한 실행창에서 데이터 입력받기
 * 
 * 
 */

package ch02_operator;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		//the constructor Scanner() is undefined 스캐너 클래스에 이런거 존재하지 X
		                               //표준 입력창으로 부터 읽어들이겠다
		Scanner keyboard = new Scanner(System.in);
		System.out.print("1 : ");
		int data1 = keyboard.nextInt(); //화면에서 입력된 정수 값을 읽겠습니다
		System.out.println("입력된 data1 : " + data1);
		
		System.out.print("2 : ");
		String data2 = keyboard.next(); //문자열로 받을 때 그냥 next()만
		System.out.println("입력된 data2 : " + data2);
		
		//double
		System.out.print("3 : ");
		double data3 = keyboard.nextDouble();
		System.out.println("입력된 data3 : " + data3);
		
		keyboard.close();
		
	}

}
