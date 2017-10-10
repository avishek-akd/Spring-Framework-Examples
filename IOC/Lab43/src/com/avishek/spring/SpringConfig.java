package com.avishek.spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

@Configuration
public class SpringConfig {

	@Bean(name="stu")
	public Student createStudent(){
		Student stu = new Student();
		stu.setSname("Avishek");
		stu.setPhone(111111);
		
		
		return stu;
	}
	
	
	@Bean
	public List<Long> phones(){
		List<Long> phones = new ArrayList<Long>();
		phones.add(111111l);
		phones.add(222222l);
		phones.add(333333l);
		
		return phones;
		
	}
	
	@Bean
	public String emails(){
		return "a@cc,b@cc,c@cc";
	}
	
	@Bean(name="sid")
	public String studentid(){
		return "B01-123";
	}
	
	
	
	@Bean(name="fee")
	public String fee(){
		return "10000.0,8000.0,2000.0";
	}
	
	
	@InitBinder
	public void initBinderAll(WebDataBinder binder){
		binder.registerCustomEditor(List.class, new ListEditor());
		binder.registerCustomEditor(Fee.class, new FeeEditor());
		binder.registerCustomEditor(StudentID.class, new StudentIDEditor());
	}
}
