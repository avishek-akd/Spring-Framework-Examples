package com.avishek.spring;

public class WorkshopTO {
	
	private String topic;
	private double fee;
	int no_of_seats;
	
	
	public WorkshopTO(String topic, double fee, int no_of_seats) {
		this.topic = topic;
		this.fee = fee;
		this.no_of_seats = no_of_seats;
	}


	@Override
	public String toString() {
		return topic + "\t" + fee + "\t" + no_of_seats;
	}
	
	
	
}
