/**
 * 목표
 * 
 * if의 확장..
 * 
 * 
 */
package ch03_condition;

public class Test02 {
	public static void main(String[] args) {
		//삼항연산자(조건연산자)
		int a = 10;
		int b = 5;
//		int max = (a>b)? a : b; 
		int max;
		/*
		if(a > b) {
			max = a;
				
		}else { //위의 if조건을 만족하지 않았을 때
			max = b;
		}
		*/
		if(a > b) max = a;
		else max = b;
		System.out.println(max);
		
		max = b;
		if(a > b) max = a; //짧을 때는 이렇게 할 수 있다. else를 써주지 않아도 된다. max가 a가 될 상황만 따지면된다

	
		
	}

}
