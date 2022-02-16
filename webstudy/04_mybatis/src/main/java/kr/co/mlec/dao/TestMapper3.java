package kr.co.mlec.dao;

import java.util.List;

import kr.co.mlec.domain.Account;
import kr.co.mlec.domain.Board;
import kr.co.mlec.domain.Comment;
import kr.co.mlec.domain.File;
import kr.co.mlec.domain.Member;

//마이바티스가 구현클래스를 만들게 하기
public interface TestMapper3 {
	public void insertBoard1(Board board);
	public void insertBoard2(Board board);
	int selectBoardNo();
	
	List<Member> selectMemberList();
	Account selectMemberAccountById(String id);
	
	
	
	public void insertFile(File file);
	
	List<Board> selectBoardList1();
	List<Comment> selectCommentList1();
	List<Comment> selectCommentList2ByNo(int no);
	
	
	
	
	
}






