package project4;

import java.util.regex.*;

// Some parts of this code are used from Professor Lords PowerPoint in defining a simple class with SSN
public class Word implements Comparable<Word> {
	String word;

	public Word(String s) {
		if (isValidWord(s))
			this.word = s;
		else
			throw new IllegalWordException("Invalid Word: " + s);
	} // Word

	public void setWord(String s) {
		this.word = s;
	} // setWord Method

	public String getWord() {
		return this.word;
	} // getWord Method

	public boolean equals(Object other) {
		return (other != null && getClass() == other.getClass() && this.word.equals(((Word) other).word));
	} // equals Method

	public int compareTo(Word other) {
		return this.word.compareTo(other.toString());
	} // compareTo Method

	public String toString() {
		return this.word;
	} // toString Method

	public boolean isValidWord(String s) {
		// if string is all letters
		if (s.matches("[a-zA-Z]+"))
			return true;
		else
			return false;
	} // isValidWord

}
