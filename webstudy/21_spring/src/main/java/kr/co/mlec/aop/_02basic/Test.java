package kr.co.mlec.aop._02basic;

public class Test {
	public static void main(String[] args) {
		Controller controller = null;
		try {
			controller = new BoardController();
			controller.service();
		} catch (Exception e) {
			System.out.println("-----------------------------");
			System.out.println("실행 중 예외 발생함");
			e.printStackTrace();
			System.out.println("-----------------------------");
		}
		try {
			controller = new MemberController();
			controller.service();
		} catch (Exception e) {
			System.out.println("-----------------------------");
			System.out.println("실행 중 예외 발생함");
			e.printStackTrace();
			System.out.println("-----------------------------");
		}
	}
}
