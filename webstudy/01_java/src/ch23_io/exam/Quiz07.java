package ch23_io.exam;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Quiz07 {
	public static void main(String[] args) {
		try {
            searchEmployeeInfo("data/employee.txt", "김");
            searchEmployeeInfo("data/employee.txt", "다");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    /**
     * 
     * @param readFileName : 읽을 파일명
     * @param lastName     : 찾을 성씨
     * @throws Exception
     */
    public static void searchEmployeeInfo(String readFileName, String lastName) 
            throws Exception {

        // 내용 구현
//    	File f = new File("data\\employee.txt");
    	FileReader fr = null;
    	BufferedReader br = null;
    	
    	int count = 0;
    	try {
    		fr = new FileReader("data\\employee.txt");
    		br = new BufferedReader(fr);
    		
    		
    
    		System.out.println("========================");
			while (true) {
				String str = br.readLine();
				if (str == null) break;
				String[] list = str.split(":");

				if (list[0].startsWith(lastName)) {
					System.out.printf("이름: %s 나이: %d 부서: %s 월급: %d\n", list[0], Integer.parseInt(list[1]), list[2],
							Integer.parseInt(list[3]));
					count++;
				}

			}
			System.out.println("========================");
			System.out.printf("%s성을 가진 회원은 총 %d명입니다 \n", lastName, count);
    		
    	}catch(Exception e) {
    		
    	}finally {
    		try {
    		fr.close();
    		}catch(Exception e) {
    			
    		}
    	}
    	
    	
//    	이름: %d 나이: %s 부서: %d 월급: %s
//    	=============
//    	 %d성을 가진 회원은 총 %s명입니다
    	
    	
    	
    	
    	
    	
		
	}

}
