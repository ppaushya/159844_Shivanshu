package org.capg.model;

import java.time.LocalDate;
import java.util.Set;

public class Customer {
	
	private int customerId;
	private String firstName;
	private String lastName;
	private String emailId;
	private String mobile;
	private LocalDate dateOfBirth;
	private Address address;
	private Set<Account> accounts;
	
	
	public Customer(int customerId, String firstName, String lastName, String emailId, String mobile,
			LocalDate dateOfBirth, Address address) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.mobile = mobile;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
	}
	
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Set<Account> getAccounts() {
		return accounts;
	}
	public void setAccounts(Set<Account> accounts) {
		this.accounts = accounts;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", emailId=" + emailId + ", mobile=" + mobile + ", dateOfBirth=" + dateOfBirth + ", address="
				+ address + ", accounts=" + accounts + "]";
	}
	public Customer(int customerId, String firstName, String lastName, String emailId, String mobile,
			LocalDate dateOfBirth, Address address, Set<Account> accounts) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.mobile = mobile;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.accounts = accounts;
	}

	public Customer() {
		//default constructor
	}

}
