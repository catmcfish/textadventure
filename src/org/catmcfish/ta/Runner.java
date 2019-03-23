package org.catmcfish.ta;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Runner {
 
     // Starting room
    static Room driveway;
	
	public static void main(String[] args) {
		TAFrame frame = new TAFrame();
			
		// Set our current room to the driveway (our starting point)
		Room currentRoom = driveway;
		
		// Build the map for the game
		constructMap(); 
		
		frame.getGal().setFirstRoom(driveway);
		frame.addText("Welcome to 'The Game'");	
	}
	
	private static void constructMap() {
		// Setup the first room
		driveway = new Room();
		driveway.setName("Driveway");
		driveway.setDescription("A gravel driveway off a dirt road.");
		
		// Setup the second room
		Room frontDoor = new Room();
		frontDoor.setName("Front Door");
		frontDoor.setDescription("You're standing in front of the front door to an old abandon house.");
		
		// Connect the two rooms
		driveway.setRoomForward(frontDoor);
		frontDoor.setRoomBack(driveway);		
	}	
	
}
