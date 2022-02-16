package kr.co.mlec.servlet.basic;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/basic/test11.do")
public class Test11 extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		Map<String, String[]> paramMap = req.getParameterMap();
		Set<String> keys = paramMap.keySet();
		for (String key : keys) {
			System.out.println("key : " + key);
			String[] values = paramMap.get(key);
			for (String value : values) {
				System.out.println("value : " + value);
			}
		}
		
		
	}
}
