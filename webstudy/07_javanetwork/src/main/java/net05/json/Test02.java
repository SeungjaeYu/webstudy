package net05.json;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.List;

import com.google.gson.Gson;

public class Test02 {
	public static void main(String[] args) {
		/*
		 * con.setRequestProperty("X-Naver-Client-Id", clientId);
		 * con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
		 * aDKEHmeuFnDG8SnOF_VQ 6b7CctQHsd
		 */
		/*
		query	string	Y	-	검색을 원하는 문자열로서 UTF-8로 인코딩한다.
		display	integer	N	10(기본값),100(최대)	검색 결과 출력 건수 지정
		start	integer	N	1(기본값), 1000(최대)	검색 시작 위치로 최대 1000까지 가능
		sort	string	N	sim(기본값), date	정렬 옵션: sim (유사도순), date (날짜순)
		*/
		
		// https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=오픈
		
		try {
//			System.out.println(URLEncoder.encode("자바","UTF-8"));			
			String blogUrl = "https://openapi.naver.com/v1/search/blog";
			
			String text = URLEncoder.encode("자바", "UTF-8");
			String query = "query=" + text + "&display=3";
			
			String blogPage = blogUrl + "?" + query;
			
			URL url = new URL(blogPage);
			
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET");
	        con.setRequestProperty("X-Naver-Client-Id", "aDKEHmeuFnDG8SnOF_VQ");
	        con.setRequestProperty("X-Naver-Client-Secret", "6b7CctQHsd");
			
	        BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
	         
	        NaverBlog nb = new Gson().fromJson(br, NaverBlog.class);
	        List<Blog> list = nb.getItems();
	        for (Blog b : list) {
	        	System.out.println(b.getTitle() + "\t" + b.getLink() + "\t" + b.getDescription());
	        }

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
