package ch12_constructor.exam;

public class ExDate {
	
	private int year;
	private int month;
	private int date;
	
	
	ExDate(){
		this(1970, 1, 1);
		
	}
    ExDate(int year, int month, int date){
		this.year = year;
		this.date = date;
		this.month = month;
		
	}
	
	
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}






	
	
	
	
	
	
	void showDate() {
		System.out.printf("%d년 %02d월 %02d일 \n", year, month, date);
		
	}
	
	
	
	

}
