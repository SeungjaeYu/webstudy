package net08.web;

import java.net.URLDecoder;
import java.net.URLEncoder;

public class Test03 {
	public static void main(String[] args) throws Exception {
		String msg = "자바";
		String encode = URLEncoder.encode(msg, "utf-8");
		System.out.println(encode);
		
		String decode = URLDecoder.decode(encode, "utf-8");
		System.out.println(decode);
	}
}
