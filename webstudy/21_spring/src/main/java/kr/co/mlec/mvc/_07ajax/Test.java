package kr.co.mlec.mvc._07ajax;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller("kr.co.mlec.mvc._07ajax.Test")
@RequestMapping("/mvc/07ajax")
public class Test {
	
	@RequestMapping("/test01.do")
	@ResponseBody
	public String test01() {
		return "OK, 성공";
	}
	
	@RequestMapping("/test02.do")
	@ResponseBody
	public Map<String, String> test02() {
		Map<String, String> result = new HashMap<>();
		result.put("id", "한동찬");
		result.put("name", "쾌우석");
		result.put("addr", "가필드");
		return result;
	}
	
	@RequestMapping("/test03.do")
	@ResponseBody
	public Member test03() {
		Member m = new Member();
		m.setId("임자바스크립트");
		m.setName("깃동찬");
		m.setPassword("쾌우석");
		return m;
	}
	
	@RequestMapping("/test04.do")
	@ResponseBody
	public List<String> test04() {
		List<String> list = new ArrayList<>();
		list.add("운동하면서");
		list.add("맨날 빵먹으면");
		list.add("살찜");
		return list;
	}
	
	@RequestMapping("/test05.do")
	@ResponseBody
	public List<Member> test05() {
		List<Member> list = new ArrayList<>();
		for (int i = 1; i < 4; i++) {
			Member vo = new Member();
			vo.setId("a" + i);
			vo.setName("b" + i);
			vo.setPassword("p" + i);
			list.add(vo);
		}
		return list;
	}
	
	@RequestMapping("/test06.do")
	public ResponseEntity<String> test06() {	// ResponseEntity => 상태값, 헤더값을 같이 보낼 수 있음
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-type", "apllicaion/json; charset=utf-8");
//		return new ResponseEntity<>("OK, 성공", headers,  HttpStatus.OK);
		return new ResponseEntity<>("OK, 성공", HttpStatus.OK);
	}
	
	@RequestMapping("/test07.do")
	public ResponseEntity<Member> test07() {
		Member m = new Member();
		m.setId("임자바스크립트");
		m.setName("깃동찬");
		m.setPassword("쾌우석");
		return new ResponseEntity<>(m, HttpStatus.OK);
	}
	
	
	@RequestMapping("/test08.do")
	public ResponseEntity<List<Member>> test08() {
		List<Member> list = new ArrayList<>();
		for (int i = 1; i < 4; i++) {
			Member vo = new Member();
			vo.setId("a" + i);
			vo.setName("b" + i);
			vo.setPassword("p" + i);
			list.add(vo);
		}
		return new ResponseEntity<>(list, HttpStatus.OK);
	}
	
	@RequestMapping("/test09.do")
	public ResponseEntity<Object> test09() {
		return new ResponseEntity<>("Error : 서버 문제 발생", HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@RequestMapping("/test10.do")
	public ResponseEntity<Member> test10(@RequestBody Member m) {
		System.out.println("id : " + m.getId());
		System.out.println("name : " + m.getName());
		System.out.println("password : " + m.getPassword());
		return new ResponseEntity<>(m, HttpStatus.OK);
	}
	
	// Rest 방식..
	// HTTP 요청 방식 : GET(조회), POST(등록), PUT(수정), DELETE(삭제)
	/*
     * 	GET		/board		-> 전체조회
     *  GET 	/board/5	-> 5번 게시글 조회
	 *  PUT 	/board/5	-> 5번 게시글 수정
	 *  DELETE  /board/5	-> 5번 게시글 삭제
	 *  POST	/board		-> 등록
	 *  
	 *  URL 의 일부를 변수로 사용?? @PathVariable
	 *	
	 *	REST 방식의 URI 설계
	 *
	 *  - "/"로 계층관계를 나타낸다.(/board/comment)
	 *  - "_"를 사용하지 않는다.(가독성이 떨어짐) 가독성을 높이기 위해 "-"을 주로 사용
	 *  - 소문자가 적합
	 *  - 파일의 확장자를 URI에 포함시키지 않는다.
	 *  
	 */
	@RequestMapping("/member/{id}.do")
	@ResponseBody
//	public String test11(@PathVariable("id") String id) {
	public String test11(@PathVariable String id) {		//변수 이름과 {id}의 이름이 같다면 생략 가능
		System.out.println("PathVariable - id : " + id);
		return "회원 아이디 : " + id;
	}
	
	@GetMapping("/board.do")
	@ResponseBody
	public String test12() {		//변수 이름과 {id}의 이름이 같다면 생략 가능
		return "전체 조회";
	}
	
	@PostMapping("/board.do")
	@ResponseBody
	public String test13() {		//변수 이름과 {id}의 이름이 같다면 생략 가능
		return "게시물 등록처리";
	}
	
	@GetMapping("/board/{no}.do")
	@ResponseBody
	public String test14(@PathVariable int no) {		//변수 이름과 {id}의 이름이 같다면 생략 가능
		return no + "번 게시물 조회";
	}
	
	@DeleteMapping("/board/{no}.do")
	@ResponseBody
	public String test15(@PathVariable int no) {		//변수 이름과 {id}의 이름이 같다면 생략 가능
		return no + "번 게시물 삭제";
	}
	
	@PutMapping("/board/{no}.do")
	@ResponseBody
	public String test16(@PathVariable int no, Board board) {		//변수 이름과 {id}의 이름이 같다면 생략 가능
		return no + "번 게시물 수정";
	}
	
	
}
