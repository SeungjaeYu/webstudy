package net07.app;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server03 {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(10001);
			while (true) {
				Socket client = server.accept();
				
				DataInputStream dis = new DataInputStream(client.getInputStream());
				DataOutputStream dos = new DataOutputStream(client.getOutputStream());
				while (true) {
					String msg = dis.readUTF();
					if("quit".equals(msg)) break;
					dos.writeUTF(msg);
				}
				System.out.println("클라이언트 에코 종료");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
