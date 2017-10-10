package com.avishek.spring;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;


public class HibernateCustomerDAO extends HibernateDaoSupport implements CustomerDAO     {


	public void addCustomer(CustomerTO cto) {

		final Customer cust = new Customer(cto.getCname(),cto.getEmail(),cto.getPhone(),cto.getCity());
		
		HibernateCallback<Session> hc = new HibernateCallback<Session>() {
			public Session doInHibernate(Session session) throws HibernateException {
				
					session.save(cust);

				return session;
			}
		};
		
		getHibernateTemplate().execute(hc);
	}

}
