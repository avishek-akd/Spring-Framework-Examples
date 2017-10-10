package com.avishek.spring;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class MyListener2 implements ApplicationListener <BatchEvent>{

	
	//Listen Only BatchEvent 
	
	
	
	public void onApplicationEvent(BatchEvent be) {
		System.out.println("ML2-->BatchEvent");
			BatchTO bto = be.getBto();
			System.out.println(bto);
	}

}
