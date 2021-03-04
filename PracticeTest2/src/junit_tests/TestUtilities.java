package junit_tests;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import model.Utilities;

public class TestUtilities {
	/* A test taking more than 10 seconds to terminate
	 * suggests that there is an infinite loop in your method. 
	 */
	@Rule
    public Timeout globalTimeout = Timeout.seconds(10);
	
	/*
	 * Example Test 2a
	 */
	
	/* Tests related to averageOf */
	@Test
	public void test_averageOf_01() {
		int[] input = {75};
		double result = Utilities.averageOf(input);
		assertEquals(75.0, result, 0.1);
	}
	
	@Test
	public void test_averageOf_02() {
		int[] input = {5, 10, 15, 19, 25};
		double result = Utilities.averageOf(input);
		assertEquals(14.8, result, 0.1);
	}
	
	/* Tests related to allMultiplesOf5 */
	@Test
	public void test_allMultiplesOf5_01() {
		int[] input = {};
		boolean result = Utilities.allMultiplesOf5(input);
		assertEquals(true, result);
	}
	
	@Test
	public void test_allMultiplesOf5_02() {
		int[] input = {5, 10, 15, 20, 25};
		boolean result = Utilities.allMultiplesOf5(input);
		assertEquals(true, result);
	}
	
	@Test
	public void test_allMultiplesOf5_03() {
		int[] input = {5, 10, 15, 19, 25};
		boolean result = Utilities.allMultiplesOf5(input);
		assertEquals(false, result);
	}
	
	/* Tests related to atLeastOneMultipleOf5 */
	@Test
	public void test_atLeastOneMultipleOf5_01() {
		int[] input = {};
		boolean result = Utilities.atLeastOneMultipleOf5(input);
		assertEquals(false, result);
	}
	
	@Test
	public void test_atLeastOneMultipleOf5_02() {
		int[] input = {5, 10, 15, 19, 25};
		boolean result = Utilities.atLeastOneMultipleOf5(input);
		assertEquals(true, result);
	}
	
	@Test
	public void test_atLeastOneMultipleOf5_03() {
		int[] input = {4, 11, 14, 23, 19};
		boolean result = Utilities.atLeastOneMultipleOf5(input);
		assertEquals(false, result);
	}
	
	/* Tests related to secondMaximumOf */
	@Test
	public void test_secondMaximumOf_01() {
		int[] input = {5, 7};
		int result = Utilities.secondMaximumOf(input);
		assertEquals(5, result);
	}
	
	@Test
	public void test_secondMaximumOf_02() {
		int[] input = {4, 9, 1, 5, 8, 3, 10, 7, 2, 6};
		int result = Utilities.secondMaximumOf(input);
		assertEquals(9, result);
	}
	
	@Test
	public void test_secondMaximumOf_03() {
		int[] input = {10, 9, 1, 5, 8, 3, 10, 7, 2, 6};
		int result = Utilities.secondMaximumOf(input);
		assertEquals(10, result);
	}
	
	/*
	 * Example Test 2b
	 */
	
