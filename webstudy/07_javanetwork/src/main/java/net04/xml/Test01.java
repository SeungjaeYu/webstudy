/**
 *  XML 파서
 *  - DOM : 젠처를 메모리에 로딩 후 접근, 브라우저에서 HTM 파싱하는 방식
 *  - SAX : 한줄 읽고 처리, 이벤트(태그가 시작된다, 태그가 종료된다)
 */
package net04.xml;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Test01 {
	public static void main(String[] args) {
		/*
		 * data/data1.xml 파일의 내용을 읽어서
		 * 
		 * 다스베이더, 호머, 신영만 의 텍스트를 화면에 출력
		 */
		
		// 1. xml파일의 내용을 읽어서 메모리에 올리기 위해서 xml 파서를 얻는 과정
		try {
			// 파서 객체를 생성하는 factory 얻기
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			// 파서 객체 얻기
			DocumentBuilder parser = factory.newDocumentBuilder();
			// 파서에게 xml 문서의 파싱을 요구..
			Document doc = parser.parse("data/data1.xml");
			
			// 메모리에서 원하는 정보를 얻기 위해서 dom api 메서드 사용하기
			// family 엘리먼트에 접근하기
			NodeList list = doc.getElementsByTagName("family");
			System.out.println("총" + list.getLength() + "개");
			
			for (int i = 0; i < list.getLength(); i++) {
				Node family = list.item(i);
				System.out.println(family.getTextContent());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
