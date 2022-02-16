package ch21_date.exam;

import java.util.Calendar;
import java.util.Scanner;

public class Quiz02 {
	
	Scanner sc = new Scanner(System.in);
	int menu() {
		System.out.println("항목을 선택하세요(1. 특정년도 날짜 보기 2. 특정월 날짜 보기 3. 종료)");
		
		return Integer.parseInt(sc.nextLine());
		
	}
	
	void service() {
		while (true) {
			switch (menu()) {
			case 1:
				System.out.print("년도를 입력하세요 : ");
				int i = Integer.parseInt(sc.nextLine());

				Calendar c = Calendar.getInstance();
				
				//입력받은 년도로 변경
				c.set(Calendar.YEAR, i);
				int eDay = c.getActualMaximum(Calendar.DAY_OF_MONTH);
				int getYear = c.get(Calendar.YEAR);
				//1월 값으로 변경
				c.set(Calendar.MONTH, 1);
			
				int day = c.get(Calendar.DAY_OF_WEEK);
				int getMonth = c.get(Calendar.MONTH);
				int cnt = 0;

				for (int j = 1; j <= 12; j++) {
					System.out.print(getYear + "년  " + j + "월 \n");
					System.out.println("--------------");
					System.out.println("일 월 화 수 목 금 토");
					System.out.println("--------------");
					
                    //공백찍기
					for (int k = 1; k < day; k++) {
						System.out.print(" ");
						cnt++;
					}
					for(int k = 1; k < eDay; k++) {
						if(cnt % 7 == 0) {
							System.out.println();
						}
						cnt++;
						System.out.printf("%5d", k);

					}
				 System.out.println();
				}
				
				
				
				
				
				
				break;
			case 2:
				break;
			case 3:
				System.exit(3);

			}

		}

	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		
		new Quiz02().service();
		
		
		
		
		
	}

}
