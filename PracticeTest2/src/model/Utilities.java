package model;

/*
 * This class contains three separate sets of test questions.
 * You can check tutorials on solutions to these methods here:
 * https://www.youtube.com/playlist?list=PL5dxAmCmjv_4UZNiLzeFPAgDDv2vLCGb4
 * (The IDE used there is not Eclipse, but the lines of code will work.)
 */

public class Utilities
{
	
	/*
	 * Example Test 2a
	 */
	
	/* Only write lines of code within the methods given to you.
	 * Do not add any new helper methods. 
	 * Do not declare any variables OUTSIDE the given methods.
	 * You can only declare local variables within each method.
	 * 
	 * Requirement: 
	 * 	- It is forbidden for you to use any Java library class or method.
	 * 	(that is, there must not be an import statement in the beginning of this class.)
	 * 	- Each task violating this requirement will result in an immediate zero for it. 
	 * 
	 * Your submission will only be graded against:
	 * 	- JUnit tests given to you in TestUtilities
	 * 	- additional JUnit tests 
	 * 	  (therefore it is important that you test your own methods
	 *     by either the console application class App or your own JUnit tests) 
	 */

	/*
	 * Given an array of integers, calculate the average of its elements.
	 * You can assume that the array is not empty and contains at least 1 one element.
	 */
	public static double averageOf(int[] ia) {
		double result = -1;

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
		int sum = 0;
		for(int i = 0; i < ia.length; i ++) {
			sum += ia[i];
		}
		
		result = (double)sum / ia.length;
		

		// Do not modify this return statement. 
		return result;
	}

	/*
	 * Given an integer array ia, determine whether or not
	 * all elements are multiples of 5.
	 */
	public static boolean allMultiplesOf5(int[] ia) {
		boolean result = false;

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
		int i = 0;
		boolean allMultiplesOf5 = true;
		while(allMultiplesOf5 && i< ia.length) {
			allMultiplesOf5 = (ia[i] % 5 == 0);
			i++;
		}
		result = allMultiplesOf5;

		// Do not modify this return statement. 
		return result;
	}

	/* Given an integer array ia, determine whether or not
	 * at lease one element is multiple of 5.
	 */
	public static boolean atLeastOneMultipleOf5(int[] ia) {
		boolean result = false;

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
		int i = 0;
		while(i < ia.length) {
			result = result || (ia[i] % 5 == 0);
			i++;
		}
		

		// Do not modify this return statement. 
		return result;
	}

	/* Given an array of integers, find out the second maximum element.
	 * The input array may contain duplicates.
	 * You can assume that integer array ia contains at least two elements.
	 * Your are forbidden to use any library class, e.g., Arrays.sort.
	 */
	public static int secondMaximumOf(int[] ia) {
		int result = -1;

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
		int max = ia[0];
		int secondMax = ia[0];
		int numOfMax = 0;
		/* find the maximum of int [] ia */
		for(int i = 1; i < ia.length; i++) {
			if(ia[i] >= max) {
				max = ia[i];
			}
			if(ia[i] < max) {
				secondMax = ia[i];
			}
		}
		
		/* find how many maximum are in the sequence */
		for(int i = 0; i < ia.length; i++) {
			if(ia[i] == max) {
				numOfMax += 1;
			}
		}
		
		
		/* find the second maximum of int [] ia */
		if(numOfMax == 1) {
			for(int i = 1; i < ia.length; i++) {
				if(ia[i] != max && ia[i] >= secondMax) {
					secondMax = ia[i];
				}
			}
		}
		if(numOfMax > 1) { 
			secondMax = max;
		}
		result = secondMax;
		// Do not modify this return statement. 
		return result;
	}
	
	/*
	 * Example Test 2b
	 */

	/* Given an array of integers, return its reverse.
	 * Your are forbidden to use any library class, e.g., Arrays.sort.
	 */
	public static int[] reverseOf(int[] ia) {
		int[] result = null;

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
		int [] reversedArray = new int [ia.length];
		for(int i = ia.length - 1; i >= 0; i--) {
			reversedArray[ia.length - 1 - i] = ia[i];
		}
		
		result = reversedArray;
		// Do not modify this return statement. 
		return result;
	}

	/* Given two arrays of integers, determine whether or not
	 * one is exactly the reverse of the other.
	 * Your are forbidden to use any library class, e.g., Arrays.sort.
	 */
	public static boolean isReverseOfEachOther(int[] ia1, int[] ia2) {
		boolean result = false;

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
		result = (ia1.length == ia2.length);
		for(int i = 0; i < ia1.length; i++) {
			result = result && ia1[i] == ia2[ia2.length - 1 - i];
		}


		// Do not modify this return statement. 
		return result;
	}

