package ch26_annotation.step03;

public class Test {
//	@Type1(type="1", name="2", value="3")	// 정상
//	@Type1(type="1", name="2", "3")	// 에러 (여러가지 속성을 같이 지정시 속성명 필수)
//	@Type1							// 디폴트 값이 설정되어 있으면 속성을 지정 안해도 가능
//	@Type1(type="1", value="2")
	@Type1("2")	// value 속성의 값을 지정
	public void call() {}
}
