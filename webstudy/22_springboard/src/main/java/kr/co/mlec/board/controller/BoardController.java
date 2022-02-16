package kr.co.mlec.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.co.mlec.board.service.BoardService;
import kr.co.mlec.repository.vo.Board;
import kr.co.mlec.repository.vo.Comment;

@Controller("kr.co.mlec.board.controller.BoardController")
@RequestMapping("/board")
public class BoardController {
	
	
	@Autowired
	private BoardService service;
	
	
	
	@RequestMapping("/comment_delete.do")
	@ResponseBody
	public List<Comment> commentDeleteAjax(Comment comment) {
		return service.commentDelete(comment);
				
	}
	
	@RequestMapping("/comment_list.do")
	@ResponseBody
	public List<Comment> commentListAjax(int no) {
		return service.selectComment(no);
	}
	
	@RequestMapping("/comment_regist.do")
	@ResponseBody
	public List<Comment> commentRegistAjax(Comment comment) {
		return service.insertComment(comment);
	}
	
	@RequestMapping("/comment_update.do")
	@ResponseBody
	public List<Comment> commentUpdateAjax(Comment comment) {
		return service.updateComment(comment);
	}
	
	@GetMapping("/delete.do")
	public String boardDelete(int no) {
		// 데이터베이스 처리하기
		service.deleteBoard(no); 
		return "redirect:list.do";
	}
	
	@GetMapping("/detail.do")
	public void boardDetail(int no, Model model) {
		// 게시물 상세 정보 조회하기
		model.addAttribute("board", service.selectOneBoard(no));
	}
	
	@GetMapping("/list.do")
	public void boardList(@RequestParam(value="pageNo", defaultValue="1") int pageNo, Model model) {
		System.out.println(pageNo);
		// 데이터를 구하고 공유
		model.addAttribute("list", service.list());
	}
	
	@PostMapping("/update.do")
	public String boardUpdate(Board board) {
		// 파라미터 정보를 읽어 데이터베이스에 저장하기
		service.updateBoard(board);
		return "redirect:list.do";
	}
	
	@GetMapping("/updateform.do")
	public void boardUpdateForm(int no, Model model) throws Exception {
		model.addAttribute("board", service.selectOneBoard(no));
	}
	
	@PostMapping("/write.do")
	public String boardWrite(Board board) {
		service.insertBoard(board);
		return "redirect:list.do";
	}
	
	@GetMapping("/writeform.do")
	public void boardWriteForm() {}
	
}
