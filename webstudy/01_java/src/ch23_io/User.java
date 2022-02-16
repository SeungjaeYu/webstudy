package ch23_io;

import java.io.Serializable;

public class User implements Serializable {
	protected String getId() {
		return id;
	}


	protected void setId(String id) {
		this.id = id;
	}


	protected String getName() {
		return name;
	}


	protected void setName(String name) {
		this.name = name;
	}


	private String id;
	private String name;
	private transient int password; //데이터 전송X
	
	
	public User() { }

	public User(String id, String name) {
		this.id = id;
		this.name = name;
	}

}