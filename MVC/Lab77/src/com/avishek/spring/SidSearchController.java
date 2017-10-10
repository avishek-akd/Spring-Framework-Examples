package com.avishek.spring;



import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.validation.Errors;

@Controller
public class SidSearchController{
	
	@Autowired
	SidValidator sidValidator;
	
	@RequestMapping(value="/sidsearch.abhi", method=RequestMethod.GET)
	public String showSearchPage(Map map){
		System.out.println("showRegister()");
		
		SidSearchCommand sidSearchCommand = new SidSearchCommand();
		map.put("sidSearchCommand",sidSearchCommand);
		
		String view = "sidsearch";
		return view;
	}
	
	@RequestMapping(value="/searchStudent.abhi", method=RequestMethod.POST)
	public String searchStudent(@ModelAttribute("sidSearchCommand") SidSearchCommand sidSearchCommand, Errors error, HttpServletRequest req){
		System.out.println("registerStudent");
		
		String view = "sidsearch";
		
		sidValidator.validate(sidSearchCommand, error);
		if (error.hasErrors()) {
			return view;
		}
		
		// Contact With DataBase
		
		String sid = sidSearchCommand.getSid();
		
		if (sid.equals("CSE-123")) {
			StudentTO sto = new StudentTO();
			sto.setSid(sid);
			sto.setBid("A-2");
			sto.setName("Avishek Das");
			sto.setEmail("avishek@gmail.com");
			sto.setPhone("8908904383");
			req.setAttribute("STO", sto);
			view = "sidresult";
		} else {
			req.setAttribute("sidSearchCommand", sidSearchCommand);
			StudentNotFoundException snfe = new StudentNotFoundException(sid);
			String msg = snfe.getMessage();
			req.setAttribute("msg", msg);
			throw snfe;
		}
		
		
		return view;
	}
	
}
