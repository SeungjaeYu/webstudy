package org.springframework.web.servlet;

import java.io.File;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.annotation.Controller;
import org.springframework.web.annotation.RequestMapping;

public class URLHandlerMapping {
	private Map<String, CtrlAndMethod> mappings = new HashMap<>();
	private List<String> ctrlNameList = new ArrayList<>();
	private String packagePath;
	
	public URLHandlerMapping() {}
	public URLHandlerMapping(String scanPackage) throws Exception {
		getCtrlNameList(scanPackage);
		addMap();
	}

	private void addMap() throws Exception {
		for (String ctrlName : ctrlNameList) {
			Class<?> clz = Class.forName(ctrlName.trim());
			Object target = clz.newInstance();
			Method[] mArr = clz.getDeclaredMethods();
			for (Method method : mArr) {
				RequestMapping rm = method.getAnnotation(RequestMapping.class);
				if (rm == null) continue;
				
				mappings.put(
					rm.value(), new CtrlAndMethod(target, method)
				);
			}
		}
	}
	
	/**
	 * scanPackage 밑의 모든 클래스 중에서 @Controller 어노테이션이
	 * 설정된 컨트롤 클래스를 찾아서 ctrlNameList에 추가한다.
	 * @param scanPackage
	 */
	private void getCtrlNameList(String scanPackage) throws Exception {
		URL url = this.getClass()
					  .getClassLoader()
					  .getResource(scanPackage.replace(".", "\\"));
//		// System.out.println("url.toURI() : " + url.toURI());

		File f = new File(url.toURI());
		packagePath = f.getPath().replace(scanPackage.replace(".", "\\"), "");
//		// System.out.println("packagePath : " + packagePath);
		
		File[] fileList = f.listFiles();
		for (File file : fileList) {
			getClassNameByPackage(file);
		}
	}
	
	/**
	 * file 이 만약 디렉토리라면 디렉토리 하위의 모든 파일들을 찾는다.
	 * file 이 파일 이라면 파일의 이름을 추출해서 클래스 패키지 형태로 변환
	 * @param file
	 */
	private void getClassNameByPackage(File file) 
			throws Exception {
		if (file.isDirectory()) {
			File[] fileList = file.listFiles();
			for (File f : fileList) {
				getClassNameByPackage(f);
			}
		}
		else if (file.isFile()) {
			String fPath = file.getPath();
			// System.out.println("fPath : " + fPath);
			String className = fPath.substring(0, fPath.lastIndexOf("."))   
					                .replace(packagePath, "")
					                .replace("\\", ".");
			// System.out.println("className : " + className);
			
			// 어노테이션이 선언된 경우만 리스트에 추가
			if (isControllerAnno(className)) {
				ctrlNameList.add(className);
			}
		}
	}
	
	/**
	 * 매개변수에 넘어온 클래스에 @Controller 어노테이션이 선언되어 있는지
	 * 판단
	 * @param className : 패키지를 포함한 클래스명
	 * @return
	 */
	private boolean isControllerAnno(String className) throws Exception {
		return Class.forName(className).getAnnotation(Controller.class) != null;
	}
	public CtrlAndMethod getController(String uri) {
		return mappings.get(uri);
	}
}












