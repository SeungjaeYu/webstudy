/**
 * 목표
 * 
 * 숫자, 영문자, 한글의 아스키 코드 범위 확인
 * 
 */
package ch05_datatype;

public class Test03 {
	public static void main(String[] args) {
		char c = 'F';
		int i = c;
		System.out.println(c + "의 아스키코드 : " + i);
		
		int i2 = 'F';
		System.out.println("F의 아스키 코드 : " + i2);
		System.out.println("F의 아스키 코드 : " + (int)'F');
		System.out.println("f의 아스키 코드 : "+ (int)'f');
//		String -> int : 에러발생. 기본형끼리 가능
//		System.out.println("F의 아스키 코드 : " + (int)"F"); 에러발생
		
		//범위 확인
		System.out.println((int)'0'); //48 아스키코드. 문자값으로 생각해야한다
		System.out.println((int)'1'); //49
		System.out.println((int)'9'); //57

		System.out.println((int)'A'); //65		
		System.out.println((int)'Z'); //90		
		System.out.println((int)'a'); //97		
		System.out.println((int)'z'); //122		
		/*
		알파벳의 아스키코드
		54~64 : 특수문자
		A-Z :65~90
		a-z :97~122  두 수 사이에 32씩 차이난다
		*/
		System.out.println((char)91); // [
		System.out.println((char)92); // \
		System.out.println((char)93); // ]
		System.out.println((char)94); // ^
		
		//문자는 양수값만 받는다
		System.out.println((int)'ㄱ');//12593
		System.out.println((int)'ㅎ');//12622
		System.out.println((int)'ㅏ');//12623
		System.out.println((int)'가');//44032
		System.out.println((int)'힣');//55203
		//단축키 : alt shift + a 열단위로 복붙, 수정
		//한글 조심
		
		
		
		
		
		
		
		
		
		
	}

}
