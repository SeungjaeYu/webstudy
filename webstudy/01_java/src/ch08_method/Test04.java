package ch08_method;

public class Test04 {
	public static void main(String[] args) {
		/**
		 * 기능의 중첩
		 * 
		 * 모듈화 : 같은 작업이 여러개 있다면 하나로 빼는 작업
		 *      -장점 : 코드가 반복되는 것을 재사용할 수 있게 해준다
		 * 유의사항 : 바뀌는 값에 대한 처리를 위해 매개변수를 생각해야한다 
		 * 
		 * 다향성 : 이름이  같은데 하는 동작이 다른 것
		 *       메서드 오버로딩, 메서드 오버라이딩, 변수의 다향성
		 *       
		 * 리팩토링 : 중첩되어 있는 것을 처리해보자      
		 * 
		 * 히든변수 this.
		 * !같은 클래스일 때 사용!
		 * this.className(num); this. 는 생략될 수 있다
		 * 
		 * static에서 (대표적 : main)는 this사용이 불가능하다
		 * 
		 */
		
		/*
		//1~10까지
		for(int i=1 ; i <= 10 ; i++) {
			System.out.println(i);
		}
		
		
		System.out.println("중간코드...");
		for(int i=1 ; i <= 10 ; i++) {
			System.out.println(i);
		}  - Method04로
		*/
		
		Method04 m = new Method04();
		/*
		m.print();
		System.out.println("중간코드..");
		m.print();
		*/
		
		//사용자가 원하는 형태로 매체변수를 넣어준다
//		m.print();
//		m.print(17);
//		//시작 숫자중간숫자부터
//		m.print(15, 17);
		
		
		
		
		
		
		
	}

}
