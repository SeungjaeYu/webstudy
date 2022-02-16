/**
 * Data 의 처리 클래스
 * 
 * CRUD -> 
 * CREATE  : insert + 기능
 * READ    : select + 기능,  selectOne + 기능
 * UPDATE  : update + 기능
 * DELETE  : delete + 기능
 */
package kr.co.mlec.repository.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import kr.co.mlec.repository.vo.Board;


public interface BoardDAO {
	
	List<Board> selectBoard();
		
	public Board selectOneBoard(int no);
	
	void updateViewCnt(int no);
	
	void insertBoard(Board board);

	void updateBoard(Board board);
     
	public void deleteBoard(int no);

}