	/* Return the first n elements in an arithmetic sequence whose
	 * start term is start and common difference is diff.
	 */
	public static int[] getArithSeq(int start, int diff, int n) {
		int[] result = null;

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
		result = new int[n];
		int term = start;
		for(int i = 0; i < n; i++) {
			result[i] = term;
			term += diff;
		}
		

		// Do not modify this return statement. 
		return result;
	}
	
	/* Given an integer array, determine if it's an arithmetic sequence,
	 * i.e., there's a common different between every two consecutive elements.
	 */
	public static boolean isArithSeq(int[] ia) {
		boolean result = false;

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
		if(ia.length > 2) {
			int diff = ia[1] - ia[0];
			boolean isArithSeq = true;
			int i = 1;
			while(isArithSeq && i < ia.length - 1) {
				isArithSeq = (ia[i + 1] -ia[i] == diff);
				i++;
			}
			
			result = isArithSeq;

		}
		
		

		// Do not modify this return statement. 
		return result;
	}
	
	/*
	 * Example Test 2c
	 */

	/* Return the first i items in a Fibonacci sequence. 
	 * A Fibonacci sequence is:
	 * 1, 1, 2, 3, 5, 8, 13, 21, ...
	 * where the 1st and 2nd elements are always 1, and
	 * starting from the third element, the value of an element
	 * is the sum of its previous two neighbouring elements.
	 * For example, 2 == 1 + 1, 3 == 2 + 1, 5 == 3 + 2, 8 == 5 + 3, and etc.
	 * You can assume that the input i >= 0.
	 */
	public static int[] getFibSeq(int i) {
		int[] result = null;

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
		result = new int [i];
		if(i > 0) {
			result[0] = 1;
			if(i > 1) {
				result[1] = 1;
				for(int j = 2; j < i; j++) {
					result[j] = result[j - 2]+result[j - 1];
				}
			}
		}

		// Do not modify this return statement. 
		return result;
	}

	/* Determine whether or not an integer array ia contains
	 * the first ia.length elements in a Fibonacci sequence.
	 * Remember that ia.length >= 0
	 */
	public static boolean isFibSeq(int[] ia) {
		boolean result = false;
		/* Your task is to implement this method,
		 * so that running UtilitiesTester.java will output the expected value to console.
		 * 
		 * Do not write any System.out.print(...) or System.out.println(...).
		 * Do not declare any Scanner. 
		 * Do not re-assign any of the parameter/input variables. 
		 */

		/* Your code starts after this line: */ 
		if(ia.length > 1) {
			if(ia[0] == 1 && ia[1] ==1) {
				result = true;
				int i = 2; 
				while(result && i < ia.length) {
					result = (ia[i] == ia[i - 1] + ia[i - 2]);
					
					i++;
				}
			}
		}

		

		// Do not modify this return statement.
		return result;
	}

	/*
	 * Count the number of occurrences of string s in string array sa.
	 */
	public static int numberOfOccurrences(String[] sa, String s) {
		int result = -1;
		/* Your task is to implement this method,
		 * so that running UtilitiesTester.java will output the expected value to console.
		 * 
		 * Do not write any System.out.print(...) or System.out.println(...).
		 * Do not declare any Scanner. 
		 * Do not re-assign any of the parameter/input variables. 
		 */

		/* Your code starts after this line: */ 
		int numOfIndices = 0;
		for(int i = 0;i < sa.length; i++) {
			if(sa[i].equals(s)) {
				numOfIndices += 1;
			}
		}
		result = numOfIndices;
		

		// Do not modify this return statement.
		return result;
	}

	/* Return an array storing the indices of string s in string array sa.
	 * If s does not occur in sa, then the returned array should be EMPTY.
	 * Length of the returned array should correspond to the number of times
	 * string s occurs in string array sa.
	 */
	public static int[] getIndices(String[] sa, String s) {
		int[] result = null;
		/* Your task is to implement this method,
		 * so that running UtilitiesTester.java will output the expected value to console.
		 * 
		 * Do not write any System.out.print(...) or System.out.println(...).
		 * Do not declare any Scanner. 
		 * Do not re-assign any of the parameter/input variables. 
		 */

		/* Your code starts after this line: */ 
		
		int numOfIndices = 0;
		for(int i = 0;i < sa.length; i++) {
			if(sa[i].equals(s)) {
				numOfIndices += 1;
			}
		}
		result = new int[numOfIndices];
		int j = 0;
		for(int i = 0;i < sa.length; i++) {
			if(sa[i].equals(s)) {
				result[j] = i;
				j += 1;
			}
		}
		// Do not modify this return statement.
		return result;
	}
}

