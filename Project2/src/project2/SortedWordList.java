package project2;

public class SortedWordList extends WordList {
	SortedWordList() {
		super();
	}

	void add(Word wordN) {
		WordNode node = new WordNode(wordN);
		WordNode currentVal = first;

		while (currentVal.next != null && currentVal.next.data.compareTo(node.data) <= 0) {
			currentVal = currentVal.next;
		} // cycles through and compares current values to the node value, if its greater
			// or equal in order for sorting to occur below (equal is included to include
			// repeated values)

		if (currentVal.next == null) {
			append(wordN);
		}

		if (currentVal.next.data.compareTo(node.data) > 0) {
			node.next = currentVal.next;
			currentVal.next = node;
		} // inserts to linked list

		size++;
	} // add

	 void printSortedList() {
		WordNode test = first.next;
		while (test != null) {
			System.out.println(test.data); // Tests Console Output of the entire List

			// Checks first character in the current line and appends it to the text if
			// the first letter condition is met
			if (test.data.word.charAt(0) == 'A' || test.data.word.charAt(0) == 'a') {
				WordGUI.A.append(test.data.word);
				WordGUI.A.append("\n");
			} else if (test.data.word.charAt(0) == 'E' || test.data.word.charAt(0) == 'e') {
				WordGUI.E.append(test.data.word);
				WordGUI.E.append("\n");
			} else if (test.data.word.charAt(0) == 'I' || test.data.word.charAt(0) == 'i') {
				WordGUI.I.append(test.data.word);
				WordGUI.I.append("\n");
			} else if (test.data.word.charAt(0) == 'O' || test.data.word.charAt(0) == 'o') {
				WordGUI.O.append(test.data.word);
				WordGUI.O.append("\n");
			} else if (test.data.word.charAt(0) == 'I' || test.data.word.charAt(0) == 'u') {
				WordGUI.U.append(test.data.word);
				WordGUI.U.append("\n");
			}
			// When the line doesn't satisfy the letter conditions it is appended to the
			// Other text box
			else {
				WordGUI.Other.append(test.data.word);
				WordGUI.Other.append("\n");
			}
			test = test.next; // Goes down the list
		}
	} // printSortedList

}
