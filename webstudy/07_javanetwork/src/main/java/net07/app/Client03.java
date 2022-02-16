package net07.app;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client03 {
	public static void main(String[] args) {
		try {
			Scanner keyboard = new Scanner(System.in);
			Socket client = new Socket("203.236.209.10", 10001);
			DataInputStream dis = new DataInputStream(client.getInputStream());
			DataOutputStream dos = new DataOutputStream(client.getOutputStream());
			while (true) {
				System.out.print("메세지(종료: quit) > ");
				String msg = keyboard.nextLine();
				dos.writeUTF(msg);
				if ("quit".equals(msg)) break;
				String echo = dis.readUTF();
				System.out.println("서버(echo) : " + echo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
