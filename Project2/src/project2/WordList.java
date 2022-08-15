package project2;

public class WordList {

	protected WordNode first;
	protected WordNode last;
	int size;

	public WordList() {
		WordNode ln = new WordNode();
		first = ln;
		last = ln;
		size = 0;
	} // Word List constructor

	public void append(Word wrd) {
		WordNode node = new WordNode(wrd);

		if (size == 0) {
			first.next = node;
			last = node;
		} else {
			last.next = node;
			last = node;
		}
	} // append Method

}
