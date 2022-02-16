package net07.app;

import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server02 {
	public static void main(String[] args) {
		try {
			
			ServerSocket server = new ServerSocket(10001);
			while (true) {
				Socket client = server.accept();
				System.out.println(client.getInetAddress() + " 접속");
				
				
				Thread.sleep(5000);
				
				OutputStream out = client.getOutputStream();
				out.write("안녕하세요~".getBytes("utf-8"));
				out.close();
				System.out.println(client.getInetAddress() + " 데이터 전송 완료");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
