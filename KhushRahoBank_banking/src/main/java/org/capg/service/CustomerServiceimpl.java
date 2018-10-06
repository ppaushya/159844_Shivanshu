package org.capg.service;

import java.time.LocalDate;

import org.capg.dao.CustomerDao;
import org.capg.model.Customer;

public class CustomerServiceimpl implements ICustomerService{
	
	CustomerDao customerDao=new CustomerDao();
	
	@Override
	public void createCustomer(Customer customer) {
		if(isValidCustomer(customer))
			customerDao.createCustomer(customer);
		else 
			System.out.println("This is not a valid customer!");
			
			
		
	}
	
	private boolean isValidCustomer(Customer customer) {
		boolean flag=false;
		
		if(customer.getDateOfBirth().isBefore(LocalDate.now()))
		{
			if(customer.getMobile().matches("(7|8|9)\\d{9}"))
				flag=true;
			else flag=false;
			
		}
		else flag=false;
		return flag;
	}

}
