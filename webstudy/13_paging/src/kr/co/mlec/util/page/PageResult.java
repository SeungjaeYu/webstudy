package kr.co.mlec.util.page;

public class PageResult {
	private int pageNo;
	private int count;
	
	private int beginPage;
	private int endPage;
	
	private boolean prev;
	private boolean next;
	
	public PageResult(int pageNo, int count) {
		this(pageNo, count, 10, 10);
	}
	public PageResult(int pageNo, int count, int listSize, int tabSize) {
		this.pageNo = pageNo;
		this.count = count;
		// 마지막 페이지
		int lastPage = (int)Math.ceil(count / (double)listSize);
		int currTab = (pageNo - 1) / tabSize + 1; 
		this.beginPage = (currTab - 1) * tabSize + 1;
		this.endPage = currTab * tabSize;
		if (this.endPage > lastPage) this.endPage = lastPage;
		
		this.prev = this.beginPage != 1;
		this.next = this.endPage != lastPage;
	}
	
	public int getPageNo() { return pageNo;	}
	public int getCount() {	return count; }
	public int getBeginPage() {	return beginPage; }
	public int getEndPage() { return endPage; }
	public boolean getPrev() { return prev; }
	public boolean getNext() { return next;	}
	
}
