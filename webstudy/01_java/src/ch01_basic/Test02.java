//문서화 주석문 *가 두개붙는다 : 파일에 대한 설명,클래스 자체에 대한 설명, 메서드에 대한 설명, 변수에 대한 설명
//단일행, 다중행 주석문 : 메서드내에 작성한 코드에 대한 설
/**
 * 목표
 * 
 * 주석문의 종류 및 사용법 이해
 * 
 * 주석문은 자바코드에 아무리 많이 있어도 jvm이 해석하지 않는다. .class에 변환되지 않는다
 * 
 * 자바의 주석문 세 가지의 종류
 * 1. // : 단일행 주석문. 이후의 문장이 주석처리 됨
 * 2. :안의 문장이 주석처리됨 
 * 3. ctrl+shift+c 문장 다 선택하고 주석
 * 
 * 쓰는 이유 : 개발자들간의 이해를 돕기위해서 사용함
 * 
 */
package ch01_basic;
/**
 * 
 * @author bitsc-04-05
 * class를 설명하고 싶을 때는 별 두개 붙인 문서화 주석을 써야한다
 */

public class Test02 {
	public static void main(String [] args) {
		System.out.println(11/*"주석문"*/);
	// ctrl+shift+c 문장 다 선택하고 주석 
//		System.out.println("주석문");
//		System.out.println("주석문");
//		System.out.println("주석문");
//		System.out.println("주석문");
//		System.out.println("주석문");
		
		
		
		/*
		* 여러행 주석문, 다중행 주석문, 범위 주석문. 특정 범위 주석처리
		System.out.println("주석문");
		System.out.println("주석문");
		System.out.println("주석문");
		System.out.println("주석문");
		System.out.println("주석문");
		*/ 
	}
}
