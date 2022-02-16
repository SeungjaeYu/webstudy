package ch22_collection03.sort.exam;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import ch19_inner_final.board.ui.BaseUI;

public class Quiz02 {
	
	public static void main(String[] args) {
		new Quiz02().service();
	}
	private void service() {
		List<QuizUI> list = new ArrayList<>();
		File f = new File("data/ch22/sort/exam/quiz02.txt");
		try {
			Scanner sc = new Scanner(f);
			while(sc.hasNextLine()) {
				String line = sc.nextLine();
//				System.out.println(line);
				String[] arr = line.split(":");
				list.add(new QuizUI(
						arr[0], Integer.parseInt(arr[1]), 
						Integer.parseInt(arr[2]),
						Integer.parseInt(arr[3])));
			}
			
			Collections.sort(list, new Comparator<QuizUI>() {

				@Override
				public int compare(QuizUI o1, QuizUI o2) {
					
					return o1.getName().compareTo(o2.getName());
				}
				
			});	

			for(QuizUI ui :list) {
			System.out.println(ui);
			}
		
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
