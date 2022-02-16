package net06.crawling;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Test02 {
	public static void main(String[] args) {
		try {
			Document doc = Jsoup.connect("http://www.naver.com").get();
//			Elements ele = doc.select(".ah_item > .ah_a");
			Elements ele = doc.select("ul.ah_l > li.ah_item > a[href='#']");
			for (Element e : ele) {
//				System.out.println(e.select(".ah_r").html() + "\t" + e.select(".ah_k").html());
				Elements sList = e.select("span");
				System.out.println(sList.get(0).html() + "\t" + sList.get(1).html());
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
