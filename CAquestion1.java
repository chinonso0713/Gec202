/*1. Problem Statement
 Accept a double number and print it out
 
 2. Variables 
     num = number
     
 3. algorithm
  a.1st step is start, 
  b.get value of the number
  c.print the number
  d.last step is stop

*/

import java.util.Scanner;

public class CAquestion1 {

	//variables
	static double num;
	
	public static void main(String[] args) {
 
		//calling the methods
		getNumber();
		printNumber();
	}
	

	//method to get number from user
	static void getNumber() {		
	Scanner input = new Scanner(System.in);
	System.out.println("what's your number?");
      num = input.nextDouble();
	input.close();
	}
	
	
	//method to print number from user 
	static void printNumber() {
		System.out.println("Your number is " + num );
		
	}


}
