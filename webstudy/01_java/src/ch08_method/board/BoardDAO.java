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
package ch08_method.board;

import java.util.Arrays;

public class BoardDAO {
	// 게시물
	// ---------------------------
	// 입력의 수 =>
	
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
		// 데이터 관리 배열
		// 공간이 꽉 찼다면 크기를 늘려서 사용한다.
		// 배열은 고정되어있다. 변경 X 새로운 배열을 만들어서 그 배열에 복사시켜야한다
		// 늘려준 공간을 사용해야 한다 기존의 공간은 arr 을 새롭게 생성된 공간으로 주소를 바꿔줘야한다

		if (boardArr.length == boardPos) {
			// 새롭게 확보하고 복사한 배열을 다시 대입해준다 공간확장
			boardArr = Arrays.copyOf(boardArr, boardPos * 2);

		} // -1을 넘어가면 입력공간이 없다고 생각하라

		// just 등록

		// 게시물 번호
		// 1로 바꾼다음에 저장하기위해 ++이 앞
		// 삭제 수정을 위해 setNo 글 번호를 넘겨준다
		board.setNo(++boardNo);

		// 게시글 개수 올리기 : 데이터저장 처리 이후에는 1씩 증가시키기
		boardArr[boardPos++] = board;

	}
	

	void upDateBoard(Board board) { //수정 여러개
		for (int i = 0; i < boardPos; i++) {
			Board b = boardArr[i];

			if (b.getNo() != board.getNo()) continue;
		    
			//배열에 있는  제목과 내용을 넘겨줬으니까
			//값 설정                       값 갖고오기
			b.setTitle(board.getTitle());
			b.setContent(board.getContent());
			return;
		}
		//못찾았다
//		return null;
		
		
	}
	int deleteBoard(int no) {
		//no의 값을 찾았다면 삭제후 앞으로 한 칸씩 당기는 것을 해야한다
		for (int i = 0; i < boardPos; i++) {
			Board b = boardArr[i];
			if(b.getNo() != no) continue;
			//한칸만 옮길꺼라 1
			System.arraycopy(boardArr, i+1, boardArr, i, 1);
			//마지막 자리에 null값 주기
			boardArr[--boardPos] = null;
			//하나가 삭제되었다
			return 1;
			
		}
		//0개가 삭제되었다
			return 0;
			
	}
	
	

}
