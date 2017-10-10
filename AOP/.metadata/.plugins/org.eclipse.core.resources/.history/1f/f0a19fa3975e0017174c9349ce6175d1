package com.avishek.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@Configuration
public class SpringConfig {

	@Bean(name="cs")
	public CustomerServiceImpl createCS(){
		return new CustomerServiceImpl();
	}
	
	@Bean(name="as")
	public AccountService createAS(){
		return new AccountService();
	}
	
	@Bean
	public SecurityService createSS(){
		return new SecurityService();
	}
	
	@Bean
	public LogService createLS(){
		return new LogService();
	}
	
	@Bean
	public TxServices createTS(){
		return new TxServices();
	}
	
	
}
