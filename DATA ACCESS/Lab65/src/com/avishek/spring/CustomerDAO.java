package com.avishek.spring;

import java.util.List;

public interface CustomerDAO {
	

	public CustomerTO getCustomerByEmail(String email);
	
	public List<CustomerTO> getAllCustomers();
	public List<CustomerTO> getCustomersByCity(String city);
	
	public int getCustomersCount();
	public int getCustomersCountByCity(String city);
	
	public String getCustomerCityByEmail(String email);
	public long getCustomerPhoneByEmail(String email);

}
