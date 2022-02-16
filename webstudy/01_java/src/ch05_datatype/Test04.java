/**
 * 목표
 * 
 * 산술연산자, 배정연산자의 특이점
 * 
 */
package ch05_datatype;

public class Test04 {
	public static void main(String[] args) {
/*
		산술 연산의 주의점 : 
			int, short, byte, char int보다 같거나 작은 타입 
			산술연산의 결과는 int로 된다. byte + byte = int / char + char = int
			
		
*/	
		System.out.println('a' + 1); //char + int : 98
		System.out.println('A' + 'B'); //char + char  65 + 66 : 131
		
		
		System.out.println('A' + 10); //75
		System.out.println('A' + (char)10); //75
		System.out.println((char)('A' + 10)); //'K'
		System.out.println((char)75); //'K'
		
		/*
		int + float , int + long, int + double
		   float         long         double 
		    => 값의 손실을 막기위해
		*/
		System.out.println(5 / 2); // 2 int / int
		System.out.println(5 / 2.0); // 2.5 int / double
		System.out.println((double)5 / 2); // 2.0  int / int => double로
		System.out.println(5 / 2d); // 2.5 int / d를 붙여 double
		
		//배정연산자
		int totPrice = 50000;
		if (totPrice > 30000) {
//			totPrice = totPrice * 0.9;	//totPrice은 int 타입 0.9 double. int = int * double
			totPrice = (int)(totPrice * 0.9);
			totPrice *= 0.9; //형변환 자동. 배정연산자
			
		}
		System.out.println(totPrice);

		
		
		
		
		
		
		
	}

}
