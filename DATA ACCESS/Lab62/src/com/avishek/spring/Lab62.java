package com.avishek.spring;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Lab62 {
	
	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		
		System.out.println("----------Spring Container Is Ready----------\n");
		
		CustomerDAO cdao = (CustomerDAO) ctx.getBean("cdao");
		
		// Add Customer
		CustomerTO cto1 = new CustomerTO("B", "b@jlc", 2222, "HYD");
		cdao.addCustomer(cto1);
		
		// Update Customer
		cto1 = new CustomerTO(101,"A", "a@jlc", 1111, "BBSR");
		cdao.updateCustomer(cto1);
		
		// Delete Customer
		cdao.deleteCustomer(102);
		
		// GetCustomerByCid
		cto1 = cdao.getCustomerByCid(101);
		System.out.println(cto1);
		
		
	}
}


