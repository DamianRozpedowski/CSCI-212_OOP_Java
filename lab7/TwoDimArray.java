package lab7;


public class TwoDimArray {

	//public static int[][] myArray = {{1,2,3},{4,5,6},{7,8,9}};
	
	public static void main(String[] args) {
		
		int[][] myArray=fillArray(args[0]);
		
		printArray(myArray);
		System.out.println();
		printArrayEven(myArray);
	}
	private static void printArray (int[][] theArray) {
		for (int i=0; i<theArray.length; i++) {
			for (int j=0; j<theArray[i].length;j++)
				display(theArray[i][j]);
			System.out.println();
		}
	}
	private static void display (int num){
		System.out.print(num+" ");
	}
	private static void printArrayEven(int[][] theArray){
		for (int i=0; i<theArray.length; i++) {
			for (int j=0; j<theArray[i].length;j++)
				if(theArray[i][j] % 2 == 0) {
					display(theArray[i][j]);	
				}
				else {
					System.out.print("* ");
				}
			System.out.println();
		}
	}
	
	 public static int[][] fillArray(String myFile) {
		 //read first two lines to get the row size and col size
		 TextFileInput tfi = new TextFileInput(myFile);
		 int row = Integer.parseInt(tfi.readLine());//first line is the row size
		 int col = Integer.parseInt(tfi.readLine()); //second line is the col size
	 
		 //create 2d array
		 int[][] array = new int[row][col];
		 
		 //read the rest of the lines and save into the array
		 for(int i=0; i<array.length;i++) {
			 for(int j=0; j<array[i].length;j++) {
				 array[i][j] = Integer.parseInt(tfi.readLine());
			 }
			 
		 }
		 
		 return array;
		 
	 }

}
