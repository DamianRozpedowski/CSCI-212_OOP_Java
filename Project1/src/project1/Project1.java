package project1;

public class Project1 {
	static TextFileInput inFile;
	static String inFileName = "input.txt";
	static WordGUI createGUI;

	public static void main(String[] args) {
		createGUI = new WordGUI();
		readWordsFromFile(inFileName);
	} //main

	public static void readWordsFromFile(String fileName) {
		inFile = new TextFileInput(inFileName);
		String line;
		line = inFile.readLine();

		// Needed to check through every and determine their starting letter
		while (line != null) {
			// Checks first character in the current line and appends it to the text if
			// the first letter condition is met
			if (line.charAt(0) == 'A' || line.charAt(0) == 'a') {
				WordGUI.A.append(line);
				WordGUI.A.append("\n");
			} else if (line.charAt(0) == 'E' || line.charAt(0) == 'e') {
				WordGUI.E.append(line);
				WordGUI.E.append("\n");
			} else if (line.charAt(0) == 'I' || line.charAt(0) == 'i') {
				WordGUI.I.append(line);
				WordGUI.I.append("\n");
			} else if (line.charAt(0) == 'O' || line.charAt(0) == 'o') {
				WordGUI.O.append(line);
				WordGUI.O.append("\n");
			} else if (line.charAt(0) == 'I' || line.charAt(0) == 'u') {
				WordGUI.U.append(line);
				WordGUI.U.append("\n");
			}
			// When the line doesn't satisfy the letter conditions it is appended to the
			// Other text box
			else {
				WordGUI.Other.append(line);
				WordGUI.Other.append("\n");
			}
			// Needed to read the next line in the txt file
			line = inFile.readLine();

		} // while

		// Needed to close text file
		inFile.close();
		// Makes the GUI Visible
		createGUI.pack();
		createGUI.setVisible(true);
	} //readWordsFromFile
} //Project 1
