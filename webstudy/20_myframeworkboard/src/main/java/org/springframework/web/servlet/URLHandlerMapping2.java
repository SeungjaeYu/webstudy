package org.springframework.web.servlet;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.annotation.RequestMapping;


public class URLHandlerMapping2 {
	
	private Map<String, CtrlAndMethod> mappings = new HashMap<>();
	public URLHandlerMapping2(String ctrlNames) throws Exception {
		String[] params = ctrlNames.split(";");
		for (String param : params) {
			Class<?> clz = Class.forName(param.trim());
			Object target = clz.newInstance();
			
			Method[] methods = clz.getDeclaredMethods();
			for (Method method : methods) {
				RequestMapping rm = method.getAnnotation(RequestMapping.class);
				if (rm == null) continue;	// 메서드에 RequestMapping 어노테이션이 없으면 스킵
				mappings.put(rm.value(), new CtrlAndMethod(target, method));
			}
			
			
//			String[] p = param.trim().split("=");
//			mappings.put(p[0],(Controller) (Class.forName(p[1]).newInstance()));
		}
	}
	
	public CtrlAndMethod getController(String uri) {
		return mappings.get(uri);
	}
	
}
