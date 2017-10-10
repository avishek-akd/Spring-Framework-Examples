package com.avishek.spring;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class MyListener3 implements ApplicationListener <WorkshopEvent>{

	
	//Listen Only WorkshopEvent
	
	
	
	public void onApplicationEvent(WorkshopEvent we) {
		System.out.println("ML3-->WorkshopEvent");
			WorkshopTO wto = we.getWto();
			System.out.println(wto);
	}
}
