/**
 * 목표
 * 
 * 배정 연산자(+=, -=, *=...)의 이해
 * 
 * 주의점 : 우선 순위가 가장 낮다 
 *
 */
package ch02_operator;

public class Test13 {
	public static void main(String[] args) {
		int a = 5;
		a*=3;//a = a * 3; 연산한 결과를 다시 자기한테 넣을 때 사용
		System.out.println(a); //15
//		a = a + 1;
//		a+ = 1;
//		a++//
		
		int b = 5;
		b*=2 + 3;  //b = b*(2+3) 
		System.out.println(b);
		
	}

}
