package kr.co.mlec.aop;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component("board")
public class BoardController implements Controller {
	@Override
	public void service() {
		System.out.println("게시판 핵심 기능 수행 시작");
		Random r = new Random();
		int n1 = r.nextInt(100);
		int n2 = r.nextInt(2) + 1;
		System.out.println(n1 / n2);
		System.out.println("게시판 핵심 기능 정상 종료");
	}
}
