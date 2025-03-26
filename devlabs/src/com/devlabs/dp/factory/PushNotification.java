package com.devlabs.dp.factory;

public class PushNotification implements Notification{

	@Override
	public void notifyUser() {
		System.out.println("Sending an Push Notification...");
	}

}
