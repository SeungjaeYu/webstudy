package kr.co.mlec.mvc.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import kr.co.mlec.mvc._09interceptor.AuthInterceptor;

@EnableWebMvc
@Configuration
@ComponentScan("kr.co.mlec.mvc")
public class Config implements WebMvcConfigurer {
	/*
		<mvc:message-converters>
			<bean class="org.springframework.http.converter.StringHttpMessageConverter">
				<property name="supportedMediaTypes">
					<list>
						<value>text/plain; charset=UTF-8</value>
						<value>text/html; charset=UTF-8</value>
					</list>
				</property>
			</bean>
		</mvc:message-converters>	
	 */
	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		StringHttpMessageConverter shmc = new StringHttpMessageConverter();
		List<MediaType> list = new ArrayList<>();
		list.add(MediaType.TEXT_PLAIN);
		shmc.setSupportedMediaTypes(list);
		converters.add(shmc);
	}
	
	
	/*
	<mvc:interceptors>
		<mvc:interceptor>
			<mvc:mapping path="/mvc/09interceptor/**" />
			<mvc:exclude-mapping path="/mvc/09interceptor/login*.do" />
			<bean class="kr.co.mlec.mvc._09interceptor.AuthInterceptor" />
		</mvc:interceptor>
	</mvc:interceptors>
	 */
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new AuthInterceptor()).addPathPatterns("/mvc/09interceptor/**").excludePathPatterns("/mvc/09interceptor/login*.do");
	}	

	/*
	<bean id="multipartResolver"
		  class="org.springframework.web.multipart.commons.CommonsMultipartResolver">
		<property name="maxUploadSize" value="10485760" />
	</bean>
	*/
	@Bean("multipartResolver")
	public CommonsMultipartResolver getCommonsMultipartResolver() {
		CommonsMultipartResolver resolver = new CommonsMultipartResolver();
		resolver.setMaxUploadSize(10485760);
		return resolver;
	}
	
	// <mvc:default-servlet-handler /> 
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}

	/*
	  	<mvc:view-resolvers>
			<mvc:jsp prefix="/WEB-INF/jsp/" suffix=".jsp" />
		</mvc:view-resolvers>
	 */
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setViewClass(JstlView.class);
		resolver.setPrefix("/WEB-INF/jsp/");
		resolver.setSuffix(".jsp");
		registry.viewResolver(resolver);
	}
}









