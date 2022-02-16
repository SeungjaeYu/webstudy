package ch08_method.exam;

public class Quiz05 {
	private int factorial(int i) {
		if (i > 0) return i * factorial(i - 1);
		else return 1;
	
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
	/**
	 *팩토리얼 계산하기.. 
	 * 0! = 1
	 * n > 0 n! = n * (n - 1)!
	 * 5! = 5 * 4!
	 */	
		
		Quiz05 q = new Quiz05();
		int result = q.factorial(5);
		System.out.printf("d! = %d ", 5 , result);
		
		
		
		
		
		
		
		
		
		
		
	}

}
