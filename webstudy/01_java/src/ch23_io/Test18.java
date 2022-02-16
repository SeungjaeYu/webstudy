package ch23_io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Test18 {
	public static void main(String[] args) {
		ArrayList<User> list = new ArrayList<>();
		list.add(new User("trueekim", "김진실"));
		list.add(new User("jh_jung", "정윤오"));
		list.add(new User("superPower", "서영호"));

		// 저장한 정보를 다시 꺼낼 수 있게 한다.
		// 1.구분할 수 있게 넣어준다.
		FileOutputStream fos = null;
		//객체 저장하기 위한 생성
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream("data/ch23/text18.txt");
			oos = new ObjectOutputStream(fos); //직렬화 다 따로따로 분해한다.
			//list를 쓰세요
			oos.writeObject(list);

			System.out.println("등록성공");
			

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			try {
				oos.close();
				fos.close();
			} catch (Exception e) {

			}
		}
		//읽기

		FileInputStream fis = null;
		// 줄단위로 읽기위해
		//객체를 읽겠다
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream("data/ch23/text18.txt");
			// fis에 가서 객체를 읽겠다
			ois = new ObjectInputStream(fis); //역직렬화 다시 합쳐준다
			ArrayList<User> list2 = (ArrayList<User>) ois.readObject();
			for (User user : list2) {
				System.out.println("id: " + user.getId() + "\nname: " + user.getName());

			}
		}

		 catch (Exception e) {
			 e.printStackTrace();

		} finally {
			try {
				fis.close();
				ois.close();
			} catch (Exception e) {

			}
		}

	}

}
