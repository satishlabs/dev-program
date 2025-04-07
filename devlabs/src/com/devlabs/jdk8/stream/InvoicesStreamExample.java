package com.devlabs.jdk8.stream;

import java.util.Comparator;
import java.util.List;

public class InvoicesStreamExample {
	public static void main(String[] args) {
		List<Invoice> invoices = List.of(
				new Invoice("INV001", 2500.0, true),
				new Invoice("INV002", 3000.0, false),
				new Invoice("INV003", 1500.0, true),
				new Invoice("INV004", 5000.0, true),
				new Invoice("INV005", 4000.0, true)
				);
		
		double top3PaidTotal = invoices.stream()
				.filter(Invoice::isPaid)
				.map(Invoice::getAmount)
				.sorted(Comparator.reverseOrder())
				.limit(3)
				.reduce(0.0, Double::sum);
		System.out.println(top3PaidTotal);
	}
}
