package ch23_io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class Test17 {
	public static void main(String[] args) {
		ArrayList<User> list = new ArrayList<>();
		list.add(new User("trueekim", "김진실"));
		list.add(new User("jh_jung", "정윤오"));
		list.add(new User("superPower", "서영호"));

		// 저장한 정보를 다시 꺼낼 수 있게 한다.
		// 1.구분할 수 있게 넣어준다.
		FileWriter fw = null;
		try {
			fw = new FileWriter("data/ch23/text17.txt");

			for (User u : list) {
				String id = u.getId();
				String name = u.getName();
				// 저장 형식
				fw.write(id + ":" + name + "\n");

			}
			System.out.println("등록성공");
			// 저장된 정보 꺼내기

		} catch (Exception e) {

		} finally {
			try {
				fw.close();
			} catch (Exception e) {

			}
		}

		FileReader fr = null;
		// 줄단위로 읽기위해
		BufferedReader br = null;
		ArrayList<User> list2 = new ArrayList<>();
		try {
			fr = new FileReader("data/ch23/text17.txt");
			br = new BufferedReader(fr);
			while(true) {
				String line = br.readLine();
				if(line == null) break;
				
//				System.out.println(line);
				// 저장하는 과정
				String[] arr = line.split(":");
				
				User user = new User(arr[0], arr[1]);
				list2.add(user);
			}
			//찍기
			for(User user : list2) {
				System.out.println("id: " + user.getId() + "\nname: " + user.getName());
			}

		} catch (Exception e) {

		} finally {
			try {
				br.close();
				fr.close();
			} catch (Exception e) {

			}
		}

	}

}
