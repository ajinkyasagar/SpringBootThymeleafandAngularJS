package com.course.tutorial;

import javax.xml.ws.soap.Addressing;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
public class MVCConfig extends WebMvcConfigurerAdapter {

	

	 

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
	
		registry.addViewController("/home").setViewName("home");
        registry.addViewController("/").setViewName("home");
        registry.addViewController("/hello").setViewName("hello");
        registry.addViewController("/login").setViewName("login");
	}
	
	
	@Bean
	  public InternalResourceViewResolver viewResolver() {
	   InternalResourceViewResolver resolver = new InternalResourceViewResolver();
	   resolver.setPrefix("/WEB-INF/");
	   resolver.setPrefix("/templates/");
	   resolver.setPrefix("/WEB-INF/js/");
	   resolver.setSuffix(".html");
	   return resolver;
	  }
	
	
}
