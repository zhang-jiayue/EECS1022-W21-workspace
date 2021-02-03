package model;

import java.util.Arrays;

public class Utilities
{
	/* Only write lines of code within the methods given to you.
	 * Do not add any new helper methods. 
	 * Do not declare any variables OUTSIDE the given methods.
	 * You can only declare local variables within each method.
	 * 
	 * Your submission will only be graded against:
	 * 	- JUnit tests given to you in TestUtilities
	 * 	- additional JUnit tests 
	 * 	  (therefore it is important that you test your own methods
	 *     by either the console application class App or your own JUnit tests) 
	 */

	/*	Task 1:
	 *  Given an input double number that denotes the radius of a circle,
	 *  return its area.
	 */
	public static double areaOfCircle(double radius) {
		double result = 0;
		
		/* Your task is to implement this method,
		 * so that running TestUtilities.java will pass all JUnit tests.
		 *  
		 * Recall from Week 1's tutorial videos:
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, an explicit, final `return` statement is placed for you.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.
		 * 3. Do not re-assign any of the parameter/input variables. 
		 */
		
		// Your implementation of this method starts here. 
		result = 3.14 * radius * radius;
		
		
		// Do not modify this return statement. 
		return result;
	}

	/*  Task 2:
	 *  Given four input integers a, b, c, and d,
	 *  return their average with precision.
	 */
	public static double averageOf(int a, int b, int c, int d) {
		double result = 0;
		
		/* Your task is to implement this method,
		 * so that running TestUtilities.java will pass all JUnit tests.
		 *  
		 * Recall from Week 1's tutorial videos:
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, an explicit, final `return` statement is placed for you.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.
		 * 3. Do not re-assign any of the parameter/input variables. 
		 */
		
		// Your implementation of this method starts here. 
		result = (Double.valueOf(a) + Double.valueOf(b) + Double.valueOf(c) +Double.valueOf(d)) / 4;
		
		
		// Do not modify this return statement. 
		return result;
	}

	/*  Task 3:
	 *  Given three input integers (which may or may not be equal),
	 *  return the maximum.
	 */
	public static int maximumOf(int x, int y, int z) {
		int result = 0;
		
		/* Your task is to implement this method,
		 * so that running TestUtilities.java will pass all JUnit tests.
		 *  
		 * Recall from Week 1's tutorial videos:
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, an explicit, final `return` statement is placed for you.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.
		 * 3. Do not re-assign any of the parameter/input variables. 
		 */
		
		// Your implementation of this method starts here. 
		if (x > y) {
			result = x;
				if (result < z) {
					result = z;
				}
					
		}
		else if (x < y) {
			result = y;
				if (result < z) {
					result = z;
				}
		}
		
		
		// Do not modify this return statement. 
		return result;
	}

	/*  Task 4:
	 *  Given four input integers,
	 *  return whether or not they represent an arithmetic sequence.
	 *  An arithmetic sequence is has a common difference between every consecutive numbers.
	 *  e.g., 1, 3, 5, 7 is an arithmetic sequence with 2 being the common difference.
	 *  e.g., 10, 8, 6, 4 is an arithmetic sequence with -2 being the common difference.
	 */
	public static String isArithmeticSeq(int n1, int n2, int n3, int n4) {
		String result = "";
		
		/* Your task is to implement this method,
		 * so that running TestUtilities.java will pass all JUnit tests.
		 *  
		 * Recall from Week 1's tutorial videos:
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, an explicit, final `return` statement is placed for you.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.
		 * 3. Do not re-assign any of the parameter/input variables. 
		 */
		
		// Your implementation of this method starts here. 
		int[] ints = {n1, n2, n3, n4};
		Arrays.sort(ints);
		int d1 = n2 - n1;
		int d2 = n3 - n2;
		int d3 = n4 - n3;
		if(d1 == d2 && d2 == d3) {
			result = String.format("It is an arithmetic sequence with common difference %d", d1);
		}
		else {
			result = String.format("It is not an arithmetic sequence", d1);
		}
		
		// Do not modify this return statement. 
		return result;
	}

}

