package kr.co.mlec.repository.dao;

import java.util.List;

import kr.co.mlec.repository.vo.Board;
import kr.co.mlec.repository.vo.Page;

public interface BoardDAO {
	// 전체 게시글 조회
	List<Board> selectBoard(Page page);
	// 전체 게시글 갯수
	int selectBoardCount();
}














