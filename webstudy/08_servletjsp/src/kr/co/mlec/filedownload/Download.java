package kr.co.mlec.filedownload;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/filedownload/download.do")
public class Download extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// 사용자가 요청하는 파일을 찾아서 사용자에게 전송
		String uploadRoot = "c:/java/upload";
		String path = req.getParameter("path");		// 사용자 요청 파일이 저장된 경로
		String name = req.getParameter("name");		// 사용자 요청 파일명
		String dname = req.getParameter("dname");		// 다운로드할 파일명
		
		// 파일을 읽기 위한 파일 객체 생성
		File f = new File(uploadRoot + path, name);
		
		// 전송하는 내용에 대한 설정
		if (dname == null) {
			res.setHeader("Content-Type", "image/jpg");
		}
		// 다운로드 할 경우
		else {
			// 브라우져에게 문서의 타입을 모르니 다운로드 해라..
			res.setHeader("Content-Type", "application/octet-stream");
			// 다운로드할 이름을 지정
			dname = new String(dname.getBytes("utf-8"), "8859_1");
			res.setHeader("Content-Disposition", "attchment;filename=" + dname);
		}
		
		
		// 파일의 내용을 읽어서 브라우져로 전송하기
		FileInputStream fis = new FileInputStream(f);
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		OutputStream out = res.getOutputStream();
		BufferedOutputStream bos = new BufferedOutputStream(out);
		
		while (true) {
			int ch = bis.read();
			if (ch == -1) break;
			
			bos.write(ch);
		}
		
		bis.close();	fis.close();
		bos.close();	out.close();
	}
	
}
