/**
 *  버스 정보 실시간 가져오기
 *  http://bus.go.kr/searchResult6.jsp?mnuNm=1
 */ 

package net06.crawling.exam;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Station {
	
	
	private int x;
	private int y;
	private String name;
	
	private Scanner sc;
	

	public Station() {
		super();
		// TODO Auto-generated constructor stub
	}



	// 셀레니움 사용시의 기본 설정
	private WebDriver driver;	// 컴퓨터의 브라우져를 구동할 수 있게 하는 도구
	
	
	private void init() {
		System.setProperty("webdriver.chrome.driver", "C:\\java\\bin\\crawling\\chromedriver.exe");
		
		// chrome을 사용하기 위해서 설정
		driver = new ChromeDriver();
		// 옵션 설정
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}
	// 셀레니움 적용
	private void execute(String busNo) throws Exception {
		init();
		
		driver.get("http://bus.go.kr/searchResult6.jsp?mnuNm=1");
		
		driver.findElement(By.id("searchname")).sendKeys(busNo);
		driver.findElement(By.cssSelector("#left > div.left_top > div > span")).click();
//		driver.findElement(By.id("loginSubmit")).click();
		
		Thread.sleep(3000);
		driver.get("http://ticket.interpark.com/");
		
		driver.findElement(By.id("Nav_SearchWord")).sendKeys("포스트시즌");
		driver.findElement(By.cssSelector(".btn_search")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#playend_list > tr:nth-child(1) > td.btnArea > a")).click();
		
		// 드라이버 사용 종료
//		driver.quit();
		
	}
	public void service() {
		sc = new Scanner(System.in);
		while (true) {
			System.out.print("검색할 버스 번호 입력(-1) : ");
		}
	}
	@Override
	public String toString() {
		return "Station [x=" + x + ", y=" + y + ", name=" + name + ", sc=" + sc + ", driver=" + driver + "]";
	}
	
	
	

}
