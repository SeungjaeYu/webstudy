package kr.co.mlec.aop._01basic;

import java.util.Random;

public class BoardController implements Controller {
	@Override
	public void service() {
		try {
			System.out.println("게시판 핵심 기능 수행 시작");
			Random r = new Random();
			int n1 = r.nextInt(100);
			int n2 = r.nextInt(2);
			System.out.println(n1 / n2);
			System.out.println("게시판 핵심 기능 정상 종료");
		} catch (Exception e) {
			System.out.println("-----------------------------");
			System.out.println("실행 중 예외 발생함");
			e.printStackTrace();
			System.out.println("-----------------------------");
		}
	}

}
