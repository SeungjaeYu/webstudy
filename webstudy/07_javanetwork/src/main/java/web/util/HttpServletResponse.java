package web.util;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;

public class HttpServletResponse {
	
	public static void main(String[] args) {
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		
		pw.println("<html></html>");
		pw.println("TEST");
		pw.close();
		
		System.out.println(sw.toString());
	}
	
	
	private OutputStream out;
	private String contentType;
	
	private StringWriter sw = new StringWriter();
	private PrintWriter pw = new PrintWriter(sw); 
	
	public HttpServletResponse(OutputStream out) {
		this.out = out;
	}
	
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public PrintWriter getWriter() {
		// TODO Auto-generated method stub
		return pw;
	}

	/**
	 * 사용자에게 내용 출력하는 부분
	 * @throws Exception
	 */
	
	public void send() throws Exception {
		String msg = sw.toString();
		String startLine = "HTTP/1.1 200 OK\r\n";
		// 서버에서 헤더 타입을 보내준 것을 클라이언트가 해석한다.
		String header = 
				"Content-Type: " + contentType + "\r\n" // text - 메인 타입, html - 서브 타임
			  + "Content-Length: " + msg.getBytes("utf-8").length + "\r\n\r\n"; // 보내는 데이터의 길이 값(바이트 단위로 전송하기 때문에)
			  		
		String sendData = startLine + header + msg;
		
		out.write(sendData.getBytes("utf-8"));
		out.close();
	}

	public void sendByte(byte[] buffer) throws Exception {
		String startLine = "HTTP/1.1 200 OK\r\n";
		// 서버에서 헤더 타입을 보내준 것을 클라이언트가 해석한다.
		String header = 
				"Content-Type: " + contentType + "\r\n" // text - 메인 타입, html - 서브 타임
				+ "Content-Length: " + buffer.length + "\r\n\r\n"; // 보내는 데이터의 길이 값(바이트 단위로 전송하기 때문에)
		
		
		out.write(startLine.getBytes());
		out.write(header.getBytes());
		out.write(buffer);
		out.close();
	}
	
	
}
