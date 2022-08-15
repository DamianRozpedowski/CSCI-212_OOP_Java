package project2;

public class Project2 {
	static TextFileInput inFile;
	static String inFileName = "input.txt";
	static WordGUI createGUI;

	public static void main(String[] args) {
		createGUI = new WordGUI();
		inFile = new TextFileInput(inFileName);
		SortedWordList list = new SortedWordList();
		String line;
		
		line = inFile.readLine();

		while (line != null) {
			// Assigns line as a Word
			list.add(new Word(line));
			// Needed to read the next line in the txt file
			line = inFile.readLine();

		} // while

		list.printSortedList();
		inFile.close();
		
		// Makes the GUI Visible
		createGUI.pack();
		createGUI.setVisible(true);
	} // main

} // Project 2
