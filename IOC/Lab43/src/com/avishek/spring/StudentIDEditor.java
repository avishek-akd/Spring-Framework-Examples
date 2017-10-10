package com.avishek.spring;

import java.beans.PropertyEditorSupport;
import java.util.Arrays;
import java.util.List;

public class StudentIDEditor extends PropertyEditorSupport {
	
	public void setAsText(String txt){
		System.out.println("Container Use The StudentIDEditor For com.avishek.spring.StudentID Type Field");
		
		String str[] = txt.split("-");
		StudentID sid = new StudentID(str[0], Integer.parseInt(str[1]));
		
		setValue(sid);
	}
}
