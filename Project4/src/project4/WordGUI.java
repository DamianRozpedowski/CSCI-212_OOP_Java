package project4;

import java.awt.*;
import java.util.*;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;
import javax.swing.*;

public class WordGUI extends JFrame {

	static TextArea A, E, I, O, U, Other;
	// private TreeMap<Word, Word> list;
	public TreeMap<Word, Word> list;

	public WordGUI() {
		// Basic formating of GUI, size and Grid layout
		new JFrame("Project 4");
		setSize(200, 200);
		setLayout(new GridLayout(2, 3));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createFileMenu();
		getContentPane();

		// Text Areas for each section, named after respective first letter
		A = new TextArea();
		E = new TextArea();
		I = new TextArea();
		O = new TextArea();
		U = new TextArea();
		Other = new TextArea();

		// Adds text areas into content panes so it can be displayed
		add(A);
		add(E);
		add(I);
		add(O);
		add(U);
		add(Other);

		pack();
		setVisible(true);

		list = new TreeMap<>();
	} // WordGUI

	private void createFileMenu() {
		JMenuItem open, quit, add;
		JMenuBar menuBar = new JMenuBar();
		JMenu fileMenu, editMenu;

		fileMenu = new JMenu("File");
		editMenu = new JMenu("Edit");

		FileMenuHandler fmh = new FileMenuHandler(this);
		EditMenuHandler emh = new EditMenuHandler(this);

		open = new JMenuItem("Open"); // Open...
		open.addActionListener(fmh);
		fileMenu.add(open);

		fileMenu.addSeparator(); // add a horizontal separator line

		quit = new JMenuItem("Quit"); // Quit
		quit.addActionListener(fmh);
		fileMenu.add(quit);

		add = new JMenuItem("Add"); // Add
		add.addActionListener(emh);
		editMenu.add(add);

		setJMenuBar(menuBar);
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
	} // createMenu

	public static void resetTextBoxes() {
		WordGUI.A.setText("");
		WordGUI.E.setText("");
		WordGUI.I.setText("");
		WordGUI.O.setText("");
		WordGUI.U.setText("");
		WordGUI.Other.setText("");
	} // resetTextBoxes

	public void addIntoTreeMap(Word entry) {
		this.list.put(entry, entry);
	} // addIntoTreeMap

	public void printIntoGUISorted() {
		// Reset text boxes
		WordGUI.resetTextBoxes();

		Set set = list.entrySet();
		Iterator i = set.iterator();
		// Map.Entry<Word, Word> me;
		Map.Entry<Word, Word> me;
		// Goes through TreeMap and assigns each value into text area depending on first
		// Digit
		while (i.hasNext()) {
			// list = (TreeMap<Word, Word>) i.next();
			me = (Map.Entry) i.next();
			// Outputs Key and Value in Console
			// System.out.print(me.getKey() + ": ");
			// System.out.println(me.getValue());

			// Checks first character in the current line and appends it to the text if
			// the first letter condition is met
			if (me.getValue().word.charAt(0) == 'A' || me.getValue().word.charAt(0) == 'a') {
				A.append(me.getValue().word);
				A.append("\n");
			} else if (me.getValue().word.charAt(0) == 'E' || me.getValue().word.charAt(0) == 'e') {
				E.append(me.getValue().word);
				E.append("\n");
			} else if (me.getValue().word.charAt(0) == 'I' || me.getValue().word.charAt(0) == 'i') {
				I.append(me.getValue().word);
				I.append("\n");
			} else if (me.getValue().word.charAt(0) == 'O' || me.getValue().word.charAt(0) == 'o') {
				O.append(me.getValue().word);
				O.append("\n");
			} else if (me.getValue().word.charAt(0) == 'I' || me.getValue().word.charAt(0) == 'u') {
				U.append(me.getValue().word);
				U.append("\n");
			}
			// When the line doesn't satisfy the letter conditions it is appended to the
			// Other text box
			else {
				Other.append(me.getValue().word);
				Other.append("\n");
			}

		}
	} // printIntoGUISorted
}
