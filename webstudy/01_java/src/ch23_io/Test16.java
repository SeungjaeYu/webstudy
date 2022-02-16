package ch23_io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Random;

public class Test16 {
	public static void main(String[] args) {
		FileWriter fw = null;
		//속도를 높이게
		BufferedWriter bfw = null;
		//출력만
		PrintWriter pw = null;
		
		try {
			fw = new FileWriter("data/ch23/test16.txt");
			bfw = new BufferedWriter(fw);
			pw = new PrintWriter(bfw);
			
			String[] msg = {"일곱번째감각", "WithOutU", "BabyDon'tLikeIt", "ChewingGum", "CherryBomb", "Boss"};
			String[] users = {"정윤오", "김동영", "이동혁","김정우", "이제노"};
			
			Random r = new Random();
			for(int i = 1; i <= 100; i++) {
				pw.printf(
				"%d. %s님 %s\n",
				i, 
				users[r.nextInt(users.length)], 
				msg[r.nextInt(msg.length)]
				);
			}
			
			
		}catch(Exception e) {
			
		}finally {
			
		}
		
		
		try {
			pw.close();
			bfw.close();
			
		}catch(Exception e) {
			
		}
		try {
			fw.close();
			
			
		}catch(Exception e) {
			
		}
		
		
	}

}
