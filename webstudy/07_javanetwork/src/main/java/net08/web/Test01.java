/**
 *  http 프로토콜(protocol) - 약속
 *  											1. 시작라인(첫줄만)
 *  											2. 헤더(여러줄, 엔터가 나오기 전까지 헤더) 
 *  											3. 데이터(엔터 이후)
 *  
 *  
 *  
 *   3가지 라인																
 *   요청 응답 - 시작라인                       - 프로토콜버전(HTTP/1.1) 상태코드	응답메세지
 *             - 헤더
 *        html - 데이타
 *   
 *   
 * 
 */

package net08.web;

import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Test01 {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(8000);
			while (true) {
				
				
				System.out.println("사용자 요청 대기중...");
				Socket client = server.accept();
				System.out.println("사용자 접속됨...");
				
				String msg = "<!DOCTYPE html>"
						   + "<html>"
						   + 	"<head>"
						   + 		"<meta charset='utf-8'>"
						   + 		"<title>웹서버 구현"
						   + 		"</title>"
						   + 	"</head>"
						   + "<body>"
						   + 	"<h2>직접 만든 서버에서 응답...</h2>"
						   + "</body>"
						   + "</html>";
				String startLine = "HTTP/1.1 200 OK\r\n";
				// 서버에서 헤더 타입을 보내준 것을 클라이언트가 해석한다.
				String header = 
						"Content-Type: text/html; charset=utf-8\r\n" // text - 메인 타입, html - 서브 타임
					  + "Content-Length: " + msg.getBytes("utf-8").length + "\r\n\r\n"; // 보내는 데이터의 길이 값(바이트 단위로 전송하기 때문에)
					  		
				String sendData = startLine + header + msg;
				System.out.println(sendData);
				OutputStream out = client.getOutputStream();
				out.write(sendData.getBytes("utf-8"));
				out.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
