package lab6;

import javax.swing.JOptionPane;

public class Lab6Program1 {
	public static void main(String[] args) {
		// add argument configuration
		// create input file
		// read the file
		
		//create TextFileInput object and pass in the file name.
		TextFileInput tfi = new TextFileInput(args[0]);
		
		//create a string variable to save each line
		String line=tfi.readLine();
		
		//test if it's reading correctly
		//read the rest of the lines until the end of the file
		while(line != null) {
			//test if it is reading the line
			System.out.println(line);
			//read next line
			line=tfi.readLine();
		}
		//close the file
		tfi.close();
		
		//read the file and count line number
		tfi = new TextFileInput(args[0]);
		//integer to count the line
	 	int lineNum=0;
	 	//read first line
		line=tfi.readLine();
		
		//read the rest of the lines
		while(line != null) {
			//increase line number
			lineNum++;
			//read the next line
			line=tfi.readLine();
		}	
		//close the file
		tfi.close();
		//test line number
		System.out.println("How many lines in the file? " + lineNum);
		
		//Create the array
		int[] array = new int[lineNum];
		
		//create the file and save the line into the array
		//create TextFileInput object and pass in the file name.
		tfi = new TextFileInput(args[0]);
		
		//create a string variable to save each line
		line=tfi.readLine();
		int index=0;
		//test if it's reading correctly
		//read the rest of the lines until the end of the file
		while(line != null) {
			//line is string value, convert string to integer
			array[index]=Integer.parseInt(line);
			//increase index
			index++;
			//read next line
			line=tfi.readLine();
		}
		//close the file
		tfi.close();
		
		//test the array
		for(int i=0; i< array.length; i++) {
			System.out.println(array[i]+ " ");
		}
		
		//calculate sum
		int sum = sum(array,array.length);
		System.out.println("Sum of the Array = " + sum);
		JOptionPane.showMessageDialog(null, "Sum of the Array = " + sum);
		
		//calculate the average
		int average = average(array,array.length);
		System.out.println("Average of the Array = " + average);
		JOptionPane.showMessageDialog(null, "Average of the Array = " + average);
		
	} //main
	
	public static int sum (int[] myArray, int myArraySize) {
		int sumOfArray=0;
		
		//goes through each element in array
		for(int i=0; i<myArraySize; i++) {
			//sumOfArray gets the value of the current array element added to itself
			sumOfArray += myArray[i];
		} //for
		return sumOfArray;
	} //sum
	
	public static int average (int[] myArray, int myArraySize) {
		int averageOfArray=0;
		int sumOfArray=0;
		
		//uses sum function to calculate sum of array
		sumOfArray = sum(myArray,myArraySize);
		
		averageOfArray = sumOfArray / myArraySize; 
		return averageOfArray;
	} //average
	
} //Lab6Program1
