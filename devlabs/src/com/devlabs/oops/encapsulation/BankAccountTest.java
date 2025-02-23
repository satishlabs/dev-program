package com.devlabs.oops.encapsulation;

public class BankAccountTest {
	public static void main(String[] args) {
		BankAccount account = new BankAccount(1000.50);
		
		//Read-Only : Access balance using getter
		System.out.println("Current balance: "+account.getBalance());
		
		//Write-Only: Modify balance using setter
		account.setBalance(2000.75);
		System.out.println("Updated balance: "+account.getBalance());
	}
}
