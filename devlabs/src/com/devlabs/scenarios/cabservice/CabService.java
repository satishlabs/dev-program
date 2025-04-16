package com.devlabs.scenarios.cabservice;

import java.util.ArrayList;
import java.util.List;

public class CabService {
	private final List<Cab> cabs = new ArrayList<>();
	
	//Add can to the system
	public void addCab(Cab cab) {
		cabs.add(cab);
	}
	
	 // 1. Check available cabs for a location
	public List<String> getAvailableCabsAtLocation(String location){
		List<String> availableCabs = new ArrayList<String>();
		for(Cab cab : cabs) {
			if(cab.getLocation().equalsIgnoreCase(location)) {
				availableCabs.add(cab.getId());
			}
		}
		return availableCabs;
	}
	// 2. Update location of a booked cab
	public boolean updateLocation(String cabId, String newLocation) {
		for(Cab cab: cabs) {
			if(cab.getId().equals(cabId)) {
				cab.setLocation(newLocation);
				return true;
			}
		}
		return false;
	}
	 // 3. Display all cabs
	public void displayAllCabs() {
		System.out.println("List of all cabs:");
		for(Cab cab: cabs) {
			System.out.println(cab);
		}
	}
}
