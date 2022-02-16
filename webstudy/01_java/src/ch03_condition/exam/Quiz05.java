/**
 * 랜덤한 숫자를 하나 생성합니다(1-12)
 * 
 * 생성된 문자가 12,1,2 일경우 "겨울입니다"
 * 3,4 5 봄입니다
 * 6,7,8 여름입니다
 * 9,10,11 가을입니다
 * 
 * 
 */
package ch03_condition.exam;
import java.util.Random;

public class Quiz05 {
	public static void main(String[] args) {
		Random r = new Random();
		int month = r.nextInt(12) + 1;
		
		
		/*
		switch (month){
			case 12:		
			case 1:
			case 2:
				System.out.println("겨울입니다");		//case는 break 이전의 모든 것을 처리하기 때문에 하나로 묶을 수 있다.
			break;
			
			case 3:
			case 4 :	
			case 5 :
				System.out.println("봄입니다");
			break;
			
			case 6:
			case 7 :	
			case 8 :
				System.out.println("여름입니다");
				break;
			case 9:
			case 10 :	
			case 11 :
				System.out.println("가을입니다");
				break;

		}*/
		
		
		
		
		
		
		
		
		
	}

}
