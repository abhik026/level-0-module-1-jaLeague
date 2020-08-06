package _04_int._1_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {
	int score = 0;
	String rightans1 = "A";
	String ans1 =	JOptionPane.showInputDialog("Your Score: "+score+"\nRiddle 1: ?");
	if(ans1.equalsIgnoreCase(rightans1)) {
		JOptionPane.showMessageDialog(null, "Correct!");
	}
	else {
		JOptionPane.showMessageDialog(null,"Incorrect\nCorrect Answer: "+rightans1);
	}
	// 1. Make a variable to hold the score

		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles

		// 4. If they got the answer right, pop up "correct!" and increase the score by one

		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		
	}
}

