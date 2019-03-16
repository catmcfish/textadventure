package org.catmcfish.ta;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Runner {

	// Private (so noone outside this class' code can make changes.
	// Static because there should only ever be one instance of this variable
	private static boolean stayRunning = true;
	
	// Use a Scanner to get console input from the player
    static Scanner consoleScanner = new Scanner(System.in);
    
     // Starting room
    static Room driveway;
	
	public static void main(String[] args) {
		
		// Build the map for the game
		constructMap();
			
		// Set our current room to the driveway (our starting point)
		Room currentRoom = driveway;
		
		// Keep looping to capture input as long as stayRunning == true
		while (stayRunning) {
			String inputFromPlayer = consoleScanner.nextLine();
			String consoleResponse = "<no valid response determined>";
			
			// Cut the input into separate words
			StringTokenizer tokenizer = new StringTokenizer(inputFromPlayer);
			if (tokenizer.hasMoreTokens()) {
				String command = tokenizer.nextToken();
				switch (command) {
					case "quit":
						stayRunning = false;
						consoleResponse = "Goodbye.";
						break;
					case "look":
						consoleResponse = currentRoom.getDescription();
						break;		
					case "forward":
						// If I can move forward, do so
						if (currentRoom.getRoomForward() != null) {
							currentRoom = currentRoom.getRoomForward();
							consoleResponse = currentRoom.getDescription();
						} else {
							consoleResponse = "I can't move forward";
						}
				
						break;
					case "behind":
						// If I can move forward, do so
						if (currentRoom.getRoomBehind() != null) {
							currentRoom = currentRoom.getRoomBehind();
							consoleResponse = currentRoom.getDescription();
						} else {
							consoleResponse = "I can't move behind";
						}					
						
						break;
				}
			}
			
			System.out.println(consoleResponse);
		}
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
		frontDoor.setRoomBehind(driveway);		
	}	
	
}
