/**
 *  요청 URL 파싱
 *  
 * 
 */

package net08.web;

public class Test04 {
	public static void main(String[] args) {
		String startLine = "GET /board/delete.do?no=10&commentNo=1 HTTP/1.1";
		
		/*
		 *  요청메서드 : GET
		 *  요청페이지 : /board/delete.do
		 *  요청 파라미터
		 *  no : 100
		 *  commentNo : 1
		 */
		String[] arr = startLine.split(" ");
		String method = arr[0];
		System.out.println("요청메서드 : " + method);
		String uri = arr[1];
		
		String[] uriArr = uri.split("\\?");
		String path = uriArr[0];
		System.out.println("요청페이지 : " + path);
		
		System.out.println("요청파라미터");
		
		for (String param : uriArr[1].split("&")) {
//			System.out.println(param);
			String[] pArr = param.split("=");
			System.out.println(pArr[0] + " : " + pArr[1]);
		}
		
		System.out.println(uriArr[1].replace("&", "\r\n").replace("=", " : "));
		
		
		
		
	}
}
