package org.catmcfish.ta;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameActionListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
        String line = e.getActionCommand();
        String command = line.substring(2); // remove the prompt
        System.out.println(command);
	}

}
