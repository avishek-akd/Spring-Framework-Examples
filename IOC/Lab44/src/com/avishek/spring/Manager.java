package com.avishek.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

public class Manager {
	@Autowired
	ApplicationContext ctx;
	
		public void addBatch(BatchTO bto){
			BatchEvent be = new BatchEvent(this, bto);
			ctx.publishEvent(be);
		}
		
		public void addWorkshop(WorkshopTO wto){
			WorkshopEvent we = new WorkshopEvent(this, wto);
			ctx.publishEvent(we);
		}
}
