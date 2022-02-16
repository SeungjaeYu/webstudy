/**
 * 목표
 * 
 * switch 문을 이해한다.
 * 
 * 형식
 * 
 * 수식자리 에 올 수 있는 것들
 * - 1.4 버전까지 : byte, short, char(문자타입 한 문자만 담는다), int
 *   byte b = 100;
 *   short s = 100;
 *   int i = 100;
 *   (long l = 100; long은 큰 숫자를 담을 수 있다 switch에 올 수 X)
 *   char c = 'a'; 
 *   
 *   1.5버전에 추가 : enum
 *   *1.7버전에 추가* : String 원래 쓸 수 없었는데 1.7부터 가능해졌다
 *   
 * -switch의 역할 : "같다" 비교만 가능함
 * break;
 * int a = 2
 * if(a == 1){}
 * else if(a == 2){}
 * else 위의 경우가 모두 아닐 때 처리
 * switch(a) {
 * case 1:
 * 
 * case 2:
 * 
 * default:
 * 
 * }  
 * switch(수식){ 
 * case 값1 :  // 수식 == 값1이 동일하다
 *  수식이 값1과 동일할 때 수행할 문장들 나열
 * 
 * case 값2 :  // 수식 == 값2이 동일하다
 *  수식이 값2과 동일할 때 수행할 문장들 나열
 *  
 *  default:
 *   else와 같다. 위의 case가 성립되지않을 때 수행할 문장들.. 생략가능
 * }
 * 
 */
package ch03_condition;

public class Test04 {
	public static void main(String[] args) {
		int a = 1;
		/*switch (a) {
		case 1:
			System.out.println("a는 1입니다");	
		case 2:
			System.out.println("a는 2입니다");
		default:
			System.out.println("a는위에 해당하는 경우 없음"); 
			
			스위치문은 순서대로 다 처리 한다. 하나의 조건만 만족하려면 break를 써야한다 */
		
			switch (a) {
			case 1:
				System.out.println("a는 1입니다");
				break;
			case 2:
				System.out.println("a는 2입니다");
				break;
			default:
				System.out.println("a는위에 해당하는 경우 없음");		
		}
			
			
			
			String food = "짜장면";
			switch (food) {
			case "짜장면" :
				System.out.println("중국 식당 메뉴이다");
				break;
				
			default:
				System.out.println("중식 아님..");
			
			}
		/*
			if(food == "짜장면") {
				System.out.println("중식");
			}
		
		
			String food2 = new String("짜장면");
			if(food2 == "짜장면") {
				System.out.println("f2는 중식");
			}
		
			if(food2.equals("짜장면")) {
				System.out.println("f2는 중식");
			}
			
			문자열을 if로 비교하려면 식은 
			if(변수 == "문자열") X
			if(변수.equals("문자열"))
			
		*/
		
		
		
		
	}

}
