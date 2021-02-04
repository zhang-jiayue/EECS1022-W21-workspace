package model;
public class Utilities
{
	/* 
	 * 	Requirements:
	 * 	- It is strictly forbidden for you to use: 
	 * 		+ Any Java library method (e.g., Arrays.sort)
	 * 		  (That is, there must not be an import statement in the beginning of this class.)
	 * 		+ arrays
	 * 	- You will receive an immediate zero for this task if the requirement is violated. 
	 * 
	 * Only write lines of code within the methods given to you.
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

	/*	Task 1.
	 * 	
	 * 	Input Parameters:
	 *	- `weightUnit`	: either 'p' (for pound) or 'k' (for kilogram)
	 *	- `w`			: the weight value
	 *	- `heightUnit`	: either 'f' (for foot) or 'i' (for inch)
	 *	- `h`			: the height value
	 *
	 *	Error conditions (in order of priority):
	 *	1. When the `weightUnit` is neither 'p' nor 'k' (case sensitive).
	 *	2. When the `heightUnit` is neither 'f' nor 'i' (case sensitive).
	 *	3. When not both weight value and height value are positive.
	 *	If multiple error conditions hold, return a message related to the error with the highest priority.
	 *	e.g., invoking getBMIReport('q', -154.3, 'I', -66.92) has all inputs invalid,
	 *			but only an error message about weight unit is returned.
	 *
	 *  What to return?
	 *  - Return an error message if there is any error.
	 *  - Otherwise, calculate the Body Mass Index (BMI) by: weight (in kilogram) divided by the square of height (in meters).
	 *  	+ Use the following conversion rates (when needed):
	 *  		1 inch is 0.0254 meter 			(use it when `heightUnit` is 'i')
	 *  		1 foot is 0.3048 meter
	 *  		1 pound is 0.453592 kilogram
	 *  	+ The calculation result must be formatted with 2 digits after the decimal:
	 *  		Use String.format("%.2f", someNumber)
	 *  	+ Also, include an interpretation message (case sensitive) according to the following scheme:
	 *  		BMI < 18.5 			means "Underweight"
	 * 			18.5 <= BMI < 25.0 	means "Normal"
	 * 			25.0 <= BMI < 30.0 	means "Overweight"
	 * 			30.0 <= BMI 		means "Obese"
	 * 
	 * See the JUnit tests related to this method for the precise format of the string return value.
	 */
	public static String getBMIReport(char weightUnit, double w, char heightUnit, double h) {
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
		double weight;
		double height;
		double bmi;
		String interpretation = "";
		if (weightUnit != 'p' && weightUnit != 'k' ) {
			result = String.format("Error: %s is not a valid weight unit", weightUnit);
			
		}
		else if(heightUnit != 'f' && heightUnit != 'i' ){
				result = String.format("Error: %s is not a valid height unit", heightUnit);
		}
		else if (w <= 0 || h<= 0 ) {
				result = "Error: both weight and height must be positive";
			}
		else {
			//Convert weightUnit
			if (weightUnit == 'p') { 
				weight = w * 0.453592;
			}
			else {
				weight = w;
			}
			//Convert heightUnit
			if (heightUnit == 'i') { 
				height = h * 0.0254;
			}
			else {
				height = h * 0.3048;
			}
			//Calculate BMI
			bmi = weight / (height * height);
			// Interpretation method
			if (bmi < 18.5) {
				interpretation = "Underweight";
			}
			else if (18.5 <= bmi && bmi< 25.0) {
				interpretation = "Normal";
			}
			else if (25.0 <= bmi && bmi< 30.0) {
				interpretation = "Overweight";
			}
			else {
				interpretation = "Obese";						
			}
			// Final result
			result = String.format("BMI is: %.2f (%s)", bmi, interpretation);
				
				
	}
				
		
		
		// Do not modify this return statement. 
	return result;
}
	
	
	/*
	 * Task 2.
	 * 
	 * Input Parameters: 
	 * - `coffeeType` 	: either 'L' (for light type), 'R' (for regular type) or 'D' (for dark type)
	 * - `cupSize`		: either 'S' (for small size), 'M' (for medium size) or 'L' (for large size)
	 * - `numberofCup`	: integer represent number of cups ordered
	 * 
	 * Assumptions:
	 * 	- the numberofCups is positive value greater than zero.
	 *	- `coffeeType` and `cupSize` characters are valid (no error checking is needed).
	 *
	 * What to return? - First you need to determine the preparation time  
	 * of single cup of coffee in term of minutes and seconds  according to the following facts
	 * If coffee type is light coffee then the initial preparation time of single cup of any size is 25 seconds.
	 * If coffee type is regular coffee then the initial preparation time of single cup of any size is 45 seconds.
	 * If coffee type is dark coffee then the initial preparation time of single cup of any size is 65 seconds.
	 * 
	 * Now, consider the size 
	 * if the cup size is small then add 15 seconds. 
	 * if the cup size is medium then add 35 seconds.
	 * if the cup size is large then add 45 seconds.
	 * 
	 * Do not forget to consider the number of cup to determine the final preparation time of coffee order
	 * 
	 * The output string should include  message with case sensitive. For example:
	 * 
	 * "You ordered 5 cups of type light and size small, then your time is 3 minutes 20 seconds" 
	 * "You ordered 1 cup of type light and size small, then your time is 0 minutes 40 seconds" 
	 * "You ordered 7 cups of type dark and size large, then your time is 12 minutes 50 seconds" 
	 * 
	 * Note: we use cup  when the order is for single cup and 
	 *  we use cups  when the order is for more than one cup
	 * 
	 *  
	 * See the JUnit tests related to this method for the precise format of the
	 * string return value.
	 */ 
	public static String getCoffeeTime(char coffeeType, char cupSize, int numberofCup) {
		String result = "";
		int coffeeTime = 0;
		String size = "";
		String type = "";
		String time = "";
		int minutes = 0;
		int seconds = 0;
		/*
		 * Your task is to implement this method, so that running TestUtilities.java
		 * will pass all JUnit tests.
		 * 
		 * Recall from Week 1's tutorial videos: 1. No System.out.println statements
		 * should appear here. Instead, an explicit, final `return` statement is placed
		 * for you. 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 * Instead, refer to the input parameters of this method. 3. Do not re-assign
		 * any of the parameter/input variables.
		 */

		if (coffeeType == 'L') {
			coffeeTime = coffeeTime + 25 * numberofCup;
			type = "light";
		}
		if (coffeeType == 'R'){
			coffeeTime = coffeeTime + 45 * numberofCup;
			type = "regular";

		}
		if (coffeeType == 'D'){
			coffeeTime = coffeeTime + 65 * numberofCup;
			type = "dark";

		}
		if (cupSize == 'S'){
			coffeeTime = coffeeTime + 15 * numberofCup;
			size = "small";
		}
		if (cupSize == 'M'){
			coffeeTime = coffeeTime + 35 * numberofCup;
			size = "medium";
		}		
		if (cupSize == 'L'){
			coffeeTime = coffeeTime + 45 * numberofCup;
			size = "large";
		}
		//Compute time
		minutes = coffeeTime / 60;
		seconds = coffeeTime % 60;
		time = String.format("%d minutes %d seconds", minutes, seconds);
		// Output
		if (numberofCup == 1) {
			result = String.format("You ordered %d cup of type %s and size %s, then your time is %s",numberofCup, type, size, time);
		}
		if (numberofCup > 1) {
			result = String.format("You ordered %d cups of type %s and size %s, then your time is %s",numberofCup, type, size, time);
		}
		// Do not modify this return statement.
		return result;
	}
	
	
	/*
	 * Task 3.
	 * 
	 * Input Parameters: 
	 * - `carSpeed` 	: integer value represents car speed in kilometer per hour at time of ticket
	 * - `roadSpeed`	: integer value represents the road speed limit in kilometer per hour regulated by the City
	 * - `whenItHappen`	: either 'M' (for Morning day time), 'A' (for Afternoon day time) or 'E' (for Evening day time)
	 * 
	 * Assumptions:
	 * 	- `carSpeed` is greater than `roadSpeed` always
	 *	- `whenItHappen` character is valid (no error checking is needed).
	 *
	 * What to return? - First you need to determine speed ticket value in dollars according to the following facts
	 * If difference between car speed and road speed limit is less than 20 kilometer/hour 
	 * then the initial ticket value is 80 dollars.
	 * 
	 * If difference between car speed and road speed limit is between 20 and 40 kilometer/hour inclusive 
	 * then the initial ticket value is 250 dollars.
	 * 
	 * If difference between car speed and road speed limit is more than 40 kilometer/hour 
	 * then the initial ticket value is 800 dollars.
	 * 
	 * Now, consider the when ticket happen. 
	 * if speeding ticket happened during morning day time then add 150 dollars to the initial speeding ticket value
	 * if speeding ticket happened during afternoon day time then add 100 dollars to the initial speeding ticket value
	 * if speeding ticket happened during evening day time then add 540 dollars to the initial speeding ticket value
	 * 
	 * The output string should include  message with case sensitive. For example:
	 * 
	 * "In the morning, your speed was 25 over the limit then your ticket value is 400$" 
	 * 
	 * "In the afternoon, your speed was 10 over the limit then your ticket value is 180$"
	 *  
	 * See the JUnit tests related to this method for the precise format of the
	 * string return value.
	 */

