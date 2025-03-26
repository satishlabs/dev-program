package com.devlabs.dp.abstractfactory;

public class PremiumNotificationFactory implements NotificationFactory{

	@Override
	public EmailNotification createEmailNotification() {
		return new PremiumEmailNotification();
	}

	@Override
	public SMSNotification createSmsNotification() {
		return new PremiumSMSNotification();
	}

}
