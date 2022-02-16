package kr.co.mlec.repository.vo;

import java.util.Date;

public class Board {
	private int no;
	private String writer;
	private String title;
	private String content;
	private int viewCnt;
	private Date regDate;
	
	public int getViewCnt() {
		return viewCnt;
	}
	public Board setViewCnt(int viewCnt) {
		this.viewCnt = viewCnt;
		return this;
	}
	public int getNo() {
		return no;
	}
	public Board setNo(int no) {
		this.no = no;
		return this;
	}
	public String getWriter() {
		return writer;
	}
	public  Board  setWriter(String writer) {
		this.writer = writer;
		return this;
	}
	public String getTitle() {
		return title;
	}
	public  Board  setTitle(String title) {
		this.title = title;
		return this;
	}
	public String getContent() {
		return content;
	}
	public  Board  setContent(String content) {
		this.content = content;
		return this;
	}
	public Date getRegDate() {
		return regDate;
	}
	public  Board  setRegDate(Date regDate) {
		this.regDate = regDate;
		return this;
	}
}
