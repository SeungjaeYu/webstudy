/**
 * 목표
 * 
 * 변수의 개념 이해
 * 
 * 데이터형 중에서 int와 String 데이터에 대한 이해
 * 
 *  변수란? 
 * -값을 저장할 수 있는 메모리의 공간
 * -변수는 오직 하나의 값만을 담을 수 있다
 * -프로그램에서 변수를 사용하려면??
 *   : 변수에 대해 선언, 값을 대입or 초기화
 *   : 타입 이름;    이름 = 값;-> 대입연산자
 * -값을 변수에 대입할 때는 "="을 사용한다.
 * - 변수의 선언과 값의 대입을 한 번에 할 수있디
 * - 타입 이름 = 값;     타입 = 공간의 크기 int , string ... 
 * 
 * 
 *  참고
 *  int = 정수 숫자
 *  String = 문자가 여러개 모인 문자열을 담는 데이터 타입.  " 더블쿼티션이 있어야 문자열로 인식  ex)String("hi"); 
 */
package ch01_basic;

public class Test05 {
	public static void main(String [] args) { //args 도 지역변수 메서드 안에 들어가 있기때문에/ 메서드의 파라미터
		
//		System.out.println(x);
		//오류 i cannot be resolved to a variable : 선언이 안돼있다
//		System.out.println(i);  //변수 선언 없이 사용할 때 에러발생
		
//		int i;                 
//		System.out.println(i); //the local variable i may not have been initialized i 값을 대입해줘야한다
		                       //local variable(지역변수) : 변수 선언이 메소드 안에 있는 것
		                       //에러 : 지역변수 선언 후 사용 전에 값을 대입(초기화 해야 한다)
		 
		int i; //i라는 변수 공간을 만들고 정수를 담는다고(int)  선언
		i = 10; //i란 이름의 변수 공간에 10을 담는다
		System.out.println(i); //화면에 i 란 이름의 변수 공간에 담긴 값을 출력한다
		
		
		//변수 k를 만들고 k의 공간에 홍길동을대입한다.
		//화면에 k 변수에 대입된 값을 출력한다
//		String k;
//		k = "홍길동"; 와 String k = "홍길동"; 같다
		String k = "홍길동";
		System.out.println(k);
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
