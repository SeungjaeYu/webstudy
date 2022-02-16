package ch22_collection02.clazz.exam;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

class Player {
	private String name;
	private String score;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	
}

public class Quiz03 {
	public static void main(String[] args) {
		File f = new File("C:\\java\\workspace\\true\\01_java\\data\\ch22\\clazz\\exam\\quiz03");
		try {
			Scanner sc = new Scanner(f);
			List<Player> list = new ArrayList<>();
			System.out.println("선수 성적순");
			System.out.println("선수명 점수");
			System.out.println("-----------");
			while(sc.hasNextLine()) {
				String line = sc.nextLine();
				String[] arr = line.split(":");
				//플레이어 객체 생성
				Player p = new Player();
				p.setName(arr[0]);
				p.setScore(arr[1]);
				
				list.add(p);	
			}
			
		
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
