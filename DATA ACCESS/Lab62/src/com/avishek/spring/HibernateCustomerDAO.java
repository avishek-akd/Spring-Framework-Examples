package com.avishek.spring;


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
	
	
	@Autowired
	HibernateTransactionManager txManager;
	
	
	public void addCustomer(CustomerTO cto) {
		
		TransactionDefinition txDef = new DefaultTransactionDefinition();
		TransactionStatus ts = txManager.getTransaction(txDef);
		
		Customer cust = new Customer(cto.getCname(),cto.getEmail(),cto.getPhone(),cto.getCity());
		hTemp.save(cust);
		
		txManager.commit(ts);
		
	}

	@Transactional
	public void updateCustomer(CustomerTO cto) {

		TransactionDefinition txDef = new DefaultTransactionDefinition();
		TransactionStatus ts = txManager.getTransaction(txDef);
		
		Customer cust = new Customer(cto.getCid(),cto.getCname(),cto.getEmail(),cto.getPhone(),cto.getCity());
		hTemp.update(cust);
		
		txManager.commit(ts);

	}
	

	public void deleteCustomer(int cid) {
		
		TransactionDefinition txDef = new DefaultTransactionDefinition();
		TransactionStatus ts = txManager.getTransaction(txDef);
		
		Customer cust = (Customer) hTemp.load(Customer.class, 102);
		hTemp.delete(cust);
		
		txManager.commit(ts);
		
	}

	public CustomerTO getCustomerByCid(int cid) {
		Customer cust = (Customer) hTemp.load(Customer.class, 101);
		CustomerTO cto = new CustomerTO(cust.getCid(), cust.getCname(), cust.getEmail(), cust.getPhone(), cust.getCity());
		return cto;
	}


	



	
	
	


}
