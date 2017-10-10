package com.avishek.spring;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

@Controller
public class StudentController{
	
	@Autowired
	StudentService ss;
	
	@RequestMapping(value="/student.abhi")
	public String getStudent(HttpServletRequest req){
		
		List list = ss.getStudent();
		req.setAttribute("SLIST", list);
		String view = "show";
		
		return view;
	}
	
}
