package basic;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/basic/test04.do")
public class Test04 extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		List<String> list = new ArrayList<>();
		list.add("hong");
		list.add("kim");
		list.add("park");
		req.setAttribute("list", list);
		RequestDispatcher rd = req.getRequestDispatcher("test04.jsp");
		rd.forward(req, res);
	}
	

}
