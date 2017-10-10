package com.avishek.spring;


import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class BidValidator implements Validator{

	
	@Override
	public boolean supports(Class<?> cls) {
		
		return cls.equals(BidSearchCommand.class);
	}

	@Override
	public void validate(Object command, Errors error) {
		
		BidSearchCommand bidSearchCommand = (BidSearchCommand) command;
		
		
		
		String bid = bidSearchCommand.getBid();
		
		if (bid==null || bid.length()==0) {
			error.rejectValue("bid", "error.bid.required",null,"Provide BatchId");
		}else if(!bid.startsWith("B-")){
			error.rejectValue("bid", "error.bid.format",null,"Provide Correct BatchId(eg.B-12)");
		}else{
			try {
				String temp = bid.substring(2);
				int x = Integer.parseInt(temp);
				if (x<10 || x>99) {
					error.rejectValue("bid", "error.bid.range",null,"Provide Correct BatchId Within Range");
				} else {

				}
			} catch (Exception e) {
				error.rejectValue("bid", "error.bid.integer",null,"Provide digits after B-");

			}
		}
	}

}
