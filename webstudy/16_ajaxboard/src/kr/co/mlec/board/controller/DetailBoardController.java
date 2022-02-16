package kr.co.mlec.board.controller;



import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.mlec.common.db.MyAppSqlConfig;
import kr.co.mlec.repository.dao.BoardDAO;
import kr.co.mlec.repository.dao.CommentDAO;
import kr.co.mlec.repository.vo.Board;
import kr.co.mlec.util.FileUtil;



@WebServlet("/board/detailform.do")
public class DetailBoardController extends HttpServlet {
	private BoardDAO dao;
	public DetailBoardController() {
		this.dao = MyAppSqlConfig.getSqlSessionInstance().getMapper(BoardDAO.class);

	}
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	
		
//		int no = getInt("조회할 글번호를 입력하세요 : ");
		
		// dao 글번호에 해당하는 게시물 요청
		dao.updateViewCnt(Integer.parseInt(req.getParameter("no")));
		Board board = dao.selectOneBoard(Integer.parseInt(req.getParameter("no")));
		
		req.setAttribute("board", board);
		
		
		
		
		req.getRequestDispatcher("/jsp/board/detailform.jsp").forward(req, res);
		
		
//		String path = context.getRealPath("/board/detailform.html");
//		System.out.println(path);
//		
//		// list.html 파일의 내용을 읽어서 #count, #tdata 부분을 변경한다.
//		String content = FileUtil.readFile(path);
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//		content = content.replace("#no", String.valueOf(b.getNo())).replace("#writer", b.getWriter())
//				.replace("#regDate", sdf.format(b.getRegDate())).replace("#viewCnt", String.valueOf(b.getViewCnt()))
//				.replace("#content", b.getContent()).replace("#title", b.getTitle());
//		out.println(content);
//		out.close();
//		System.out.println("-------------------------------");
//		if (b != null) {
//			System.out.println("번호 : " + no);
//			System.out.println("글쓴이 : " + b.getWriter());
//			System.out.println("제목 : " + b.getTitle());
//			System.out.println("내용 : " + b.getContent());
//			System.out.println("작성일시 : " + b.getRegDate());
//			System.out.println("-------------------------------");		
//			return;
//		}
//		System.out.println("입력된 번호는 존재하지 않습니다.");	
//		System.out.println("-------------------------------");		
	}

}
