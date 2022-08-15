package project3;

import java.awt.*;
import javax.swing.*;

public class WordGUI extends JFrame {

	static TextArea A, E, I, O, U, Other;

	public WordGUI() {
		// Basic formating of GUI, size and Grid layout
		new JFrame("Project 3");
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

	} // WordGUI

	private void createFileMenu() {
		JMenuItem item;
		JMenuBar menuBar = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		FileMenuHandler fmh = new FileMenuHandler(this);

		item = new JMenuItem("Open"); // Open...
		item.addActionListener(fmh);
		fileMenu.add(item);

		fileMenu.addSeparator(); // add a horizontal separator line

		item = new JMenuItem("Quit"); // Quit
		item.addActionListener(fmh);
		fileMenu.add(item);

		setJMenuBar(menuBar);
		menuBar.add(fileMenu);

	} // createMenu

	public static void resetTextBoxes() {
		WordGUI.A.setText("");
		WordGUI.E.setText("");
		WordGUI.I.setText("");
		WordGUI.O.setText("");
		WordGUI.U.setText("");
		WordGUI.Other.setText("");
	} // resetTextBoxes

}
