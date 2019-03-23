package org.catmcfish.ta;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.StringTokenizer;

public class GameActionListener implements ActionListener {
	TAFrame myframe;
	Room firstRoom;
	Room currentRoom;

	public GameActionListener () {
		currentRoom = firstRoom;
		
	}
	
	public void setFirstRoom(Room aRoom) {
		this.firstRoom = aRoom;
	}

	public void setFrame(TAFrame frame) {
		myframe = frame;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
        String line = e.getActionCommand();
        String command = line.substring(2); // remove the prompt
        myframe.addText("\"" + command + "\"");
        listen(command);
	}

	public void listen(String lineOfText) {

		String consoleResponse = new String();
		// Cut the input into separate words
		StringTokenizer tokenizer = new StringTokenizer(lineOfText);
		if (tokenizer.hasMoreTokens()) {
			String command = tokenizer.nextToken();
			switch (command) {
				case "quit":
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
				case "back":
					// If I can move forward, do so
					if (currentRoom.getRoomBack() != null) {
						currentRoom = currentRoom.getRoomBack();
						consoleResponse = currentRoom.getDescription();
					} else {
						consoleResponse = "I can't move back";
					}					
					
					break;
			}
		}
		
		myframe.addText(consoleResponse);
	}
			
}
