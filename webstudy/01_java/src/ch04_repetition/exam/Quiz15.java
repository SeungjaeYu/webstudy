/**

화면에서 행의 수와 열의 수를 입력 받아 아래와 같은 형식으로 출력되는 프로그램을 작성하시오

주의 사항 : 
출력 행이 홀수일 경우 문자( "<" )를 먼저 출력, 짝수일 경우 문자( ">" )를 먼저 출력


출력형식 > 

출력할 행의 수를 입력하세요(1-10) : 4
출력할 열의 수를 입력하세요(1-10) : 3
>>>
<<<
>>>
<<<


출력형식 > 

출력할 행의 수를 입력하세요(1-10) : 3
출력할 열의 수를 입력하세요(1-10) : 3
<<<
>>>
<<<

 */
package ch04_repetition.exam;
import java.util.Scanner;
public class Quiz15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("출력할 행의 수를 입력하세요(1-10) : ");
		int num1 = sc.nextInt();
		
		System.out.print("출력할 열의 수를 입력하세요(1-10) : ");
		int num2 = sc.nextInt();
		
//		String hol = "<";
//		String jjak = ">";
	
		for(int i = 1; i <= num1; i++)
		{ 
			for(int j = 0; j < num2; j++)
			{
				if (num1 % 2 == 0) System.out.print(">");
			    System.out.print("<");
					
				}
			System.out.println();
		}
//		for(int j = 1; j < num2; j++)
//		//System.out.print(j);
//			
//		{ if(j % 2 == 0) {
//			System.out.printf("%s", jjak);
//		}
//		else
//			System.out.printf("%s",hol);
//		}
		
			

		
		
		
		
		
		
	}
}

