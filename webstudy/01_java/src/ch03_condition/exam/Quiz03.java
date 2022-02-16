package ch03_condition.exam;
import java.util.Scanner;
public class Quiz03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력하세요 : ");
		int num1 = sc.nextInt();		
		System.out.print("두번째 숫자를 입력하세요 : ");
		int num2 = sc.nextInt();		
		System.out.print("세번째 숫자를 입력하세요 : ");
		int num3 = sc.nextInt();
		
//		if(num1>num2) {
//			System.out.printf("최대값은 %d입니다.", num1);
//		}
//		else if(num2>num3) {
//			System.out.printf("최대값은 %d입니다", num2);
//		}
//		else {
//			System.out.printf("최대값은 %d입니다", num3);
//		}
//		if(num1<num2) {
//			System.out.printf("최소값은 %d입니다.", num1);
//		}
//		else if(num2<num3) {
//			System.out.printf("최소값은 %d입니다", num2);
//		}
//		else {
//			System.out.printf("최소값은 %d입니다", num3);
//		}
//		
	int max = num1, min = num1;
	//if문으로 max와 min 구분해보아라
	if(max < num2) max = num2;
	if(min > num2) min = num2;
		
	if(max < num3) max = num3;
	if(min > num3) min = num3;
	}

}
