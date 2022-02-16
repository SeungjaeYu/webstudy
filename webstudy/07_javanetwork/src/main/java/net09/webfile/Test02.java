package net09.webfile;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import web.util.FileUtil;
import web.util.HttpServletRequest;
import web.util.HttpServletResponse;

public class Test02 {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(8000);
			while (true) {
				Socket client = server.accept();
				HttpServletRequest request = new HttpServletRequest(client.getInputStream());
				HttpServletResponse response = new HttpServletResponse(client.getOutputStream());
				
				String content = FileUtil.readFile("WebContent/html/test02.html");
				String name = request.getParameter("name");
				String msg = request.getParameter("msg");
				content = content.replace("#name", name).replace("#msg", msg);
				
				// HTML 파일의 내용을 전송한다.
				response.setContentType("text/html; charset=utf-8");
				PrintWriter out = response.getWriter();
				out.println(content);
				out.close();

				response.send();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
