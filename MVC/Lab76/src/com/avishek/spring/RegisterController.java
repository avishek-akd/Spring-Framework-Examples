package com.avishek.spring;



import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.validation.Errors;

@Controller
public class RegisterController{
	
	@Autowired
	StudentValidator studentValidator;
	
	@RequestMapping(value="/register.abhi", method=RequestMethod.GET)
	public String showRegister(Map map){
		System.out.println("showRegister()");
		
		StudentCommand student = new StudentCommand();
		map.put("student",student);
		
		String view = "register";
		return view;
	}
	
	@RequestMapping(value="/registerStudent.abhi", method=RequestMethod.POST)
	public String registerStudent(@ModelAttribute("student") StudentCommand student, Errors error){
		System.out.println("registerStudent");
		
		studentValidator.validate(student, error);
		if (error.hasErrors()) {
			return "register";
		}
		
		System.out.println(student.getSid());
		System.out.println(student.getSname());
		System.out.println(student.getEmail());
		System.out.println(student.getPhone());
		System.out.println(student.getGender());
		System.out.println(student.getQualification());
		System.out.println(student.getRemarks());
		String timings[] = student.getTimings();
		for (String string : timings) {
			System.out.println(string);
		}
		
		
		
		
		return "home";
		
		
	}
	
}
