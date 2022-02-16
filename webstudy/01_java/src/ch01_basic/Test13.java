/**
 * 목표
 * 
 * 
 * 상수의 사용법을 이해하자
 * 
 */
package ch01_basic;

public class Test13 {
	public static void main(String[] args) {
		final int HOUR = 24; //ctrl + shift + y 소문자
             		         //상수로 써 줄 거기 때문에 대문자
		
//		HOUR = 22;  //ctrl + shift + x 대문자 
		//위에 final을 선언해줘서 값 변경 못함 
		
		
		//the final field Integer.MAX_VALUE cannot be assigned : final 선언한 값을 바꿀 수 없다
//		Integer.MAX_VALUE = 100;
		
		long val = 21147483647l; //long을 사용할 땐 숫자 뒤 l을 사용
//		itn val = 21147483647; //21147483647이 int의 범위를 넘어서
		
		System.out.println(Integer.MAX_VALUE); // 인트가 가질 수 있는 최대값 
		System.out.println(Integer.MIN_VALUE); // 인트가 가질 수 있는 최소값
	}

}
