package com.devlabs.dp.abstractfactory;

public class PremiumSMSNotification implements SMSNotification{

	@Override
	public void sendSMS(String message) {
		System.out.println("Sending PREMIUM SMS: "+message);
	}

}
