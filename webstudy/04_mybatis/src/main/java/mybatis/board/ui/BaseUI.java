package mybatis.board.ui;

import java.util.Scanner;

public abstract class BaseUI {
	protected Scanner sc = new Scanner(System.in);
	
	//모든 상속받는 UI 클래스가 구현할 공통의 메서드 정의
	public abstract void service();
	

	//String title = getString("제목을 입력하세요: ");
	protected String getString(String msg) {
		System.out.println(msg);
		return sc.nextLine();
	}
	
	protected int getInt(String msg) {
		/*
		System.out.println(msg);
		return Integer.parseInt(sc.nextLine());
		*/
		
		return Integer.parseInt(getString(msg));
	}
	

}
