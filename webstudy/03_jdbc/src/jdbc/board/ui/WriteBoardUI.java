package jdbc.board.ui;



import jdbc.board.dao.BoardDAO;
import jdbc.board.vo.Board;

public class WriteBoardUI extends BaseUI{
	
	String loginId = "hong";
	private BoardDAO dao;
	
	
	public WriteBoardUI(BoardDAO dao) {
		this.dao = dao;
		
	}

	public void service() {
		Board b = new Board();
		b.setTitle(getString("제목을 입력하세요 : "));
		b.setContent(getString("내용을 입력하세요 : "));
		// 로그인 정보에 있는 이름으로 작성자를 설정한다.
		b.setWriter(loginId);
		
		dao.insertBoard(b);

		System.out.println();
		System.out.println("게시글이 등록되었습니다.");
	}
	
	

}
