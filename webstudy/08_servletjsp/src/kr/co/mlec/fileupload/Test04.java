/**
 * 썸네일 생성하기
 * 
 * - 자바 라이브러리 활용
 * - 오픈 라이브러리 활용(Thumbnailator)
 */
package kr.co.mlec.fileupload;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;

import net.coobird.thumbnailator.Thumbnails;

@WebServlet("/fileupload/test04.do")
public class Test04 extends HttpServlet {
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		SimpleDateFormat sdf = new SimpleDateFormat("/yyyy/MM/dd/HH");
		String filePath = "/board" + sdf.format(new Date());
		File file = new File("c:/java/upload" + filePath);
		if (file.exists() == false) file.mkdirs();
		
		MultipartRequest request = new MultipartRequest(
				req, 
				file.getPath(),  
				1024 * 1024 * 100, 
				"utf-8",  
				new MlecFileRenamePolicy()  
		);
		
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
				
				// 썸네일 이미지 생성하기
				Thumbnails.of(new File(f.getParent(), systemName))
				          .size(300, 200)
				          .outputFormat("jpg")
				          .toFile(new File(f.getParent(), "thumb_" + systemName));
			}
		}
		System.out.println("파일 업로드 성공");
	}
}










