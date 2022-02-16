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

public class Test03 {
	public static void main(String[] args) {
		Test03 t = new Test03();
		try {
//			t.execute01();
			t.execute02();
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
	private void execute02() {
		init();
		
		driver.get("http://localhost:8000/07_javaweb/crawling.html");
		
		WebElement ele= driver.findElement(By.cssSelector("#maintitle"));
		System.out.println(ele.getText());
		
		// 드라이버 사용 종료
		driver.quit();
		
	}

	private void execute01() throws Exception {
		Document doc = Jsoup.connect("http://localhost:8000/07_javaweb/crawling.html").get();
//		System.out.println(doc.html());
		Element e = doc.selectFirst("#maintitle");
		System.out.println(e.html());
//		Element e2 = doc.selectFirst("#subtitle");
//		System.out.println(e2.html());
	}
}
