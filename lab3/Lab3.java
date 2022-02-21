package lab3;

public class Lab3 {
	//step 1
	public static void main(String[] args) { 
		//step 2
		float fahrenheit, centigrade;	
		//step 3
		fahrenheit = (float) 98.6;	//type casting
		//step 4
		centigrade = (float) 5 / 9 * (fahrenheit-32); // c=(f-32)*5/9
		System.out.println("Fahrenheit = " + fahrenheit + " Centigrade = " + centigrade);
		//step 5
		System.out.println(); //Organization
		System.out.println("For Loop");
		
		for (fahrenheit = (float) 0.0; fahrenheit < 40.0 ;fahrenheit += 5) {
			centigrade = (float) 5 / 9 * (fahrenheit-32);
			System.out.println("Fahrenheit = " + fahrenheit + " Centigrade = " + centigrade);
		}
		//step 6
		System.out.println(); //Organization
		System.out.println("While Loop");
		
		fahrenheit=(float) 0.0;
		while(fahrenheit < 40.0) {
			centigrade = (float) 5 / 9 * (fahrenheit-32);
			System.out.println("Fahrenheit = " + fahrenheit + " Centigrade = " + centigrade);
			fahrenheit += 5;
		}
	}
}
