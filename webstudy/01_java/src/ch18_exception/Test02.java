package ch18_exception;

import java.util.Random;

public class Test02 {
	public static void main(String[] args) {
		/**
		 * 디버그 창이 뜨는 경우
		 * 내가 작성한 코드에 예외가 발생했을 때 예외처리 코드가 없을 경우
		 * 
		 */
		
		
		
		Object obj = new Random(); //묵시적 형변환
		
		//실행시점 발생 예외 : java.lang.ClasscastException
		Test02 t = (Test02)obj; //문법적으로는 O , 실행해보면 에러. 런타임에러
		
		System.out.println("메인 종료");
		
		
		
	}

}
