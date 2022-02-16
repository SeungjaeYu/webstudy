package basic;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import kr.co.mlec.common.db.MyAppSqlConfig;
import kr.co.mlec.repository.dao.MemberDAO;
import kr.co.mlec.repository.vo.Member;

@WebServlet("/basic/test07.do")
public class Test07 extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html; charset=utf-8");
		
		MemberDAO dao = MyAppSqlConfig.getSqlSessionInstance().getMapper(MemberDAO.class);
		List<Member> list = dao.selectMember();
		PrintWriter out = res.getWriter();
		out.println(new Gson().toJson(list));
		out.close();
		
	}
	

}
