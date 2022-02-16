/**
 *  tcp, udp
 *  
 *  TCP 방식 
 *  ServerSocket - 서버
 *  Socket 		 - 클라이언트
 */

package net07.app;

import java.net.ServerSocket;
import java.net.Socket;

public class Server01 {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(10001);
			// 클라이언트의 요청에 응답하기 위해서..
			System.out.println("사용자 요청 대기중...");
			while(true) {
				Socket client = server.accept();
				System.out.println(client.getInetAddress());
				System.out.println("사용자 요청 들어왔음..");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
