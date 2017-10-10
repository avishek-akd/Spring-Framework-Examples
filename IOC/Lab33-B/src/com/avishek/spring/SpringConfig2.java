package com.avishek.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(SpringConfig1.class)
public class SpringConfig2 {

	
	
	@Bean(name="hello")
	public Hello createHello(){
		Hello h = new Hello();
		return h;
	}
}
