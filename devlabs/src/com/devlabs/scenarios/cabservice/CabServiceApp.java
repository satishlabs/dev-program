package com.devlabs.scenarios.cabservice;

import java.util.List;

public class CabServiceApp {
	public static void main(String[] args) {
		CabService service = new CabService();

		// Adding cabs
		service.addCab(new Cab("CAB101", "Downtown"));
		service.addCab(new Cab("CAB102", "Uptown"));
		service.addCab(new Cab("CAB103", "Downtown"));

		// Display all cabs
		service.displayAllCabs();

		// Check available cabs at Downtown
		System.out.println("\nCabs available at Downtown:");
		List<String> available = service.getAvailableCabsAtLocation("Downtown");
		System.out.println(available);

		// Book a cab and update location
		if (!available.isEmpty()) {
			String cabToBook = available.get(0);
			service.updateLocation(cabToBook, "Airport");
			System.out.println("\nUpdated cab " + cabToBook + " to Airport.");
		}

		// Final state of all cabs
		System.out.println("\nAfter booking and updating location:");
		service.displayAllCabs();
	}
}
