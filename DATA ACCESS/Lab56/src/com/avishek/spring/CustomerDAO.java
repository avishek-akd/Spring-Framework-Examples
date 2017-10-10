package com.avishek.spring;

public interface CustomerDAO {
	
	public void addCustomer(CustomerTO cto);
	public void updateustomer(CustomerTO cto);
	public void deleteCustomer(int cid);
	
}
