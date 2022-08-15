package Project0;

//Damian Rozpedowski
//CSCI 212 Java Lab 22D with Ali (Yafang) Zhao

import javax.swing.*;

public class Project0 {
	
	/* The user is asked to input a sentence. Then the program finds
	 * and displays how many upper case and lower case e's are in the
	 * string with the use of a for loop. Runs until user enters Stop.
	*/
	public static void main(String[] args) {
		
		String inputWord;
		int numLowerE= 0;
		int numUpperE= 0;
		
		// Infinite loop but can be exited when user enters Stop
		while(true) {
			inputWord = JOptionPane.showInputDialog(null, "Please type in a sentence:");
			
			// When user enters "Stop", ends while loop, not case sensitive
			if (inputWord.equalsIgnoreCase("Stop")){
				System.exit(0);
			}
			
			// Loops based on string length
			for(int i=0; i<inputWord.length(); i++) {
				// Gets the char based on the index, index starts at 0
				char testChar= inputWord.charAt(i);
				
				// Tests characters and increments variables if 'e' or 'E' is found
				if(testChar == 'e') {
					numLowerE++;	
				}
				else if(testChar == 'E') {
					numUpperE++;
				} 
			} // for
			
			JOptionPane.showMessageDialog(null, "Number of lower case e's: " + numLowerE + 
					"\nNumber of upper case E's: " + numUpperE);
	
			// Resets Lower case and Upper case variables in case of rerun
			numLowerE = 0;
			numUpperE = 0;	
		} // while	
	} // main
} // class