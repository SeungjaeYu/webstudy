package ch08_method.exam;

public class Quiz02 {
	public static void main(String[] args) {
		//기능을 사용하는 클래스
		// 클래스의 객체를 먼저 생성
		Bank bank = new Bank();
		
		//계좌 생성
		bank.makeAccount();
		
		
		//잔액 확인
		System.out.printf("현재 잔액 : %d원%n", bank.getBalance());
		
		//입금
		bank.deposit(10000);
		
		//잔액 확인
		System.out.printf("입금 후 현재 잔액 : %d원%n",bank.getBalance());
		
		//출금
		bank.withdraw(7000);
		
		//잔액 확인
		System.out.printf("출금 후 현재 잔액 : %d원%n", bank.getBalance());
		
		//출금 불가능
		bank.withdraw(15000);
		
		//잔액 확인
		System.out.printf("출금 실패 후 현재 잔액 : %d원%n", bank.getBalance());
		
		
		
		
		
		
		
		
	}

}
