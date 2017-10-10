package com.avishek.spring;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

@Controller
public class UserController{
	
	
	@RequestMapping(value="/hello.abhi")
	public String showHello(){
		System.out.println("showHello()");
		
		return "hello";
	}
	
	@RequestMapping(value="/admin.abhi")
	public String showAdmin(){
		System.out.println("showAdmin()");
		
		return "admin";
	}
	
	@RequestMapping(value="/employee.abhi")
	public String showEmployee(){
		System.out.println("showEmployee()");
		
		return "employee";
	}
	
	@RequestMapping(value="/logout")
	public String showLogoutPage(HttpServletRequest req, HttpServletResponse res){
		System.out.println("showLogoutPage()");
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		
		if(auth != null)
			new SecurityContextLogoutHandler().logout(req, res, auth);
		
		return "redirect:/login?logout";
	}
	
	
	
}
