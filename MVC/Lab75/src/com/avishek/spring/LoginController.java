package com.avishek.spring;



import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.validation.Errors;

@Controller
public class LoginController{
	
	@Autowired
	UserValidator userValidator;
	
	@RequestMapping(value="/login.abhi", method=RequestMethod.GET)
	public String showLogin(Map map){
		System.out.println("showLogin()");
		
		UserCommand user = new UserCommand();
		map.put("user",user);
		
		String view = "login";
		return view;
	}
	
	@RequestMapping(value="/verifyUser.abhi", method=RequestMethod.POST)
	public String verifyUser(@ModelAttribute("user") UserCommand user, Errors error){
		System.out.println("verifyUser()");
		
		userValidator.validate(user, error);
		if (error.hasErrors()) {
			return "login";
		}
		
		
		String un = user.getUsername();
		String pw = user.getPassword();
		
		if (un.equals(pw)) {
			return "home";
		}
		
		return "login";
		
		
	}
	
}
