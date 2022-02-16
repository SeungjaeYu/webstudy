/**
 *  페이지 호출
 *  
 *  http://localhost:8000/board/list
 *  
 *  Method : GET
 *  RequestURI : /board/list
 *  Parameter
 *  없음
 *  
 *  http://localhost:8000/board/login?id=abc&pass=1234
 *  
 *  Method : GET
 *  RequestURI : /board/list
 *  Parameter
 *  id : abc
 *  pass : 1234
 * 
 */
package net08.web;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Test05 {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(8000);
			while (true) {
				Socket client = server.accept();
				BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream(), "utf-8"));
				
				String[] arr = br.readLine().split(" ");
				String method = arr[0];
				String uri = arr[1];
				
				String[] uriArr = uri.split("\\?");
				String path = uriArr[0];
				// 파라미터 정보는 uriArr 길이가 1이 아닌 경우
				StringBuffer param = new StringBuffer();
				if (uriArr.length == 2) {
					for (String p : uriArr[1].split("&")) {
						String[] pArr = p.split("=");
						param.append("<div>" + pArr[0] + " : " + pArr[1] + "</div>");
					}
				} else {
					param.append("없음");
				}
				
				String msg = "<!DOCTYPE html>"
						   + "<html>"
						   + 	"<head>"
						   + 		"<meta charset='utf-8'>"
						   + 		"<title>웹서버 구현"
						   + 		"</title>"
						   + 	"</head>"
						   + "<body>"
						   + 	"<h2>Method : " + method + "</h2>"
						   + 	"<h2>RequestURI : " + path + "</h2>"
						   + 	"<h2>Parameter</h2>"
						   + param.toString() 
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
