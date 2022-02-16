/**
 * 메서드를 호출하는 클래스
 * 
 * -반환타입 void로 설정되어있다면 호출 후 값을 받을 수 없다
 * -반환타입이 void인데 값을 받으려 한다면 ?? - 에러
 * 
 * -반환타입이 void가 아니라면 무조건 받아야 한다??    X
 *                    선택적으로 받을 수 있다??  O
 * 
 * 
 */
package ch08_method;

import java.util.Random;


public class Test02 {
	public static void main(String[] args) {
		
		//클래스 객체 생성
		Method02 m = new Method02();
		
		//methoc01 호출
		m.method01(); //값을 주지 않는다
//		int val = m.method01(); //에러
		
		
		//method02호출
		m.method02();
		
		
		//method03호출 인트타입
		
		m.method03(); // int가 반환되지만 꼭 값을 받지 않아도 된다
		
		int i = m.method03();// 값을 주고 싶을 때 
		System.out.print("method03 반환값" + i); //100이 찍힌다
		
		//method04호출
		String j = m.method04();
		System.out.println("method04반환값" + j);
		
		/*
		 * sysout("method04 반환값 : " + m.method04( m.method03 ) 에러
		 * 클래스에서 method04() 빈칸으로 값을 안준다고 했는데 int 타입의 값을 줘서
		 * 받고 싶다면 오버로딩해라 (2)
		 */
		
		
		//method05번 호출
		Random r = m.method05();
		
		
		//호출
		HaHa ha = m.method06(new KiKi());
		
		
		
		
	}

}
