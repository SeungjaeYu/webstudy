package org.springframework.web.servlet;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.annotation.RequestParam;

public class PreProcess {
	/**
	 * 
	 * 메서드의 파라미터 정보를 추출하고
	 * 추출된 파라미터에 해당하는 HttpServletRequest 객체에서 뽑는다.
	 * rArr 배열에 추가한다.
	 * 
	 * detail(int no)
	 * 1. int no
	 * 2. req.getParameter("no");
	 * 3. rArr[?] = req.getParameter("no");
	 * @param m
	 * @param req
	 * @return
	 * @throws Exception
	 */
	public Object[] process(Method m, HttpServletRequest req) throws Exception {
		Parameter[] pArr = m.getParameters();
		Object[] rArr = new Object[pArr.length];
		int index = 0;
		for (Parameter param : pArr) {
			// 메서드의 타입 정보 가져오기
			Class<?> tClz = param.getType();
			String tName = tClz.getSimpleName();
			String name = param.getName();
			
			RequestParam rp = param.getAnnotation(RequestParam.class);
			String defaultValue = "";
			if (rp != null) {
				name = rp.value();
				defaultValue = rp.defaultValue();
			}
			switch (tName) {
			case "String":
				rArr[index++] = req.getParameter(name) == null ? defaultValue : req.getParameter(name);
				break;
			case "int":
			case "Integer":
				rArr[index++] = Integer.parseInt(req.getParameter(name) == null ? defaultValue : req.getParameter(name));
				break;
			case "HttpServletRequest":
				rArr[index++] = req;
				break;
			case "HttpSession":
				rArr[index++] = req.getSession();
				break;
			default:
				rArr[index++] = WebUtil.getVoToParameter(tClz, req);
				break;
			}
			
		}
		
		return rArr;
	}
}
