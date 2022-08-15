package project1;

import java.awt.*;
import javax.swing.*;

public class WordGUI extends JFrame {

	static TextArea A, E, I, O, U, Other;

	public WordGUI() {
		// Basic formating of GUI, size and Grid layout
		new JFrame("Project 1");
		setSize(200, 200);
		setLayout(new GridLayout(2, 3));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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

	}
}
