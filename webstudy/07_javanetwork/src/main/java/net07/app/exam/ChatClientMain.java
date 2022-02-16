package net07.app.exam;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ChatClientMain {
	public static void main(String[] args) {
		Socket sock = null;
		Scanner keyboard = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		boolean end = false;
		try {
			sock = new Socket("203.236.209.10", 20000);
			dis  = new DataInputStream (sock.getInputStream());
			dos  = new DataOutputStream(sock.getOutputStream());
			keyboard = new Scanner(System.in);
			
			System.out.print("채팅 아이디 입력 : ");
			String id = keyboard.nextLine();
			// 서버에 id 전송
			dos.writeUTF(id);
			dos.flush();
			
			// 서버에서 보내준 데이터를 읽어서 화면에 출력
			Listener thread = new Listener(sock, dis);
			thread.start();
			
			while (true) {
				String line = keyboard.nextLine();
				dos.writeUTF(line);
				dos.flush();
				
				if (line.equals("/quit")) {
					end = true;
					break;
				}
			}
			System.out.println("채팅을 종료합니다.");
		} catch (Exception e) {
			if (end == false) {
				System.out.println("채팅이 비정상 종료되었습니다.");
			}
		} finally {
			if (dis != null) {
				try { dis.close(); } catch (IOException e) {}
			}
			if (dos != null) {
				try { dos.close(); } catch (IOException e) {}
			}
			if (keyboard != null) {
				keyboard.close();
			}
			if (sock != null) {
				try { sock.close(); } catch (IOException e) {}
			}
		}
	}
}
class Listener extends Thread {
	private Socket sock;
	private DataInputStream dis;
	public Listener(Socket sock, DataInputStream dis) {
		this.sock = sock;
		this.dis  = dis;
	}
	
	public void run() {
		try {
			while (true) {
				// 서버에서 보내주는 데이터 읽기
				String line = dis.readUTF();
				System.out.println(line);
			}
		} catch (Exception e) {
		} finally {
			if (dis != null) {
				try { dis.close(); } catch (IOException e) {}
			}
			if (sock != null) {
				try { sock.close(); } catch (IOException e) {}
			}
		}
	}
	
}














