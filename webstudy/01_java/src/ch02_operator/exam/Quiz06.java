package ch02_operator.exam;
import java.util.Scanner;
public class Quiz06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("수를 입력하세요 : ");
		int num1 = sc.nextInt();

		System.out.print("수를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		System.out.printf("몫 : %d%n나머지 : %d%n", num1/num2, num1%num2);
		
		
	}

}

