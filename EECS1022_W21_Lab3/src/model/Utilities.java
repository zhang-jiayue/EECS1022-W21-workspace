package model;

public class Utilities {
	/*
	 * Input parameters:
	 * 	- `lower` is the lower bound
	 *  - `upper` is the upper bound
	 *  
	 * Use of arrays or any Java library class (e.g., ArrayList) is strictly forbidden.
	 * Violation of this will result in a 50% penalty on your marks.
	 * Try to solve this problem using loops only.   
	 *  
	 * Refer to you lab instructions for what the method should return. 
	 */
	public static String getNumbers(int lower, int upper) {
		String result = "";
		
		/* Your implementation of this method starts here. 
		 * Recall from Week 1's tutorial videos:
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, an explicit, final `return` statement is placed for you.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		int difference = 0;
		if (lower < 0 || upper < 0) {
			result = "Error: both bounds must be non-negative";
		}
		else if (lower > upper) {
			result = String.format("Error: lower bound %d is not less than or equal to upper bound %d", lower, upper);
		}
		else {
			String sequence = "";
			difference = upper - lower;
			for (int i = 0; i <= difference; i++) {
				if ((lower + i) % 3 == 0) {
					sequence = sequence + "(" + (lower + i) + ")";
				}
				if((lower + i) % 3 == 1) {
					sequence = sequence + "[" + (lower + i) + "]";
				}
				if((lower + i) % 3 == 2) {
					sequence = sequence + "{" + (lower + i) + "}";
				}
				if (i < difference) {
					sequence += ", ";
				}
			}
		if (difference == 0) {
			result = String.format("%d number between %d and %d: <%s>", difference + 1, lower, upper, sequence);
		}
		if (difference > 0) {
			result = String.format("%d numbers between %d and %d: <%s>", difference + 1, lower, upper, sequence);
		}
		
		
		
		/* Your implementation ends here. */
		
	}
		return result;
}
	
	/*
	 * Input parameters:
	 * 	- `ft`, `d`, `n` are the first term, common difference, and size of an arithmetic sequence.
	 * 
	 * Use of arrays or any Java library class (e.g., ArrayList) is strictly forbidden.
	 * Violation of this will result in a 50% penalty on your marks.
	 * Try to solve this problem using loops only. 
	 *  
	 * Refer to you lab instructions for what the method should return. 
	 */
	public static String getIntermediateStats(int ft, int d, int n) {
		String result = "";
		
		/* Your implementation of this method starts here. 
		 * Recall from Week 1's tutorial videos:
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, an explicit, final `return` statement is placed for you.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		if (n == 0) {
			result = "{}";
		}
		else {
			result = "{";
			int term = 0;
			String sequence = "";
			int sum = 0;
			double avg = 0.0;
			for(int i = 0; i < n; i ++) {
				if (i == 0) {
					term = ft;
					sequence = String.valueOf(ft);
					sum = ft;
					avg = sum / (i + 1.0);
					result += String.format("[sum of <%s>: %d ; avg of <%s>: %.2f]", sequence, sum, sequence, avg);
				}
				if(i > 0){
					term += d;
					sequence += ", " + term;
					sum += term;
					avg = sum / (i + 1.0);
					result += String.format(", [sum of <%s>: %d ; avg of <%s>: %.2f]", sequence, sum, sequence, avg);
				}
			}
			result += "}";
		}
		/* Your implementation ends here. */
		return result;
	}
	/*
	 * Input parameters:
	 * 	- `ft1`, `d1`, `n1` are the first term, common difference, and size of the first arithmetic sequence.
	 *  - `ft2`, `d2`, `n2` are the second term, common difference, and size of the second arithmetic sequence.
	 *  
	 * Use of arrays or any Java library class (e.g., ArrayList) is strictly forbidden.
	 * Violation of this will result in a 50% penalty on your marks.
	 * Try to solve this problem using loops only.  
	 *  
	 * Refer to you lab instructions for what the method should return. 
	 */
	public static String getInterlevaings(int ft1, int d1, int n1, int ft2, int d2, int n2) {
		String result = "";
		
		/* Your implementation of this method starts here. 
		 * Recall from Week 1's tutorial videos:
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, an explicit, final `return` statement is placed for you.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		result = "<";
		if (n1 == 0 && n2 > 0){
			int i =0;
			int term = ft2;
			result += "[" + ft2 + "], ";
			for (;i < n2 - 1;) {
				term += d2;
				result += "[" + term + "]";
				if (i < n2 - 2) {
					result += ", ";
				}
				i++;
			}
		}
		
		if (n1 > 0 && n2 == 0){
			int i =0;
			int term = ft1;
			result += "(" + ft1 + "), ";
			for (;i < n1 - 1;) {
				term += d1;
				result += "(" + term + ")";
				if (i < n1 - 2) {
					result += ", ";
				}
				i++;
			}
		}
		
		if (n1 > 0 && n2 >0 && n1 == n2){

			int term1 = ft1;
			int term2 = ft2;
			result += "(" + ft1 + "), " + "[" + ft2 + "], ";
			for (int i = 1; i < n1; i++) {
				term1 += d1;
				term2 += d2;
				result += "(" + term1 + "), ";
				result += "[" + term2 + "]";
				if (i < n1 - 1 ) {
					result += ", ";
				}
				}
			}
	
		if (n1 > 0 && n2 >0 && n1 < n2){
			int i = 1;
			int term1 = ft1;
			int term2 = ft2;
			result += "(" + ft1 + "), " + "[" + ft2 + "], ";
			for (;i < n2;) {
				term1 += d1;
				term2 += d2;
				if (i < n1) {
					result += "(" + term1 + "), ";
				}
				result += "[" + term2 + "]";
				if (i < n2 - 1) {
					result+= ", ";
				}
				i++;
				}
			}
		
		if (n1 > 0 && n2 > 0 && n1 > n2){
			int i = 1;
			int term1 = ft1;
			int term2 = ft2;
			result += "(" + ft1 + "), " + "[" + ft2 + "], ";
			for (;i < n1;) {
				term1 += d1;
				term2 += d2;
				result += "(" + term1 + ")";
				if (i < n1 - 1) {
					result+= ", ";
				}
				if (i < n2) {
					result += "[" + term2 + "], ";
				}
				i++;
				}
		}	
		
		result += ">";
		/* Your implementation ends here. */
		return result;
	}
}
