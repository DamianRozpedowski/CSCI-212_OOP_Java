package project2;

// Some parts of this code are used from Professor Lords PowerPoint in defining a simple class with SSN
public class Word {
	String word;

	public Word(String s) {
		
		this.word = s;
	}

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

} 
