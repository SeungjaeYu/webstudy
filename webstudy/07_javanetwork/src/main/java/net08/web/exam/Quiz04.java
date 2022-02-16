/**
 * Quiz02가 모듈화시켰을때 어떻게 바뀌나 봐라.
 * 
 * 화면에서 숫자와 메세지를 입력받아서 숫자만큼 메세지를 화면에 출력하는 프로그램을 작성
 * 
 * http://localhost:8000/loop?num=3&msg=hello
 * 
 * hello
 * hello
 * hello
 * 
 */

package net08.web.exam;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import web.util.HttpServletRequest;
import web.util.HttpServletResponse;

public class Quiz04 {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(8000);
			while (true) {
			Socket client = server.accept();
			HttpServletRequest request = new HttpServletRequest(client.getInputStream());
				int num = Integer.parseInt(request.getParameter("num"));
				String message = request.getParameter("msg");
				
				
				StringBuffer sb = new StringBuffer();
				for (int i = 0; i < num; i++) {
					sb.append("<div>" + message + "</div>");
				}
				
				
			
				
				String msg = "<!DOCTYPE html>"
						   + "<html>"
						   + 	"<head>"
						   + 		"<meta charset='utf-8'>"
						   + 		"<title>웹서버 구현"
						   + 		"</title>"
						   + 	"</head>"
						   + "<body>"
						   + "<h2>" + sb.toString() + "</h2>"
						   + "</body>"
						   + "</html>";
				
				HttpServletResponse response = new HttpServletResponse(client.getOutputStream());
				
				
				response.setContentType("text/html; charset=utf-8");
				// 서버에서 헤더 타입을 보내준 것을 클라이언트가 해석한다.
					  		
				PrintWriter out = response.getWriter();
				out.println(msg);
				
				response.send();
				out.close();
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
