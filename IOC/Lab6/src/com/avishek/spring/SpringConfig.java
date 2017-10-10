package com.avishek.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class SpringConfig {

	@Bean(name="ao")
	public A createA(){
		A aobj = new A();
		aobj.setA(101);
		aobj.setMsg("Debasis");
		
		return aobj;
	}
	
	@Bean(name="bo")
	public B createB(){
		B bobj = new B(111, "Avishek");
		
		return bobj;
	}
	
	@Bean(name="hello")
	@Scope("singleton")
	@Lazy(true)
	
/*	@Lazy(false)*/
	
	public Hello createHello(A aobj , B bobj){
		Hello h = new Hello(bobj);
		h.setAo(aobj);
		
		return h;
	}
}
