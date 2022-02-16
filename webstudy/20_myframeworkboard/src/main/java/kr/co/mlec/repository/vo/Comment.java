package kr.co.mlec.repository.vo;

import java.util.Date;

import lombok.Data;

@Data
public class Comment {
	private int commentNo;
	private int no;
	private String content;
	private String writer;
	private Date regDate;
	
}
