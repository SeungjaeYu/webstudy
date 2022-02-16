package cors;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cors/test.do")
public class Test extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html; charset=utf-8");
		
		// http://localhost:9080/18_jquery_apiserver/cors/test01.do
		URL url = new URL("http://localhost:9080/18_jquery_apiserver/cors/test01.do");
		Scanner sc = new Scanner(url.openStream());
		PrintWriter out = res.getWriter();
		while (sc.hasNextLine()) {
			out.write("proxy : " + sc.nextLine());
		}
		sc.close();
		out.close();
	}
	
}
