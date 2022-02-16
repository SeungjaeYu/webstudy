/**
 
10부터 20사이의 랜덤한 숫자를 생성한 다음 생성된 숫자 만큼의 소수를 출력하는 프로그램을 작성하시오 
 
출력형식> 
총 17개의 소수를 출력합니다.
2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59  
  
 */
package ch04_repetition.exam;
import java.util.Random;
public class Quiz14 {
	public static void main(String[] args) {
		Random r = new Random();
		int num = r.nextInt(11)+10;
		
		int count = 0;
		
		int i=1, j;
	
		
    	System.out.printf("총 %d개의 소수를 출력합니다 %n", num);
    	
    	boolean cham = true;
    	
    	while(true) {
    	cham = true;
    	 i++;
    	
    	 for(j = 2; j < i; j++) {
    		 if( i % j == 0) 
    			 cham = false;	
    	 }
    		 
    	 
    	 if(cham == true) {
    	 System.out.printf("%d ", i);
    	 count++;
    	 	
    	 if(num == count)
    		 break;
    	 }	
    	}
    	
    	
    	
    

		
		
				
		
		
		
	}

}
