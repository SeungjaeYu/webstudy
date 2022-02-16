/**
 * 요청 정보를 모듈화 작업
 */

package net08.web;

import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import web.util.HttpServletRequest;

//지금부터 Test06을 톰캣이라고 생각해라.
public class Test06 {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(8000);
			while (true) {
				Socket client = server.accept();

				// http://localhost:8000/board/delete.do?no=100&commentNo=1
				/*
				 * 요청메서드 : GET 요청URI : /board/delete.do 쿼리스트링 : no=100&commentNo=1 요청파라미터 no =
				 * 100 commentNo : 1 name = null
				 */
				HttpServletRequest request = new HttpServletRequest(client.getInputStream());
				String method = request.getMethod();
				String requestURI = request.getRequestURI();
				String queryString = request.getQueryString();
				String no = request.getParameter("no");
				String commentNo = request.getParameter("commentNo");
				String name = request.getParameter("name");// 없으면 null
				StringBuffer sb = new StringBuffer();
				
				
				sb.append("<div>요청 메서드 : " + method + "</div>");
				sb.append("<div>요청 URI : " + requestURI + "</div>");
				sb.append("<div>쿼리 스트링 : " + queryString + "</div>");
				sb.append("<div>no : " + no + "</div>");
				sb.append("<div>commentNo : " + commentNo + "</div>");
				sb.append("<div>name : " + name + "</div>");
				
				String msg = "<!DOCTYPE html>"
						   + "<html>"
						   + 	"<head>"
						   + 		"<meta charset='utf-8'>"
						   + 		"<title>웹서버 구현"
						   + 		"</title>"
						   + 	"</head>"
						   + "<body>"
						   + 	sb.toString()	
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
