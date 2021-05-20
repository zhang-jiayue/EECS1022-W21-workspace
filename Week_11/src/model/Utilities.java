package model;

public class Utilities {
	public static String getPrintOutRowByRow(int[][] a) {
		String result = "{";
		for(int i = 0; i < a.length; i++) {
			result += "{";
			for(int j = 0; j < a[i].length; j++) {
				result += a[i][j];
				if(j < a[i].length- 1) {
					result += ", ";
				}
			}
			result += "}";
			if(i < a.length - 1) {
				result += ", ";
			}
		}
		
		result += "}";
		
		return result;
	}
	
	public static String getPrintOutColByCol(int[][] a) {
		String result = "{";
		int maxLen = 0;
		for(int i = 0; i < a.length; i ++) {
			if(a[i].length > maxLen){
				maxLen = a[i].length;
			}
		}
		// numInListForCol is for adding ","
		for(int c = 0; c < maxLen; c ++) {
			result += "{";
			int numInListForCol = 0;
			for(int r = 0; r < a.length; r++) {	
				if(a[r] != null && a[r].length > c) {
						numInListForCol += 1;
					}
				}
			//iterate through each row and add integers in column c to the string
			int numAddedSoFar = 0;
			for(int r = 0; r < a.length; r++) {	
				if(a[r] != null && a[r].length > c) {
					result += a[r][c];
					numAddedSoFar += 1;
					if(numAddedSoFar < numInListForCol) {
						result += ", ";
					}
				}
			}
		
		

			result += "}";
			if(c < maxLen - 1) {
				result += ", ";
			}
		}
		

		result += "}";
		return result;
	}
	
	public static double getAverage(int[][] a) {
		double sum = 0;
		int count = 0;
		for(int r = 0; r < a.length; r ++) {
			for(int c = 0; c < a[r].length; c ++) {
				sum += a[r][c];
				count += 1;
			}
		}
		
		return sum / count;
	}
	
	public static double[] getRowAverage(int[][] a) {
		// create a double array with the length of the size of the input 2D array
		double[] result = new double[a.length];
		for(int r = 0; r < a.length; r ++) {
			/* Start of a new row*/
			double sum = 0; //set/reset double sum to 0;
			int count = 0; //set the counter to 0
			for(int c = 0; c < a[r].length; c ++) {
				/* Start of a new col*/
				sum += a[r][c];
				count += 1;
			}
			/* End of the current row*/
			result[r] = sum / count; //the row average
		}
		

		return result;
	}
	
	public static int[] getMaxMin(int[][]a) {
		int max = a[0][0];	/* do not set initial values to 0, because the terms of the array list might be all negative*/
		int min = a[0][0]; //set initial values to the first integer in the position a[0][0]
		int[] result = new int[2];
		for(int r = 0; r < a.length; r++) {
			for(int c = 0; c < a[r].length; c++) {
				if(a[r][c] < min) {
					min = a[r][c];
				}
				if(a[r][c] > max) {
					max = a[r][c];
				}
			}
		}
		result[0] = max;
		result[1] = min;
		return result;
	}
	
	public static int[][] getRowMaxMin(int[][]a){
		int[][] result = {};
		
		
		return result;
	}
	
	
	public static int[] getRowWithMaxSum(int[][] a) {
		int[] result = {};
		int maxSumIndex = 0;
		int maxSum = 0;
		//iterate through the first integer array in the 2D array,
		//and set the initial max value to the sum of the first array
		for(int i = 0; i < a[0].length; i++) {
			maxSum += a[0][i];
		}
		
		for(int i = 1; i < a.length; i++) {//iterate through each row
			int sum = 0;
			for(int j = 0; j < a[i].length; j++) {//column
				sum += a[i][j];
			}
			if (sum > maxSum) { // if the sum of the current row is > initial max value, then update
				maxSum = sum;
				maxSumIndex = i;
			}
			
		}
		
		result = a[maxSumIndex];
		return result;
	}
	
	public static int[] getRowWithMinSum(int[][] a) {
		int[] result = {};
		int minSumIndex = 0;
		int minSum = 0;
		for(int i = 0; i < a[0].length; i++) {
			minSum += a[0][i];
		}
		
		for(int i = 1; i < a.length; i++) {
			int sum = 0;
			for(int j = 0; j < a[i].length; j++) {
				sum += a[i][j];
			}
			if (sum < minSum) {
				minSum = sum;
				minSumIndex = i;
			}
			
		}
		
		result = a[minSumIndex];
		return result;
	}
	
	public static boolean allPositive(int[][] a) {
		boolean result = true; /* Have we found any violation witness? */
		for(int r = 0; result && r < a.length; r ++) {
			for(int c = 0; result && c < a[r].length; c++) {
				if(a[r][c] < 0) {
					result = false;
				}
			}
		}
		
		return result;
	}
	
	public static boolean atLeastOneRow(int[][]a) {//at least one row is all positive
		boolean atLeastOne = false;
		for(int r = 0; !atLeastOne && r < a.length; r ++) {
			boolean positiveRow = true;
			for(int c = 0; positiveRow && c < a[r].length; c++) {
				if(a[r][c] < 0) {
					positiveRow = false;
				}
			}
			
			if(positiveRow) {
				atLeastOne = true;
			}
		}
		
		
		return atLeastOne;
	}
	
	public static boolean isRectangle(int[][] a) {
		boolean rectangle = true;
		int numOfCol = a[0].length;
		for(int r = 1; rectangle && r < a.length; r++) {
			rectangle = rectangle && a[r].length == numOfCol;
		}
		
		return rectangle;
	}
	
	public static boolean isSquare(int[][] a) {
		boolean square = isRectangle(a);
		int numOfCol = a[0].length;
		square = square && numOfCol == a.length;
		
		return square;
	}
	
	public static String lowerTriangle(int[][] a) {
		String result = "";
		for(int row = 0; row < a.length; row++) {
			for(int col = 0; col <= row; col++) {
				result += a[row][col];
			}
		}
		
		
		
		return result;
	}
	
	public static String upperTriangle(int[][] a) {
		String result = "";
		for(int row = 0; row < a.length; row++) {
			for(int col = 0; col < a[0].length - row; col++) {
				result += a[row][col];
			}
		}
		
		
		
		return result;
	}
		
		
	
}
