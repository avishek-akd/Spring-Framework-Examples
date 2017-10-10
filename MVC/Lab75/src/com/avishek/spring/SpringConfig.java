package com.avishek.spring;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@ComponentScan({"com.avishek.spring"})
public class SpringConfig {
	
	@Bean
	public InternalResourceViewResolver getResolver(){
		InternalResourceViewResolver vr =  new InternalResourceViewResolver();
		vr.setViewClass(JstlView.class);
		vr.setPrefix("/");
		vr.setSuffix(".jsp");
		
		return vr;
	}
	
	@Bean
	public MessageSource messageSource(){
		ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
		messageSource.setBasename("classpath:message");
		messageSource.setDefaultEncoding("UTF-8");
		
		return messageSource;
	}
}
