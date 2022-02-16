package ch23_io.exam;



class MultipartRequest {
	public MultipartRequest(String string) {
		// TODO Auto-generated constructor stub
		
	}

	String getParameter(String id) {
		return id;
	}

	public MultipartFile[] getFiles() {
		// TODO Auto-generated method stub
		return null;
	}



}

class MultipartFile {

	public char[] getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public char[] getContent() {
		// TODO Auto-generated method stub
		return null;
	}

	

	
}

public class Quiz11 {
public static void main(String[] args) {
		
		// quiz11.txt 파일의 내용을 파싱하여 아래의 주석에 해당하는 내용들이 출력될 수 있도록 
		// MultipartRequest, MultipartFile 클래스 및 메서드를 작성합니다.
		
		MultipartRequest request = new MultipartRequest("stream.txt");
		
		String id = request.getParameter("id");
		// hong 이 출력됨
		System.out.println("id : " + id);
		
		String pass = request.getParameter("pass");
		// 1234 가 출력됨
		System.out.println("pass : " + pass);
		
		// test.txt, abc.txt 의 내용을 가지고 있는 배열을 반환
		MultipartFile[] files = request.getFiles();
		
		// 2 가 출력
		System.out.println(files.length);
		
		// test.txt 이 출력
		System.out.println(files[0].getName());
		/*
		commons-fileupload
		commons-fileupload   이 출력됨
		 */
		System.out.println(files[0].getContent());
		// abc.txt 이 출력
		System.out.println(files[1].getName());
		/*
		abcd
		efg
		hijk		이 출력됨
		 */
		System.out.println(files[1].getContent());
	}

}
