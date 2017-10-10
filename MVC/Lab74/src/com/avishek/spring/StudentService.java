package com.avishek.spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;



@Service
public class StudentService {
	
	public List<String> getStudent(){
		List<String> list = new ArrayList<String>();
		list.add("Avishek");
		list.add("Ashutosh");
		list.add("Praveen");
		list.add("Bikash");
		list.add("Sunny");
		list.add("Aswini");
		
		return list;
	}
}
