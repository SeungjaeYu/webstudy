/**
 * 		네이버 오픈 API 활용하기
 */

package net03.openapi;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Scanner;

public class Test01 {
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
			String blogUrl = "https://openapi.naver.com/v1/search/movie.xml";
			
			String text = URLEncoder.encode("4", "UTF-8");
			String query = "query=" + text + "&display=3&start=1&genre=4&country=US";
			
			String blogPage = blogUrl + "?" + query;
			System.out.println(blogPage);
			
			URL url = new URL(blogPage);
			
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			
			con.setRequestMethod("GET");
			
			 con.setRequestProperty("X-Naver-Client-Id", "aDKEHmeuFnDG8SnOF_VQ");
	         con.setRequestProperty("X-Naver-Client-Secret", "6b7CctQHsd");
			
	         BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
	         
	         while (true) {
	        	 String line = br.readLine();
	        	 if (line == null) break;
	        	 
	        	 System.out.println(line);
	         }

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
