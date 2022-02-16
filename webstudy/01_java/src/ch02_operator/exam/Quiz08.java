package ch02_operator.exam;
import java.util.Scanner;
public class Quiz08 {
	public static void main(String[] args){
		/*
		 * 아래와 같이 출력하는 프로그램을 작성하시오
		 * 출력 형식>
		 * 
		 * 초를 입력하시오 : 7600 (60초는 1분)
		 * 입력된 7600초는 2시간 06분 40초입니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("초를 입력하세요 :");
		int sec = sc.nextInt();
		
		
		int time = sec / 3600;
		int min = (sec % 3600) / 60;
		int sec2 = (sec % 60);
		
		System.out.printf("입력된 %d초는 %d시간 %02d분 %02d초입니다.", sec, time, min, sec2);
		
	}

}
