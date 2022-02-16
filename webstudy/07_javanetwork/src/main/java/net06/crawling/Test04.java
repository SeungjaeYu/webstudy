/**
 *  다운로드된 페이지의 기본 정보가 아닌 변경된 정보를 가져오기 위해서는 selenium 라이브러리 활용
 * 
 * 	- 라이브러리 다운로드 : mvnre.... pom.xml 파일에 추가
 *  - 크롬드라이버 다운로드
 *    : https://sites.google.com/a/chromium.org/chromedriver/ 페이지 이동
 *    : 화면 하단의 Latest stable release: ChromeDriver 76.0.3809.126 링크 클릭
 *    : chromedriver_win32.zip 윈도우용 다운로드
 *    : 다운로드된 파일 압축 해제
 *    : chromedriver.exe 파일을 c:/java/bin/crawling 폴더를 생성 한 후 붙여넣기
 */

package net06.crawling;

import java.util.concurrent.TimeUnit;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test04 {
	public static void main(String[] args) {
		Test04 t = new Test04();
		try {
			t.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
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
	private void execute() throws Exception {
		init();
		
		driver.get("https://logins.daum.net/accounts/toploginform.do");
		
		driver.findElement(By.id("id")).sendKeys("abcd");
		driver.findElement(By.id("inputPwd")).sendKeys("adfdskfd");
		driver.findElement(By.id("loginSubmit")).click();
		
		Thread.sleep(3000);
		driver.get("http://ticket.interpark.com/");
		
		driver.findElement(By.id("Nav_SearchWord")).sendKeys("포스트시즌");
		driver.findElement(By.cssSelector(".btn_search")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#playend_list > tr:nth-child(1) > td.btnArea > a")).click();
		
		// 드라이버 사용 종료
//		driver.quit();
		
	}


}
