package com.avishek.spring;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class AbhiExceptionHandler {

	@ExceptionHandler(StudentNotFoundException.class)
	public ModelAndView studentNotFound(StudentNotFoundException snfe){
		System.out.println("---Caught StudentNotFoundException---");
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", snfe.getMessage());
		mav.setViewName("sidsearch");
		
		return mav;
	}
	
	
}
