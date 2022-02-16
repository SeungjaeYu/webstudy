/**
 *  json : 배열([]), 객체({})
 * 
 *  - 이름과 값의 쌍으로 되어있음
 *  - 이름은 반드시 ""로 묶여야 한다.
 *  
 *  {
 *  	name : "홍길동" <- 에러 : name -> "name" 묶어야 한다.
 *  }
 *  
 *  {
 *  	"name" : "홍길동", 
 *  	"age"  : 11
 *  }
 *  
 *  
 *  -->
 *  
 *  class Member {
 *  	String name;
 *  	int age;
 *  }
 *  Member m = new Member()
 *  m.setName("홍길동");
 *  m.setAge(11);
 *  
 *  
 *  [
 *  	"aaa",
 *  	"bbb"
 *  ]
 *  
 *  ->  String[],	List<String>
 *  
 *  {
 *  	"name" : "졸리",
 *  	"hobbys" : ["쇼핑", "직방", "먹기"]
 *  }
 *  
 *  class Member {
 *  	String name;
 *  	List<String> hobbys;
 *  }
 *  
 *  {
 *  	"name" : "졸리",
 *  	"hobbys" : ["쇼핑", "직방", "먹기"]
 *		"addrs" : {"basic" : "서울", "detail" : "강남구"}  
 *  }
 *  
 *  class Addr {
 *  	String basic;
 *  	String detail;
 *  }
 *  
 *  
 *  class Member {
 *  	String name;
 *  	List<String> hobbys;
 *  	Addr addrs;
 *  }
 *  
 *  {
 *  	"name" : "졸리",
 *  	"hobbys" : ["쇼핑", "직방", "먹기"]
 *		"addrs" : {"basic" : "서울", "detail" : "강남구"}
 *		"items" : [
 *			{"name" : "시계", "price" : 10000},
 *			{"name" : "차", "price" : 500000}
 *  	]
 *  }
 *  
 *  class Addr {
 *  	String basic;
 *  	String detail;
 *  }
 *  
 *  class Item {
 *  	String name;
 *  	int price;
 *  }
 *  
 *  
 *  class Member {
 *  	String name;
 *  	List<String> hobbys;
 *  	Addr addrs;
 *  	List<Item> items;
 *  }
 *  
 *  
 */
package net05.json;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class Test01 {
	public static void main(String[] args) {
		// VO 객체의 내용을 json 문자열로 변환
//		test01();
//		test02();
//		test03();
//		test04();
		test05();
	}
	
	private static void test05() {
		String json = "{'name' : '연우', 'age' : 11}";
		Member m = new Gson().fromJson(json, Member.class);
		System.out.println(m.getName());
		System.out.println(m.getAge());
		
	}
	
	private static void test04() {
		Member m = new Member();
		m.setName("예지");
		m.setAge(8);
		
		List<String> list = new ArrayList<>();
		list.add("영화감상");
		list.add("음악감상");
		m.setHobbys(list);
		
		Address addr = new Address();
		addr.setPostNo("12345");
		addr.setBasic("서울시 강남구");
		addr.setDetail("111-111");
		m.setAddr(addr);
		
		
		System.out.println(new Gson().toJson(m));
	}

	private static void test03() {
		Member m = new Member();
		m.setName("예지");
		m.setAge(8);
		
		List<String> list = new ArrayList<>();
		list.add("영화감상");
		list.add("음악감상");
		m.setHobbys(list);
		
		System.out.println(new Gson().toJson(m));
		System.out.println(new Gson().toJson(m));
	}

	private static void test02() {
		Member m = new Member();
		m.setName("예지");
		m.setAge(8);

		/*
		Gson gson = new Gson();
		String json = gson.toJson(m);
		System.out.println(json);
		*/
		System.out.println(new Gson().toJson(m));
	}

	private static void test01() {
		Member m = new Member();
		m.setName("예지");
		m.setAge(8);
		String json = "{\"name\" : \"" + m.getName() + "\", \"age\" : " + m.getAge() + "}";
		System.out.println(json);
		/*
		 * {"name" : "m.getName()", "age" : m.getAge()}
		 * 
		 * 
		 */
		
		
		/*
		 * 	<member>
		 * 		<name>예지</name>
		 * 		<age>8</age>
		 * 	</member>
		 * 
		 * 
		 */
		
		
		
	}
}

