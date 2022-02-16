package GameInter;

import java.util.Scanner;

public class GameTest {
	
  
	
	Scanner sc = new Scanner(System.in);
	int you = 0;
	int totalScore = 0;
	
	String menu() {
		System.out.println("게임을 선택하세요");
		System.out.println( "A. 가위바위보");
		System.out.println( "B. 주사위 값 맞추기");
		System.out.println( "C. 종료");
		return sc.nextLine();
	}

	
	void service() {
		while(true) {
			switch(menu()) {
			case "A":
				ScissorsRockPaper srp = new ScissorsRockPaper();
				System.out.println("가위바위보 게임입니다");
				System.out.print("가위바위보 중에 하나를 고르세요");
				System.out.print("(1.가위 2.바위 3. 보)");
				you = Integer.parseInt(sc.nextLine());
				
				switch(srp.startGame(you)) {
				case 1 : System.out.println("이겼습니다");
				          totalScore++;
				          break;
				case 2 : System.out.println("졌습니다");
				         break;
				case 3 : System.out.println("비겼습니다");
				         break;
				}
		
				break;
				
			case "B": 
				
				
			case "C": exit();	
			
			}
		}
	}
	
	
	void exit() {
		int i = 0;
		i = Integer.parseInt("C");
		sc.close();
		System.out.println("종료합니다");
		System.exit(i);
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		new GameTest().service();
		
		
		
		
		
		
		
		
	}

}
