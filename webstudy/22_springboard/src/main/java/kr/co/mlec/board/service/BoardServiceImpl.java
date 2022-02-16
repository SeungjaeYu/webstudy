package kr.co.mlec.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.mlec.repository.dao.BoardDAO;
import kr.co.mlec.repository.vo.Board;
import kr.co.mlec.repository.vo.Comment;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	private BoardDAO dao;
	
	public List<Board> list() {
		return dao.selectBoard();
	}
	
	public List<Comment> commentDelete(Comment comment) {
		dao.deleteComment(comment.getCommentNo());
		// 댓글 목록 공유
		return dao.selectComment(comment.getNo());
	}
	public List<Comment> selectComment(int no) {
		// 댓글 목록 공유
		return dao.selectComment(no);
	}
	
	public List<Comment> insertComment(Comment comment) {
		dao.insertComment(comment);
		return dao.selectComment(comment.getNo());
	}
	
	public List<Comment> updateComment(Comment comment) {
		dao.updateComment(comment);
		return dao.selectComment(comment.getNo());
	}
	public void deleteBoard(int no) {
		dao.deleteBoard(no);
	}
	
	public Board selectOneBoard(int no) {
		dao.updateViewCnt(no);
		return dao.selectOneBoard(no);
	}
	public void updateBoard(Board board) {
		dao.updateBoard(board);
	}
	
	public void insertBoard(Board board) {
		dao.insertBoard(board);
	}
	
}
