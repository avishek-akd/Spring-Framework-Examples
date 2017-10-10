package com.avishek.spring;


import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class UserValidator implements Validator{

	
	@Override
	public boolean supports(Class<?> cls) {
		
		return cls.equals(UserCommand.class);
	}

	@Override
	public void validate(Object command, Errors error) {
		
		UserCommand user = (UserCommand) command;
		String un = user.getUsername();
		String pw = user.getPassword();
		
		if (un==null || un.length()==0) {
			error.rejectValue("username", "error.username.required",null,"Provide Username");
		}
		
		if(pw==null || pw.length()==0) {
			error.rejectValue("password", "error.password.required", null, "Provide Password");
		}

	}

}
