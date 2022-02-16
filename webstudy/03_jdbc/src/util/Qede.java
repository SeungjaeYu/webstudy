package util;

import java.util.Random;
import java.util.Scanner;

public class Qede {
	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);	
     Random r = new Random();
     int num = r.nextInt(10)+1;
     for(int i = 0; i < 9 ; i++) {
    	 long a = r.nextInt(1000000000)+1;
    	 System.out.println(a);
     }
     
     
     
     
     
		System.out.println("--------------");
	    System.out.println("게시글작성");
	    System.out.println("--------------");
	    System.out.println("내용을 입력하세요 : ");
	    sc.nextLine();
	    System.out.println();
	    System.out.println("등록하시겠습니까 ? Y/N");
	
	    System.out.print("메뉴선택 : ");
	     String choise = sc.nextLine();
	    if(choise.equalsIgnoreCase("y")) {
	    
	    
	     sc.close();
	    }
	}

}
