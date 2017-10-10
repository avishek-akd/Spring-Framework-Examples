package com.avishek.spring;



import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.validation.Errors;

@Controller
public class HomeController{
	
	
	@RequestMapping(value="/home.abhi")
	public String showHomePage(){
		System.out.println("showHomePage()");
		
		String view = "home";
		return view;
	}

}


