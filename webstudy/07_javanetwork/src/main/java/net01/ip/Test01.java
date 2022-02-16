/**
 *  용어
 * 
 * 	- 소켓(Socket)
 *    : 컴퓨터가 연결된 통신의 끝점
 *    : 소켓에 쓰는 일은 상대에게 데이터를 전달
 *    : 소켓에서 읽는 일은 상대가 전송한 데이터를 수신	
 *    : 대표적인 자바에서 사용하는 소켓의 종류 (TCP-전화, UDP-편지) - TCP는 신뢰성이 높다, UDP는 신뢰성이 떨어진다.(데이터 소실확률이 있음)
 *    : TCP는 HTTP 프로토콜이 사용하는 소켓 - stateless
 *    
 *    
 *  - 호스트(Host)
 *    : 하나의 컴퓨터에 할당된 고유 이름
 *    : 인터넷에서 IP(xxx.xxx.xxx.xxx) 주소나 도메인명(www.naver.com)으로 나타낸다.
 *    
 *  - 포트(Port)
 *    : 하나의 컴퓨터에는 여러개의 서비스 제공이 가능
 *    : 서비스를 구분하기 위해서 사용함
 *    : 포트번호의 범위는 0~ 65535 번까지 가능(0 ~ 1024 일반적으로 시스템 포트번호)
 *    : 권장하는 사용 포트 번호는 5000번 이후로 사용
 *    
 *    호스트는 대표전화	포트는 내선번호
 *    
 *  - java.net 패키지에서 다룰 클래스
 *    : 주소 관련(InetAddress)
 *    : URL 관련(URL, HttpURLConnection)
 *    : TCP 소켓(ServerSocket, Socket)
 *    
 *  - ip
 *  - url : openAPI(xml, json), 크롤링(crawling)
 *  - server : mini webserver 구현해보기
 *  
 */


/**
 *  출력형식 >
 *  도메인 주소를 입력하세요 : http://www.naver.com
 *  도메인 주소는 www로 시작해야 합니다.
 *  
 *  도메인 주소를 입력하세요 : www.naver.com
 *  www.naver.com 에서 사용하는 주소정보
 *  ---------------------------------------------------
 *  220.189.20.111
 *  220.189.20.64
 *  ---------------------------------------------------
 * 
 *  도메인 주소를 입력하세요 : www.aidfjeijf.com
 *  존재하지 않는 도메인주소 입니다.
 *  
 *  도메인 주소를 입력하세요 : exit
 *  프로그램을 종료합니다.
 */



package net01.ip;

import java.net.InetAddress;

public class Test01 {
	public static void main(String[] args) {
		
		// 현재 사용하는 컴퓨터의 주소
		try {
			InetAddress local = InetAddress.getLocalHost();
			System.out.println(local);
			
			System.out.println(local.getHostAddress());
			System.out.println(local.getHostName());
			
			// 외부 사이트의 주소 얻기
//			InetAddress jun = InetAddress.getByName("www.af54asdf65e.com");
			InetAddress jun = InetAddress.getByName("www.jun2food.com");
			System.out.println(jun);
			
			InetAddress[] navers = InetAddress.getAllByName("www.naver.com");
			for (InetAddress naver : navers) {
				System.out.println(naver);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		
	}
}
