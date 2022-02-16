package ch23_io;

import java.io.File;
import java.io.FilenameFilter;

public class Test07 {
	public static void main(String[] args) {
		File f= new File("data/ch23");
		
		//디렉토리 경로일 때
		String[] list = f.list(); //바로 밑에 있는 것만 준다. exam 안에 있는 것은 continue;
		System.out.println("1.----------");
		for(String name : list) {
			System.out.println(name);
		}
		
		File[] sf = f.listFiles();
		System.out.println("2.----------");
		System.out.println(sf.length);
		//이름갖고오기
		for(File f2 : sf) {
			System.out.println(f2.getName());
		}
		
		
		
		/*
		System.out.println("3.----------");
		//디렉토리 밑의 특정한 확장자만 뽑고 싶을 때
		File[] sf2 = f.listFiles();
		System.out.println(sf.length);
		//이름갖고오기
		for(File f2 : sf2) {
			if(f2.getName().endsWith(".java")) {
			System.out.println(f2.getName());
			}
		}
		*/
		
		System.out.println("3.----------");
		//거르기. 익명클래스.. 문자열 배열이라 list에 넣어줬다
		list = f.list(new FilenameFilter() {
			
			@Override//매개변수, (디렉토리 정보, 파일 이름) 총 6번 호출. txt3개 java3개 디렉토리 1개
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				//이름이 자바로만 끝나는 것을 리턴 주고싶다
				return name.endsWith(".java");
			}
		});
		
		System.out.println(list.length);
		for(String name : list) {
			System.out.println(name);
		}
		
		/*
		File[] sf2 = f.listFiles();
		System.out.println(sf.length);
		//이름갖고오기
		for(File f2 : sf2) {
			if(f2.getName().endsWith(".java")) {
			System.out.println(f2.getName());
			}
		}
		*/
		
		File[] files = f.listFiles();
		
		
		System.out.println("5.람다----------");
		files = f.listFiles((File dir, String name) -> name.endsWith(".txt"));
	

		System.out.println(files.length);
		for(File file : files) {
			System.out.println(file.getName());
		}
		
		
		
		
		
		
		
		
	}

}
