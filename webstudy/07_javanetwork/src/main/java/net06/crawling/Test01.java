package net06.crawling;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Test01 {
	public static void main(String[] args) {
		String html = "<html>"
					+ "    <head>"
					+ "        <title>JSOUP 연습</title>"
					+ "    </head>"
					+ "    <body>"
					+ "        <p>Parse HTML</p>"
					+ "        <div class='a'>클래스 접근</div>"
					+ "        <p id='b'>아이디 접근</p>"
					+ "        <div>"
					+ "            <p>div 안에 있는 p</p>"
					+ "            <a href='#1'>위로</a>"
					+ "            <a href='#2'>아래로</a>"
					+ "            <a href='#3'>중간</a>"
					+ "            <a href='http://www.naver.com'>네이버</a>"
					+ "        </div>"
					+ "    </body>"
					+ "</html>";
		// parse메서드에 html로 된 문서를 매개변수로 주면 파싱해서 document로 반환해줌
		Document doc = Jsoup.parse(html);	// import시에 jsoup패키지에 있는걸 해야함!!!!!
		/*
		Element e = doc.getElementById("b");				// .getElementbyId ==> id값으로 접근하겠다.
		System.out.println(e.html());
		// CSS 선택자를 쓰면 메서드를 쓰는것보다 간단해짐 ↓
		*/
		/*
		Elements list = doc.select("#b");
		for (Element e : list) {
			System.out.println(e.html());
		}
		/*
		Element e = doc.selectFirst("#b");
		System.out.println(e.html());
		
		*/
		
		// div 하위에 있는 a 태그들의 내용을 화면에 출력
		/*
		Elements list = doc.select("div > a");
		for (Element e : list) {
			System.out.println(e.html());
		}
		*/
		
		// a 태그의 href의 속성의 값이 .com 으로 끝나는 것
		
		Elements list = doc.select("a[href$=.com]");
		for (Element e : list) {
			System.out.println(e.html());
		}
		
		/*
		#PM_ID_ct > div.header > div.section_navbar >
		div.area_hotkeyword.PM_CL_realtimeKeyword_base > 
		div.ah_list.PM_CL_realtimeKeyword_list_base >
		ul:nth-child(5) > li:nth-child(1) > a.ah_a > span.ah_r
		*/
	}
}
