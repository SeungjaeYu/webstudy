package mybatis.board.ui;

import java.util.Scanner;

import org.apache.ibatis.session.SqlSession;

import kr.co.mlec.common.db.MyAppSqlConfig;
import mybatis.board.dao.BoardDAO;
import mybatis.board.vo.Board;

public class BoardUI {
	
	private BoardDAO dao;
	
	Scanner sc = new Scanner(System.in);
	
	//생성자 만든다
	public  BoardUI() {
		SqlSession session = MyAppSqlConfig.getSqlSessionInstance();
		dao = session.getMapper(BoardDAO.class);
	}
	// 로그인 사용자 아이디
	String loginId = "hong";
	

	void exit() {
		sc.close();
		// 프로세스 종료
		System.out.println("게시판 시스템을 종료합니다.");
		System.exit(0);
	}
	
	int menu() {
		System.out.println("-----------------");
		System.out.println("1. 전체 조회");
		System.out.println("2. 글번호 조회");
		System.out.println("3. 글등록");
		System.out.println("4. 글수정");
		System.out.println("5. 글삭제");
		System.out.println("0. 종료");
		System.out.println("-----------------");
		System.out.print("메뉴 중 처리할 항목을 선택하세요 : ");
		return Integer.parseInt(sc.nextLine());	
	}
	
	public void service() {
		System.out.println("-----------------");
		System.out.println("자바로 구현하는 게시판 프로젝트");
		System.out.println("-----------------");
		
		BaseUI ui = null;
		
		while (true) {
			switch (menu()) {
			case 1: ui = new ListBoardUI(dao);
			        break;
			case 2: ui = new DetailBoardUI(dao);	
			        break;
			case 3:  
			        ui = new WriteBoardUI(dao);
			        break;
			case 4: ui = new ModifyUI(dao);
			        break;
			case 5: ui = new DeleteUI(dao);
			        break;
			case 0: exit();
			default:
				System.out.println("잘못된 메뉴번호 입니다.");
				System.out.println("다시 선택해 주세요.");
			}
			if(ui != null) ui.service();
		}		
	}
}
