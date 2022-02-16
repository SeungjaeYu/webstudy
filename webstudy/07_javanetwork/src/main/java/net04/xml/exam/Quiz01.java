/**
 * 
 * 		출력형식 > 
 * 
 * 		제목	링크	내용
 * 		---------------------
 * 		..		...		...
 * 		..		...		...
 * 		..		...		...
 * 		..		...		...
 * 		---------------------
 */

package net04.xml.exam;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Quiz01 {
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
			String blogUrl = "https://openapi.naver.com/v1/search/blog.xml";
			
			String text = URLEncoder.encode("자바", "UTF-8");
			String query = "query=" + text + "&display=3";
			
			String blogPage = blogUrl + "?" + query;
			System.out.println(blogPage);
			
			URL url = new URL(blogPage);
			
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			
			con.setRequestMethod("GET");
			
			con.setRequestProperty("X-Naver-Client-Id", "aDKEHmeuFnDG8SnOF_VQ");
	        con.setRequestProperty("X-Naver-Client-Secret", "6b7CctQHsd");
			
	        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
	        DocumentBuilder parser = factory.newDocumentBuilder();
	        Document doc = parser.parse(con.getInputStream());
	        
	         
	        NodeList list = doc.getElementsByTagName("item");
	         
	        List<Blog> bList = new ArrayList<>();
	         
	        for (int i = 0; i < list.getLength(); i++) {
	        	Node node = list.item(i);
	        	NodeList cList = node.getChildNodes();
				Blog blog = new Blog();
				for (int j = 0; j < cList.getLength(); j++) {
					Node cNode = cList.item(j);
					String name = cNode.getNodeName();
					switch (name) {
					case "title": blog.setTitle(cNode.getTextContent());	break;
					case "link": blog.setLink(cNode.getTextContent());	break;
					case "description": blog.setDescription(cNode.getTextContent());	break;
					}
						
				}
				bList.add(blog);
	        }
	         
	         
	        System.out.println("제목\t\t\t\t\t\t\t\t\t\t\t\t\t링크\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t내용");
	        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------");
	        for (Blog blog : bList) {
	        	System.out.println(blog.getTitle() + "\t\t" + blog.getLink() + "\t\t" + blog.getDescription());
	        }
	        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
