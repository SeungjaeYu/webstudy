/**
 * 		http://localhost:8000/board/list.do
 * 		http://localhost:8000/board/writeform.do
 * 		http://localhost:8000/board/write.do
 * 
 */



package net10.webservlet;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import web.util.FileUtil;
import web.util.HttpServlet;
import web.util.HttpServletRequest;
import web.util.HttpServletResponse;

public class Test01 {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(8000);
			while (true) {
				Socket client = server.accept();
				HttpServletRequest request = new HttpServletRequest(client.getInputStream());
				HttpServletResponse response = new HttpServletResponse(client.getOutputStream());
				
				String uri = request.getRequestURI();
				if (uri == null) continue;
				System.out.println("요청 URI : " + uri);
				
				if ("/favicon.ico".equals(uri)) continue;
				
				// css 파일의 요청일 경우
				if (uri.endsWith(".css")) {
					// HTML 파일의 내용을 전송한다.
					response.setContentType("text/css");
					PrintWriter out = response.getWriter();
					out.println(FileUtil.readFile(uri.substring(1)));
					out.close();
					response.send();
					continue;
				}
				
				// 이미지의 요청
				if (uri.endsWith(".jpg") || uri.endsWith(".jepg")
						|| uri.endsWith(".png")
						|| uri.endsWith(".gif")) {
					// HTML 파일의 내용을 전송한다.
					response.setContentType("image/jpeg");
					byte[] buffer = FileUtil.readByteFile(uri.substring(1));
					response.sendByte(buffer);
					continue;
				}
				
				HttpServlet servlet = null;
				
				switch (uri) {
				case "/login/loginform.do":
					servlet = new LoginformServlet();
					break;
				case "/login/login.do":
					servlet = new LoginServlet();
					break;

				default:
					
					break;
				}
				if (servlet == null) {
					response.setContentType("text/html; charset=utf-8");
					PrintWriter out = response.getWriter();
					out.println("<h1>404 - FileNotFound</h1>");
					out.close();
					response.send();
					continue;
				}
				servlet.service(request, response);
				
				response.send();

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
