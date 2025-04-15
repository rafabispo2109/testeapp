// In com.rafabispo.banking.models.Account
package com.rafabispo.banking.models;


public class Account {
	private String accountNumber;
	private double balance;
	private String ownerName;
	
	public Account(String accountNumber) {
		this.accountNumber = accountNumber;
		this.ownerName = ownerName;
		this.balance = 0.0;
	}

	public String getAccountNumber() { return accountNumber; }
	public String getOwnerName() { return ownerName; }
	
	public void updateBalance(double amount) {
		this.balance += amount;
		
		}
	
		public double getBalance() {
			return balance;
		}

		public void deposit(double d) {
			// TODO Auto-generated method stub
			
		}

		public void withdraw(double d) {
			// TODO Auto-generated method stub
			
		}
}
