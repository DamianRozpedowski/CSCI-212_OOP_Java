package project4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class EditMenuHandler implements ActionListener {
	WordGUI jframe;

	public EditMenuHandler(WordGUI jf) {
		jframe = jf;
	} // EditMenuHandler

	public void actionPerformed(ActionEvent event) {
		String menuName = event.getActionCommand();
		if (menuName.equals("Add")) {
			addToTreeMap();
			jframe.printIntoGUISorted();
		}

	} // actionPerformed

	private void addToTreeMap() {
		// JOptionPane.showInputDialog // Allow user enter a word
		// jFrame.addIntoTreeMap(word);
		try {
			String inputWord = JOptionPane.showInputDialog(null, "Enter a word:");
			Word input = new Word(inputWord);
			((WordGUI) jframe).addIntoTreeMap(input);
		} catch (IllegalWordException e) {
			System.out.println(e);

		}
	} // addToTreeMap

}
