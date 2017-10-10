package com.avishek.spring;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

	
	@Bean(name="hello", autowire=Autowire.BY_TYPE)
	public Hello createHello(){
		Hello h = new Hello();
		return h;
	}
}