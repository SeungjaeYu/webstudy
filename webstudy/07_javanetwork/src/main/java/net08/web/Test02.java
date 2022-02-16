/**
 *  요청규약 이해하기
 *   
 *   시작라인		- 요청메서드(GET/POST) 요청URI(/board/list?파라미터) 프로토콜버전(HTTP/1.1)
 *   헤더			- key: value
 *   ...
 *   헤더
 * 	
 * 	 바디(데이터) - 쿼리스트링(파라미터 - POST일 경우), 파일의 내용
 * 	 
 */

package net08.web;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Test02 {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(8000);
			while (true) {
				
				
				System.out.println("사용자 요청 대기중...");
				Socket client = server.accept();
				
				// 사용자 요청 정보 중 시작라인과 헤더 정보 확인하기
				
				InputStream in = client.getInputStream();
				BufferedReader br = new BufferedReader(new InputStreamReader(in, "utf-8"));
				String reqStartLine = br.readLine();
				
				StringBuffer reqHeader =  new StringBuffer();
				
				while (true) {
					String header = br.readLine();
					if ("".equals(header)) break;
					
					reqHeader.append(header + "<br>");
				}
				
				
				
				System.out.println("사용자 접속됨...");
				
				String msg = "<!DOCTYPE html>"
						   + "<html>"
						   + 	"<head>"
						   + 		"<meta charset='utf-8'>"
						   + 		"<title>웹서버 구현"
						   + 		"</title>"
						   + 	"</head>"
						   + "<body>"
						   + 	"<h2>" + reqStartLine + "</h2>"
						   + 	"<h2>" + reqHeader.toString() + "</h2>"
						   + "</body>"
						   + "</html>";
				String startLine = "HTTP/1.1 200 OK\r\n";
				// 서버에서 헤더 타입을 보내준 것을 클라이언트가 해석한다.
				String header = 
						"Content-Type: text/html; charset=utf-8\r\n" // text - 메인 타입, html - 서브 타임
					  + "Content-Length: " + msg.getBytes("utf-8").length + "\r\n\r\n"; // 보내는 데이터의 길이 값(바이트 단위로 전송하기 때문에)
					  		
				String sendData = startLine + header + msg;
//				System.out.println(sendData);
				OutputStream out = client.getOutputStream();
				out.write(sendData.getBytes("utf-8"));
				out.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
