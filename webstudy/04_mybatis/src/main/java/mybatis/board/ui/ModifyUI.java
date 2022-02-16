package mybatis.board.ui;

import mybatis.board.dao.BoardDAO;
import mybatis.board.vo.Board;

public class ModifyUI extends BaseUI {
	private BoardDAO dao;
	public ModifyUI(BoardDAO dao) {
		this.dao = dao;
	}
	
	
	public void service() {
		
		
		Board board = dao.selectOneBoard(getInt("수정할 글번호를 입력하세요 : "));
		if (board == null) {
			System.out.println("해당 게시물이 존재하지 않습니다.");
			return;
		}
		// 글번호가 존재할때 사용자에게 수정할 내용을 받는다.
		board.setTitle(getString("제목을 입력하세요 : "));
		board.setContent(getString("내용을 입력하세요 : "));
		
		dao.updateBoard(board);
		
		System.out.println();
		System.out.println("게시글이 수정되었습니다.");	
	}

}
