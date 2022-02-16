/**
 *  HttpURLConnection 을 이용한 다양한 처리하기
 * 
 *  - post 방식의 호출
 *  - 헤더 값을 설정해야 할 때
 */

package net02.url;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class Test05 {
	public static void main(String[] args) {
		try {
			
			URL url = new URL("http://localhost:8000/07_javaweb/net/url/login");
			
			// url 클래스는 post 방식의 요청이 없음
			// HttpURLConnection 클래스 사용
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			
			// POST 방식
			conn.setRequestMethod("POST");
			
			// 헤더 설정하기 : 오픈 API 가 주로 사용하는 방식
			conn.setRequestProperty("my-id", "aaaa"); 		// 헤더의 이름, 값
			
			// 파라미터 전송하기
			conn.setDoOutput(true);		// 연결된 쪽으로 데이터를 쓸 수 있다.
			
			OutputStream out = conn.getOutputStream();
			out.write("id=test&pass=1111".getBytes("utf-8"));
			
			// 서버의 실행된 응답 코드 가져오기 : 정상처리(200)
			int code = conn.getResponseCode();
			System.out.println("응답코드 : " + code);
			
			InputStreamReader isr = new InputStreamReader(conn.getInputStream());
			BufferedReader br = new BufferedReader(isr);
			while (true) {
				String line = br.readLine();
				if (line == null) break;
				
				System.out.println(line);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
