package ch25_reflection;

import java.lang.reflect.Method;
import java.util.Properties;

public class WebUtil {
	public static Object getVoToParameter(Class<?> clz, Properties prop) throws Exception {
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
			
			String pValue = prop.getProperty(mName);
			if (pValue == null) continue;
			
			switch (m.getParameterTypes()[0].getName()) {
			case "int":
				m.invoke(target, Integer.parseInt(pValue));
				break;
			default:
				m.invoke(target, pValue);
			}
		}
		return target;
	}
}











