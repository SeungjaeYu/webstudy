package net06.crawling.exam;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Quiz01 {
	public static void main(String[] args) {
		try {
			Document doc = Jsoup.connect("http://www.daum.net").get();
			Elements ele = doc.select("ul.list_weather > li");
			for (Element e : ele) {
				System.out.println(e.select(".txt_part").html() + "\t" + e.select(".txt_temper").html() + e.select(".ir_wa").html());
			}
		}catch (Exception e) {
		}
	}
}
