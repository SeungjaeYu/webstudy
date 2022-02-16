package ch08_method.exam;

public class Message {
	private int no;
	private String sender;
	private String sendDate = "2011-11-11 10:10:10";
	private String content;
	private String readDate = "2011-11-11 11:11:11";
	private boolean readYN;
	private int status = 0;  // 1. 보낸사람만 삭제  2. 받은사람만 삭제  3. 둘다 삭제
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getSendDate() {
		return sendDate;
	}
	public void setSendDate(String sendDate) {
		this.sendDate = sendDate;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getReadDate() {
		return readDate;
	}
	public void setReadDate(String readDate) {
		this.readDate = readDate;
	}
	public boolean isReadYN() {
		return readYN;
	}
	public void setReadYN(boolean readYN) {
		this.readYN = readYN;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
