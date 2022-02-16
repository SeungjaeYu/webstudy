package web.util;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;

public class HttpServletRequest {
	private InputStream in;
	private String method;
	private String requestURI;
	private String queryString;
	private Map<String, String> paramMap = new HashMap<>();
	
	public HttpServletRequest(InputStream in) throws Exception {
		this.in = in;
		// 시작라인 분석 및 파라미터 처리 
		init();
	}

	private void init() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(in, "utf-8"));
		String startLine = br.readLine();
		if (startLine == null) return;
		// GET URI HTTP/1.1
		String[] arr = startLine.split(" ");
		method = arr[0];
		
		// arr[1] : /board/delete.do?no=1&commentNo=100
		// arr[1] : /board/list.do
		String[] uriArr = arr[1].split("\\?");
		requestURI = uriArr[0];
		
		// GET 방식일 경우 파라미터 처리
		if (uriArr.length == 2) {
			queryString = uriArr[1];
			// 파라미터 처리 메서드 작성 : 이유?? POST 방식도 동일하게 파라미터 처리 필요함..
			setParamMap();
		}
		
		// POST 방식일 경우
		// 헤더 정보 읽기
		while (true) {
			String line = br.readLine();
			if ("".equals(line)) break;
		}
		
		// POST 방식일 경우 BODY 에 있는 파라미터 읽기
		if ("POST".equals(method)) {
			String bodyParam = "";
			while (br.ready()) {
				int ch = br.read();
				bodyParam += (char)ch;
			}
			
			if (bodyParam.length() > 0) {
				queryString = bodyParam;
				setParamMap();
			}
		}
	}
	
	private void setParamMap() throws Exception {
		// queryString -> no=1&commentNo=100
		String[] params = queryString.split("&");
		for (String p : params) {
			// p -> no=1
			// p -> commentNo=100
			String[] data = p.split("=");
			if (data.length == 2) {
				paramMap.put(data[0], URLDecoder.decode(data[1], "utf-8"));
			} else {
				paramMap.put(data[0], "");
			}
		}
	}
	
	public InputStream getIn() {
		return in;
	}

	public String getMethod() {
		return method;
	}

	public String getRequestURI() {
		return requestURI;
	}

	public String getQueryString() {
		return queryString;
	}

	public Map<String, String> getParamMap() {
		return paramMap;
	}
	
	public String getParameter(String key) {
		return paramMap.get(key);
	}
}



















