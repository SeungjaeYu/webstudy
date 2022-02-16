package ch03_condition.exam;
import java.util.Scanner;
public class Quiz04 {
	public static void main(String[] args) {
		//중간값 출력	
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력하세요 : ");
		int num1 = sc.nextInt();		
		System.out.print("두번째 숫자를 입력하세요 : ");
		int num2 = sc.nextInt();		
		System.out.print("세번째 숫자를 입력하세요 : ");
		int num3 = sc.nextInt();
		
		
		if((num1>num2 && num1<num3)||(num1<num2 && num1>num3) ) {
			System.out.println("중간 값은" + num1 + "입니다");
		}
		else if((num2>num1 && num2<num3)||(num2<num1 && num2>num3)) {
				System.out.println("중간 값은" + num2 + "입니다");
		}
		else System.out.println("중간 값은" + num3 + "입니다");
		
		
		
		
	

		
	}

}
