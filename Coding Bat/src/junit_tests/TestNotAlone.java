package junit_tests;

import static org.junit.Assert.*;

import org.junit.Test;

import array.notAlone;

public class TestNotAlone {

	@Test
	public void test_01() {
		int[] nums = {1, 3, 1, 2};
		int [] result = notAlone.notAlone(nums, 1);
		int [] expected = {1, 3, 3, 2};
		assertArrayEquals(expected, result);
		
	}

}
