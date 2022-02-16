/**
 * 메서드 선언  - 반환타입 연습
 * 
 * void
 * -메서드는 실행한 다음 호출한 쪽으로 값을 넘기지 않는다
 *  클래스를 만들었을 때 마지막 처리 값은 호출하는 쪽 넘어간다. 이때 void가 있어서 다시 값을 넘겨주지 않는거다
 * 
 * -return이 사용 될 수도 있고 안될수도 있다
 *  만약 return문을 사용하면 뒤에 아무것도 명시하지 않아야 한다
 *  예> return 1;(에러)   return ;(O)
 *  
 *      
 * return
 * - return에 설정한 값을 호출한 쪽으로 넘겨준다.
 * - 실행 중인 메서드를 즉시 종료.
 * 
 * void - return 메서드 실행하다 조건에 맞을 때 그 즉시 빠져나가고 싶을 때. 강제
 * 
 * 반환타입이 void가 아니라면 
 * : 반드시 메서드 종료 전에 반드시 return이 나와야한다
 * return 뒤에 반환 타입에 해당하는 값이 설정되어야 한다.
 * 
 *      
 */
package ch08_method;

import java.util.Random;



public class Method02 {
	/*
	 * void 문이라서  return문이 없어도 상관x
	*/
	void method01() {
		System.out.println("method01 ->" );
	}
	
	/*
	 * void일 경우 return; 의 사용이 가능하다
	 */
	
	void method02() {
		System.out.println("methid02");
		return;
//		return 100; 에러! void일 경우 값 설정이 불가능
	}
	
	
	/**
	 * 반환타입이 void가 아닐 경우 반드시 return이 있어야한다
	 * 설정된 반환타입에 묵시적 형변환이 되는 값은 가능하다
	 * @return
	 */
	
	int method03() {
		System.out.println("method03");
//		return 100;
//		return 'd'; 아스키코드값으로 형변환되어서 묵시적형변환
//		return 1.1; 묵시적형변환이 안되어서 에러
		return 4885;
	}
	
	
	//(2)오버로딩 : 메서드의 이름은 같은데 매개변수가 다른 것
	//String타입
	String method04() {
		System.out.println("method04");
		return "gogo";
	}
	
	String method04(int i) {
		System.out.println("method04");
		return "gogo";
	}

	
	
	//Random 
	Random method05() {
		
		System.out.println("method05");
		return new Random();
	}
	
	
	//선언
	//클래스           (클래스 변수이름)
	HaHa method06(KiKi kk) {
	
		//변수.메서드() kk라는 KiKi안에 있어야한다 
		//반환타입 void int 다 된다. 메서드의 호출 결과를 d안받아서 void kikiki(){}
		kk.kikiki(); 
		return new HaHa();
	}
	
} //method 클래스의 끝
	
	class HaHa {

	} //HaHa의 클래스의 끝
	
	class KiKi {
	    void kikiki() {

			}

		} //KiKi의 클래스의 끝


	
	
	
	
	
	
	
	
	
	

