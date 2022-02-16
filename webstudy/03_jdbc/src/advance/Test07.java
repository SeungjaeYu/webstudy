/**
 * Variable Argument
 * 
 * 
 */
package advance;

public class Test07 {
	//가변적 '...' 이 다 받아준다 
	public static void sum(int... num1) {
		for (int val : num1) {
			System.out.println(val);
		}
	}
	
	
	/*
	public static void sum(int num) { }
	public static void sum(int num1, int num2) { }
	public static void sum(int[] arr) { }
	*/
	
	
	public static void main(String [] args) {
		sum(10);
		sum(10, 20);
		//몇개가 나올지 모르니까.. 배열로..
		//하나만 나왔을 때도 배열로 만들어주니 비효율적..
		sum(new int[] {10, 20});
		
		
		
		
		
		
	}

}
