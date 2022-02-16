package ch12_constructor.exam;

public class Time {
	private int hour;
	private int minute;
	private int second;
	
	Time(){
		this( 0, 0, 0);
	}
	
	Time(int hour){
		this(hour, 0, 0);
		
	}
	
	Time(int hour, int minute){
		this(hour, minute, 0);
	}
	
	Time(int hour, int minute, int second){
		this.hour = hour;
		this.minute = minute;
		this.second = second;

	}
	
	Time(Time time){
		this(time.hour, time.minute, time.second);
		
	}
	
	void toUnivTime(){
		if(hour < 0 || hour > 60) hour = 0; 
		if(minute < 0 || minute > 60) minute = 0;
		if(second < 0 || second > 60) second = 0;
		
	}
	
	void toStanTime() {
		if(hour >= 10) 
			hour = hour % 12;
	}
	
	
	
	

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	
	
	
 
	
	
	
	
	
	

	
	
	

}
