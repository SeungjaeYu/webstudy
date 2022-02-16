package net05.json.exam;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Scanner;

import com.google.gson.Gson;

public class Quiz01 {
	
	
	
	
	
	 public static void main(String[] args) {
	        String clientId = "aDKEHmeuFnDG8SnOF_VQ";//애플리케이션 클라이언트 아이디값";
	        String clientSecret = "6b7CctQHsd";//애플리케이션 클라이언트 시크릿값";
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.println("번역을 시작합니다.");
	        outer :
	        while (true) {
	        	try {
	        		System.out.print("우리말(종료 quit) : ");
	        		String text = sc.nextLine(); 
	        		if (text.equalsIgnoreCase("quit")) break;
	        		text = URLEncoder.encode(text, "UTF-8");
	        		String apiURL = "https://openapi.naver.com/v1/papago/n2mt";
	        		URL url = new URL(apiURL);
	        		HttpURLConnection con = (HttpURLConnection)url.openConnection();
	        		con.setRequestMethod("POST");
	        		con.setRequestProperty("X-Naver-Client-Id", clientId);
	        		con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
	        		System.out.print("1. 영어   2. 일본어  3. 중국어 : ");
	        		String translateFormat = "";
	        		int num = Integer.parseInt(sc.nextLine());
	        		switch (num) {
					case 1: translateFormat = "en"; break;
					case 2: translateFormat = "ja"; break;
					case 3: translateFormat = "zh-CN"; break;

					default:
						System.out.println("잘못된 값을 입력하셨습니다.");
						break outer;
					}
	        		// post request

	        		String postParams = "source=ko&target=" + translateFormat + "&text=" + text;
	        		con.setDoOutput(true);
	        		DataOutputStream wr = new DataOutputStream(con.getOutputStream());
	        		wr.writeBytes(postParams);
	        		wr.flush();
	        		wr.close();
	        		int responseCode = con.getResponseCode();
	        		BufferedReader br;
	        		
	        		if(responseCode==200) { // 정상 호출
	        			br = new BufferedReader(new InputStreamReader(con.getInputStream()));
	        		} else {  // 에러 발생
	        			br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
	        		}
	        		
	        		Papago p = new Gson().fromJson(br, Papago.class);
	        		System.out.println("번역 : " + p.getMessage().getResult().getTranslatedText());
	        		
	        	
	        		
	        		br.close();
	        		
	        	} catch (Exception e) {
	        		System.out.println(e);
	        	}
	        }
	        
	    }
}
