package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.annotations.Insert;

import kr.co.mlec.common.db.MyAppSqlConfig;
import kr.co.mlec.repository.dao.MemberDAO;

@WebServlet("/basic/test06.do")
public class Test06 extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html; charset=utf-8");
		String id = req.getParameter("id");
		
		MemberDAO dao = MyAppSqlConfig.getSqlSessionInstance().getMapper(MemberDAO.class);
		
		int cnt = dao.selectIdCount(id);
		PrintWriter out = res.getWriter();
		out.println(cnt);
		
		
//		out.println(cnt == 0 ? "사용할 수 있는 아이디 입니다." : "사용중인 아이디 입니다.");
		
		out.close();
		
	}
	

}
