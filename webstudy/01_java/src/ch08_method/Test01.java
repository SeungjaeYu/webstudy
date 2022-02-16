package ch08_method;

import java.util.Random;
import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
	
		/* 기존에 만들어진 메서드 호출
		String msg = "hello";
		msg.length(); //호출 랭스라는 메서드를 호출
		msg.charAt(0);//만들어진 메서드에는 숫자값을 준다
		msg.substring(10, 20); 10번째부터 20번째까지 잘라줘라
		msg.indexOf('d'); 'd' d가 몇번째 자리에 있는지 찾아준다
		*/
		
		
		
		
		//클래스를 따로 분리해서 메소드를 만들 것이다.
		//Text01 - Method01
		
		//순수하게 문법 중심으로 호출과 생성을 이해하겠다
		
		/**
		 * 목표 선언된 메서드를 호출
		 * 
		 * 메서드를 호출하기 위해서 선언이 되어있어야한다
		 * 
		 * 메서드를 만들 때 , 단독적으로 사용할 수 없음으로 . 클래스 안에 있어야한다는 것을 잊지X
		 * 
		 * 메서드 선언 형식(1) Method01 [] // 문법에서 생략할 수 있다는 뜻
		 * 
		 * [접근제한자] [활용제한자] 반환타입 메서드의 이름 ( [매개변수-파라미터, 여러 개 올 수 있다] ){ 실행문장들... [return
		 * 반환값;] //위의 반환타입과 []안의 반환값은 서로 연결되어있다 -타입에 해당하는 값 설정.
		 * 
		 * [return 반환값;] //위의 반환타입과 []안의 반환값은 서로 연결되어있다 -타입에 해당하는 값 설정. }
		 * 
		 * [접근제한자] [활용제한자] 서로 위치가 바뀔 수 있다
		 * 
		 * 부르지 않으면 실행 X 메인메서드는 JVM이 자동으로 실행
		 * 
		 * 
		 * 호출하는 단계
		 * 1. 메서드를 갖고있는 클래스 정보를 알려준다. 객체(인스턴스)생성
		 * 2. 객체 변수명.메서드명([매개변수에 들어갈 값, .., ..]); int i 면 정수값을 줘야 한다
		 * 
		 * 
		 * 
		 */
		
		System.out.println("main start");
		
		//객체를 사용하기 위해 인스턴스 생성
		Method01 m = new Method01(); 
		/*
		 * ------|----------
		 *       | 
		 *   m   |  Method01
		 *       | 
		 *       | 
		 */
		//method01 메서드 호출
		m.method01();
		
		//method02 메서드 호출
		m.method02(100); //(int i 에 들어갈 값을 준다)
		//int i = 100 을 줬다는 선언
		
		//정수 두 개 값을 주는 메서드
		m.method03(100, 200);
		
		//문자열 주는 메서드
		m.method04("Hello world");
		
		
		String s = "hello";
	

		
		//랜덤 호출하는 메서드
//		Random r = new Random();
//		m.method05(r);
		//한 번만 사용할 땐 이렇게
		m.method05(new Random());
		
		//스캐너 호출
		Scanner sc = new Scanner(System.in);
		m.method06(sc);
		
		
		//배열호출
		int[] arr = new int[3];
		m.method07(new int[3]);
//		m.method07({1, 2, 3}) 에러. 변수선언이 되어야 쓸 수있다. 위에 선언을 해줘야한다
//		m.method07(new int[]{1, 2, 3}) 쓰려면 이렇게 써야한다. 한 번만 사용할 때 사용
		
		
		//08번 호출하기
		MyClass mc = new MyClass();
		m.method08(mc);
		
	
		
		//위의 메서드를 클래스 내용을 호출 하고 난 뒤에 마지막에 나온다
		System.out.println("main end");
		
		
		
		
		
		
		
	}

}
