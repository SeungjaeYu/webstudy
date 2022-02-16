package ch03_condition.exam;
import java.util.Scanner;
public class Quiz02 {
	public static void main(String[] args) {
		/*
		 * 마트에서 할인 행사를 진행합니다. 물건값에 때라서 각각의 할인율이 적용됩니다
		 * 
		 * 물건값    10만원 이하    30만원 이하  100만원 이하   100만원 초과
		 * 할인율     3%         5%        8%        10%
		 * 
		 * 화면에서 물건 값을 입력받아서 할인된 금액을 계산하여 출력하는 프로그램을 작성하시오
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("물건 값을 입력하세요(만원) : ");
		int price = sc.nextInt();
		
		if(price<=10) {
			//System.out.println("할인된 금액은 " + (price*0.97)*10000 + "원입니다");
			System.out.printf("할인된 금액은 %-4.0f원입니다", (price*0.97)*10000);
			
		}else if(price<=30) {
		System.out.println("할인된 금액은 " + (price*0.95)*10000 + "원입니다");
		}
          else if(price<=100) {
		System.out.println("할인된 금액은 " + (price*0.92)*10000 + "원입니다");
	} else {
		System.out.println("할인된 금액은" + (price*0.9)*10000 + "원입니다");
	}
		
		
		
	}

}
