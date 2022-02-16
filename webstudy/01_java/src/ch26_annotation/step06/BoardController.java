package ch26_annotation.step06;

public class BoardController {
	
	@RequestMapping("/board/list.do")
	public void list() {
		System.out.println("board - list 메서드 실행");
	}
	@RequestMapping("/board/detail.do")
	public void detail() {
		System.out.println("board - detail 메서드 실행");
	}
}
