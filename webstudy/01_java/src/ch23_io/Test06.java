package ch23_io;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test06 {
	public static void main(String[] args) {
		File f = new File("data/ch23/a.txt");	
		System.out.println(f.exists());
         //a.txt 을 얻을 수 있따
		String name = f.getName();
		//data/ch23
		String parent = f.getParent();
		//전체경로
		String path = f.getPath();
		System.out.println("name : " + name);
		System.out.println("parent : " + parent);
		System.out.println("path : " + path);
		
		//파일 크기 byte - 1M(1024k) 1K(1024byte)
		long len = f.length();
		System.out.println("f의 파일크기(byte) : " + len);
		
		//수정시간
		long time = f.lastModified();
		Date d = new Date(time);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss"); 
		String sTime = sdf.format(d);
		System.out.println(sTime);
		
		
		//쓸수 없는 파일
		System.out.println(f.canWrite() ? "쓸 수 있음" : "쓸 수 없음");
		System.out.println(f.canRead() ? "읽을 수 있음" : "읽을 수 없음");
		System.out.println(f.canExecute() ? "실행할 수 있음" : "실행할 수 없음");
		
		
		
		
	}

}