	/* Tests related to reverseOf */
	@Test
	public void test_reverseOf_01() {
		int[] input = {};
		int[] result = Utilities.reverseOf(input);
		int[] expected = {};
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void test_reverseOf_02() {
		int[] input = {23};
		int[] result = Utilities.reverseOf(input);
		int[] expected = {23};
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void test_reverseOf_03() {
		int[] input = {4, 9, 7, 11};
		int[] result = Utilities.reverseOf(input);
		int[] expected = {11, 7, 9, 4};
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void test_reverseOf_04() {
		int[] input = {4, 9, 13, 7, 11};
		int[] result = Utilities.reverseOf(input);
		int[] expected = {11, 7, 13, 9, 4};
		assertArrayEquals(expected, result);
	}
	
	/* Tests related to isReverseOfEachOther */
	@Test
	public void test_isReverseOfEachOther_01() {
		int[] input1 = {};
		int[] input2 = {};
		boolean result = Utilities.isReverseOfEachOther(input1, input2);
		assertEquals(true, result);
	}
	
	@Test
	public void test_isReverseOfEachOther_02() {
		int[] input1 = {};
		int[] input2 = {2, 3, 4};
		boolean result = Utilities.isReverseOfEachOther(input1, input2);
		assertEquals(false, result);
	}
	
	@Test
	public void test_isReverseOfEachOther_03() {
		int[] input1 = {4, 9, 1, 5, 8, 3, 10, 7, 2, 6};
		int[] input2 = {6, 2, 7, 10, 3, 8, 5, 1, 9, 4};
		boolean result = Utilities.isReverseOfEachOther(input1, input2);
		assertEquals(true, result);
	}
	
	/* Tests related to getArithSeq */
	@Test
	public void test_getArithSeq_01() { 
		int[] result = Utilities.getArithSeq(3, 2, 0);
		int[] expected = {};
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void test_getArithSeq_02() { 
		int[] result = Utilities.getArithSeq(3, 2, 5);
		int[] expected = {3, 5, 7, 9, 11};
		assertArrayEquals(expected, result);
	}
	
	/* Tests related to isArithSeq */
	@Test
	public void test_isArithSeq_01() {
		int[] input = {5, 8, 11, 14};
		boolean result = Utilities.isArithSeq(input);
		assertEquals(true, result);
	}
	
	@Test
	public void test_isArithSeq_02() {
		int[] input = {5, 8, 11, 13};
		boolean result = Utilities.isArithSeq(input);
		assertEquals(false, result);
	}
	
	/*
	 * Example Test 2c
	 */
	
	/* Tests related to getFibSeq */
	@Test
	public void test_getFibSeq_01() { 
		int[] result = Utilities.getFibSeq(0);
		int[] expected = {};
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void test_getFibSeq_02() { 
		int[] result = Utilities.getFibSeq(1);
		int[] expected = {1};
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void test_getFibSeq_03() { 
		int[] result = Utilities.getFibSeq(2);
		int[] expected = {1, 1};
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void test_getFibSeq_04() { 
		int[] result = Utilities.getFibSeq(10);
		int[] expected = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55};
		assertArrayEquals(expected, result);
	}
	
	/* Tests related to isFibSeq */
	@Test
	public void test_isFibSeq_01() {
		int[] input = {1, 1};
		boolean result = Utilities.isFibSeq(input);
		assertEquals(true, result);
	}
	
	@Test
	public void test_isFibSeq_02() {
		int[] input = {2, 2};
		boolean result = Utilities.isFibSeq(input);
		assertEquals(false, result);
	}
	
	@Test
	public void test_isFibSeq_03() {
		int[] input = {1, 1, 2, 3, 5, 8, 13};
		boolean result = Utilities.isFibSeq(input);
		assertEquals(true, result);
	}
	
	@Test
	public void test_isFibSeq_04() {
		int[] input = {1, 1, 2, 3, 7, 8, 13};
		boolean result = Utilities.isFibSeq(input);
		assertEquals(false, result);
	}
	
	@Test
	public void test_isFibSeq_05() {
		int[] input = {2, 2, 4, 6, 10, 16, 26};
		boolean result = Utilities.isFibSeq(input);
		assertEquals(false, result);
	}
	
	/* Tests related to numberOfOccurrences */
	@Test
	public void test_numberOfOccurrences_01() {
		String[] input = {"d", "c", "a", "b", "c", "d", "a", "a", "d", "a"};
		int result = Utilities.numberOfOccurrences(input, "a");
		assertEquals(4, result);
	}
	
	@Test
	public void test_numberOfOccurrences_02() {
		String[] input = {"d", "c", "a", "b", "c", "d", "a", "a", "d", "a"};
		int result = Utilities.numberOfOccurrences(input, "b");
		assertEquals(1, result);
	}
	
	@Test
	public void test_numberOfOccurrences_03() {
		String[] input = {"d", "c", "a", "b", "c", "d", "a", "a", "d", "a"};
		int result = Utilities.numberOfOccurrences(input, "e");
		assertEquals(0, result);
	}
	
	/* Tests related to getIndices */
	@Test
	public void test_getIndices_01() {
		String[] input = {"d", "c", "a", "b", "c", "d", "a", "a", "d", "a"};
		int[] result = Utilities.getIndices(input, "a");
		int[] expected = {2, 6, 7, 9};
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void test_getIndices_02() {
		String[] input = {"d", "c", "a", "b", "c", "d", "a", "a", "d", "a"};
		int[] result = Utilities.getIndices(input, "b");
		int[] expected = {3};
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void test_getIndices_03() {
		String[] input = {"d", "c", "a", "b", "c", "d", "a", "a", "d", "a"};
		int[] result = Utilities.getIndices(input, "e");
		int[] expected = {};
		assertArrayEquals(expected, result);
	}
}
