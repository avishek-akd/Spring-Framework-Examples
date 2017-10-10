package com.avishek.spring;


import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class SidValidator implements Validator{

	
	@Override
	public boolean supports(Class<?> cls) {
		
		return cls.equals(SidSearchCommand.class);
	}

	@Override
	public void validate(Object command, Errors error) {
		
		SidSearchCommand sidSearchCommand = (SidSearchCommand) command;
		
		
		
		String sid = sidSearchCommand.getSid();
		
		if (sid==null || sid.length()==0) {
			error.rejectValue("sid", "error.sid.required",null,"Provide StudentId");
		}else if(!sid.startsWith("CSE-")){
			error.rejectValue("sid", "error.sid.format",null,"Provide Correct StudentId(eg.CSE-123)");
		}else{
			try {
				String temp = sid.substring(4);
				int x = Integer.parseInt(temp);
				if (x<100 || x>999) {
					error.rejectValue("sid", "error.sid.range",null,"Provide Correct StudentId Within Range");
				} else {

				}
			} catch (Exception e) {
				error.rejectValue("sid", "error.sid.integer",null,"Provide digits after CSE-");

			}
		}
	}

}
