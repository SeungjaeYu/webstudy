package ch22_collection03.sort.exam;

public class QuizUI {
	private String name;
	private int java;
	private int sql;
	private int jdbc;
	int totalScore;
	
	protected int getTotalScore() {
		return java + sql + jdbc;
	}
	QuizUI(String name, int java, int sql, int jdbc){
		this.name = name;
		this.java = java;
		this.sql = sql;
		this.jdbc = jdbc;
		this.totalScore = totalScore;
	}


	protected String getName() {
		return name;
	}


	protected void setName(String name) {
		this.name = name;
	}


	protected int getJava() {
		return java;
	}


	protected void setJava(int java) {
		this.java = java;
	}


	protected int getSql() {
		return sql;
	}


	protected void setSql(int sql) {
		this.sql = sql;
	}


	protected int getJdbc() {
		return jdbc;
	}


	protected void setJdbc(int jdbc) {
		this.jdbc = jdbc;
	}
	
	public String toString() {
		return name + "(" + this.getTotalScore()+ "점)" +
	     ", 자바(" + java +"점-"+ (java>=70 ? "수료" : "미수료")+ ")"+
	     ", SQL(" + sql +"점-"+ (sql>=80 ? "수료" : "미수료")+ ")" +	
	     ", jdbc(" + jdbc +"점-"+ (jdbc>=80 ? "수료" : "미수료")+ ")"; 
				
	}



	/*
	public void service() {
		while(true) {
			System.out.println("--------------");
			System.out.println("학생 정보");
			System.out.println("--------------");
			
		}
		
	}
	*/
	

}
