package ch12_constructor.exam;

public class MyDate {
	private int year;
	private int month;
	private int date;

	public MyDate(int year, int month, int date) {
		this.year = year;
		this.month = checkMonth(month); // 월 유효성 체크
		this.date = checkDate(date); // 일자 유효성 체크
	}

	/**
	 * 월을 매개변수로 받아서 잘못된 월이 입력되면 1을 반환한다. 
	 * 단, 화면에 아래의 형식으로 출력하여 잘못된 월이 입력되었음을 알려준다. 
	 * 예> 
	 * checkMonth(14); 호출된 경우 
	 * 14월은 존재하지 않는 월입니다. 월을 1월로 설정합니다.
	 * 
	 * @param month
	 * @return
	 */
	int checkMonth(int month) {
		if(month < 1 || month > 12) {
				System.out.printf("해당월에 %d는 존재하지 않은 날짜입니다. 해당월을 1월로 설정합니다", month);
				return month = 1;
		}
		return month;
	}

	/**
	 * 일을 매개변수로 받아서 잘못된 일자가 입력되면 1을 반환한다. 
	 * 단, 화면에 아래의 형식으로 출력하여 잘못된 일자가 입력되었음을 알려준다.
	 *  
	 * 예>
	 * checkDate(33) 
	 * 해당월에 33일은 존재하지 않은 날짜입니다. 일자를 1일로 설정합니다. 
	 * 
	 * 주의사항 - 2월일 경우 윤년체크하여 29일 유효성 체크 필요
	 * 
	 * @param month
	 * @return
	 */
	int checkDate(int date) {
		
		if(year %  5 == 1 && month == 2 ) {
			if(date < 0 || date > 30) return date;
		}
		return 1;
	}

	/**
	 * 년/월/일 의 형태의 날짜 정보를 반환 예> 2013/07/26
	 * 
	 * @return
	 */
	public String toString() {
		return String.format("4d% / %02d / %02d" , this.year, this.month, this.date );
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
	
	
}
