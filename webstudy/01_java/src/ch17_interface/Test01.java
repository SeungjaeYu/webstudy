/**
 * 목표
 * 
 * 인터페이스 이해하기
 * -완벽한 추상화된 클래스
 * 
 * -인터페이스의 장점
 *  : 다중상속이 가능하다 / 추상클래스와 차이점
 * 
 * -keyword 
 * -class 대신에 interface를 선언하면 인터페이스로 인식
 *  클래스가 인터페이스를 상속받을 때에는 extends(X) , implements(O) 사용
 *  클래스 ----> 클래스 : extends (확장)
 *  클래스 ----> 인터페이스 : implements(구현)
 *  인터페이스---->인터페이스 : extends (확장)
 *  인터페이스-----> 클래스 : X  
 * 
 */

package ch17_interface;



interface Inter01{
	
}

interface Inter02 {}
interface Inter03 extends Inter01 {}
interface Inter04 extends Inter01, Inter02{}

class Parent01 {}
class Parent02 {}
                                                //클래스는 단일상속만 가능
class Inter01Child implements Inter01 , Inter02 /*Parent01, Parent02*/{
	
}







public class Test01 {
	public static void main(String[] args) {
		
	}

}
