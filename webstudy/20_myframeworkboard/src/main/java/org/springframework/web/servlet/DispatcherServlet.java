package org.springframework.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;


public class DispatcherServlet extends HttpServlet {

	private URLHandlerMapping uhm;
	private String prefix, suffix;
	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("DispastcherServlet - init");
		prefix = config.getInitParameter("prefix");
		suffix = config.getInitParameter("suffix");
		String ctrlNames = config.getInitParameter("controllers");
		try {
			uhm = new URLHandlerMapping(ctrlNames);
		} catch (Exception e) {
			throw new ServletException(e);
		}
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		try {
			// /main.do의 요청이 오게되면
			// MainController 에게 작업처리를 맡긴다.(호출)
			
			// 사용자 요청 URL 정보 출력
			String contextPath = req.getContextPath();	//	/20_myframeworkboard
			String requestURI = req.getRequestURI();
			requestURI = requestURI.substring(contextPath.length());
//			System.out.println(requestURI);
			
			CtrlAndMethod cam = uhm.getController(requestURI);
			if (cam == null) {
				throw new ServletException("잘못된 URL을 호출하였습니다.");
			}
			Object target = cam.getTarget();
			Method m = cam.getMethod();
			
			PreProcess pp = new PreProcess();
			Object[] param = pp.process(m, req);
			
			// uri 가 .json으로 끝날 경우 중간에 Ajax 처리하여 리턴
			if (requestURI.endsWith(".json")) {
				Object obj = m.invoke(target, param);
				res.setContentType("application/json; charset=utf-8");
				PrintWriter out = res.getWriter();
				out.println(new Gson().toJson(obj));
				out.close();
				return;
			}
			
			Class<?> rType = m.getReturnType();
			String rName = rType.getSimpleName();
			ModelAndView mav = null; 
			String view = null;
			switch (rName) {
			case "ModelAndView":
				mav = (ModelAndView) m.invoke(target, param);
				view = mav.getView();
				break;
			case "String":
				view = (String) m.invoke(target, param);
				break;
			case "void":
				m.invoke(target, param);
				view = requestURI.substring(1).replace(".do", "");
				break;
			}
			
			if (view.startsWith(WebConstants.REDIRECT)) {
				res.sendRedirect(view.substring(WebConstants.REDIRECT.length()));
			} else {
				if (mav != null) {
					// forward일 경우 ModelAndView 맵의 데이터를 화면에 공유
					Map<String, Object> model = mav.getModel();
					// 맵의 모든 키에 해당하는 값을 공유
					Set<String> keys = model.keySet();
					for (String key : keys) {
						req.setAttribute(key, model.get(key));					
					}
				}
				req.getRequestDispatcher(prefix + view + suffix).forward(req, res);
			}
			
		} catch (Exception e) {
			throw new ServletException(e);
		}
	}
	
}
