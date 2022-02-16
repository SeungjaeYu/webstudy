package net04.xml;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Test02 {
	public static void main(String[] args) {
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder parser = factory.newDocumentBuilder();
			Document doc = parser.parse("data/data2.xml");
			NodeList list = doc.getElementsByTagName("family");
			for (int i = 0; i < list.getLength(); i++) {
				Node family = list.item(i);
				NodeList cList = family.getChildNodes();
//				엔터 값도 textNode로 들어간다. 그래서 7이 나온다.
//				System.out.println(cList.getLength());
				for (int j = 0; j < cList.getLength(); j++) {
					Node cNode = cList.item(j);
					String name = cNode.getNodeName();
					if (name.equals("#text")) continue;
					System.out.println(name + "-" + cNode.getTextContent());
				}
				System.out.println();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
