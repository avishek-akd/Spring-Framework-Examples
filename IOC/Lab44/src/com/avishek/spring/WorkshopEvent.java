package com.avishek.spring;

import org.springframework.context.ApplicationEvent;

public class WorkshopEvent extends ApplicationEvent {

	WorkshopTO wto;
	
	public WorkshopEvent(Object source, WorkshopTO wto) {
		super(source);
		this.wto = wto;
	}

	public WorkshopTO getWto() {
		return wto;
	}
	
	

}
