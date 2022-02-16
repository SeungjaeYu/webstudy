package kr.co.mlec.board.service;

import java.util.List;

import kr.co.mlec.repository.vo.Board;
import kr.co.mlec.repository.vo.Comment;

public interface BoardService {
	List<Board> list();
	List<Comment> commentDelete(Comment comment);
	List<Comment> selectComment(int no);
	List<Comment> insertComment(Comment comment);
	List<Comment> updateComment(Comment comment);
	void deleteBoard(int no);
	Board selectOneBoard(int no);
	void updateBoard(Board board);
	void insertBoard(Board board);
	
}
