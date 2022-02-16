package ch03_condition.exam;
import java.util.Scanner;
public class Quiz01 {
	public static void main(String[] args) {
		/* 
		 * 숫자를 입력하세요 : -7
		 * -7의 절대 값 : 7
		 * 
		 * 숫자를 입력하세요 : 8
		 * 8의 절대값 : 8
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.printf("%d의 절대값 %d", num, num);
		}else 
			System.out.printf("%d의 절대값 %d", num, num*-1);
		
		
		
		
		
		
		
		
		
		
//		if(num>0) {
//			System.out.println("절대값은 : " + num);
//		}else
//			System.out.println("절대값은 : " + (num*=-1));
				
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
