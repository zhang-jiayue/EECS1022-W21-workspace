package junit_tests;

import static org.junit.Assert.*;

import org.junit.Test;

import model.Utilities;

public class TestUtilities {
	
	/*
	 * Tests related to getBMIReport
	 */
	@Test
	public void test_getBMIReport_01() {
		String result = Utilities.getBMIReport('k', 40, 'f', 5.57);
		assertEquals("BMI is: 13.88 (Underweight)", result);
	}
	
	@Test
	public void test_getBMIReport_02() {
		String result = Utilities.getBMIReport('k', 70, 'i', 66.92);
		assertEquals("BMI is: 24.23 (Normal)", result);
	}
	
	@Test
	public void test_getBMIReport_03() {
		String result = Utilities.getBMIReport('p', 154.3, 'f', 5.13);
		assertEquals("BMI is: 28.63 (Overweight)", result);
	}
	
	@Test
	public void test_getBMIReport_04() {
		String result = Utilities.getBMIReport('p', 167.3, 'i', 60.92);
		assertEquals("BMI is: 31.69 (Obese)", result);
	}
	
	@Test
	public void test_getBMIReport_05a() {
		String result = Utilities.getBMIReport('q', -154.3, 'I', -66.92);
		assertEquals("Error: q is not a valid weight unit", result);
	}
	
	@Test
	public void test_getBMIReport_05b() {
		String result = Utilities.getBMIReport('p', -154.3, 'I', -66.92);
		assertEquals("Error: I is not a valid height unit", result);
	}
	
	@Test
	public void test_getBMIReport_05c() {
		String result = Utilities.getBMIReport('p', 154.3, 'i', -66.92);
		assertEquals("Error: both weight and height must be positive", result);
	} 
	
	/*
	 * Tests related to getTicketValue
	 */ 
	@Test
	public void test_getTicketValue_01() {
		String result = Utilities.getTicketValue(65,40,'M');
		assertEquals("In the morning, your speed was 25 over the limit then your ticket value is 400$", result);
	}
	
	@Test
	public void test_getTicketValue_02() {
		String result = Utilities.getTicketValue(50,40,'A');
		assertEquals("In the afternoon, your speed was 10 over the limit then your ticket value is 180$", result);
	}
	
	@Test
	public void test_getTicketValue_03() {
		String result = Utilities.getTicketValue(120,60,'E');
		assertEquals("In the evening, your speed was 60 over the limit then your ticket value is 1340$", result);
	}
	@Test
	public void test_getTicketValue_04() {
		String result = Utilities.getTicketValue(100,80,'M');
		assertEquals("In the morning, your speed was 20 over the limit then your ticket value is 400$", result);
	}
	
	@Test
	public void test_getTicketValue_05() {
		String result = Utilities.getTicketValue(150,100,'A');
		assertEquals("In the afternoon, your speed was 50 over the limit then your ticket value is 900$", result);
	}
	
	@Test
	public void test_getTicketValue_06() {
		String result = Utilities.getTicketValue(120,100,'E');
		assertEquals("In the evening, your speed was 20 over the limit then your ticket value is 790$", result);
	}
	
	/*
	 * Tests related to getCoffeeTime
	 */
	@Test
	public void test_getCoffeeTime_01() {
		String result = Utilities.getCoffeeTime('L','S',1);
		assertEquals("You ordered 1 cup of type light and size small, then your time is 0 minutes 40 seconds", result);
	}
	@Test
	public void test_getCoffeeTime_02() {
		String result = Utilities.getCoffeeTime('R','M',10);
		assertEquals("You ordered 10 cups of type regular and size medium, then your time is 13 minutes 20 seconds", result);
	}
	@Test
	public void test_getCoffeeTime_03() {
		String result = Utilities.getCoffeeTime('D','L',7);
		assertEquals("You ordered 7 cups of type dark and size large, then your time is 12 minutes 50 seconds", result);
	}
	
	@Test
	public void test_getCoffeeTime_04() {
		String result = Utilities.getCoffeeTime('D','S',1);
		assertEquals("You ordered 1 cup of type dark and size small, then your time is 1 minutes 20 seconds", result);
	}
	@Test
	public void test_getCoffeeTime_05() {
		String result = Utilities.getCoffeeTime('R','S',10);
		assertEquals("You ordered 10 cups of type regular and size small, then your time is 10 minutes 0 seconds", result);
	}
	@Test
	public void test_getCoffeeTime_06() {
		String result = Utilities.getCoffeeTime('D','s',17);
		assertEquals("You ordered 17 cups of type dark and size large, then your time is 31 minutes 10 seconds", result);
	}
	
}
