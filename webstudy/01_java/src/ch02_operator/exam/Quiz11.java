package ch02_operator.exam;
import java.util.Scanner;
public class Quiz11 {
	public static void main(String[] args) {
		/*
		 * 사용자가 입력한 사칙 연산의 종류 값에 따라 아래와 같이 적용
		 * - 1 : +
		 * - 2 : -
		 * - 3 : *
		 * - 4 : /
		 * 
		 * 사칙연산 종류를 입력 : 1
		 * 숫자1 : 10
		 * 숫자2 : 2
		 * 결과 10 + 2 = 12
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("사칙연산 종류를 입력 : ");
	    int vary = sc.nextInt();
	    System.out.print("숫자 입력 : ");
	    int num1 = sc.nextInt();
	    System.out.print("숫자 입력 : ");
	    int num2 = sc.nextInt();
	    int sum = 0;
	    
	    
	    
	    switch(vary){
	    case 1: sum = num1 + num2; break;
	    case 2: sum = num1 - num2; break;
	    case 3: sum = num1 * num2; break;
	    case 4:	sum = num1 / num2; break;
	    default : System.out.print("잘못된 번호입니다"); 
	    
	    }
	    
	    System.out.printf("결과 : %d %d의 사칙연산결과 %d", num1, num2, sum);
	    
//	    int a = 1;
//	    int b = 2;
//	    int c = 3;
//	    int d = 4;
//	    String giho  = vary==1 ? "+" 
// 		             : vary==2 ? "-" : vary==3 ? "*" : "/";
//	    
//	    System.out.print("숫자1 : ");
//	    int num1 = sc.nextInt();
//		System.out.print("숫자2 : ");
//	    int num2 = sc.nextInt();
//
//	
//	   int result =  vary==1 ? num1+num2 :
//	                  vary==2? num1-num2:
//	                  vary==3 ? num1*num2:
//	                  num1/num2 ;
//	    
//	    
//	    System.out.printf("%d %s %d = %d", num1, giho ,num2, result);
	}

}
