package _04_int._1_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {
		
		int score = 0;

	String rightans1 = "coffin";
	String ans1 =	JOptionPane.showInputDialog("Riddle 1: Who makes it, has no need of it.\r\n" + 
			"Who buys it, has no use for it.\r\n" + 
			"Who uses it can neither see nor feel it.\r\n" + 
			"What is it? ");
	String anslower1 = ans1.toLowerCase();
	if(anslower1.contains(rightans1)){
		JOptionPane.showMessageDialog(null, "Correct!");
		score += 5;
	}
	else {
		JOptionPane.showMessageDialog(null,"Incorrect\nCorrect Answer: "+rightans1);

	
	
	String rightans2 = "piano";
	String ans2 =	JOptionPane.showInputDialog("Score: "+score+" \nRiddle 2: What has many keys but can't open a single lock?");
	String anslower2 = ans2.toLowerCase();
	if(anslower2.contains(rightans2)){
		JOptionPane.showMessageDialog(null, "Correct!");
		score += 3;
	}
	else {
		JOptionPane.showMessageDialog(null,"Incorrect\nCorrect Answer: "+rightans2);

	}
	
	String rightans3 = "fence";
	String ans3 =	JOptionPane.showInputDialog("Score: "+ score+"\nRiddle 3: What runs all around a backyard, yet never moves? ");
	String anslower3 = ans3.toLowerCase();
	if(anslower3.contains(rightans3)){
		JOptionPane.showMessageDialog(null, "Correct!");
		score += 2;
	}
	else {
		JOptionPane.showMessageDialog(null,"Incorrect\nCorrect Answer: "+rightans3);

	}
	
	
	String rightans4 = "tongue";
	String ans4 =	JOptionPane.showInputDialog("Score: "+ score+"\nRiddle 4: What tastes better than it smells?");
	String anslower4 = ans4.toLowerCase();
	if(anslower4.contains(rightans4)){
		JOptionPane.showMessageDialog(null, "Correct!");
		score += 4;
	}
	else {
		JOptionPane.showMessageDialog(null,"Incorrect\nCorrect Answer: "+rightans4);

	}
	
	String rightans5 = "coin";
	String ans5 =	JOptionPane.showInputDialog("Score: "+ score+"\nRiddle 5: What has a head and a tail, but no body? ");
	String anslower5 = ans5.toLowerCase();
	if(anslower5.contains(rightans5)){
		JOptionPane.showMessageDialog(null, "Correct!");
		score += 1;
	}
	else {
		JOptionPane.showMessageDialog(null,"Incorrect\nCorrect Answer: "+rightans5);

	}
	
	JOptionPane.showMessageDialog(null, "Final Score: "+ score+"\nThanks for playing!");
	}
}
}
