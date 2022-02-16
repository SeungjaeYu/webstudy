package kr.co.mlec.mvc._05return;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.InternalResourceView;

@Controller("kr.co.mlec.mvc._05return.Test")
@RequestMapping("/mvc/05return")
public class Test {
	// webapp/WEB-INF/jsp/mvc/05return/test01.jsp
	@RequestMapping("/test01.do")
	public String test01() { return "mvc/05return/test01"; }
	
	// /WEB-INF/jsp/mvc/05return/test02.jsp
	@RequestMapping("/test02.do")
	public void test02() {}

	// /WEB-INF/jsp/mvc/05return/test02.jsp
	@RequestMapping("/test03.do")
	public ModelAndView test03() {
		return new ModelAndView("mvc/05return/test03");
	}

	@RequestMapping("/test04.do")
	public View test04() {
		View view = new InternalResourceView("/WEB-INF/jsp/mvc/05return/test04.jsp");
		return view;
	}
}








