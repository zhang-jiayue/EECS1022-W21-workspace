package model;

public class ArrayUtilities {
	public static int[] getIntermediateSums(int[] ns) {
		int[] result = null; // array variable stores no address
		
		int sum = 0;
		int[] sums = new int[ns.length];
		for(int i = 0; i < ns.length; i ++) {
			sum += ns[i];
			sums[i] = sum;
		}
		result = sums;
		
		
		return result;
	}
}
