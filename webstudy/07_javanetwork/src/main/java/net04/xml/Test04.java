package net04.xml;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class Test04 {
	public static void main(String[] args) {
		String clientId = "aDKEHmeuFnDG8SnOF_VQ";//애플리케이션 클라이언트 아이디값";
        String clientSecret = "6b7CctQHsd";//애플리케이션 클라이언트 시크릿값";
        try {
            String text = "https://www.daum.net";
            String apiURL = "https://openapi.naver.com/v1/util/shorturl.xml?url=" + text;
            URL url = new URL(apiURL);
            HttpURLConnection con = (HttpURLConnection)url.openConnection();
            
            con.setRequestMethod("GET");
            con.setRequestProperty("X-Naver-Client-Id", clientId);
            con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
            
           
            
            
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder parser = factory.newDocumentBuilder();
            Document doc = parser.parse(con.getInputStream());
            	System.out.println(doc.getElementsByTagName("url").item(0).getTextContent());
            
            
            
        } catch (Exception e) {
            System.out.println(e);
        }
	}
}
