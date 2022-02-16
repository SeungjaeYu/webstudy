/**
 * 목표
 * 
 * 생성자의 역할
 * - 초기에 객체에 필요한 메모리를 만든다.
 * - 초기화 작업 진행(멤버변수의 값 설정..) 가장 큰 역할
 * 
 */
package ch12_constructor;

public class Test03 {
	public static void main(String[] args) {
		Member03 m1 = new Member03();
		m1.setName("정윤오");
		m1.setAge(23);
		
		System.out.println(m1.getName() + ":" + m1.getAge());
		
		
		//내가 설정한 값대로 객체를 생성하고 싶다...
		//new Member03(매개변수)
		
		
		//매개변수 필요한 값을 받을 수 있다
		//안에 값을 바로 넣어준다
//		Member03 m2 = new Member03();
		Member03 m2 = new Member03("김연수", 33);
		//그냥 뽑으면 null 0 값  불러온 곳에 이름을 받게 저장시켜줘야한다
		System.out.println(m2.getName() + ":" + m2.getAge());
		
		int i = 100;
		
	}

}
