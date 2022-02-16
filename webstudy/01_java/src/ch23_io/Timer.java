package ch23_io;

public class Timer {
	long start;
	public void start() {
		//스타트 하는 순간 시간 측정
		start = System.currentTimeMillis();
	}
	
	public double end() {
		//end를 호출했을 때 시간까지 걸린 시간을 측정
		return (System.currentTimeMillis() - start) / 1000d;
	}
}
