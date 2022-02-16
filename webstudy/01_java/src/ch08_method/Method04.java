package ch08_method;

public class Method04 {
	
	/*
	void print() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}
	
	
	 번호 넣기 귀찮
	void print(int max) {
		for (int i = 1; i <= max; i++) {
			System.out.println(i);
		}
	}
	
	//오버로딩 : 이름은 같은데 매개변수가 다른 것
	void print() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}
	
	void print(int max) {
		for (int i = 1; i <= max; i++) {
			System.out.println(i);
		}
	}
	//시작 숫자가 지정한 숫자부터
	void print(int start, int end) {
		for (int i = start; i <= end; i++) {
			System.out.println(i);
		}
	}
	 */
	
	
	
	//리팩토링 : 중첩되어 있는 것을 처리해보자
	//히든변수 this.print(num); this. 는 생략될 수 있다 같은 클래스일 때 사용
	//this가 생기지 않는 메서드 : static 영역. 
	//static에서는 this사용이 불가능하다
	
//	void print(/*Method04 this*/) {
//		this.print(10);
//		   print(10);
//	}
//	
//	void print(/*Method04 this,*/int max) {
//		for (int i = 1; i <= max; i++) {
//			System.out.println(i);
//		}
//	}
	

	
	
	
	void print(int end) {
//		for (int i = 1; i <= max; i++) {
//			System.out.println(i);
			print(1,end);
		}
	
	//시작 숫자가 지정한 숫자부터
	void print(int start, int end) {
		for (int i = start; i <= end; i++) {
			System.out.println(i);
		}
	}
	 
	
	
	
	
	
	
	
	
	
	

}
