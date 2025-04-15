package com.rafabispo.banking;

import com.rafabispo.banking.models.Account;
import com.rafabispo.banking.controllers.BankingController;
import com.rafabispo.banking.services.AccountService;
import com.rafabispo.banking.util.Utility;

public class Main {
    public static void main(String[] args) {
        // Create an account
        Account myAccount = new Account("1234567890");

        // Perform transactions
        myAccount.deposit(1000.0);
        System.out.println("Deposit: " + 1000.0);
        System.out.println("Current Balance: " + myAccount.getBalance());

        myAccount.withdraw(250.0);
        System.out.println("Withdraw: " + 250.0);
        System.out.println("Current Balance: " + myAccount.getBalance());
    }
}
