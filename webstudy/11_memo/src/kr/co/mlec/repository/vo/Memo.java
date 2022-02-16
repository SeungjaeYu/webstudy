package kr.co.mlec.repository.vo;

import java.util.Date;

public class Memo {
	private int no;
	private String content;
	public Memo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Memo(int no, String content) {
		super();
		this.no = no;
		this.content = content;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "Memo [no=" + no + ", content=" + content + "]";
	}
	
	
	
	
}
