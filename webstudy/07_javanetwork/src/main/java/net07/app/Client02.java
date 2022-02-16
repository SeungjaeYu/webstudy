package net07.app;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client02 {
	public static void main(String[] args) {
		try {
			while(true) {
			Socket client = new Socket("localhost", 10001);
			InputStream in = client.getInputStream();
			InputStreamReader isr = new InputStreamReader(in, "utf-8");
			BufferedReader br = new BufferedReader(isr);
			System.out.println("서버의 메세지 기다리는중......");
			String inputData = br.readLine();
			br.close();
			isr.close();
			in.close();
			
			System.out.println("서버에서 전송된 데이터 : " + inputData);
			
			}
		} catch (Exception e) {
		}
	}
}
