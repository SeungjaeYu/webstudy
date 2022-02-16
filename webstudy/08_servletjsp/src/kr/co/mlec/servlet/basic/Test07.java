/**
 *  이미지를 브라우저로 전송하기
 *  바이트 단위 데이터를 출력하는 방법
 *  getWriter() (X - 문자 출력시)
 *  OutputStream getOutputStream()
 *  
 */
package kr.co.mlec.servlet.basic;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/basic/test07.do")
public class Test07 extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// 전송할 문자서의 타입을 설정 - 브라우저에게 알려준다.
		res.setContentType("image/jpg");
		
		OutputStream out = res.getOutputStream();
		BufferedOutputStream bos = new BufferedOutputStream(out);
		FileInputStream fis = new FileInputStream("C:\\java\\workspace\\true\\08_servletjsp\\WebContent\\test1.jpg");
		BufferedInputStream bis = new BufferedInputStream(fis);
		while (true) {
			int ch = bis.read();
			if (ch == -1) break;
			
			bos.write(ch);
		}
		
		bis.close();	bos.close();
		fis.close();	out.close();
		
		out.close();
		
		
		
	}
}
