package org.springframework.web.servlet;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Properties;

import javax.servlet.http.HttpServletRequest;

public class WebUtil {
	public static Object getVoToParameter(Class<?> clz, HttpServletRequest req) throws Exception {
		Object target = clz.newInstance();
		Method[] mArr = clz.getDeclaredMethods();
		for (Method m : mArr) {
			// setNo
			String mName = m.getName();
			if (!mName.startsWith("set")) continue;
			// No
			mName = mName.substring("set".length());
			// no
			mName = Character.toLowerCase(mName.charAt(0)) + mName.substring(1);
			
			String[] pValue = req.getParameterValues(mName);
			if (pValue == null) continue;
			
			switch (m.getParameterTypes()[0].getName()) {
			case "[Ljava.lang.String;":	// 문자열 배열
				m.invoke(target, new Object[] {pValue});
				break;
			case "java.util.List":	// 리스트 배열
				m.invoke(target, Arrays.asList(pValue));
				break;
			case "int":
				m.invoke(target, Integer.parseInt(pValue[0]));
				break;
			default:
				m.invoke(target, pValue[0]);
			}
		}
		return target;
	}
}











