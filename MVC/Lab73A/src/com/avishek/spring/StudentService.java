package com.avishek.spring;

import java.util.ArrayList;
import java.util.List;

public class StudentService {
	
	public List<String> getStudent(){
		List<String> list = new ArrayList<String>();
		list.add("Avishek");
		list.add("Ashutosh");
		list.add("Praveen");
		list.add("Bikash");
		list.add("Sunny");
		
		return list;
	}
}
