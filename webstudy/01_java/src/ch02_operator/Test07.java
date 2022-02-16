/**
 * 목표
 * 
 * 조건 연산자(삼항 연산자)에 대해서 이해하자
 * 
 *   <형태>
 * (조건) ? 값1 : 값2; 
 * 조건자리 : 반드시 참이나 거짓이 판단되는 식이 와야한다.
 *         if 3+5>10 거짓. 
 * 값1의 자리 : 조건이 참일 경우 선택
 * 값2의 자리 : 조건이 거짓일 경우 선택
 * 
 * 증감 연산자를 제외한 연산자는 사용할 때는 반드시 연산의 결과를 사용해야 한다.
 * 
 */
package ch02_operator;

public class Test07 {
	public static void main(String[] args) {
		int a = 15;
		int b = 10;
		
		               //? 참이면 5출력 : 거짓이면 10 출력
		int max= (a > b) ? a : b;
//		System.out.println("max : " + max); 
		System.out.println("max : " + ((a > b) ? a : b)); //max를 한 번만 사용하기 때문에 그냥 조건식을 바로 입력해도 된다
		
		
		//화면에 결과를 출력하도록 코드 완성
		//변수에 담아서 처리
		String result = (a > b) ? "a가 크다" : "b가 크다";
		System.out.println(result);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
