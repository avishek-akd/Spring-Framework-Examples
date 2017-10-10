package com.avishek.spring;


import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class StudentValidator implements Validator{

	
	@Override
	public boolean supports(Class<?> cls) {
		
		return cls.equals(StudentCommand.class);
	}

	@Override
	public void validate(Object command, Errors error) {
		
		StudentCommand student = (StudentCommand) command;
		
		// Validate StudentId
		
		String sid = student.getSid();
		
		if (sid==null || sid.length()==0) {
			error.rejectValue("sid", "error.required",new Object[]{"StudentId"},"Provide StudentId");
		}else if(!sid.startsWith("CSE-")){
			error.rejectValue("sid", "error.sid.format",null,"Provide Correct StudentId(eg.CSE-123)");
		}
		
		// Validate Student Name
		
		String sname = student.getSname();
		
		if (sname==null || sname.length()==0) {
			error.rejectValue("sname", "error.required",new Object[]{"Name"},"Provide Name");
		}
		
		// Validate Email

		String email = student.getEmail();
		
		if (email==null || email.length()==0) {
			error.rejectValue("email", "error.required",new Object[]{"Email"},"Provide Email");
		}else if(!((email.contains("@")) && (email.endsWith(".com") || email.endsWith(".co.in") || email.endsWith(".in")))){
			error.rejectValue("email", "error.email.format",null,"Invalid Email");
		}
		
		// Validate Phone
		
		String phone = student.getPhone();
		
		if (phone==null || phone.length()==0) {
			error.rejectValue("phone", "error.required",new Object[]{"Phone"},"Provide Phone");
		}else if(phone.length()!=10){
			error.rejectValue("phone", "error.phone.format",null,"Enter 10 Digit No");
		}
		else if(phone.length()==10){
			try {
				//Integer.parseInt(phone);
				Long.parseLong(phone);
			} catch (Exception e) {
				error.rejectValue("phone", "error.phone.digit",null,"Enter Digits");

			}
		}
		
		// Validate Timings
		
		String[] timings = student.getTimings();
		
		if (timings.length<1) {
			error.rejectValue("timings", "error.required",new Object[]{"Timing"},"Provide Timing");
		}
		
		// Validate Gender 
		
		String gender = student.getGender();
		
		if (gender==null || gender.length()==0) {
			error.rejectValue("gender", "error.required",new Object[]{"Gender"},"Provide Gender");
		}
		
		// Validate Qualification
		
		String qualification = student.getQualification();
		
		if (qualification==null || qualification.length()==0 ||qualification.equals("...Select Options...")) {
			error.rejectValue("qualification", "error.required",new Object[]{"Qualification"},"Provide Qualification");
		}
		
	
		
	}

}
