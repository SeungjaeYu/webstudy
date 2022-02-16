/**
 * cos 라이브러리 사용해서 파일 업로드 처리
 */
package kr.co.mlec.fileupload;

import java.io.File;
import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

@WebServlet("/fileupload/test02.do")
public class Test02 extends HttpServlet {
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		MultipartRequest request = new MultipartRequest(
				req, 
				"c:/java/upload",  // 저장될 위치 
				1024 * 1024 * 100, // 최대 파일 크기 지정(byte)
				"utf-8",  // 파라미터 인코딩 
				new DefaultFileRenamePolicy()  // 파일의 저장 이름 정책지정
		);
		
		/*
		 * 정적인 방식 : 권장  X
		for (int i = 1; i < 6; i++) {
			String fName = "attach" + i;
			File f = request.getFile(fName);
			if (f != null) {
				System.out.println("파일의 크기 : " + f.length());
				String orgName = request.getOriginalFileName(fName);
				System.out.println("원본 파일명 : " + orgName);
				String systemName = request.getFilesystemName(fName);
				System.out.println("시스템 저장 파일명 : " + systemName);
			}
		}
		 */
		Enumeration<String> names = request.getFileNames();
		while (names.hasMoreElements()) {
			String fName = names.nextElement();
			File f = request.getFile(fName);
			if (f != null) {
				System.out.println("파일의 크기 : " + f.length());
				String orgName = request.getOriginalFileName(fName);
				System.out.println("원본 파일명 : " + orgName);
				String systemName = request.getFilesystemName(fName);
				System.out.println("시스템 저장 파일명 : " + systemName);
			}
		}
		System.out.println("파일 업로드 성공");
	}
}










