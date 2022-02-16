package ch12_constructor;

public class Member01 {
	//생성자 : 객체 생성시 호출 가능, 생성 후에는 호출이 불가능. 일반메서드가되면 호출이 X
       Member01(String name) {
		System.out.println("생성자인가욥(1)?");
		
	}
     
       //일반메서드 : 객체 생성 후 호출이 가능. 반환타입을 반드시 줘야한다.
	void Member01(String name) {
		System.out.println("생성자인가욥(2)?");
		
	}
	
	
	
}
