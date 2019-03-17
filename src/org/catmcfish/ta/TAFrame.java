package org.catmcfish.ta;

import java.awt.*;
import java.awt.event.*;  

public class TAFrame extends Frame {
	private static final long serialVersionUID = 1L;

	private TextArea textArea;
	private TextField textField;
	private GameActionListener gal;
	
	TAFrame() {  
		textArea = new TextArea();
		textArea.setBounds(10,30, 500,500);
		textArea.setEditable(false);
		
		textField = new TextField();
		textField.setText(">>"); // prompt 
		
		gal = new GameActionListener();
		
		textField.addActionListener(gal);
		
		setSize(500,500);
		
		// Add a WindowListener that will listen for someone clicking on the Close Window button
		// Then kill the application
		this.addWindowListener(new WindowAdapter() {
	         public void windowClosing(WindowEvent windowEvent){
	            System.exit(0);
	         }        
	      });
 
		add(textArea, BorderLayout.CENTER); // Add textArea to the frame
		add(textField, BorderLayout.SOUTH); // Add textField to the frame
		setVisible(true); // After adding the components, make it visible
	}  
	
	public void addText(String text) {
		textArea.append(text);
	}
}
