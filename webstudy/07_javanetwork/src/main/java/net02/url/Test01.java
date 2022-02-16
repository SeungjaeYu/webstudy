/**
 *  URL
 *  HttpURLConnection
 *  
 *  URL 의 형태
 *  
 *  http://www.naver.com:8888/search.naver?where=1&query=java
 *  
 *  프로토콜 : http
 *  호스트 : www.naver.com
 *  포트 : 8888
 *  패스(path) : /search.naver ( form action )
 *  쿼리(query) : where=1&query=java
 *  
 *  
 */
package net02.url;

import java.net.URL;

public class Test01 {
	public static void main(String[] args) {
		try {
			URL url = new URL("http://www.abc.com:8888/test.do?msg=hello");
			System.out.println(url.getProtocol());
			System.out.println(url.getHost());
			System.out.println(url.getPort());	// -1 : 포트번호 설정이 없는 경우
			System.out.println(url.getPath());
			System.out.println(url.getQuery());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
