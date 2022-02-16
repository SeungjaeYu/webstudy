package myrepeat01;

public class ListBoard extends BaseUI{
	
	private BoardDAO dao;
	
	public ListBoard(BoardDAO dao) {
		this.dao = dao;
	}
	
	
	public void service() {
		ObjectArrayList list = dao.selectBoard();
		System.out.println("전체 "+ list.size());
		if(list.isEmpty()) {
			System.out.println("글이 없습니다");
			return;
		}
		for(int i = list.size()-1 ; i >= 0 ; i--) {
			Board b = (Board)list.get(i);
			System.out.printf("%d %s %s %s", b.getNo(), b.getWriter(), b.getTitle(), b.getRegDate());
		}
	}

}
