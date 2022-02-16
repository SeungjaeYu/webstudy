///**
// * Quiz02가 모듈화시켰을때 어떻게 바뀌나 봐라.
// * 
// * 화면에서 숫자와 메세지를 입력받아서 숫자만큼 메세지를 화면에 출력하는 프로그램을 작성
// * 
// * http://localhost:8000/loop?num=3&msg=hello
// * 
// * hello
// * hello
// * hello
// * 
// */
//
//package net08.web.exam;
//
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.io.OutputStream;
//import java.net.ServerSocket;
//import java.net.Socket;
//
//import net08.web.util.HttpServletRequest;
//
//public class Quiz03 {
//	public static void main(String[] args) {
//		try {
//			ServerSocket server = new ServerSocket(8000);
//			while (true) {
//			Socket client = server.accept();
//			HttpServletRequest request = new HttpServletRequest(client.getInputStream());
//				int num = Integer.parseInt(request.getParameter("num"));
//				String message = request.getParameter("message");
//				
//				BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream(), "utf-8"));
//				
//				String[] arr = br.readLine().split(" ");
//				String uri = arr[1];
//				
//				String lastPage = uri.substring(uri.lastIndexOf("?") + 1, uri.length());
//				String[] pArr = lastPage.split("&");
//				if (pArr[0].equals("/favicon.ico")) continue;
//				int num = Integer.parseInt(pArr[0].split("=")[1]);
//				StringBuffer sb = new StringBuffer();
//				for (int i = 0; i < num; i++) {
//					sb.append(pArr[1].split("=")[1] + "<br>");
//				}
//				
//				
//			
//				
//				String msg = "<!DOCTYPE html>"
//						   + "<html>"
//						   + 	"<head>"
//						   + 		"<meta charset='utf-8'>"
//						   + 		"<title>웹서버 구현"
//						   + 		"</title>"
//						   + 	"</head>"
//						   + "<body>"
//						   + "<h2>" + sb.toString() + "</h2>"
//						   + "</body>"
//						   + "</html>";
//				String startLine = "HTTP/1.1 200 OK\r\n";
//				// 서버에서 헤더 타입을 보내준 것을 클라이언트가 해석한다.
//				String header = 
//						"Content-Type: text/html; charset=utf-8\r\n" // text - 메인 타입, html - 서브 타임
//					  + "Content-Length: " + msg.getBytes("utf-8").length + "\r\n\r\n"; // 보내는 데이터의 길이 값(바이트 단위로 전송하기 때문에)
//					  		
//				String sendData = startLine + header + msg;
////				System.out.println(sendData);
//				OutputStream out = client.getOutputStream();
//				out.write(sendData.getBytes("utf-8"));
//				out.close();
//				
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//}
