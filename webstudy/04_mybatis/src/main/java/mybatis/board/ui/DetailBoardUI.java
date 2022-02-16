package mybatis.board.ui;



import mybatis.board.dao.BoardDAO;
import mybatis.board.vo.Board;

public class DetailBoardUI extends BaseUI{
	private BoardDAO dao;
	public DetailBoardUI(BoardDAO dao) {
		this.dao = dao;
	}
	
	public void service() {
	
		int no = getInt("조회할 글번호를 입력하세요 : ");
		
		// dao 글번호에 해당하는 게시물 요청
		Board b = dao.selectOneBoard(no);
		System.out.println("-------------------------------");
		if (b != null) {
			System.out.println("번호 : " + no);
			System.out.println("글쓴이 : " + b.getWriter());
			System.out.println("제목 : " + b.getTitle());
			System.out.println("내용 : " + b.getContent());
			System.out.println("작성일시 : " + b.getRegDate());
			System.out.println("-------------------------------");		
			return;
		}
		System.out.println("입력된 번호는 존재하지 않습니다.");	
		System.out.println("-------------------------------");		
	}

}
