package net01.ip.exam;

import java.net.InetAddress;
import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		while (true) {			
			try {
				System.out.print("도메인 주소를 입력하세요 : ");
				String host = sc.nextLine();
				if (host.equalsIgnoreCase("exit")) break;
				if (!host.startsWith("www")) {
					System.out.println("도메인 주소는 www로 시작해야 합니다.");
					continue;
				}
				InetAddress[] inet = InetAddress.getAllByName(host);
				System.out.println(host + " 에서 사용하는 주소정보");
				System.out.println("------------------------------------------");
				for (InetAddress addr : inet) {
					System.out.println(addr.getHostAddress());
				}
				System.out.println("------------------------------------------");
				System.out.println();
				
				
			} catch (Exception e) {
				System.out.println("존재하지 않는 도메인 주소 입니다.");
				System.out.println();
				continue;
			}
		}
		sc.close();
		System.out.println("프로그램을 종료합니다.");
	}
}
