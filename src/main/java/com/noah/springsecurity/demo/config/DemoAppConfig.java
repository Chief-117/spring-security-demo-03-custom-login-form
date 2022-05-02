package com.noah.springsecurity.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.noah.springsecurity.demo")
public class DemoAppConfig {
	//定義bean 給 view
	
	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver =  new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/view/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}
	 public void addResourceHandlers(ResourceHandlerRegistry registry) {
	     registry.addResourceHandler("/css/**").addResourceLocations("/css/");
//	     registry.addResourceHandler("/images/**").addResourceLocations("/images/");
//	     registry.addResourceHandler("/js/**").addResourceLocations("/js/");
	 }
}
