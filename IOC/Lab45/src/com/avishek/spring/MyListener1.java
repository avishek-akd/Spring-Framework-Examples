package com.avishek.spring;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class MyListener1{

	
	//Listen All The Events
	
	
	@EventListener
	public void handleEvent(ApplicationEvent event) {
		System.out.println("ML1-->" + event.getClass().getSimpleName());
		
		if (event instanceof BatchEvent ) {
			BatchEvent be = (BatchEvent) event;
			BatchTO bto = be.getBto();
			System.out.println(bto);
		}else {
			System.out.println("Some Other Event");
		}
		
	}
	
	@EventListener
	public void handleEvent(WorkshopEvent we) {
		System.out.println("ML1-->WorkshopEvent");
			WorkshopTO wto = we.getWto();
			System.out.println(wto);
	}

}
