package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {
	String arjun = ("Intellectual");
	String ames = ("a Great Cook");
	String acha = ("helpful");
	
	String userAns = JOptionPane.showInputDialog("Type in your name"
			+ " to find out something remarkable about yourself");
		// 1. Save something remarkable about each person in a variable.
	String userreturn = userAns.substring(0,1).toUpperCase()+userAns.substring(1);
		// 2. Ask the user to enter a name. Store their answer in a variable.
	if (userAns.equalsIgnoreCase("Brother")) {
		JOptionPane.showMessageDialog(null,userreturn+" is "+arjun);
	}
		
	else if (userAns.equalsIgnoreCase("Mom")) {
		JOptionPane.showMessageDialog(null,userreturn+" is "+ames);
	}
	
	else if (userAns.equalsIgnoreCase("Dad")) {
		JOptionPane.showMessageDialog(null,userreturn+" is "+acha);
	}
	else {
		String userException = JOptionPane.showInputDialog("Hmm... "+userreturn+" We don't seem to know you yet, tell us something"
				+ " remarkable about yourself:");
	
	JOptionPane.showMessageDialog(null, "Thanks's "+userreturn+" for letting us know that you are "+userException+"!");
	
	}
	
	
	// 3. In a pop-up, tell the user what is remarkable about that person. 

	}
}

