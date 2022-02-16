package kr.co.mlec.board.controller;

import java.util.List;

import org.springframework.web.annotation.Controller;
import org.springframework.web.annotation.RequestMapping;
import org.springframework.web.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.WebConstants;


import kr.co.mlec.board.service.BoardService;
import kr.co.mlec.repository.vo.Board;
import kr.co.mlec.repository.vo.Comment;

@Controller
public class BoardController {
	private BoardService service;
	
	public BoardController() {
		this.service = new BoardService();
	}
	
	@RequestMapping("/board/comment_delete.json")
	public List<Comment> commentDeleteAjax(Comment comment) {
		return service.commentDelete(comment);
				
	}
	
	@RequestMapping("/board/comment_list.json")
	public List<Comment> commentListAjax(int no) {
		return service.selectComment(no);
	}
	
	@RequestMapping("/board/comment_regist.json")
	public List<Comment> commentRegistAjax(Comment comment) {
		return service.insertComment(comment);
	}
	
	@RequestMapping("/board/comment_update.json")
	public List<Comment> commentUpdateAjax(Comment comment) {
		return service.updateComment(comment);
	}
	
	@RequestMapping("/board/delete.do")
	public String boardDelete(int no) {
		// 데이터베이스 처리하기
		service.deleteBoard(no); 
		return WebConstants.REDIRECT + "list.do";
	}
	
	@RequestMapping("/board/detail.do")
	public ModelAndView boardDetail(int no) {
		// 게시물 상세 정보 조회하기
		ModelAndView mav = new ModelAndView();
		mav.setView("board/detail");
		mav.addObject("board", service.selectOneBoard(no));
		return mav;
	}
	
	@RequestMapping("/board/list.do")
	public ModelAndView boardList(@RequestParam(value="pageNo", defaultValue="1") int pageNo) {
		System.out.println(pageNo);
		ModelAndView mav = new ModelAndView();
		// 데이터를 구하고 공유
		mav.setView("board/list");
		mav.addObject("list", service.list());
		// 사용할 화면으로 이동하기
		return mav;
	}
	
	@RequestMapping("/board/update.do")
	public String boardUpdate(Board board) {
		// 파라미터 정보를 읽어 데이터베이스에 저장하기
		service.updateBoard(board);
		return WebConstants.REDIRECT + "list.do";
	}
	
	@RequestMapping("/board/updateform.do")
	public ModelAndView boardUpdateForm(int no) {
		ModelAndView mav = new ModelAndView();
		mav.setView("board/updateform");
		mav.addObject("board", service.selectOneBoard(no));
		return mav;
	}
	
	@RequestMapping("/board/write.do")
	public String boardWrite(Board board) {
		service.insertBoard(board);
		return WebConstants.REDIRECT + "list.do";
	}
	
	@RequestMapping("/board/writeform.do")
	public void boardWriteForm() {}
	
}
