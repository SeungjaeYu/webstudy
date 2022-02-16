package net07.app;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

class EchoThread extends Thread {
	private Socket client;
	public EchoThread(Socket client) {
		this.client = client;
	}
	public void run() {
		try {
			DataInputStream dis = new DataInputStream(client.getInputStream());
			DataOutputStream dos = new DataOutputStream(client.getOutputStream());
			while (true) {
				String msg = dis.readUTF();
				if("quit".equals(msg)) break;
				dos.writeUTF(msg);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}


public class Server03_Multi {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(10001);
			while (true) {
				Socket client = server.accept();
				System.out.println("클라이언트 접속 : " + client.getInetAddress());
				
				// Thread 처리하기
				EchoThread multi = new EchoThread(client);
				multi.start();
				
				System.out.println("클라이언트 에코 종료");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
