package com.rafabispo.banking.services;

import com.rafabispo.banking.models.Account;
import com.rafabispo.banking.util.Utility;


public class AccountService {
	public Account createAccount(String ownerName) {
		String accountNumber = Utility.generateAccountNumber();
		return new Account(accountNumber);
		
	}
	
	public void deposit(Account account, double amount) {
		account.updateBalance(amount);
		
	}
	
	public void withdraw(Account account, double amount) {
		if (account.getBalance() >= amount) {
			account.updateBalance(-amount);
		} else {
			System.out.println("insufficient funds!");
		}
		}
	}

