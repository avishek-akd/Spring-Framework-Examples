package com.avishek.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.avishek.spring"})
public class SpringConfig {

	
	@Bean(name="manager")
	public Manager getManager(){
		return new Manager();
	}
}
