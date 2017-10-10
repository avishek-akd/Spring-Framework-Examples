package com.avishek.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig1 {

	@Bean(name="hai")
	public Hai createHai(){
		Hai hai = new Hai();
		
		return hai;
	}
	
}
