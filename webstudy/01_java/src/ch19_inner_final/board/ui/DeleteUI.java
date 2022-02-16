package ch19_inner_final.board.ui;

import ch19_inner_final.board.dao.BoardDAO;

public class DeleteUI extends BaseUI {
	private BoardDAO dao;
	public DeleteUI(BoardDAO dao) {
		this.dao = dao;
	}
	
	
	public void service() {
		int result = dao.deleteBoard(getInt("삭제할 글번호를 입력하세요 : "));
		if (result == 1) {
			System.out.println();
			System.out.println("게시글이 삭제되었습니다.");
			return;
		}
		System.out.println("해당 게시물이 존재하지 않습니다.");
	}
	

}
