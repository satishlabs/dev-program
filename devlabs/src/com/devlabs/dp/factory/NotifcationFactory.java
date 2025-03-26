package com.devlabs.dp.factory;

public class NotifcationFactory {
	public static Notification getNotification(String type) {
		if(type == null) {
			throw new IllegalArgumentException("Notification type cannot be null");
		}
		
		switch (type) {
		case "email": 
			return new EmailNotification();
		case "sms":
			return new SMSNotification();
		case "push":
			return new PushNotification();
		default:
			throw new IllegalArgumentException("Unexpected value: " + type);
		}
	}
	
}
