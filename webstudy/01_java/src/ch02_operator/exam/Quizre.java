package ch02_operator.exam;
import java.util.Random;
import java.util.Scanner;
public class Quizre {
	public static void main(String[] args) {
		/*
		 * score 변수에 랜덤하게 50~100 사이의 값을 대입한다
		 * score 점수에 따라서 수, 우, 미를 화면에 출력
		 * 
		 * score가 90보다 크거나 같다면 수
		 * score가 80보다 크거나 같다면 우
		 * score가 70보다 크거나 같다면 미
		 * score가 60보다 크거나 같다면 양
		 * score가 60보다 작다면        가
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		
		
		Random rc = new Random();
		int score = rc.nextInt(51)+50;
		
		String result = score>=90 ? "수" : score>=80 ? "우" : score>=70 ? "미" : score>=60 ? "양" : "가";
		
		System.out.printf("점수는 %d이고, 점수는 %s 입니다", score, result);
		*/

		
		
		
		
		
		
		
		
		
		
		
		//num변수에 1~100사이의 숫자를 랜덤하게 대입한다
		
				//num 변수의 값이 70이였다면 
				//출력형식>
				//70은 3의 배수가 아닙니다.
		
//		Random r = new Random();
//		int num = r.nextInt(100)+1;
//		
//		System.out.printf("%d는 %s", num, num%3==0 ? "3의 배수입니다" : "3의 배수가 아닙니다");
		
		/*
		//두 수를 입력받아 나누고 몫과 나머지
		Scanner sc = new Scanner(System.in);
		System.out.print("num1을 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.print("num2을 입력하세요 : ");
		int num2 = sc.nextInt();
		
		System.out.printf("%d / %d 의 몫은 %d, 나머지는 %d입니다", num1, num2, num1/num2, num1%num2);
		*/
		
		/*Random r = new Random();
		int i = r.nextInt(100)+1;
		
		System.out.printf("출력된 %d는 3의 배수가%s",i, i%3==0 ? "맞습니다" : "아닙니다");
		*/
		
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("num1을 입력하세요");
		int num1 = sc.nextInt();
		System.out.print("num2를 입력하세요");
		int num2 = sc.nextInt();
		
		System.out.printf("num1 %d num2 %d 의 나눗셈의 몫은 %d 나머지는 %d입니다", num1, num2, num1/num2, num1%num2);
		*/
		
		
		
		
		
		
		/*
		 환율계산 : 1달러당 1088.11원
		 출력시 소수점 아래 2자리만 출력
		 
		 출력형식 >
		 
		 
		 달러를 입력하시오 : 30
		 원화 : 3264.30원
		 */
		
//	 Scanner sc = new Scanner(System.in);
//	 final double WON = 1088.11;
//	 System.out.print("달러를 입력하세요 : ");
//	 int dal = sc.nextInt();
//	 System.out.printf("원화 : %.2f원",dal*WON);
		
		/*
		Scanner sc = new Scanner(System.in);
		final double DallWon = 1088.11; 
		System.out.print("환전할 달러 금액을 입력하세요 :");
		double dall = sc.nextDouble();
		
		System.out.printf("입력한 달러의 금액은 %.2f 환전이 적용된 금액은%.2f 입니다", dall, dall*DallWon);*/
		
		
		
		
		
		
	 
		/*
		 * 아래와 같이 출력하는 프로그램을 작성하시오
		 * 출력 형식>
		 * 
		 * 초를 입력하시오 : 7600 (60초는 1분)
		 * 입력된 7600초는 2시간 06분 40초입니다.
		 */
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("초를 입력하세요 :");
//		final int cho = 60*60; 
//		int time = sc.nextInt();
//	
//	
//		System.out.printf("입력된 %d초는 %d시간 %02d분 %2d초", time,
//				                                        time/cho,
//				                                        (time%cho)/60,
//				                                        (time%cho)%60);
		
		//1~100까지 랜덤 수를 입력받아 짝수면서 5의 배수인지를 출력하라
//		Random r = new Random();
//		int num = r.nextInt(100)+1;
//		
//		System.out.printf("%d는 짝수이면서 5의배수가 %s", num, num%2==0 && num%5==0 ? "맞습니다" : "아닙니다");
		
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
		
/*		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		System.out.println("입력된 나이"+ age);*/
		
	
		
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요");
		int num = sc.nextInt();
		if(num<0) System.out.printf("%d의 절대값은 %d입니다", num, num*-1);
		else System.out.printf("%d의 절대값은 %d입니다",num,num);*/
		
		
		
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("물건 값을 입력하세요(만원) : ");
		int price = sc.nextInt();
		
		if(price<=10) System.out.printf("할인된 금액은 %d입니다", price*0.97);
		else if (price<=30) System.out.printf("할인된 금액은 %d입니다", price*0.95);
		else if(price<=100) System.out.printf("할인된 금액은 %d입니다", price*0.92);
		else System.out.printf("할인된 금액은 %d입니다", price*0.9);
		
		System.out.printf("할인된 금액은 ");
		
		
	}

}
