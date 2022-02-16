package ch22_collection03.sort.exam;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Data01{
	private String name;
	private String music;
	private String group;
	private int age;
	
	public Data01(String name, int age, String music, String group) {
		this.name = name;
		this.music = music;
		this.group = group;
		this.age = age;
		
	}
	
	
	protected String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	protected String getMusic() {
		return music;
	}
	protected void setMusic(String music) {
		this.music = music;
	}
	protected String getGroup() {
		return group;
	}
	protected void setGroup(String group) {
		this.group = group;
	}
	protected int getAge() {
		return age;
	}
	protected void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return String.format("%s %d %s %s", name, age, music, group);
	}
	
	
	
}

public class Quiz01 {
	public static void main(String[] args) {
		File f = new File("data/ch22/sort/exam/quiz01.txt");
		System.out.println("가수정보");
		System.out.println("----------------");
		System.out.println("이름  나이  장르  그룹");
		System.out.println("----------------");
		
		
		List<Data01> list = new ArrayList<>();
		try {
			Scanner sc = new Scanner(f);
			while(sc.hasNextLine()) {
				String[] arr = sc.nextLine().split(":");
				list.add(new Data01(arr[0], Integer.parseInt(arr[1]), arr[2], arr[3]));
				
			}
		Collections.sort(list, new Comparator<Data01>() {

			@Override
			public int compare(Data01 o1, Data01 o2) {
				if(o2.getAge() == o1.getAge()) {
					return o1.getName().compareTo(o2.getName());
				}
				return o2.getAge() - o1.getAge(); 
				/**문자열만 가능*/
//				return o1.getName().compareTo(o2.getName()); 
			}
			
		});
		
		for(int i = 0 ; i < list.size(); i++) {
			System.out.println(list.get(i));
			
		}


			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("----------------");
		
	}
	

}
