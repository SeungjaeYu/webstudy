/**
 * 요청 정보를 모듈화 작업
 */

package net08.web;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import web.util.HttpServletRequest;
import web.util.HttpServletResponse;

//지금부터 Test06을 톰캣이라고 생각해라.
public class Test07 {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(8000);
			while (true) {
				Socket client = server.accept();
				String msg = "<!DOCTYPE html>"
						+ "<html>"
						+ 	"<head>"
						+ 		"<meta charset='utf-8'>"
						+ 		"<title>웹서버 구현"
						+ 		"</title>"
						+ 	"</head>"
						+ "<body>"
						+ 	"<h2>응답 결과 보내기 모듈화</h2>"
						+ "</body>"
						+ "</html>";
				HttpServletResponse response = new HttpServletResponse(client.getOutputStream());
				// 사용자에게 전송할 문서의 타입을 설정
				response.setContentType("text/html; charset=utf-8");
				
				// 사용자에게 출력할 내용을 저장할 출력객체
				PrintWriter out = response.getWriter();
				out.println(msg);
				out.close();
				
				// 사용자의 설정한 메세지를 화면으로 전송
				response.send();
				
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
