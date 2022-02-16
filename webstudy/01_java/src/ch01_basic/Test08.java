/**
 * 목표
 * 
 * printf에 대해 이해하자
 *  출력시 문자열과 변수의 결합이 복잡한 경우 사용
 * 
 */
package ch01_basic;

public class Test08 {
	public static void main(String [] args) {
		//printf는 c 언어에서 사용하던 것을 자바에서 1.5버전에서 구현...
		// 형식
		//printf("포멧", arguments...값들 쭉 나열);
		//포멧의 형태
		//[]은 생략이 가능하다 무언가 올 수 있고 안 올수도 있다
		//%[argument_index$][flags][width]conversion
		/*
		 *  C언어           특      징             java
		 *  --------------------------------- 
		 *   %d : 정수 100, 200, 300... int
		 *   %f : 실수 100.2 200.45     double/float
		 *   %s : 문자열, "hello world"  String
		 *   %n : 줄넘김 printf에서만    
		 */
	       	//변수이름 소문자로 시작(대문자X)
		String weatherCondition = "화창하다";
		System.out.println("오늘 날씨가" + weatherCondition);
//		System.out.printf("오늘 날씨가%s\n"); 오류난다 뒤에 값을 안줘서
		System.out.printf("오늘 날씨가%s\n", weatherCondition);
		
		//당신의 시력은 1.2입니다
		double sight = 1.2;
		System.out.println("당신의 시력은"+sight+"입니다.");
		System.out.printf("당신의 시력은%f입니다.%n", sight); //소숫점 뒤에 6자리까지 나온다
		
		/*
		 * 변수 세 개 선언
		 * place : 스타벅스
		 * price : 4100
		 * evalScore : 4.8
		 * 
		 * printf, println
		 * 
		 * 출력결과>
		 * 당신이 먹고 있는 커피는 스타벅스에서 4100원에 팔고 있고 평점은 4.8000000입니다.
		 * 
		 */
		
		String place = "스타벅스";
		int price = 4100;
		double evalScore = 4.8;
		
		System.out.println("당신이 마시고 있는 커피는"+ place + "에서 " + price + "원에 팔고있고 평점은 " + evalScore + "입니다");
		System.out.printf("당신이 마시고 있는 커피는%s에서 %d원에 팔고있고 평점은 %f입니다%n", place, price, evalScore);

		
	}

}
