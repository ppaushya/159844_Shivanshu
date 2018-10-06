package org.capg.boot;

import java.util.Scanner;

import org.capg.model.Customer;
import org.capg.service.CustomerServiceimpl;
import org.capg.view.UserInteraction;

public class BootClass {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		UserInteraction userInteraction=new UserInteraction();
		CustomerServiceimpl customerService=new CustomerServiceimpl(); 
		
		
		int choice;
		String option;
		do {
			System.out.println("1.Create customer");
			System.out.println("2.List customer");
			System.out.println("Enter your choice");
			choice=scanner.nextInt();
			switch(choice)
				{
					case 1: Customer customer=userInteraction.getCustomerDetails();
							System.out.println(customer);
							customerService.createCustomer(customer);
							//save the customer in db
							
							break;
		
				}
			
		
			System.out.println("Do you wish to continue?[Y|N]");
			option=scanner.next();
			}while(option=="Y"||option=="y");
		
		
		
	
	}

}
