/**
 * Scanner를 통한 file을 읽기
 * 
 * File f = new File("문자열");
 * 문자열에 c: d: 이렇게 안주면 자신이 속한 프로젝트 밑에서 찾아온다
 * ex)01_java에서 찾는다.. data를 만들었기때문에 data
 * 
 *        프로젝트 바로 밑 data->ch10->test01.txt 에 있다
 *	File f = new File("data/ch10/test01.txt");
 *
 * sc.hasNextLine()
 * 라인이 두 줄 이상일 떄
 * 
 */
package ch10_scanfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		/**
		 * text01.txt 파일의 내용을 일어서 아래와 같이 정보를 출력
		 * 
		 * --------------------
		 * 이름    나이     직업
		 * ---------------------
		 * 강동원   42   배우
		 * .....
		 * --------------------
		 * 
		 * 
		 * 찾을 성 : 강
		 * 강씨 성인 사람들
		 * -----------------
		 * 강동원   42  배우
		 * ----------------
		 * 
		 */
		
		
		
		
		
		/*
		Scanner sc = new Scanner(시스템의 읽을 위치);
		우리는 파일에서 읽을것이기 때문에 File을 준다
		입출력할 때 쓴다
		*/
		//파일의 위치를 알아야지 읽을 수 있다 -> 문자열로 줘야한다
		// 프로젝트 바로 밑 data->ch10 에 있다
		File f = new File("data/ch10/test01.txt");
		
		//경로가 없으면 책임질수없다 ㅡㅡ 무시하라고 surround 어쩌고 해줬다
		try {
			Scanner sc = new Scanner(f);
			Scanner keyboard = new Scanner(System.in);
			sc = new Scanner(f);
			
			System.out.print("찾을 성 : ");
			String lastName = keyboard.nextLine();
			System.out.println(lastName + "씨성인 사람들 ");
			
			System.out.println("------------------");
			System.out.println("이름    나이    직업");
			System.out.println("------------------");
			System.out.println("------------------");
			
			// nextline할껄 갖고있니? ㅇㅇ true, ㄴㄴfalse
			while (sc.hasNextLine()) {
//				System.out.println("line : " + line);

				String line = sc.nextLine();
				// 1. 문자열의 의미를 생각해서 passing 해주라 :을 기준으로
				String[] arr = line.split(":");
				// arr[1] 나이는 정수니까..
				if(arr[0].startsWith(lastName) == false) continue;
				
				System.out.println(arr[0] + "\t" + Integer.parseInt(arr[1]) + "\t" + arr[2]);
//				String s = sc2.next();
				
				


			}
			
//			//하드코딩.
//			line = sc.nextLine();
//			System.out.println("line : " + line);
//			

		
		
		
		
		
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
