package project3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class FileMenuHandler implements ActionListener {
	JFrame jframe;

	public FileMenuHandler(JFrame jf) {
		jframe = jf;
	}

	public void actionPerformed(ActionEvent event) {
		String menuName = event.getActionCommand();
		if (menuName.equals("Open"))
			openFile();
		else if (menuName.equals("Quit"))
			System.exit(0);
	} // actionPerformed

	public void openFile() {
		int status;
		JFileChooser chooser = new JFileChooser();
		status = chooser.showOpenDialog(null);
		readSource(chooser.getSelectedFile());
	} // openFile

	public void readSource(File chosenFile) {
		TreeMap<Word, Word> list = new TreeMap<Word, Word>();

		// new WordGUI(); used if you want to open a new window GUI

		// Reset Word Boxes in GUI after new File opened, uses same GUI
		WordGUI.resetTextBoxes();

		String chosenFileName = chosenFile.getPath();
		TextFileInput inFile = new TextFileInput(chosenFileName);
		String line;

		line = inFile.readLine();

		// Goes through each line, tests if word is valid gets inserted into TreeMap,
		// else Exception and printed into console
		while (line != null) {
			try {
				Word word = new Word(line);
				list.put(word, word);
			} catch (IllegalWordException e) {
				System.out.println("Invalid Word: " + line);
			} finally {
				line = inFile.readLine();
			}

		} // while

		Set set = list.entrySet();
		Iterator i = set.iterator();
		Map.Entry<Word, Word> me;

		// Goes through TreeMap and assigns each value into text area depending on first
		// Digit
		while (i.hasNext()) {
			me = (Map.Entry) i.next();
			// Outputs Key and Value in Console
			// System.out.print(me.getKey() + ": ");
			// System.out.println(me.getValue());

			// Checks first character in the current line and appends it to the text if
			// the first letter condition is met
			if (me.getValue().word.charAt(0) == 'A' || me.getValue().word.charAt(0) == 'a') {
				WordGUI.A.append(me.getValue().word);
				WordGUI.A.append("\n");
			} else if (me.getValue().word.charAt(0) == 'E' || me.getValue().word.charAt(0) == 'e') {
				WordGUI.E.append(me.getValue().word);
				WordGUI.E.append("\n");
			} else if (me.getValue().word.charAt(0) == 'I' || me.getValue().word.charAt(0) == 'i') {
				WordGUI.I.append(me.getValue().word);
				WordGUI.I.append("\n");
			} else if (me.getValue().word.charAt(0) == 'O' || me.getValue().word.charAt(0) == 'o') {
				WordGUI.O.append(me.getValue().word);
				WordGUI.O.append("\n");
			} else if (me.getValue().word.charAt(0) == 'I' || me.getValue().word.charAt(0) == 'u') {
				WordGUI.U.append(me.getValue().word);
				WordGUI.U.append("\n");
			}
			// When the line doesn't satisfy the letter conditions it is appended to the
			// Other text box
			else {
				WordGUI.Other.append(me.getValue().word);
				WordGUI.Other.append("\n");
			}

		}

	} // readSource

}
