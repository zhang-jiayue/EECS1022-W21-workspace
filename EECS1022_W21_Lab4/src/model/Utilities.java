package model;

/*
 * Requirements:
 * - Any use of Java library classes or methods (e.g., ArrayList) is forbidden.
 * 	 (That is, there must not be an import statement in the beginning of this class.)
 * Violation of this requirement will result in a 50% penalty of your marks.
 *  
 * - Use only if-statements and/or loops to manipulate primitive arrays (e.g., int[], String[]).
 */

public class Utilities {
	/*
	 * Input parameters:
	 * 	- `numbers` : an array of integers
	 *  
	 * Refer to you lab instructions for what the method should return. 
	 */
	public static int[] getMultiplesOf3(int[] numbers) {
		int[] result = null;
		
		/* Your implementation of this method starts here. 
		 * Recall from Week 1's tutorial videos:
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, an explicit, final `return` statement is placed for you.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		
		int multiplesNumber = 0;
		for(int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 3 == 0) {
				multiplesNumber += 1;
			}
		}
		
		int[] mutiples = new int[multiplesNumber];

		int j = 0;
		for(int k = 0; k < numbers.length; k++) {
			if (numbers[k] % 3 == 0) {
				mutiples[j] = numbers[k];
				j++;
			}
		}

			
		result = mutiples;
		
		
		/* Your implementation ends here. */
		
		return result;
		
	}	
	
	/*
	 * Input parameters:
	 * 	- `numbers` : an array of integers
	 * 	- `n`		: an integer (which may or may not exist in `numbers`)
	 *  
	 * Refer to you lab instructions for what the method should return. 
	 */
	public static int[] getFilteredSeq(int[] numbers, int n) {
		int[] result = null;
		
		/* Your implementation of this method starts here. 
		 * Recall from Week 1's tutorial videos:
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, an explicit, final `return` statement is placed for you.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		Boolean nInArray = false;
		int nmOfN = 0;
		/*
		 * Calculate how many n are in array numbers
		 */
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == n){
				nInArray = true;
				nmOfN += 1;	
			}
		}
		int k = 0;
		int[] indexOfN = new int[nmOfN];
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == n){
				indexOfN[k] = i;
				k ++;
			}
		}

		if (nInArray) {
			int [] arrayNew = new int[numbers.length - indexOfN.length];
			// loop through array numbers;
		    // i equals to the index of term
			for (int i = 0, l = 0; i < numbers.length; i++) {
				// loop through each term in indexOfN array
				boolean deleteElement = false;
				
				for (int j = 0; j < indexOfN.length; j++) {
					/*
					 *  if the index of this element in array numbers(i) is equal to any element in array index of N,
					 *  we delete this element
					 */
					if(indexOfN[j]== i) {
						deleteElement = true;
					}
					// if i is not equal to any term in the indexOfN array, the boolean expression deleteElement stays false
				}
				
				if (!deleteElement){
					arrayNew[l++] = numbers[i];
				}
				
				result = arrayNew;
			}
		}
		
		// when n is not in the array, the output array stays the same
		else {
			result = numbers;
		}
		
		
		/* Your implementation ends here. */
		
		return result;
	}
	
	/*
	 * Input parameters:
	 * 	- `numbers` : an array of integers
	 * 
	 * Assumptions:
	 * 	- numbers.length >= 1
	 *  
	 * Refer to you lab instructions for what the method should return. 
	 */
	public static String[] getAllPrefixes(int[] numbers) {
		String[] result = null;
		
		/* Your implementation of this method starts here. 
		 * Recall from Week 1's tutorial videos:
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, an explicit, final `return` statement is placed for you.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		 result = new String[numbers.length];
		 for(int i = 0; i< numbers.length; i++) {
			String element = "[";
			for(int j = 0; j <= i; j ++) {
				 element += numbers[j];
				 if(j < i) {//
					 element += ", ";
				 }
			}
			 element +="]";
			 result[i] = element;
		 }
		
		
		
		/* Your implementation ends here. */
		
		return result;
	}
	
	/*
	 * Input parameters:
	 * 	- `numbers` : an array of integers
	 *  
	 * Refer to you lab instructions for what the method should return. 
	 */
	public static int[] getGroupedNumbers(int[] numbers) {
		int[] result = null;
		
		/* Your implementation of this method starts here. 
		 * Recall from Week 1's tutorial videos:
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, an explicit, final `return` statement is placed for you.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		 result = new int[numbers.length];
		 int j = 0;
		 
		 for(int i = 0; i < numbers.length; i++) {
			 if(numbers[i] % 3 ==0) {
				 result[j] = numbers[i];
				 j++;
			 }
		 }
		 
		 for(int i = 0; i < numbers.length; i++) {
			 if(numbers[i] % 3 ==1) {
				 result[j] = numbers[i];
				 j++;
			 }
		 }
		 
		 for(int i = 0; i < numbers.length; i++) {
			 if(numbers[i] % 3 ==2) {
				 result[j] = numbers[i];
				 j++;
			 }
		 }
		 

		
		/* Your implementation ends here. */
		
		return result;
	}
}
