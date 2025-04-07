package com.devlabs.jdk8.stream;
/*
 You have a list of invoices. You want to:
Filter only paid invoices
Extract the amount
Sort them in descending order
Get the total of top 3 paid invoices
 * */
public class Invoice {
	String id;
	double amount;
	boolean isPaid;
	public Invoice(String id, double amount, boolean isPaid) {
		super();
		this.id = id;
		this.amount = amount;
		this.isPaid = isPaid;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public boolean isPaid() {
		return isPaid;
	}
	public void setPaid(boolean isPaid) {
		this.isPaid = isPaid;
	}
	@Override
	public String toString() {
		return "Invoice [id=" + id + ", amount=" + amount + ", isPaid=" + isPaid + "]";
	}
	
	
}
