package jdbc.board.ui;

import java.util.List;

import jdbc.board.dao.BoardDAO;
import jdbc.board.vo.Board;

public class ListBoardUI extends BaseUI{
	private BoardDAO dao;
	public ListBoardUI(BoardDAO dao) {
		this.dao = dao;
	}
	
	
	public void service() {
		// 화면에 출력할 전체 게시물..
		// dao에게 전체게시물 목록을 요청한다.
		List<Board> list = dao.selectBoard();
		
		System.out.println("전체 " + list.size() + "개");
		System.out.println("-------------------------------");
		System.out.println("번호 글쓴이 제목  작성일");
		System.out.println("-------------------------------");
		if (list.isEmpty()) {
			System.out.println("게시물이 없습니다.");
		}
	
		for (Board b : list) {
			System.out.printf("%3d %10s %20s %15s\n", b.getNo(), b.getWriter(), b.getTitle(), b.getRegDate());
		}
		System.out.println("-------------------------------");		
	}
	
	

}
