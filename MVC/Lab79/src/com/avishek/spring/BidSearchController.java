package com.avishek.spring;



import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.validation.Errors;

@Controller
public class BidSearchController{
	
	@Autowired
	BidValidator bidValidator;
	
	@RequestMapping(value="/bidsearch.abhi", method=RequestMethod.GET)
	public String showSearchPage(Map map){
		System.out.println("showSearchPage()");
		
		BidSearchCommand bidSearchCommand = new BidSearchCommand();
		map.put("bidSearchCommand",bidSearchCommand);
		
		String view = "bidsearch";
		return view;
	}
	
	@RequestMapping(value="/searchStudent.abhi", method=RequestMethod.POST)
	public String searchStudent(@ModelAttribute("bidSearchCommand") BidSearchCommand bidSearchCommand, Errors error, HttpServletRequest req){
		System.out.println("searchStudent");
		
		String view = "bidsearch";
		
		bidValidator.validate(bidSearchCommand, error);
		if (error.hasErrors()) {
			return view;
		}
		
		// Contact With DataBase
		
		String sbid = bidSearchCommand.getBid();
		
		if (sbid.equals("B-12")) {
			
			List<StudentTO> slist = new ArrayList<StudentTO>();
			
			StudentTO sto = new StudentTO();
			sto.setSid("CSE-123");
			sto.setBid(sbid);
			sto.setName("Avishek Das");
			sto.setEmail("avishek@gmail.com");
			sto.setPhone("8908904383");
			req.setAttribute("STO", sto);
			
			slist.add(sto);
			
			sto = new StudentTO();
			sto.setSid("CSE-124");
			sto.setBid(sbid);
			sto.setName("Avishek Das");
			sto.setEmail("avishek@gmail.com");
			sto.setPhone("8908904383");
			req.setAttribute("STO", sto);
			
			slist.add(sto);
			
			sto = new StudentTO();
			sto.setSid("CSE-125");
			sto.setBid(sbid);
			sto.setName("Avishek Das");
			sto.setEmail("avishek@gmail.com");
			sto.setPhone("8908904383");
			req.setAttribute("STO", sto);
			
			slist.add(sto);
			
			req.setAttribute("slist", slist);
			
			view = "bidresult";
		} else {
			error.rejectValue("bid", "bid.format", new Object[]{sbid},"Not Found");
		}
		
		
		return view;
	}
	
}