	public static String getTicketValue(int carSpeed, int roadSpeed, char whenItHappen) {
		String result = "";

		/*
		 * Your task is to implement this method, so that running TestUtilities.java
		 * will pass all JUnit tests.
		 * 
		 * Recall from Week 1's tutorial videos: 1. No System.out.println statements
		 * should appear here. Instead, an explicit, final `return` statement is placed
		 * for you. 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 * Instead, refer to the input parameters of this method. 3. Do not re-assign
		 * any of the parameter/input variables.
		 */
		int ticketValue = 0;
		int difference = carSpeed - roadSpeed;
		String time = "";
		if (difference<20) {
			ticketValue = 80;
		}
		if (difference >= 20 && difference <= 40) {
			ticketValue = 250;
		}
		if (difference > 40) {
			ticketValue = 800;
		}
		if (whenItHappen == 'M') {
			ticketValue = ticketValue + 150;
			time = "morning";

		}
		if (whenItHappen == 'A') {
			ticketValue = ticketValue + 100;
			time = "afternoon";
		}
		if (whenItHappen == 'E') {
			ticketValue = ticketValue + 540;
			time = "evening";
		}
		//result
		result = String.format("In the %s, your speed was %d over the limit then your ticket value is %d$", time,difference,ticketValue);
		// Do not modify this return statement.
		return result;
	}

}

