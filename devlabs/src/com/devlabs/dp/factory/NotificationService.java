package com.devlabs.dp.factory;

public class NotificationService {
	public static void main(String[] args) {
		Notification email = NotifcationFactory.getNotification("email");
		email.notifyUser();
		
		Notification sms = NotifcationFactory.getNotification("sms");
		sms.notifyUser();
		
		Notification push = NotifcationFactory.getNotification("push");
		push.notifyUser();
	}
}
