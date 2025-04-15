// In com.rafabispo.banking.controllers.BankinController
package com.rafabispo.banking.controllers;

import com.rafabispo.banking.models.Account;
import com.rafabispo.banking.services.AccountService;

public class BankingController {
	public void managerAccount() {
		AccountService accountService = new AccountService();
		Account account = accountService.createAccount("Rafael Meneses");
		
		System.out.println("Account created for "+ account.getOwnerName() + "withaccount" + account.getAccountNumber());
		
		accountService.deposit(account, 500.0);
		System.out.println("Balance after deposit: $" + account.getBalance());
		
		accountService.withdraw(account, 300.0);
		System.out.println("Balance after withdrawal: $" + account.getBalance());
		
	}

}
