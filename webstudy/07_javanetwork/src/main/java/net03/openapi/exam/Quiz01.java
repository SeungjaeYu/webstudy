/**
 *  캡차 API 활용
 * 	1. key
 *  2. 이미지 생성
 *  3. 이미지 비교 성공 실패
 */

package net03.openapi.exam;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;
import java.util.Scanner;

public class Quiz01 {
	String clientId = "aDKEHmeuFnDG8SnOF_VQ";//애플리케이션 클라이언트 아이디값";
    String clientSecret = "6b7CctQHsd";//애플리케이션 클라이언트 시크릿값";
    String key = "";
    
	private void key() {
		 
	        try {
	            String code = "0"; // 키 발급시 0,  캡차 이미지 비교시 1로 세팅
	            String apiURL = "https://openapi.naver.com/v1/captcha/nkey?code=" + code;
	            URL url = new URL(apiURL);
	            HttpURLConnection con = (HttpURLConnection)url.openConnection();
	            con.setRequestMethod("GET");
	            con.setRequestProperty("X-Naver-Client-Id", clientId);
	            con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
	            int responseCode = con.getResponseCode();
	            BufferedReader br;
	            if(responseCode==200) { // 정상 호출
	                br = new BufferedReader(new InputStreamReader(con.getInputStream()));
	            } else {  // 에러 발생
	                br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
	            }
	            String inputLine;
	            StringBuffer response = new StringBuffer();
	            while ((inputLine = br.readLine()) != null) {
	                response.append(inputLine);
	            }
	            br.close();
	            System.out.println(response.toString());
	            String response1 = response.substring("\"key\":\"".length() + 1, response.length() - 2);
	            key =  response1;
	        } catch (Exception e) {
	            System.out.println(e);
	        }
	        
	}
	
	private void image() {
		
	     try {
	         
	         String apiURL = "https://openapi.naver.com/v1/captcha/ncaptcha.bin?key=" + key;
	         URL url = new URL(apiURL);
	         HttpURLConnection con = (HttpURLConnection)url.openConnection();
	         con.setRequestMethod("GET");
	         con.setRequestProperty("X-Naver-Client-Id", clientId);
	         con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
	         int responseCode = con.getResponseCode();
	         BufferedReader br;
	         System.out.println("key : " + key);
	         if(responseCode==200) { // 정상 호출
	             InputStream is = con.getInputStream();
	             int read = 0;
	             byte[] bytes = new byte[1024];
	             // 랜덤한 이름으로 파일 생성
	             String tempname = Long.valueOf(new Date().getTime()).toString();
	             File f = new File("tempname" + tempname + ".jpg");
	             f.createNewFile();
	             OutputStream outputStream = new FileOutputStream(f);
	             while ((read =is.read(bytes)) != -1) {
	                 outputStream.write(bytes, 0, read);
	             }
	             is.close();
	         } else {  // 에러 발생
	             br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
	             String inputLine;
	             StringBuffer response = new StringBuffer();
	             while ((inputLine = br.readLine()) != null) {
	                 response.append(inputLine);
	             }
	             br.close();
//	             System.out.println(response.toString());
	         }
	     } catch (Exception e) {
	         System.out.println(e);
	     }
	 }
	
	 
	private void keyResult() {

 
        try {
            String code = "1"; // 키 발급시 0,  캡차 이미지 비교시 1로 세팅
            
            
            
//            String value = "asdasd"; // 사용자가 입력한 캡차 이미지 글자값
            Scanner sc = new Scanner(System.in);
            System.out.print("값 입력 : ");
            String value = sc.nextLine();
            
            String apiURL = "https://openapi.naver.com/v1/captcha/nkey?code=" + code +"&key="+ key + "&value="+ value;
            System.out.println(apiURL);
            URL url = new URL(apiURL);
            HttpURLConnection con = (HttpURLConnection)url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("X-Naver-Client-Id", clientId);
            con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
            int responseCode = con.getResponseCode();
            BufferedReader br;
            if(responseCode==200) { // 정상 호출
                br = new BufferedReader(new InputStreamReader(con.getInputStream()));
            } else {  // 에러 발생
                br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
            }
            String inputLine;
            StringBuffer response = new StringBuffer();
            while ((inputLine = br.readLine()) != null) {
                response.append(inputLine);
            }
            br.close();
            System.out.println(response.toString());
        } catch (Exception e) {
            System.out.println(e);
        }
	}
	
	public static void main(String[] args) {
		Quiz01 qu = new Quiz01();
		qu.key();
		qu.image();
		qu.keyResult();
	}

}
