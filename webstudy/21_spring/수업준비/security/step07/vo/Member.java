package kr.co.mlec.security.vo;

import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class Member {
	private String id;
	private String password;
	private String name;
	private Date regDate;
	private List<Auth> authList;
}
