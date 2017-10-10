package com.avishek.spring;

import java.util.Properties;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@ComponentScan({"com.avishek.spring"})
public class SpringConfig {
	
	@Bean
	public InternalResourceViewResolver getResolver(){
		InternalResourceViewResolver viewResolver =  new InternalResourceViewResolver();
		viewResolver.setViewClass(JstlView.class);
		viewResolver.setPrefix("/");
		viewResolver.setSuffix(".jsp");
		
		return viewResolver;
	}
	
	@Bean
	public SimpleMappingExceptionResolver simpleMappingExceptionResolver(){
		SimpleMappingExceptionResolver exceptionResolver =  new SimpleMappingExceptionResolver();
		
		Properties mappings = new Properties();
		mappings.put("com.avishek.spring.StudentNotFoundException", "sidsearch");
		
		exceptionResolver.setExceptionMappings(mappings);
		
		return exceptionResolver;
	}

	@Bean(name="messageSource")
	public MessageSource message(){
		ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
		messageSource.setBasename("classpath:messages");
		messageSource.setDefaultEncoding("UTF-8");
		
		return messageSource;
	}
}
