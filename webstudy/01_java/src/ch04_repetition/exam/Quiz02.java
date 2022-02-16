/**
 *   1부터 10사이의 숫자중에서
 *   3의 배수는 그대로 출력하고
 *   3의 배수가 아닌 숫자는 2배수를 출력한다.
 *   
 *   출력형식>
 *   2 1*2
 *   4 2*2
 *   3 
 *   8
 *   10
 *   6
 *   ..
 *   ..
 *   20
 */
package ch04_repetition.exam;

public class Quiz02 {
	public static void main(String[] args) {
		for(int i = 1; i <= 10; i++) {
			if(i % 3 != 0) {
				System.out.println(i*2);
			}
			else System.out.println(i);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
//	for(int i = 1; i <=10; i++) {
//		if(i%3==0) System.out.println(i);
//		else System.out.println(i*2);
//	}
		
		
		
	}

}
