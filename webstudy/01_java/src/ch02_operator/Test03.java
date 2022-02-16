/**
 * 목표
 *  
 * Scanner를 활용해보자
 * 
 */

package ch02_operator;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	/*
	System.out.print("나이 : ");
	int age = keyboard.nextInt();
	System.out.print("키 : ");
	int height = keyboard.nextInt();
	System.out.print("몸무게 : ");
	int weight = keyboard.nextInt();
	
	System.out.println("나이는" + age + " 키는 : " + height + " 몸무게는 : " + weight + "이다.");
	*/
	
	//숫자 한꺼번에 받기
	//공백으로 값이 구분된다
	System.out.print("정보를 입력하세요 (나이, 키, 몸무게)");
	int age = keyboard.nextInt();
	int height = keyboard.nextInt();
	int weight = keyboard.nextInt();
	//입력을 다 안하면 할 때까지 기다리고있다.
	
	System.out.println("나이는 : " + age);
	System.out.println("키는 : " + height);
	System.out.println("몸무게는 : " + weight);

	
	}

}
