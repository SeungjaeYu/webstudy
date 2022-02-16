/**
 * 
 * 목표
 * 
 * break 이름;
 * 
 * 많지 않지만 가끔씩 사용하는 케이스다
 * 
 */
package ch04_repetition;

public class Test07 {
	public static void main(String[] args) {
		/*
		for(int i = 1; i < 3; i++) {
			
			for(int k = 1; k < 3; k++) {
				if(k == 2) break; //2일때 k벗어나 i 값으로
				System.out.printf("i = %d, k = %d %n", i, k); // i = 1 k = 1
				                                              // i = 2 k = 1
			}
		}
		*/
		
		
		//3.outer라는 이름을 붙여줬다
		outer: for(int i = 1; i < 3; i++) {
			
			for(int k = 1; k < 3; k++) {
				if (k == 2) break outer;// 1.밖에있는 반복문까지 벗어나고 싶다. 반복문에 이름을 준다
				                        // 2.내가 이름을 주고 싶은 반복문 앞에 이름을 준다
				                        // 3.break 뒤에 이름을 넣는다
				                        // 4.이름이 붙여진 반복문을 빠져나간다
				System.out.printf("i = %d, k = %d %n", i, k);
			}
		}    // i = 1, k = 1
		
		
		
		
		
		
		
		
		
	}

}
