package ch23_io.exam;

import java.io.BufferedReader;
import java.io.FileReader;

public class Quiz08 {
	public static void dataCheck(String file1 , String file2) throws Exception{
        // 구현하세요~ ---------------------------------------------------
        // 비교 대상 파일인 file1 과 file2 에는 문자열 데이터의 라인수가 같다고 가정합니다~!!
		FileReader fr1 = null;
    	BufferedReader br1 = null;
    	FileReader fr2 = null;
    	BufferedReader br2 = null;
    	int line = 0;
    	try {
    	fr1 = new FileReader(file1);
    	br1 = new BufferedReader(fr1);
    	fr2 = new FileReader(file2);
    	br2 = new BufferedReader(fr2);
    	
    	while(true) {
    		
    		String s1 = br1.readLine();
    		String s2 = br2.readLine();

    		if(s1 == null) break;
   
//    		if(s2 == null) break;
    		if(s1.equalsIgnoreCase(s2)) {
    			System.out.println("LINE"+ ++line + " : " +"Equl");
    		}else {
    			System.out.println("LINE"+ line + " : " +"NotEqul");
    		}
    		
    	}
    	
    	
    	} catch (Exception e) {
    		e.printStackTrace();
    	}finally {
    		try {
    		br1.close();
    		br2.close();
    		}
    		catch(Exception e) {
    			e.printStackTrace();
    			
    		}
    		try {
    			fr1.close();
    			fr2.close();
    		}catch(Exception e) {
    			e.printStackTrace();
    		}
    	}
		
		
		
		
		
		
		
		

        // --------------------------------------------------------------
    }   
    
    // main 메서드는 수정하지 마세요.
    public static void main(String[] args) throws Exception {       
        try {
            dataCheck("data/data1.txt", "data/data2.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }    
}
