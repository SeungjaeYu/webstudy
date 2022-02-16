/**
 * 1~100을 반복없이 처리하냐 ?
 *-> 재귀호출 : 자기가 자기를 또 부르는 것 
 *
 * 
 * 
 */
package ch08_method;

public class Test06 {
	private void recur(int i) { //class 이 클래스 안에서만 사용 가능하다
		/*
		//정석코드
		for(i = 1; i <= 100; i++) {
			System.out.println(i);
		}
		*/
		
		
		//재귀
//		System.out.println(i);
		
//		if (i == 3) return;
		
//		recur(i + 1);
		//빠져나가는 조건이 명확해야한다
}
	
	
	private void recur2(int i) {
		if(i == 0) return;
		recur2(i-1);
		System.out.println(i);
	}
		
	
	
	
	
	public static void main(String[] args) {
		Test06 t = new Test06();
		t.recur(1);
		t.recur2(3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	

}
