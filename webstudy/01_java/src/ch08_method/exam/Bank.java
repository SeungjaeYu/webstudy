package ch08_method.exam;

public class Bank {
	/**
	 * 기능목록
	 * 1. 계좌생성
	 * 2. 잔액조회
	 * 3. 입금
	 * 4. 출금( 잔액조회랑 연결 )
	 */
	
	
	//가입축하금 만원을 줘야한다
	//잔액조회에도 공통으로 볼 수 있어야해서 클래스 바로 밑에 놓는다.
	int money;
	//int money = 0; 자동초기화 발생 
	
	
	//일단 모르겠으면 void로 시작
    /**계좌생성*/
	void makeAccount() {
		//변수는 자기와 가장 가까운 곳에서 부터 찾는다. 지금은 메서드 -> 클래스 순으로
		//계좌생성시 만원이 적립된다
		money = 10000;  
	}
	
	
	/**입금*/
	void deposit(int m) {
		//클래스 밑 머니 잔액조회를 위해 입금될때마다 증가시켜줌
		money += m;
	}
	
	
	/**출금*/
	//매번 바뀌기 때문에 매개변수에서 해야한다
	void withdraw(int m) {
		//출금요청 금액이 잔액보다 큰 지 봐야한다
		if (m > money) {
			System.out.println("잔액이 부족합니다");
			return;
		}
		money -= m;
	}
	
	
	/**잔액조회*/
	int getBalance() {
		return money;
	}
	
	
	
	
	

}
