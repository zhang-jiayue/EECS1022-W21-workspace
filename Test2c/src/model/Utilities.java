package model;

public class Utilities {
	/* 
	 * 	Requirements:
	 * 	- It is strictly forbidden for you to use: 
	 * 		+ Any Java library class (e.g., ArrayList, Arrays)
	 * 		  (That is, there must not be an import statement in the beginning of this class.)
	 * 	- You will receive an immediate zero for this task if the requirement is violated. 
	 * 	- You can define helper methods if you wish.
	 * 
	 * Only write lines of code within the methods given to you. 
	 * Do not declare any variables OUTSIDE the given methods.
	 * You can only declare local variables within each method.
	 * 
	 * Your submission will only be graded against:
	 * 	- JUnit tests given to you in TestUtilities
	 * 	- additional JUnit tests  
	 */
	
	/*	 
	 * Input Parameters:
	 *	- `seq`: an array of integers
	 *	- `indices`: an array of integers (each of which may or may not be a valid index for `seq`) 
	 *
	 * Assumptions:
	 * 	- `seq` may be empty.
	 * 	- `indices` may be empty. 
	 * 	- `indices` may contain duplicates.
	 *  
	 * What to return?
	 *  - For each integer value in `indices`, if it is a valid index for input array `seq`, 
	 *  	then use it to index into `seq` and include the result in the output array.
	 *  
	 *  For example: Say `seq` is {23, 46, 69} and `indices` is {2, -1, 0, 3, 0, 2}
	 *  	(where indices -1 and 3 are invalid, so only indices 2, 0, 0, 2 are used)
	 *   	Then the method should return {69, 23, 23, 69} 
	 *   
	 *  Note: Order of elements in the output array corresponds to the order in which
	 *  		valid indices in the `indices` array are arranged. 
	 *  
	 *  That is, the output array may be empty if the input array `seq` is empty,
	 *  	or if the input array `indices` does not contain any valid indices.
	 *   
	 * See the JUnit tests related to this method.
	 */
	public static int[] task1(int[] seq, int[] indices) {
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
		int validIndices = 0;
		for(int i =0; i< indices.length; i++) {
			if(indices[i] >= 0 && indices[i] < seq.length) {
				validIndices +=1;
			}
		}
		
		result = new int [validIndices];
		
		int j = 0;
		for(int i = 0; i < indices.length; i ++) {
			if(indices[i] >= 0 && indices[i] < seq.length) { //valid indices
				result[j] = seq[indices[i]];
				j++;
			}
		}
		

		// Do not modify this return statement. 
        return result;
    }

	/*	 
	 * Input Parameters:
	 *	- `seq`: a non-empty array of integers 
	 *
	 * Assumptions:
	 * 	- Input array `seq` is not empty. 
	 *  
	 * What to return?
	 *  - Return an array that represents an encoding of `seq`, by adopting the following principle:
	 *  	Element at each odd index (e.g., at index 1, at index 3, and so on) of the return array specifies 
	 *  		how many times the element at the previous even index (e.g., at index 0, at index 2, and so on) repeats 
	 *  		in the input array `seq`.
	 *  	
	 *  	For example, {2, 4, 1, 3} encodes that value 2 (at even index 0) should repeat 4 times (as specified at odd index 1), 
	 *  		and similarly, value 1 should repeat 3 times. 
	 *  		
	 *  		Say `seq` is {2, 2, 2, 2, 1, 1, 1}.
	 *  		Then the method should return an encoded array {2, 4, 1, 3}.
	 *   
	 * See the JUnit tests related to this method.
	 */
	public static int[] task2(int[] seq) {
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
        if(seq.length == 1) {
        	result = new int[2];
        	result[0] = seq[0];
        	result[1] = 1;
        }
        if(seq.length > 1){
            int numInArray = 0;
    		for(int i = 0; i < seq.length - 1; i++) {
    			if(seq[i] != seq[i + 1]) {
    				numInArray += 1;
    			}
    		}
    		numInArray += 1;
    		
    		result = new int [numInArray * 2];
    		
    		int j = 0;
    		for(int i = 0; i < seq.length - 1; i++) { // the array seq is non-empty but possibly only one value
    			if(seq[i] == seq[i + 1]) {
    				result[j + 1] += 1;
    				result[j] = seq[i];
    			}
    			if(seq[i] != seq[i + 1]) {
    				result[j] = seq[i];
    				j += 2;
    			}
    		}
    		if(seq[seq.length - 1] != seq[seq.length - 2]) {
    			result[j] = seq[seq.length - 1];
    		}
    		for(int i = 0; i < result.length; i++) {
    			if (i % 2 ==1){
    				result[i] += 1;
    			}
    		}
        }
 
        

		// Do not modify this return statement. 
        return result;
    }
	
	/*	 
	 * Input Parameters:
	 *	- `seq`: a non-empty array of integers 
	 *
	 * Assumptions:
	 * 	- Input array `seq` is not empty. 
	 *  
	 * What to return?
	 *  -  Return another array of strings, each of which denoting a non-empty suffix of the input array.
	 *     
	 *     A suffix of array `seq` contains its last n elements (where 1 <= n <= seq.length). 
	 *     
	 *  	For example, if the input array is:
	 *   
	 *  		<3, 1, 4>
	 *  
	 *  	Then the output or returned array of string values is:
	 *  		
	 *  		<"[3, 1, 4]", "[1, 4]", "[4]">
	 *  	
	 *  	where each suffix is structured as a comma-separated list surrounded by square brackets.	
	 *  
	 *  	Note that the length of the output array is equal to the length of the input array. 
	 *  	
	 *  	Also, elements in the output array are ``sorted'' by the lengths of the suffixes. 
	 *  		(e.g,. the last element is the suffix of length 1, the second last element is the suffix of length 2).
	 *   
	 * See the JUnit tests related to this method.
	 */
	public static String[] task3(int[] seq) {
		String[] result = null;
		
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
		result = new String [seq.length];
		
		for(int i = seq.length - 1; i >= 0; i --) {
			result[i] = "[";
			for(int j = i; j < seq.length; j++) {
				result[i] += String.format("%d", seq[j]);
				if(j < seq.length - 1) {
					result[i] += ", ";
				}
			}
			result[i] += "]";

			
		}
		

		// Do not modify this return statement. 
        return result;
    }
	
	/*	 
	 * Input Parameters:
	 *	- `sa`: an array of strings
	 *
	 * Assumptions:
	 * 	- Input array `sa` is non-empty and contains at least one elements.
	 * 	– The string value that appears the most frequently is unique.
	 *  
	 * What to return?
	 *  - Return the string value that appears the most frequently, 
	 *  	i.e., appear for the highest number of times.
	 *   
	 * See the JUnit tests related to this method.
	 */
	public static String task4(String[] sa) {
    	String result = null;
		
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
    	int[] howManyTime = new int [sa.length];
		for(int i = 0; i< sa.length; i++) {
			for(int j = 0; j < sa.length; j++) {
				if(sa[i].equals(sa[j])) {
					howManyTime[i] += 1;
				}
			}

		}
		
		int max = 0;
		for (int i = 0; i < howManyTime.length; i++) {
			if(howManyTime[i] > max) {
				max = howManyTime[i];
			}
		}
		
		for (int i = 0; i < howManyTime.length; i++) {
			if(howManyTime[i] == max) {
				result = sa[i];
			}
		}
    	

		// Do not modify this return statement. 
        return result;
    }	 
}

