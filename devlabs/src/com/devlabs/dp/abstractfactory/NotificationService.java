package com.devlabs.dp.abstractfactory;

public class NotificationService {
	private EmailNotification emailNotification;
	private SMSNotification smsNotification;
	
	public NotificationService(NotificationFactory factory) {
		this.emailNotification = factory.createEmailNotification();
		this.smsNotification = factory.createSmsNotification();
	}
	
	public void sendNotification(String message) {
		emailNotification.sendEmail(message);
		smsNotification.sendSMS(message);
	}
	
	
	public static void main(String[] args) {
		 // Using PREMIUM factory
		NotificationFactory premiumFactory = new PremiumNotificationFactory();
		NotificationService premiumService = new NotificationService(premiumFactory);
		premiumService.sendNotification("Premium user alert!");
		
		System.out.println("--------------------------------");
		// Using STANDARD factory
		NotificationFactory standardFactory = new StandardNotificationFactory();
		NotificationService standardService = new NotificationService(standardFactory);
		standardService.sendNotification("Standard user alert!");
	}
	
}
