package ch26_annotation.step05;

@Type1(value="클래스 지정")
@Type2("런타임 지정")
public class MyApply {
	@Type3(id="tester", pass="1234")
	public void call() {}
	
	public void info() {}
}
