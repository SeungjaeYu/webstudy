package ch18_exception;

public class JuminNumberException extends RuntimeException {
	public JuminNumberException(String juminNo) {
	    super("주민번호는 13자리 이어야 합니다.("+ juminNo + ")");
}
}
