/**
 * 목표
 * 
 * 논리 연산자(&&, ||) 앤드와 오어를 이해하자
 * 앞 뒤에 true false 값이 있어야 한다
 *   조건식 && 조건식     조건식 || 조건식 -> 참 , 거짓이 반환
 * 
 */
package ch02_operator;

public class Test12 {
	public static void main(String[] args) {
		/* 앞이 False면 실행X
		True  &&  True  => True
		True  &&  False => False
		False &&  True  => False
		False &&  False => False		
		*/
		
		int a = 20;
		int b = 10;
		boolean result = (a > b) && (a%2==0); //true false 
		                        //& 하나는 무조건 실행한다
		System.out.println(result);
		
		
		/* || 앞이 true면 무조건 실행
		        True  ||  True  => True
				True  ||  False => True
				False ||  True  => True
				False ||  False => False		
		*/
		
		
		
		
		
	}

}
