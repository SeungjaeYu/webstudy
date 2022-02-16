/**
 * 	lotto 폴더 하위에 1 ~ 45번 까지의 이미지 저장하기
 */

package net02.url.exam;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Quiz01 {
	public static void imgSave(int num) throws Exception {
			URL url = new URL("http://www.lotto.co.kr/resources/images/lottoball_92/on/" + num + ".png");
			BufferedInputStream bis = new BufferedInputStream(url.openStream());
			FileOutputStream fos = new FileOutputStream("src/main/resources/lotto/" + num + ".png");
			while (true) {
				int ch = bis.read();
				if (ch ==  -1) break;
	
				fos.write(ch);	// byte 단위로 써야 함.
			}
			System.out.println(num + "저장 성공");
			fos.close();
			bis.close();
		
	}
	
	public static void main(String[] args) {
		File f = new File("src/main/resources/lotto");
		if (!f.exists()) {
			f.mkdirs();
		}
		try {
			for (int i = 1; i <= 45; i++) {
				imgSave(i);
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// http://www.lotto.co.kr/resources/images/lottoball_92/on/1.png
		
	}
}
