package com.avishek.spring;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class StudentController extends AbstractController {
	
	@Autowired
	StudentService ss;
	
	protected ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res) throws Exception {
		
		
		List list = ss.getStudent();
		//req.setAttribute("SLIST", list);
		String view="show";
		ModelAndView mav = new ModelAndView(view,"SLIST",list);
		
		return mav;
	}
	
}
