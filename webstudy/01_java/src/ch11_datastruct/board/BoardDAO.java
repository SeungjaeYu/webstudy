/**
 * data에 대한 class
 * 
 * CRUD -> 
 * CREATE : insert+기능명 ex) 회원등록 insertMember  
 * READ   : select + 기능명 하나갖고오기 상세  selectOne+기능 전체 갖고오기 목록 , 
 * UPDATE : delete + 기능명
 * DELETE :
 * 
 * 
 */
package ch11_datastruct.board;

import java.util.Arrays;

public class BoardDAO {
	
	BoardArrayList list = new BoardArrayList();
	//new BoardDAO();
	BoardDAO(){
		//Board.txt 의 파일을 읽어서 list에 데이터를 add하는 작업
		
	}
	
	
	// 게시물
	// ---------------------------
	// 입력의 수 =>
	
	
	
	//BoardArrayList 호출해라..
	Board[] boardArr = new Board[10];
	// 게시물 위치 정보
	int boardPos = 0;
	int boardNo = 0;

	// ---------------------------

	/**
	 * 전체 게시글 찍는 것
	 * @return
	 */
	
	Board[] selectBoard(){
		//문제가된다 
		//카피한 값으로 리턴해라
		return Arrays.copyOf(boardArr, boardPos); // 
	} //전체
	
	/**
	 * 게시글 하나를 찾는 것
	 */
	Board selectOneBoard(int no) {
		
		for (int i = 0; i < boardPos; i++) {
			Board b = boardArr[i];

			if (b.getNo() != no) continue;
		//게시물 넘기기
			return b;
		}
		//못찾았다
		return null; 
	} //회원정보

	void insertBoard(Board board) {
		if (boardArr.length == boardPos) {
			boardArr = Arrays.copyOf(boardArr, boardPos * 2);
		} 

		board.setNo(++boardNo);

		boardArr[boardPos++] = board;

	}
	

	void upDateBoard(Board board) { //수정 여러개
		for (int i = 0; i < boardPos; i++) {
			Board b = boardArr[i];

			if (b.getNo() != board.getNo()) continue;
			
			b.setTitle(board.getTitle());
			b.setContent(board.getContent());
			return;
		}

		
	}
	int deleteBoard(int no) {
		
		for (int i = 0; i < boardPos; i++) {
			Board b = boardArr[i];
			if(b.getNo() != no) continue;

			System.arraycopy(boardArr, i+1, boardArr, i, 1);
			
			boardArr[--boardPos] = null;                                           

			return 1;
			
		}
	
			return 0;
			
	}
	
	

}
