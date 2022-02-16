
package ch23_io;

import java.io.InputStreamReader;
import java.io.Reader;

public class Test09 {
	public static void main(String[] args) {
		//한글받기

		Reader in = new InputStreamReader(System.in);
	
		try {
			
			while(true) {
				int ch = in.read();
				System.out.print((char)ch); 
			}
		}
		catch(Exception o){
			
		}
		
		
		
	}

}
