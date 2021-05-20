package junit_tests;

import static org.junit.Assert.*;


import org.junit.Test;

import model.Utilities;

public class TestUtilities {

	@Test
	public void test_01() {
		int[][] input1 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};	
		String output1 = Utilities.getPrintOutRowByRow(input1);
		String expected1 = "{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}}";
		assertEquals(expected1, output1);
	}
	
	@Test
	public void test_02() {
		int[][] input2 = {{1, 2, 3, 4}, {5, 6, 7}, {8}};	
		String output2 = Utilities.getPrintOutRowByRow(input2);
		String expected2 = "{{1, 2, 3, 4}, {5, 6, 7}, {8}}";
		assertEquals(expected2, output2);
	}

	@Test
	public void test_03() {
		int[][] input3 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};	
		String output3 = Utilities.getPrintOutColByCol(input3);
		String expected3 = "{{1, 5, 9}, {2, 6, 10}, {3, 7, 11}, {4, 8, 12}}";
		assertEquals(expected3, output3);
	}
	
	@Test
	public void test_04() {
		int[][] input4 = {{1, 2, 3, 4}, {5, 6, 7}, {8}};	
		String output4 = Utilities.getPrintOutColByCol(input4);
		String expected4 = "{{1, 5, 8}, {2, 6}, {3, 7}, {4}}";
		assertEquals(expected4, output4);
	}
	
	@Test 
	public void test_05() {
		int[][] input1 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};	
		double output1 = Utilities.getAverage(input1);
		double expected1 = 6.5;
		assertEquals(expected1, output1, 0.01);
		
		int[][] input2 = {{1, 2, 3, 4}, {5, 6, 7}, {8}};	
		double output2 = Utilities.getAverage(input2);
		double expected2 = 4.5;
		assertEquals(expected2, output2, 0.01);
		
		
	}
	
	@Test 
	public void test_06() {
		int[][] input1 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};	
		double[] output1 = Utilities.getRowAverage(input1);
		double[] expected1 = {2.5, 6.5, 10.5};
		assertTrue(output1.length == expected1.length);
		for(int i = 0; i<output1.length; i++){
			assertEquals(expected1[i], output1[i], 0.01);
		}
		
		int[][] input2 = {{1, 2, 3, 4}, {5, 8, 7}, {6}};	
		double[] output2 = Utilities.getRowAverage(input2);
		double[] expected2 = {2.5, 6.6, 6.0};
		assertTrue(output1.length == expected1.length);
		for(int i = 0; i<output1.length; i++){
			assertEquals(expected2[i], output2[i], 0.1);
		}
	}
	
	@Test 
	public void test_07() {
		int[][] input1 = {{1, 10, 5, 7}, {6, 2, 12, 9}, {3, 8, 4, 11}};	
		int[] output1 = Utilities.getMaxMin(input1);
		int[] expected1 = {12, 1};
		assertEquals(expected1[0], output1[0]);
		assertEquals(expected1[1], output1[1]);

		
		int[][] input2 = {{6, 2, 5, 3}, {4, 8, 1}, {7}};	
		int[] output2 = Utilities.getMaxMin(input2);
		int[] expected2 = {8, 1};
		assertEquals(expected2[0], output2[0]);
		assertEquals(expected2[1], output2[1]);
	}
	
	@Test 
	public void test_08() {
		int[][] input1 = {{10, 10, 10, 10}, {41}, {-4, 29, 13}};	
		int[] output1 = Utilities.getRowWithMaxSum(input1);
		int[] expected1 = {41};
		assertArrayEquals(expected1, output1);
		
		
		int[][] input2 = {{10, 10, 10, 10}, {41}, {-4, 29, 13}, {2}, {1, 3, 9}};	
		int[] output2 = Utilities.getRowWithMaxSum(input2);
		int[] expected2 = {41};
		assertArrayEquals(expected2, output2);
		
		int[] output3 = Utilities.getRowWithMinSum(input1);
		int[] expected3 = {-4, 29, 13};
		assertArrayEquals(expected3, output3);
		
		
		int[] output4 = Utilities.getRowWithMinSum(input2);
		int[] expected4 = {2};
		assertArrayEquals(expected4, output4);
		
	}
	
	
	@Test 
	public void test_09() {
		int[][] input1 = {{1, 10, 5, 7}, {6, 2, 12, 9}, {3, 8, 4, 11}};	
		boolean output1 = Utilities.allPositive(input1);
		boolean expected1 = true;
		assertEquals(expected1, output1);
		
		
		int[][] input2 = {{10, 10, 10, 10}, {41}, {-4, 29, 13}};	
		boolean output2 = Utilities.allPositive(input2);
		boolean expected2 = false;
		assertEquals(expected2, output2);

		
	}
	
	@Test 
	public void test_10() {
		int[][] input1 = {{1, 10, -5, 7}, {6, -2, 12, 9}, {3, 8, 4, 11}};	
		boolean output1 = Utilities.atLeastOneRow(input1);
		boolean expected1 = true;
		assertEquals(expected1, output1);
		
		
		int[][] input2 = {{10, -10, 10, 10}, {-41}, {-4, 29, 13}};	
		boolean output2 = Utilities.atLeastOneRow(input2);
		boolean expected2 = false;
		assertEquals(expected2, output2);
		
		int[][] input3 = {{10, -10, 10, 10}, {-41}, {4, 29, 13}};	
		boolean output3 = Utilities.atLeastOneRow(input3);
		boolean expected3 = true;
		assertEquals(expected3, output3);

		
	}
	
	@Test 
	public void test_11() {
		int[][] input1 = {{1, 10, -5, 7}, {6, -2, 12, 9}, {3, 8, 4, 11}};	
		boolean output1 = Utilities.isRectangle(input1);
		boolean expected1 = true;
		assertEquals(expected1, output1);
		
		
		int[][] input2 = {{10, -10, 10, 10}, {-41, 1, 3, 5}, {-4, 29, 13}};	
		boolean output2 = Utilities.isRectangle(input2);
		boolean expected2 = false;
		assertEquals(expected2, output2);
		
		int[][] input3 = {{10, -10, 10, 10}, {-41}, {4, 29, 13}};	
		boolean output3 = Utilities.isRectangle(input3);
		boolean expected3 = false;
		assertEquals(expected3, output3);

		
	}
	
	@Test 
	public void test_12() {
		int[][] input1 = {{1, 10, -5, 7}, {6, -2, 12, 9}, {3, 8, 4, 11}};	
		boolean output1 = Utilities.isSquare(input1);
		boolean expected1 = false;
		assertEquals(expected1, output1);
		
		
		int[][] input2 = {{-10, 10, 10}, {1, 3, 5}, {-4, 29, 13}};	
		boolean output2 = Utilities.isSquare(input2);
		boolean expected2 = true;
		assertEquals(expected2, output2);
		
		int[][] input3 = {{10}};	
		boolean output3 = Utilities.isSquare(input3);
		boolean expected3 = true;
		assertEquals(expected3, output3);

		
	}
	
	@Test 
	public void test_13() {
		int[][] input2 = {{-10, 10, 10}, {1, 3, 5}, {-4, 29, 13}};	
		String output2 = Utilities.lowerTriangle(input2);
		String expected2 = "-1013-42913";
		assertEquals(expected2, output2);
		
		String output3 = Utilities.upperTriangle(input2);
		String expected3 = "-10101013-4";
		assertEquals(expected3, output3);


		
	}
	
	
	
	
	
}
