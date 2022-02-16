package ch26_annotation.step02;

@Marker
@Type1(value = "abc")
@Type2(name = "깃동찬")
public class Test {

	@Marker
	@Type1("abc")		// 속성의 이름이 value 일 경우에는 속성명을 생략 가능
//	@Type2("깃동찬")	// 속성의 이름이 name 이므로 생략불가능(에러발생)
	private int val;
	
	@Marker
	@Type1(value = "abc")
	@Type2(name = "깃동찬")
	public void call() {}
}
