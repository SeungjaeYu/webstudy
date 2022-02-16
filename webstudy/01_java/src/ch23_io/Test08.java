/**
 *IO 입출력 
 *--------------------
 *입력 : 프로그램 메모로 돌아오는 작업
 *출력 : 프로그램에서 내보내는 작업
 *
 *핵심 클래스(부모 추상)
 *
 *처리단위 : 바이트(해석이 불가능...) - img, mp3, 어떤 해석프로그램을 통해서 해야하는 것/
 *          문자 : 바로 눈으로 보고 해석할 수 있는것. .java
 *
 * <바이트단위>
 *InputStream : 입력 클래스
 *OutputStram : 출력 클래스
 *
 * <문자단위>
 *Reader : 입력관련 클래스
 *Writer : 출력관련 클래스..
 *
 *FileInputStream -> 파일을 읽는다 바이트 단위의 입력클래스를
 *FileOutputStream->            바이트 단위의 출력클래스
 *
 *FileReader      -> 문자단위의 입력클래스
 *FileWriter      -> 문자단위의 출력클래스
 *
 *-> 속도가 좋지 않다
 *
 *<속도가 향상된 클래스> Buffered 공간을 만들어 한 번에 옮기겠다
 *BufferedInputStream ->속도향상 바이트, 입력클래스
 *BufferedOutPutStream->속도향상 바이트, 출력클래스
 *
 *BufferedReader 
 *BufferedWriter 
 *
 *
 *ObjectInputStream
 *ObjectOutputStream      
 *
 *
 * <입력클래스가없다>
 *PrintWriter - 문자단위 출력
 *PrintStream - 바이트단위 출력
 *
 *InputStreamReader  바이트를 문자단위로 처리
 *OutputStreamWriter 바이트를 문자단위로 처리
 *--------------------
 * 
 * 프로그램에서 Person p = new Person(); 객체를 생성 했습니다
 * 이렇게 생성된 p 객체를 c:/result.data 파일에 저장하고 싶습니다
 * 
 * 위에 필요한 클래스는 ??
 * 앞이 아웃풋이면 뒤에도 아웃풋으로 사용한다
 * ObjectOutputStream, FileOutputStream
 * 
 *-------------------------------------------- 
 * A씨는 컴퓨터에 있는 이력서.doc 파일의 내용을 읽어서 
 * 이력서1.doc 파일로 복사하는 프로그램을 만들고 싶습니다.
 * 
 * 위에 필요한 클래스는?
 * FileInputStream, FileOutputStream, 
 * 
 *-------------------------------------------- 
 * 
 * Test10.java 파일의 내용을 화면에 출력하는 프로그램을 작성합니다
 * 
 * 위에 필요한 클래스는?
 * FileReader, FileInputStream(한글이 깨졌을 때), PrintWriter
 * 
 *-------------------------------------------- 
 * 
 * 사용자의 입력을 받아서 화면에 출력하는 프로그램작성
 * 필요한 클래스는 ?
 * InputStream, PrintStream
 * 
 *-------------------------------------------- 
 * InputStream 대표 메서드
 * 
 * int read() - 1byte를 읽겠다. 반환타입은 int. 읽은 byte에대한 아스키코드값으로 찍혀나온다
 * int read(byte[]) - byte배열을 한꺼번에 읽어라. 실제 배열의 읽어들인 크기 
 *  ex) byte[] arr = new byte[2] / arr{1, 2, 3}  이였을 때
 *      arr.read() 를 주면 2(1, 2) 출력. 한번더 찍으면 1(3) 출력. 없으면 -1출력
 * int read(byte[], int, int)
 *       
 * 
 *  
 * Reader - 처리단위 char
 * int read() - char 를 읽겠다. 반환타입은 int. 읽은 byte에대한 아스키코드값으로 찍혀나온다 반환하지 못하면 -1
 * int read(char[]) - byte배열을 한꺼번에 읽어라. 실제 배열의 읽어들인 크기 반환하지 못하면 -1
 * int read(char[], int, int)
 *       
 *
 *
 *
 *
 */
package ch23_io;

import java.io.InputStream;

public class Test08 {
	public static void main(String[] args) {
		System.out.println((int)'\r'); //13
		System.out.println((int)'\n'); //10
		
		//System.in; 표준입력//inputStream 타입 
		InputStream in = System.in;
		//InputStream의 read() 메서드를 쓰겠따
		try {
			/*
			//abc 를 주면 처음에 a읽고 뒤에서 b를 읽는다 한번 더 주면 c도 읽는다
			//a만 주면 97 13 10이 뜬다. 줄넘김을 인식한다.
			int ch = in.read();
			System.out.println(ch);
			ch = in.read();
			System.out.println(ch);
			ch = in.read();
			System.out.println(ch);
			*/
			while(true) {
				int ch = in.read();
				System.out.print((char)ch); //한글은 깨진다. byte처리 안됨
			}
		}
		catch(Exception o){
			
		}
		
		
		
	}

}
