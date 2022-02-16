package kr.co.mlec.mvc.config;

import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.DispatcherServlet;

public class JavaWebApplicationInitializer implements WebApplicationInitializer {

	public JavaWebApplicationInitializer() {
		System.out.println("자바설정 - web.xml 대체");
	}

	public void onStartup(ServletContext servletContext) throws ServletException {
		System.out.println("자바설정 - onStartup");
		AnnotationConfigWebApplicationContext servletAppContext = new AnnotationConfigWebApplicationContext();
		servletAppContext.register(Config.class);
		
		DispatcherServlet dispatcherServlet = new DispatcherServlet(servletAppContext);

		ServletRegistration.Dynamic servlet = servletContext.addServlet("dispatcher", dispatcherServlet);
		servlet.setLoadOnStartup(1);
		servlet.addMapping("*.do");

		FilterRegistration.Dynamic filter = servletContext.addFilter("encodingFilter", CharacterEncodingFilter.class);
		filter.setInitParameter("encoding", "UTF-8");
		filter.addMappingForServletNames(null, false, "dispatcher");
	}
}
