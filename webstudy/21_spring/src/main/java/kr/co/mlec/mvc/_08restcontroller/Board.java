package kr.co.mlec.mvc._08restcontroller;

import java.util.Date;

import lombok.Data;

@Data
public class Board {
	private int no;
	private String writer;
	private String title;
	private String content;
	private int viewCnt;
	private Date regDate;
	
}
