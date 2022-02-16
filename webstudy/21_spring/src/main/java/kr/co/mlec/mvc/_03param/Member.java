package kr.co.mlec.mvc._03param;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class Member {
	private String id;
	private String password;
	private String name;
	private int age;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date birthDate;
}
