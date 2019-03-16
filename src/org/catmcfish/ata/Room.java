package org.catmcfish.ata;

public class Room {

	// Basic information about this room
	private String name;
	private String description;
	
	// Connections to rooms around this one
	private Room roomLeft;
	private Room roomRight;
	private Room roomForward;
	private Room roomBehind;
	private Room roomUp;
	private Room roomDown;
	
	// Getters and Setters for the private variables
	public Room getRoomLeft() {
		return roomLeft;
	}
	public void setRoomLeft(Room roomLeft) {
		this.roomLeft = roomLeft;
	}
	public Room getRoomRight() {
		return roomRight;
	}
	public void setRoomRight(Room roomRight) {
		this.roomRight = roomRight;
	}
	public Room getRoomUp() {
		return roomUp;
	}
	public void setRoomUp(Room roomUp) {
		this.roomUp = roomUp;
	}
	public Room getRoomBehind() {
		return roomBehind;
	}
	public void setRoomBehind(Room roomBehind) {
		this.roomBehind = roomBehind;
	}
	public Room getRoomForward() {
		return roomForward;
	}
	public void setRoomForward(Room roomForward) {
		this.roomForward = roomForward;
	}
	public Room getRoomDown() {
		return roomDown;
	}
	public void setRoomDown(Room roomDown) {
		this.roomDown = roomDown;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
