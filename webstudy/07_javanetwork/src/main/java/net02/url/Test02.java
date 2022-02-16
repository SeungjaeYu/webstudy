/**
 * URL 을 통해서 연결된 사이트의 데이터를 읽기 
 */

package net02.url;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class Test02 {
	private static void test01() throws Exception {
		URL url = new URL("https://www.naver.com");

		InputStream in = url.openStream();	// 데이터를 주고받는 통로
		while (true) {
			int ch = in.read();
			if (ch ==  -1) break;
			
			System.out.print((char) ch);
		}
		
	}
	private static void test02() throws Exception {
		URL url = new URL("https://www.naver.com");
		InputStream in = url.openStream();	// 데이터를 주고받는 통로
		InputStreamReader isr = new InputStreamReader(in);
		while (true) {
			int ch = isr.read();
			if (ch ==  -1) break;
			System.out.print((char) ch);
		}
		
	}
	private static void test03() throws Exception {
		URL url = new URL("https://www.naver.com");
		InputStream in = url.openStream();	// 데이터를 주고받는 통로
		InputStreamReader isr = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(isr);
		while (true) {
			String ch = br.readLine();
			if (ch == null) break;
			System.out.println(ch);
		}
		
	}
	
	public static void main(String[] args) {
		try {
//			test01();	// 한글 깨짐
//			test02();	// 한글 처리
			test03();	// 속도 개선
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
