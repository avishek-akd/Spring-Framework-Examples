package com.avishek.spring;

public class StudentNotFoundException extends RuntimeException {

	private String sid;
	
	public StudentNotFoundException(){
	}
	
	public StudentNotFoundException(String sid){
		this.sid = sid;
	}
	
	public String getMessage(){
		String msg = "StudentId Not Found";
		if (sid!=null) {
			msg = "StudentId\t" +sid+ "\tNot Found";
		}
		return msg;
	}
	
}
