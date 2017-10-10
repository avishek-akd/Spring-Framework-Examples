package com.avishek.spring;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class MyListener2 {

	
	//Listen Only BatchEvent 
	
	
	@EventListener
	public void handleEvent(BatchEvent be) {
		System.out.println("ML2-->BatchEvent");
			BatchTO bto = be.getBto();
			System.out.println(bto);
	}

}
