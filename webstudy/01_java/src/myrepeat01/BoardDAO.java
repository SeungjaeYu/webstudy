package myrepeat01;

public class BoardDAO {
	ObjectArrayList list = new ObjectArrayList();
	int boardNo=0;
	
	
	ObjectArrayList selectBoard() {
		return list;
	}
	
	
	Board selectOneBoard(int no) {
		for(int i = 0; i < list.size(); i++) {
			Board b = (Board)list.get(i);
			if(b.getNo() != no) continue;
			
			return b;
		}
		return null;
	}
	
	
	public void insertBoard(Board board) {
		if(board.getNo() == 0) {
			board.setNo(++boardNo);
		}
		list.add(board);
	}
	
	public void updateBoard(Board board) {
		for (int i = 0; i < list.size(); i++) {
			Board b = (Board) list.get(i);
			if (b.getNo() != board.getNo())
				continue;

			b.setTitle(board.getTitle());
			b.setContent(board.getContent());
			return;
		}

	}
	
	
	public int delete(int no) {
		for(int i = 0; i < list.size(); i++) {
			Board b = (Board)list.get(i);
			if(b.getNo() != no) continue;
			
			list.remove(i);
			return 1;
		}
		return 0;
	}
	
	
	
	
	
	

}
