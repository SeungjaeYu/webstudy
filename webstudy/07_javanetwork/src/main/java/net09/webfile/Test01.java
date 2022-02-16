package net09.webfile;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import web.util.FileUtil;
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
				
				// HTML 파일의 내용을 전송한다.
				response.setContentType("text/html; charset=utf-8");
				PrintWriter out = response.getWriter();
				out.println(FileUtil.readFile("WebContent/html/test01.html"));
				out.close();

				response.send();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
