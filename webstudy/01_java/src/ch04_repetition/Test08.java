/**
 * 
 * 목표
 * 
 * 현재 반복문의 스킵
 * 
 * continue, continue 이름(반복문에 이름을 줄 수 있다)
 * 
 * 현재 실행중인 반복만 벗어난다
 */
package ch04_repetition;

public class Test08 {
	public static void main(String[] args) {
		
		
		/*
		for(int i = 1; i < 5; i++) {
			if(i % 2 == 0) {
			System.out.println(i);
			}
		
		//continue 사용		
		}
		 */
		for(int j = 1; j < 5; j++) {
			if(j % 2 == 1) {
			 continue; //홀수를 스킵하겠다
			}
			// => if(j % 2 == 1) continue;
			System.out.println(j);
		}
		
		
		/*
		 i = 1 k = 1
		 i = 2 k = 1
		outer: for(int i = 1; i < 3; i++) {
			
			for(int k = 1; k < 4; k++) {
				if(k == 2) {
					//continue; //k가 2인것만 넘겠다. 3부터는 찍힌다
					continue outer; //i++ 로 넘어간다
				}
			 System.out.printf("i = %d, k = %d %n", i, k);	
			}
			
		}
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
