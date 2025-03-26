package com.devlabs.dp.abstractfactory;

public class PremiumEmailNotification implements EmailNotification{

	@Override
	public void sendEmail(String message) {
		System.out.println("Sending PREMIUM Email: "+message);
	}
	
}
