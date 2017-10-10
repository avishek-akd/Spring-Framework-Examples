package com.avishek.spring;

import java.beans.PropertyEditorSupport;
import java.util.Arrays;
import java.util.List;

public class ListEditor extends PropertyEditorSupport {
	
	public void setAsText(String txt){
		System.out.println("Container Use The ListEditor For java.util.List Type Field");
		String str[] = txt.split(",");
		List list = Arrays.asList(str);
		setValue(list);
	}
}
