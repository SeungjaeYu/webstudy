/**
 * 	http://localhost:8000/board/list
 * 	http://localhost:8000/board/delete?no=1
 * 	http://localhost:8000/board/update?no=1&title=aaa
 * 	http://localhost:8000/board/writeForm
 *  
 * 	각각의 호출에 대해서 아래와 같이 사용자에게 응답하도록 코드 작성
 *  http://localhost:8000/board/list 호출이 오면
 *  사용자에게 "게시판 목록 페이지 요청" 메시지를 응답한다.
 *  사용자에게 "게시판 삭제 페이지 요청" 메시지를 응답한다.
 *  사용자에게 "게시판 수정 페이지 요청" 메시지를 응답한다.
 *  사용자에게 "게시판 등록 폼 페이지 요청" 메시지를 응답한다.
 *  
 *  만약, 위의 지정된 URL 이외의 페이지 호출시에는
 *  "요청 페이지가 존재하지 않습니다" 메시지를 응답한다.
 * 
 * 
 */


package net08.web.exam;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Quiz01 {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(8000);
			while (true) {
				Socket client = server.accept();
				BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream(), "utf-8"));
				
				String[] arr = br.readLine().split(" ");
				String uri = arr[1];
				
				String lastPage = uri.substring(uri.lastIndexOf("/") + 1, 
						uri.lastIndexOf("?") == -1 ? uri.length() : uri.lastIndexOf("?"));
				
				// 파라미터 정보는 uriArr 길이가 1이 아닌 경우
				String pageResponse = "";
				switch (lastPage) {
				case "list": pageResponse = "게시판 목록 페이지 요청"; break;
				case "delete": pageResponse = "게시판 삭제 페이지 요청"; break;
				case "update": pageResponse = "게시판 수정 페이지 요청"; break;
				case "writeForm": pageResponse = "게시판 등록폼 페이지 요청"; break;
				default: pageResponse = "요청 페이지가 존재하지 않습니다"; break;
				}
				
				String msg = "<!DOCTYPE html>"
						   + "<html>"
						   + 	"<head>"
						   + 		"<meta charset='utf-8'>"
						   + 		"<title>웹서버 구현"
						   + 		"</title>"
						   + 	"</head>"
						   + "<body>"
						   + "<h2>" + pageResponse + "</h2>"
						   + "</body>"
						   + "</html>";
				String startLine = "HTTP/1.1 200 OK\r\n";
				// 서버에서 헤더 타입을 보내준 것을 클라이언트가 해석한다.
				String header = 
						"Content-Type: text/html; charset=utf-8\r\n" // text - 메인 타입, html - 서브 타임
					  + "Content-Length: " + msg.getBytes("utf-8").length + "\r\n\r\n"; // 보내는 데이터의 길이 값(바이트 단위로 전송하기 때문에)
					  		
				String sendData = startLine + header + msg;
//				System.out.println(sendData);
				OutputStream out = client.getOutputStream();
				out.write(sendData.getBytes("utf-8"));
				out.close();
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
