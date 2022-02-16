package kr.co.mlec.mvc._04file;

import java.io.File;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

@Controller("kr.co.mlec.mvc._04file.Test")
@RequestMapping("/mvc/file")
public class Test {
	
	@RequestMapping("/upload01.do")
	public String upload01(String msg, MultipartFile attach) throws Throwable {
		System.out.println("msg : " + msg);
		
		if (attach.isEmpty()) return "redirect:/mvc/index04.jsp";
		
		String orgName = attach.getOriginalFilename();
		long size = attach.getSize();
		System.out.println("파일명 : " + orgName);
		System.out.println("파일크기 : " + size);
		attach.transferTo(new File("c:/java/upload/" + orgName));
		
		return "redirect:/mvc/index04.jsp";
	}
	
	@RequestMapping("/upload02.do")
	public String upload02(String msg, List<MultipartFile> attach) throws Throwable {
		System.out.println("msg : " + msg);
		System.out.println("attach.size() : " + attach.size());
//		System.out.println(attach.isEmpty());
		for (MultipartFile file : attach) {
		if (file.isEmpty()) continue;
			
		String orgName = file.getOriginalFilename();
		long size = file.getSize();
		System.out.println("파일명 : " + orgName);
		System.out.println("파일크기 : " + size);
		file.transferTo(new File("c:/java/upload/" + orgName));
		}
		
		return "redirect:/mvc/index04.jsp";
	}
	
	@RequestMapping("/upload03.do")
	public String upload03(FileVO fileVO) throws Throwable {
		System.out.println("msg : " + fileVO.getMsg());
//		System.out.println(attach.isEmpty());
		for (MultipartFile file : fileVO.getAttach1()) {
			if (file.isEmpty()) continue;
			
			String orgName = file.getOriginalFilename();
			long size = file.getSize();
			System.out.println("파일명 : " + orgName);
			System.out.println("파일크기 : " + size);
			file.transferTo(new File("c:/java/upload/" + orgName));
		}
		for (MultipartFile file : fileVO.getAttach2()) {
			if (file.isEmpty()) continue;
			
			String orgName = file.getOriginalFilename();
			long size = file.getSize();
			System.out.println("파일명 : " + orgName);
			System.out.println("파일크기 : " + size);
			file.transferTo(new File("c:/java/upload/" + orgName));
		}
		
		return "redirect:/mvc/index04.jsp";
	}
	
}
