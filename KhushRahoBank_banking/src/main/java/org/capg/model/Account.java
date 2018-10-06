package org.capg.model;

import java.time.LocalDate;

public class Account {

	private long accountNumber;
	private AccountType account;
	private LocalDate accountOpeningDate;
	private double openingBalance;
	private String description;
	
	public Account() {
		//default constructor
	}
	
	public Account(long accountNumber, AccountType account, LocalDate accountOpeningDate, double openingBalance,
			String description) {
		super();
		this.accountNumber = accountNumber;
		this.account = account;
		this.accountOpeningDate = accountOpeningDate;
		this.openingBalance = openingBalance;
		this.description = description;
	}


	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", accountOpeningDate=" + accountOpeningDate
				+ ", openingBalance=" + openingBalance + ", description=" + description + "]";
	}


	public long getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}


	public AccountType getAccount() {
		return account;
	}


	public void setAccount(AccountType account) {
		this.account = account;
	}


	public LocalDate getAccountOpeningDate() {
		return accountOpeningDate;
	}


	public void setAccountOpeningDate(LocalDate accountOpeningDate) {
		this.accountOpeningDate = accountOpeningDate;
	}


	public double getOpeningBalance() {
		return openingBalance;
	}


	public void setOpeningBalance(double openingBalance) {
		this.openingBalance = openingBalance;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
