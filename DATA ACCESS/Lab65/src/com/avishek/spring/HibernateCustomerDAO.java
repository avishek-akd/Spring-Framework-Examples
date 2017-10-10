package com.avishek.spring;


import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.DefaultTransactionDefinition;


public class HibernateCustomerDAO implements CustomerDAO {

	@Autowired
	HibernateTemplate hTemp;
	
	


	public CustomerTO getCustomerByEmail(String email) {
		// For Criteria Object We need Session object So go for DetachedCriteria
		
		DetachedCriteria dc = DetachedCriteria.forClass(Customer.class);
		dc.add(Restrictions.eq("email", email));
		List<Customer> custlist = (List<Customer>) hTemp.findByCriteria(dc);
		Customer cust = custlist.get(0);
		CustomerTO cto = new CustomerTO(cust.getCid(), cust.getCname(), cust.getEmail(), cust.getPhone(), cust.getCity());
			
		return cto;
	}


	public List<CustomerTO> getAllCustomers() {
		
		// For Criteria Object We need Session object So go for DetachedCriteria
		
		DetachedCriteria dc = DetachedCriteria.forClass(Customer.class);
		List<Customer> cust = (List<Customer>) hTemp.findByCriteria(dc);
		
		List<CustomerTO> ctoList= new 	ArrayList<CustomerTO>();	
		for (Customer customer : cust) {
			CustomerTO cto = new CustomerTO(customer.getCid(), customer.getCname(), customer.getEmail(), customer.getPhone(), customer.getCity());
			ctoList.add(cto);
		}
		return ctoList;
	}


	public List<CustomerTO> getCustomersByCity(String city) {
		
		DetachedCriteria dc = DetachedCriteria.forClass(Customer.class);
		dc.add(Restrictions.eq("city", city));
		List<Customer> custlist = (List<Customer>) hTemp.findByCriteria(dc);
		
		List<CustomerTO> ctoList= new 	ArrayList<CustomerTO>();	
		
		for (Customer customer : custlist) {
			CustomerTO cto = new CustomerTO(customer.getCid(), customer.getCname(), customer.getEmail(), customer.getPhone(), customer.getCity());
			ctoList.add(cto);
		}
		return ctoList;
	}


	public int getCustomersCount() {
		List list = hTemp.findByNamedQuery("CountAll");
		System.out.println(list.get(0).getClass().getSimpleName());
		BigInteger bint = (BigInteger)list.get(0);
		return bint.intValue();
	}


	public int getCustomersCountByCity(String city) {
		
		List list = hTemp.findByNamedQuery("CountByCity",city);
		System.out.println(list.get(0).getClass().getSimpleName());
		BigInteger bint = (BigInteger)list.get(0);
		return bint.intValue();
		
	}


	public String getCustomerCityByEmail(String email) {
		List list = hTemp.findByNamedQuery("getCity",email);
		System.out.println(list.get(0).getClass().getSimpleName());
		String str = (String)list.get(0);
		return str;
	}


	
	public long getCustomerPhoneByEmail(String email) {
		List list = hTemp.findByNamedQuery("getPhone",email);
		System.out.println(list.get(0).getClass().getSimpleName());
		String str = (String)list.get(0);
		return Long.parseLong(str);
	}

}
