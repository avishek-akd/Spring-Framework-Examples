package com.avishek.spring;

public class BatchTO {
	
	private int bid;
	private String start_date;
	private String timing;
	private int no_of_seats;
	
	
	public BatchTO(int bid, String start_date, String timing, int no_of_seats) {
		this.bid = bid;
		this.start_date = start_date;
		this.timing = timing;
		this.no_of_seats = no_of_seats;
	}


	@Override
	public String toString() {
		return bid + "\t" + start_date + "\t" + timing + "\t"
				+ no_of_seats;
	}
	
	
	
	
}
