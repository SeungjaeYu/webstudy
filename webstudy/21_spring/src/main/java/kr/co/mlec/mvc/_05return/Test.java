package kr.co.mlec.mvc._05return;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.InternalResourceView;

@Controller("kr.co.mlec.mvc._05return.Test")
@RequestMapping("/mvc/05return")
public class Test {
	
	@RequestMapping("/test01.do")
	public String test01() {
		return "mvc/05return/test01";
	}
	
	@RequestMapping("/test02.do")
	public void test02() {
		
	}
	
	@RequestMapping("/test03.do")
	public ModelAndView test03() {
		return new ModelAndView("mvc/05return/test03");
	}
	
	@RequestMapping("/test04.do")
	public View test04() {
		// spring이 지정한 페이지가 아닌 내가 지정한 페이지를 갈 수 있다(prefix, suffix의 영향을 받지 않는다)
		View view = new InternalResourceView("/WEB-INF/jsp/mvc/05return/test04.jsp");
		return view;
		
	}
	
	
}
