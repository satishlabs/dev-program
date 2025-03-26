package com.devlabs.dp.abstractfactory;

//This factory will provide methods for creating both Email and SMS notifications.


//Abstract Factory
public interface NotificationFactory {
	EmailNotification createEmailNotification();
	SMSNotification createSmsNotification();
}
