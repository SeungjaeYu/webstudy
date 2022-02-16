package kr.co.mlec.repository.vo;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Test {
	private String msg;
	private String[] aaa;
	private List<String> bbb;
	
	public static void main(String[] args) {
		String[] a = {"a"};

	}
}
