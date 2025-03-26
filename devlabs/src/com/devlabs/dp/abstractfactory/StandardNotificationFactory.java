package com.devlabs.dp.abstractfactory;

public class StandardNotificationFactory implements NotificationFactory{

	@Override
	public EmailNotification createEmailNotification() {
		return new StandardEmailNotification();
	}

	@Override
	public SMSNotification createSmsNotification() {
		return new StandardSMSNotification();
	}

}
