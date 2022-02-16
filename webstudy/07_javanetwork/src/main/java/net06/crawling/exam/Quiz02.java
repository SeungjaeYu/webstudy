package net06.crawling.exam;

import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Quiz02 {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			while(true) {
				System.out.println("------------------");
				System.out.println("1. 영화 랭킹");
				System.out.println("2. 영화인 랭킹");
				System.out.println("0. 종료");
				System.out.println("------------------");
				System.out.print("선택 : ");
				int num = Integer.parseInt(sc.nextLine());
				Document doc;
				switch (num) {
				case 1:
					doc = Jsoup.connect("http://movie.naver.com/movie/sdb/rank/rmovie.nhn").get();
					Elements ele = doc.select(".list_ranking tr > td.title > div.tit3 > a");
					int i = 0;
					System.out.println("영화 랭킹");
					System.out.println("---------------------------------------------");
					System.out.println("순위\t영화");
					System.out.println("---------------------------------------------");
					for (Element e : ele) {
						System.out.println(++i + "." + "\t" + e.html());
						if (i == 10) break;
					}
					break;
				case 2:
					doc = Jsoup.connect("https://movie.naver.com/movie/sdb/rank/rpeople.nhn").get();
					Elements ele2 = doc.select("table.list_ranking > tbody > tr");
					int j = 0;
					
					System.out.println("영화 랭킹");
					System.out.println("---------------------------------------------");
					System.out.println("순위\t출생일\t\t영화인");
					System.out.println("---------------------------------------------");
					
					for (Element e : ele2) {
						
						System.out.println(++j + "\t" + e.select("td.birth").text() + "\t\t" + e.select("td.title > a").text() );
						if (j == 10) break;
					}
				default:
					break;
				}
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
