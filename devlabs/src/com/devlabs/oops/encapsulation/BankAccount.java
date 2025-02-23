package com.devlabs.oops.encapsulation;

/*
 Encapsulation with Read-Only and Write-Only Fields
 
Sometimes, you may want:

Read-Only Properties (only getter, no setter).
Write-Only Properties (only setter, no getter).

 * */
public class BankAccount {
	private double balance;
	
	public BankAccount(double balance) {
		this.balance = balance;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		if(balance >= 0) {
			this.balance = balance;
		}else {
			System.out.println("Balance cannot be negative");
		}
	}
}
