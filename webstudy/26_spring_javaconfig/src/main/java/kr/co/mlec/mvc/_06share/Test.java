package kr.co.mlec.mvc._06share;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller("kr.co.mlec.mvc._06share.Test")
@RequestMapping("/mvc/06share")
public class Test {
	@RequestMapping("/test01.do")
	public void test01(HttpServletRequest request, Member member) {
		request.setAttribute("member", member);
	}
	
	@RequestMapping("/test02.do")
	public void test02(Member member) {
		System.out.println("test02 메서드 호출됨..");
	}
	
	@RequestMapping("/test03.do")
	public void test03(@ModelAttribute("m") Member member) {
		System.out.println("test03 메서드 호출됨..");
	}
	
	@RequestMapping("/test04.do")
	public void test04(Member member, Model model) {
		System.out.println("test04 메서드 호출됨..");
		model.addAttribute("msg", "테스트");
		model.addAttribute("m", member);
	}
	
	@RequestMapping("/test05.do")
	public void test05(Member member, Map<String, Object> map) {
		System.out.println("test05 메서드 호출됨..");
		map.put("msg", "테스트");
		map.put("m", member);
	}
	
	@RequestMapping("/test06.do")
	public String test06(RedirectAttributes attr) {
		System.out.println("test06 메서드 호출됨..");
		attr.addFlashAttribute("msg1", "hi");  // 1회성 데이터 설정
		attr.addAttribute("msg2", "hello");  // 파라미터 설정 개념
		return "redirect:/mvc/06share/test07.do";
	}
	
	@RequestMapping("/test07.do")
	public void test07() {
		System.out.println("test07 메서드 호출됨..");
	}
	
	
	
}








