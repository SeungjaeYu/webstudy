package ch23_io.exam;

import java.io.BufferedReader;
import java.io.FileReader;

public class Quiz09 {
    public static void main(String[] args) {
        try {
            searchFileContent("data/find.txt", "System");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    /**
     * 
     * @param readFileName : 읽을 파일명
     * @param findStr      : 파일에서 찾을 내용
     * @throws Exception
     */
    public static void searchFileContent(String readFileName, String findStr) throws Exception {
            // 아래 부분에 내용을 구현합니다. 클래스의 다른 부분은 변경하지 않습니다.
    	
    	FileReader fr = new FileReader(readFileName);
    	BufferedReader br = new BufferedReader(fr);
    	
    	int count = 0;
    	try {
    		
    		while(true) {
    			String st = br.readLine();
    			count++;
    			if(st == null) break;
    			if(st.contains(findStr)) {
    				System.out.println(count + ":" + st);
    			}
    			
    		}
    		
    	} catch (Exception e){
    		e.printStackTrace();
    	}

            ////////////////////////////////////////////////////
    }
}