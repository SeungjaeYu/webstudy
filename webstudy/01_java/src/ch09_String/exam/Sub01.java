package ch09_String.exam;

public class Sub01 {
	/**
	 * str1이 hello world이고
	 * str2가 hillo라고 한다면..
	 * 
	 * charAt, length
	 * @param str1
	 * @param str2
	 * @return
	 */
	
	boolean startsWith(String str1, String str2) {
//	      str1 = "hello world";
//	      str2 = "hillo";
	      int len = str2.length();
	      //str2 가 더 길때..
	      
	      if(len > str1.length()) return false;
	      
	      
	      for(int i = 0; i < str2.length() ; i++) {
	    	  if(str1.charAt(i) != str2.charAt(i)) return false;
	      }
	      
	      
		return true;
		
	}
		
		/**
		 * str1 hello world이고
		 * str2가 rld 이면 true을 반환
		 * 
		 * @param str1
		 * @param str2
		 * @return
		 */
	
		boolean endsWith(String str1, String str2) {
			int len1 = str1.length();
			int len2 = str2.length();
			
			if(len1 < len2) return false;
			
			
			for(int i = len1-1,  j = len2 -1; j >=0 ; i--, j-- ) {
				if(str1.charAt(i) != str2.charAt(i)); return false;
		}
			return true;
//			return false;
		}	
			
	
	/**
	 * 
	 * @param str1
	 * @param str2
	 * @return
	 */
	
	
	
	boolean equals(String str1, String str2) {
		int len1 = str1.length();
		int len2 = str2.length();
		
		if(len1 != len2) return false;
		
		
		for(int i = 0; i < len2 ; i++) {
			if(str1.charAt(i) != str2.charAt(i)); return false;
		}
		
		return true;
	}
			
			
	
	
	

}
