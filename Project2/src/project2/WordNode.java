package project2;

// Some parts of this code is used from Lords PowerPoint, Dynamic vs Static Structures
public class WordNode {
	Word data;
	WordNode next;

	public WordNode() {
		this.data = null;
		this.next = null;
	} // constructor w/ no parameters

	public WordNode(Word data) {
		this.data = data;
		this.next = null;
	} // constructor w/ one parameter

}
