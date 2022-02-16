/**
 * cos 라이브러리 사용해서 파일 업로드 처리
 */
package kr.co.mlec.fileupload;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

@WebServlet("/fileupload/test01.do")
public class Test01 extends HttpServlet {
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		/*
		 * enctype이 multipart/form-data 일경우 읽을 수 없다..(null 이 반환)
		System.out.println("msg : " + req.getParameter("msg"));
		System.out.println("attach : " + req.getParameter("attach"));
		*/
		MultipartRequest request = new MultipartRequest(
				req, 
				"c:/java/upload",  // 저장될 위치 
				1024 * 1024 * 100, // 최대 파일 크기 지정(byte)
				"utf-8",  // 파라미터 인코딩 
				new DefaultFileRenamePolicy()  // 파일의 저장 이름 정책지정
		);
		System.out.println("msg : " + request.getParameter("msg"));
		
		// 파일 정보 저장시 필요한 값 추출하기
		// <input type="file" name="attach" />
		// f가 null일 경우는 사용자가 파일을 선택하지 않은 경우이다.
		File f1 = request.getFile("attach1");
		if (f1 != null) {
			System.out.println("파일의 크기 : " + f1.length());
			String orgName = request.getOriginalFileName("attach1");
			System.out.println("원본 파일명 : " + orgName);
			String systemName = request.getFilesystemName("attach1");
			System.out.println("시스템 저장 파일명 : " + systemName);
		}
		File f2 = request.getFile("attach2");
		if (f2 != null) {
			System.out.println("파일의 크기 : " + f2.length());
			String orgName = request.getOriginalFileName("attach2");
			System.out.println("원본 파일명 : " + orgName);
			String systemName = request.getFilesystemName("attach2");
			System.out.println("시스템 저장 파일명 : " + systemName);
		}
		System.out.println("파일 업로드 성공");
	}
	/*
	 * 파일 전송되는 형식 확인용...
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter out = res.getWriter();
		
		InputStream in = req.getInputStream();
		Scanner sc = new Scanner(in);
		while (sc.hasNextLine()) {
			out.println(sc.nextLine());
		}
		out.close();
	}
	*/
}










