package com.devlabs.dp.abstractfactory;

public class StandardEmailNotification implements EmailNotification{

	@Override
	public void sendEmail(String message) {
		System.out.println("Sending STANDARD Email: "+message);
	}

}
