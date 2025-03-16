package com.devlabs.oops.composition;

//Room cannot exist without House (Composition)
class Room{
	private String type;
	
	public Room(String type) {
		this.type = type;
	}
	
	public String getType(String type) {
		return type;
	}

	public String getType() {
		return null;
	}
}

//House COMPOSES Rooms (Composition)
class House{
	private Room room;// Strong association
	
	public House() {
		this.room = new Room("Bedroom");// Room is created inside House
	}
	
	public void showDetails() {
		System.out.println("House has a "+room.getType());
	}
}

/*
  Room cannot exist independently without a House.
If the House is destroyed, the Room also gets destroyed.
 * */
public class CompositionExample {
	public static void main(String[] args) {
		House house = new House();
		house.showDetails();
		// No way to access Room separately from House
	}
}
