package net07.app.exam;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ChatServerMain {
	public static void main(String[] args) {
		try {
			ServerSocket ss = new ServerSocket(20000);
			System.out.println("채팅 클라이언트 요청을 기다립니다.");
			ArrayList<DataOutputStream> userList = new ArrayList<>();
			while (true) {
				Socket sock = ss.accept();
				// 클라이언트의 요청이 들어오면 각 클라이언트 별로 
				// 채팅을 독립적으로 진행하기 위해 스레드로 생성 
				ChatThread ct = new ChatThread(sock, userList);
				ct.start();
			}
		} catch (Exception e) {
		}
	}
}

class ChatThread extends Thread {
	private Socket sock;
	private ArrayList<DataOutputStream> userList;
	private DataInputStream  dis = null;
	private DataOutputStream dos = null;
	private String id;
	public ChatThread(Socket sock, ArrayList<DataOutputStream> userList) {
		this.sock = sock;
		this.userList = userList;
		try {
			dos = new DataOutputStream(sock.getOutputStream());
			dis = new DataInputStream (sock.getInputStream());
			// 클라이언트와 연결된 소켓에서 처음 읽는 데이터는 아이디값이 된다.
			id = dis.readUTF();
			broadcast(id + "님이 접속했습니다.");
			
			// 기존 사용자에게 입장을 알린 후 자신도 사용자 리스트에 추가한다.
			synchronized (userList) {
				userList.add(dos);
			}
		} catch (Exception e) {
		} 
	}
	
	private void broadcast(String msg) throws Exception {
		for (DataOutputStream dos : userList) {
			dos.writeUTF(msg);
			dos.flush();
		}
	}
	
	public void run() {
		try {
			// 연결된 클라이언트에서 메시지를 보내주면 접속한 모든 사용자에게
			// 전송한다.
			while (true) {
				String msg = dis.readUTF();
				if (msg.equals("/quit")) {
					break;
				}
				broadcast(id + " : " + msg);
			}
		} catch (Exception e) {
		} finally {
			synchronized (userList) {
				userList.remove(dos);
			}
			try {
				broadcast(id + "님이 채팅을 나갔습니다.");
			} catch (Exception e) {
			}
			if (dis != null) {
				try { dis.close(); } catch (IOException e) {}
			}
			if (dos != null) {
				try { dos.close(); } catch (IOException e) {}
			}
			if (sock != null) {
				try { sock.close(); } catch (IOException e) {}
			}
		}
	}
}


















