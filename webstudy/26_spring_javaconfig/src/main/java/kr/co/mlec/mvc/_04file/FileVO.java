package kr.co.mlec.mvc._04file;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class FileVO {
	private String msg;
	private List<MultipartFile> attach1;
	private MultipartFile[] attach2;
}







