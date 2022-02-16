package net07.app;

import java.net.Socket;

public class Client01 {
	public static void main(String[] args) {
		// 서버에 접속하기
		try {
			Socket client = new Socket("203.236.209.10", 10001);
			System.out.println("서버 접속 성공");					
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
