package net04.xml;

import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Test03 {
	public static void main(String[] args) {
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder parser = factory.newDocumentBuilder();
			Document doc = parser.parse("data/data2.xml");
			NodeList list = doc.getElementsByTagName("family");
			
			
			
			// List<Family> 형태에 xml의 정보를 담는다.
			List<Family> fList = new ArrayList<>();
			for (int i = 0; i < list.getLength(); i++) {
				Node family = list.item(i);
				NodeList cList = family.getChildNodes();
//				엔터 값도 textNode로 들어간다. 그래서 7이 나온다.
//				System.out.println(cList.getLength());
				Family f = new Family();
				for (int j = 0; j < cList.getLength(); j++) {
					Node cNode = cList.item(j);
					String name = cNode.getNodeName();
					if (name.equals("#text")) continue;
					
					switch (name) {
					case "father": f.setFather(cNode.getTextContent());	break;
					case "mother": f.setMother(cNode.getTextContent());	break;
					case "me": f.setMe(cNode.getTextContent());	break;
					}
					/*
					if (name.equals("father")) f.setFather(cNode.getTextContent());
					if (name.equals("mother")) f.setMother(cNode.getTextContent());
					if (name.equals("me")) f.setMe(cNode.getTextContent());
					*/
				}
				fList.add(f);
			}
			
			
			// List<Family>	의 내용을 아래의 형식으로 출력
			/*
			 * 
			 * 	father		mother		me
			 * ------------------------------------
			 * 	다스베이더	파드메		루크
			 *   ....		 ...		....
			 * ------------------------------------
			 */
			System.out.println("father          mother  me");
			System.out.println("-------------------------------");
			for (Family family : fList) {
				System.out.println(family.getFather() + "      " + family.getMother() + "  " + family.getMe());
			}
			System.out.println("-------------------------------");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
