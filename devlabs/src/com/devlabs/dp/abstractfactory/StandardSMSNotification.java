package com.devlabs.dp.abstractfactory;

public class StandardSMSNotification implements SMSNotification{

	@Override
	public void sendSMS(String message) {
		System.out.println("Sending STANDARD SMS: "+message);
	}

}
