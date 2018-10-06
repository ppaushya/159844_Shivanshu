package org.capg.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.capg.model.Account;
import org.capg.model.Address;
import org.capg.model.Customer;

public class CustomerDao {

private static List<Customer> customers=dummyDb();
	
	private static List<Customer> dummyDb(){
		List<Customer> customers=new ArrayList<>();
		
		Address address=new Address("23,west Car St", "2nd St", "Chennai", "TN", "234442");
		customers.add(new Customer(123,"Jack","Thomson", 
				"jack@gmail.com","8890912345",LocalDate.of(1991, 01, 23),address));
		
		Address address1=new Address("North Avnnue", "2nd Cross St", "Hyderabad", "AP", "657657");
		customers.add(new Customer(1090,"Tom","Jerry",
				"tom@gmail.com","9090912345", LocalDate.of(1987, 12, 23),address1));
		
		return customers;
	}

}


