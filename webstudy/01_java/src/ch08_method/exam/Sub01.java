package ch08_method.exam;

public class Sub01 {
 //정의
	/**
	 * 매개변수로 정수형을 받는다
	 * 1부터 ~정수까지 화면에 출력하는 기능 구형 
	 * 
	 */
	
	
	void add(int num) {
		for(int i = 1; i <= num ; i++) {
			System.out.println(num); 
		}
	}
	
	
	
	/**
	 * method02
	 * 
	 * 매개 변수 : 정수, 논리형
	 * 	
	 * 1부터 ~정수까지 화면에 출력하는 기능 구형
	 * 논리형의 값 true일때는 짝수만 출력 false 일때는 홀수만 출력
	 */
	
	void method02(int num2, boolean isEven) {
		int val = isEven ? 0 : 1;
		for(int i = 1; i <= num2; i++ ) {
			if(i % 2 != val ) continue;
			System.out.println(i);
			}
				
		}
		
	/**
	 * 초를 받아서 시분초로 변환된 결과를 출력하는 기능
	 * method04
	 * 출력 >
	 * 입력된 4000초는 1시간 06분 40초 입니다.
	 * 
	 * 
	 */
	
	
	void method04(int i) {
		final int HOUR_SEC = 60 * 60;
		System.out.printf(
				
				"입력된 %d초는 %d시간 %02d분 %02d초입니다. \n"
				, HOUR_SEC, (i % HOUR_SEC) / 60, i % 60 
				);
	}
	
	
	/**
	 * 정수를 받아서 절대값을 반환하는 기능
	 * 
	 */
	
	int method05(int jul) {
		return (jul >= 0) ? jul : -jul;
		
	}
	/**
	 * Info 타입을 받아서
	 * num1, num2, num3의 변수의 값을 합하고
	 * 결과를 반환
	 * 
	 */
	
//	int method06(Info info) {
//		return (info.num1 + info.num2 + info.num3);
//	}
	
	
	int method06(String s, int num1, int num2 ) {
        
		if(s == "+") return num1 + num2;
		else if(s == "-") return num1 - num2;
		else if(s == "*") return num1 * num2;
		else return num1 / num2;	
	}
	//switch 로 변경해주는게 식이 더 짧다 
	/*
	 * switch(s){ 
	 * case "+" : return num1 + num2;
	 * 
	 * default : return 0;
	 * }
	 */
	

}


