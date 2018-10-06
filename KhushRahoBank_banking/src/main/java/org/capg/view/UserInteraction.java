package org.capg.view;

import java.time.LocalDate;
import java.util.Scanner;

import org.capg.model.Address;
import org.capg.model.Customer;
import org.capg.util.Utility;

public class UserInteraction {
	
	
			Scanner scanner=new Scanner(System.in);
		public Customer getCustomerDetails() {
			
			Customer customer=new Customer();
			customer.setCustomerId(Utility.generateNumber());
			customer.setFirstName(promptFirstName());
			customer.setLastName(promptLastName());
			customer.setMobile(promptMobile());
			customer.setEmailId(promptEmailId());
			customer.setAddress(promptAddress());
			customer.setDateOfBirth(promptDateOfBirth());
			return customer;
			
			
		}
		
		
		
		public String promptFirstName() {
			boolean flag=false;
			String fname;
			do {
				System.out.println("Enter first name: ");
				fname=scanner.next();
				
				flag=Utility.isValidName(fname);
				if(!flag) 
					System.out.println("Please enter a valid name");
				
				
			}
			while(!flag);
		return fname;
		}
		
		
		

		public String promptLastName() {
			boolean flag=false;
			String lname;
			do {
				System.out.println("Enter last name: ");
				lname=scanner.next();
				
				flag=Utility.isValidName(lname);
				if(!flag) 
					System.out.println("Please enter a valid name");
				
				
			}
			while(!flag);
		return lname;	
		}
		
		public String promptMobile() {
			boolean flag=false;
			String mobile;
			do {
				
			
			System.out.println("Enter the mobile no: ");
			mobile=scanner.next();
			flag=Utility.isValidMobile(mobile);
			if(!flag)
				System.out.println("Please enter a valid mobile number");
			}
			while(!flag);
			return mobile;
			}
		
		public String promptEmailId() {
			boolean flag=false;
			String email;
			do{
				System.out.println("Enter the email id: ");
			
			email=scanner.next();
			flag=Utility.isValidEmail(email);
			if(!flag)
				System.out.println("Enter valid email id : ");
			}
			while(!flag);
			return email;
		
		}
		
		public Address promptAddress() {
			Address address=new Address();
			System.out.println("Enter address line 1: ");
			String tempAdd=scanner.next();
			address.setAddressLine1(tempAdd);
			System.out.println("Enter address line 2: ");
			tempAdd=scanner.next();
			address.setAddressLine2(tempAdd);
			System.out.println("Enter city: ");
			tempAdd=scanner.next();
			address.setCity(tempAdd);
			System.out.println("Enter state: ");
			tempAdd=scanner.next();
			address.setState(tempAdd);
			
			
			boolean flag=false;
			do {
			System.out.println("Enter pincode: ");
			tempAdd=scanner.next();
			flag=Utility.isValidPincode(tempAdd);
			if(!flag)
				System.out.println("Enter a valid pincode");
			}
			while(!flag);
			return address;
			//address.setPincode(tempAdd);
			
			
		}
		
		public LocalDate promptDateOfBirth() {
			String dob;
			boolean flag=false;
			do{
				System.out.println("Enter date of birth[dd-mm-yyyy]");
			
			dob=scanner.next();
			flag=Utility.isValidDateOfBirth(dob);
			if(!flag)
				System.out.println("Enter the correct dob");
			}while(!flag);
			
			Integer year,date,month;
			
			date=Integer.parseInt(dob.substring(0, 2));
			System.out.println(date);
			month=Integer.parseInt(dob.substring(3,5));
			System.out.println(month);
			year=Integer.parseInt(dob.substring(6,10));
			System.out.println(year);
			return LocalDate.of(year, month, date);
			
			
		}
		
		

}


