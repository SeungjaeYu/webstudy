/**
시간을 아래와 같이 출력하는 프로그램을 작성하시오

출력형식 > 
-------------------
0 시
-------------------
00:00
00:01
00:02
00:03
...
00:59
-------------------
1 시
-------------------
01:00
01:01
...
...
-------------------
11 시
-------------------
11:54
11:55
11:56
11:57
11:58
11:59
 */
package ch04_repetition.exam;
import java.util.Scanner;
public class Quiz07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//System.out.print("시간을 입력하세요");
		//int time = sc.nextInt();
		
		for(int i =1; i<15; i++)
			System.out.print("--");
		
		for(int time = 0; time <= 11; time++) {
		System.out.printf("%n%d시%n",time);
		
		for(int i =1; i<15; i++)
			System.out.print("--");
		System.out.println();
		
		
			for(int min = 0; min <= 59; min++)
				
		   System.out.printf("%02d:%02d%n",time, min);
			for(int i =1; i<15; i++)
				System.out.print("--");
		}
		
		
		
		
		
		
		
		
	}

}
