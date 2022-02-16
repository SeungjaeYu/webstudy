/**
 * 목표
 * 
 * static
 * 
 * -static이 변수에 사용 : 클래스 변수
 * -static이 메서드에 사용 : 클래스 메서드
 * -static이 붙지 않은 변수 : 인스턴스 변수
 * -static이 붙지 않은 메서드 : 인스턴스 메서드
 * 
 * 클래스 변수 또는 메서드는
 * 클래스이름.변수명 or 클래스이름.메서드명 으로 접근이 가능함(권장) 
 * -> 메모리의 구조때문에
 *
 * Method Area - 공유의 영역
 *
 * 클래스 로딩  
 * 
 * 클래스 > 객체 순..
 * 
 */



package ch13_static;

public class Test01 {
	public static void main(String[] args) {
		System.out.println(Ticket.totalCount);
		
		Ticket t1 = new Ticket();
		System.out.println(t1.totalCount); // 뺑뺑이 돌린다. 
		
		
		
		
		
		
		
	}

}
