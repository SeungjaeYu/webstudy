package ch04_repetition;
import java.util.Scanner;
public class Test06 {
	public static void main(String[] args) {
		//-1 값을 주면 빠져나오게 해보자
		
		
		Scanner sc = new Scanner(System.in);
		
		/*boolean flag = true;
		
		while(flag) { //일단 무조건 돌게한다.
		//여기서부터 반복할꺼얌
		System.out.print("수를 입력 : ");
		int num = sc.nextInt(); //num의 값에 따라 멈출거다.
		if(num == -1) {
			//반복문을 벗어나고 싶다
			//1. true의 조건이 바꿈 true를 변수에 담는다
			flag = false;
 		}
		System.out.println("입력된 수 : " + num);
		// -1일때 입력된 수가 나오지 않게하기위해
		
		}*/
		
       boolean flag = true;
		while(true) { 
		//여기서부터 반복할꺼얌
		System.out.print("수를 입력 : ");
		int num = sc.nextInt();
		if(num == -1) {	
		    flag = false;
			break; //while이 있어서 사용가능. if는 안돼 while을 벗어난다
 		}
		System.out.println("입력된 수 : " + num);
		
		
		}
		 // break; 여기로 나온다
		System.out.print("종료합니다");
		
		
	}

}
