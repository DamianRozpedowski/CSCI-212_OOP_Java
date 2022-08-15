package lab5;

import javax.swing.*;

import lab6.TextFileInput;


public class Lab5Program1 {

	public static void main(String[] args) {
		
		
		
		//read the file and count line number
		TextFileInput tfi = new TextFileInput(args[0]);
		//integer to count the line
		String line;
		int lineNum=0;
		//read first line
		line=tfi.readLine();
				
		//read the rest of the lines
		while(line != null) {
			//increase line number
			lineNum++;
			//read the next line
			line=tfi.readLine();
		}	
		
		//close the file
		tfi.close();
				//test line number
		System.out.println("How many lines in the file? " + lineNum);
				
		//Create the array 
		String[] wordArray = new String[lineNum];
		
		
		String isOrIsNot, inputWord;

		inputFromFile(wordArray, args[0]); //Program argument is set to lab5input.txt, if program arg is not defined replace args with txt file or set new program arg
		
		
		
		// This line asks the user for input by popping out a single window
		// with text input
		while(true) {
			
			inputWord = JOptionPane.showInputDialog(null, "Enter a word in all lower case:");
			
			if (inputWord.equals("STOP")){
				System.exit(0);
			}
			
			// if the inputWord is contained within wordArray return true
			if (wordIsThere(inputWord, wordArray)) 
				isOrIsNot = "is"; // set to is if the word is on the list
			else
				isOrIsNot = "is not"; // set to is not if the word is not on the list
			
			// Output to a JOptionPane window whether the word is on the list or not
			JOptionPane.showMessageDialog(null, "The word " + inputWord + " " + isOrIsNot + " on the list.");
			
		} //while
	
	} //main

	public static boolean wordIsThere(String findMe, String[] theList) {
		for (int i = 0; i < theList.length; i++) {	
			// If they are the same return true
			if (findMe.equals(theList[i])) {
				return true;
			}
		}
		// If out of bounds, false
		return false; //default return

	} // wordIsThere
	
	
	public static void inputFromFile(String[] wordArray, String fileName) {
		
		String s;
		TextFileInput in = new TextFileInput(fileName);
		s = in.readLine();
		int i=0; //starts array at 0
		
		
		while (s != null) {
		   System.out.println(s); //shows the list of words in console
			wordArray[i] = s;
			i++;
			s = in.readLine();
			
		} //while
	} //inputFromFile
	

	
} // class Lab4Program1


		
		
