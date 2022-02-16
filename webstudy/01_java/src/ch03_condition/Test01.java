/**
 * 제어문 : 조건(if) 
 * 
 */
package ch03_condition;

public class Test01 {
	public static void main (String[] args){
	/*   조건식 : 참과 거짓을 판단해야한다
	 *   () 참일 경우 실행할 문장들
	  
	  if(조건식) 실행문장; 한 문장일때 블럭을 안줘도 된다. 세미콜론으로 문장의 끝을 나눈다 
	   if(조건식); 
	     실행문장; => 실행문장에 조건식의 영향이 없다
00
	  if(조건식) 
	       실행문장; 넘겨도 상관없다
	  
	  if(조건식){	  }
	 */
	
	
	int a = 15;
	
	if (a>10) {
		System.out.println("a는 10보다 큽니다");
	}
	
	//if(a>10) System.out.println("a는 10보다 큽니다");
	
	
	if (a>10)
		System.out.println("a는 10보다 큽니다");
	    System.out.println("a= " + a); //같아 보이지만 위에 세미콜론으로 끝냈기 때문에 조건문의 영향이X 
	                                   //같이 하고싶으면 {}을 사용해라
	
	
	    if (a>10) {
	    	System.out.println("a는 10보다 큽니다");
	    System.out.println("a= " + a); 
	    }
	
	
	
	
	
	
	}

}
