package console_apps;
import java.util.Scanner;

import model.Circle;

/*
* This is version one of a console application.
* We will prompt the user of radius values of two circles.
* The application will output the areas of the two input circles.
* This version improves version 1 by calling a utility method. 
*/
public class CircleApp2 {
	// main method: entry point of execution
	public static void main(String[] args) {
		// Starting the execution of the application.
		// System.in denotes the standard input(i.e., keyboard).
		Scanner input = new Scanner(System.in);
		
		// Start the actual application code here.
		
		
		/* 
		* Calculate the first circle.
		*/
		// Step 1: prompt the user for the radius of the first circle.
		System.out.println("Enter the radius of the 1st circle:"); 
		// Declare a variable to store the user input.
		// Step 2: Read a floating-point number from the user.
		double radius1 = input.nextDouble();
		// Step 3: Compute the area of the input circle accordingly. 
		
		// Change: reuse formula calculation by  calling the utility method
		double area1 = Circle.getArea(radius1);
		 
		String area1s = String.format("%.2f", area1);
		// Step 4: Output the result back to the user.
		System.out.println("Area of circle is: " + area1s);
		// end of the application code.
		
		/* 
		* Calculate the second circle.
		*/
		// Step 1: prompt the user for the radius of the first circle.
		System.out.println("Enter the radius of the 2nd circle:"); 
		// Declare a variable to store the user input.
		// Step 2: Read a floating-point number from the user.
		double radius2 = input.nextDouble();
		// Step 3: Compute the area of the input circle accordingly. 
		
		// Change: reuse formula calculation by  calling the utility method

		double area2 = Circle.getArea(radius2);
		
		String area2s = String.format("%.2f", area2);
		// Step 4: Output the result back to the user.
		System.out.println("Area of circle is: " + area2s);
		
		// end of the application code.
		
		
		input.close();
	}
}