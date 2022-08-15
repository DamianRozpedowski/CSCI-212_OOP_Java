package project4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class FileMenuHandler implements ActionListener {
	WordGUI jframe;
	public static StringTokenizer myTokens;

	public FileMenuHandler(WordGUI jf) {
		jframe = jf;
	} // FileMenuHandler

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
			/*
			 * try { myTokens = new StringTokenizer(line,"[,\\.\\s]+"); while
			 * (myTokens.hasMoreTokens()) { //Word word = new Word(myTokens.nextToken());
			 * //list.put(word, word); System.out.println(myTokens.nextElement());
			 * //((WordGUI) jframe).addIntoTreeMap(word); }
			 * 
			 * } catch (IllegalWordException e) { System.out.println("Invalid Word: " + line
			 * ); } finally { line = inFile.readLine(); }
			 */
			Scanner sc = new Scanner(line).useDelimiter("[,\\.\\s]+");
			;
			while (sc.hasNext()) {
				try {
					String hold = sc.next();
					Word word = new Word(hold);
					// list.put(word, word);
					System.out.println(hold);
					((WordGUI) jframe).addIntoTreeMap(word);

				} catch (IllegalWordException e) {
					System.out.println(e);

				} // finally {
					// line = inFile.readLine();
					// }
			}
			line = inFile.readLine();
			sc.close();
		}

		/*
		 * //testing list for (Map.Entry<Word, Word> entry : list.entrySet()) {
		 * System.out.println("Key: " + entry.getKey() + ". Value: " +
		 * entry.getValue()); }
		 */
		// Reset text boxes
		// WordGUI.resetTextBoxes();
		jframe.printIntoGUISorted();

	}// readSource

}
