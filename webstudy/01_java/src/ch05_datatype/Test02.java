/**
 * 목표
 * 
 * 기본형의 형변환
 * 
 */
package ch05_datatype;

public class Test02 {
	public static void main(String[] agrs) {
		//데이터의 크기에 따라서 구분. 형변환 = 타입변환
		//묵시적 형변환(암묵적 형변환, 업캐스팅)
		
		//명시적 형변환(다운캐스팅)
		// : 형변환 연산자와 같이사용(필수) 
		/*
		int = long 형변환..
        double = byte
        byte = byte x	
		
		int i = 100;
		byte b = i;  => 형변환이다
		
		 
		int = long  long값을 int로 집어 넣으려고 한다. 
		                  작은 놈이 큰 놈을 받으려고 한다 
		                  
		long = int 묵시적
		int = long 명시적
		형변환 연산자 : 큰 거를 작은 거에 담을 때 타입에 맞춰서 그만큼만 넣겠다                 
		           
		 */
		byte b = 100;
		int i = 100;
		
		int i2 = b; //묵시적 형변환 발생 (큰 쪽 = 작은 쪽) 별도의 작업X
//		byte b2 = b; //byte가 byte받음
//		byte b2 = i; //byte가 int 큰 타입을 받으려 하는데 형변환X 에러
		byte b2 = (byte)i; //i의 타입의 값을 byte의 크기만큼만 집어넣어 주세요 1바이트만 넣어주세요.
		System.out.println(b2);
		
		
		//char도 숫자로 바꿀 수 있다
		//char < int < long < float < double
		//아스키 코드를 숫자로
		char c = 'a';
		int i3 = c; //큰 거 = 작은 거 . 묵시적형변환
		System.out.println(i3); //97
		
		int i4 = 100;
		char c2 = (char)i4;
		System.out.println(c2); //d char 100은 d
		
		
		
		//boolean 은 다른 타입으로 형변환이 안된다.(X)
		boolean bool = true;
//		int i5 = (int)bool; //명시적형변환 에러
//		int i5 = bool;      //묵시적형변환 에러
		
		
		
		
		
		
		
	}

}
