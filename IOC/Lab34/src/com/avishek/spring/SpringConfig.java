package com.avishek.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("spring.xml")
public class SpringConfig {

	
	@Bean(name="hello")
	public Hello createHello(A aobj , B bobj){
		Hello h = new Hello();
		return h;
	}
}
