package ch02_operator;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		//주소를 받고 싶다
		System.out.print("나이 : ");

//		int age = keyboard.nextLine(); //nextline은 문자열이지 정수가 아니다. 문자열을 정수로 바꿔줘야한다
		//문자열을 정수로 변환
		//int Integer.parseInt(String); 인트를 문자열로 변환시켜준다
		
		int val = Integer.parseInt("100"); //문자열을 주면 int로 실행결과를 준다 val은 100이 됨
	
//		int val2 = Integer.parseInt("hello"); //숫자형태가 아닌 것은 int로 받지 못해서 오류발생

		
//		int age = keyboard.nextLine(); //nextline은 문자열이지 정수가 아니다. 문자열을 정수로 바꿔줘야한다
		int age = Integer.parseInt(keyboard.nextLine()); 
		
		
		//		keyboard.nextLine(); //입력된 줄바꿈 문자를 제거하기 위해 사용 \r\n을 읽어서..
		System.out.println("입력된 나이 : " + age);

//		String addr = keyboard.next(); // 문자열을 받아야하는데 addr은 하나만 받을 수 있다
        //서울시 강동구 를 쓰면 서울시만 출력..
        //enter가 끝이 되게... enter는 줄바꿈 \n or \r 여기까지만 읽어주게
		//서울시\r\n
		System.out.print("주소 : ");
		//ex)홍길동을 
				//nextLine()줄 단위로 입력받고 싶으면 :  문자열로 반환
		String addr = keyboard.nextLine();
		//nextLine 주의점 특성 ..?
				// 줄복사 ..addr 복사할 줄 선택 ctrl + alt + 방향키 .. ㅎ 화면이 반전되네.. intel은 화면에서 오른쪽클릭 옵션 바로가기키 사용안함
				// 복사한 것을 줄 이동 시키기 alt + 방향키
		//\r\n nextLine이 읽는다 
		System.out.println("입력된 주소 : " + addr);
		
		
	}

}
