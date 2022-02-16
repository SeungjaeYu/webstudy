/**
 * jdk8부터 가능
 * 
 * 인터페이스에 메서드가 하나만 있는 경우. 
 * lamda를 쓰면 코드가 심플해진다
 * 
 * 
 * 
 */
package ch20_lamda;

interface Sub01{
	void call(String msg);
}

class Child01 implements Sub01{
	public void call(String msg) {
		System.out.println("집가고싶다" + msg);
	}
}



public class Test01 {
	public static void main(String[] args) {
		//클래스 정의
		Sub01 sub01 = new Child01();
		
		sub01.call("ㅜ-ㅜ");
		//익명
		Sub01 sub02 = new Sub01() {
			public void call(String msg) {
				System.out.println("익명 일진짱" + msg);
			}
		};
		sub02.call("ㅡ_ㅡ^--^");
		
		//람다.. 메서드가 하나여야한다.
		//매개변수가 하나만 있을 때는 소괄호를 생략가능
		Sub01 sub03 = msg -> {System.out.println("람다리람다람쥐" + msg);};
		sub03.call("ㅇ'ㅅ'ㅇ");
		//실행문장이 하나일때 중괄호 생략 가능
		MySub01 ms01 = (i, j) -> {System.out.println("람다 수"+ i +" "+ j);};
		ms01.test(10, 30);
		
	}

}



interface MySub01{
	public void test(int i, int j);
}










