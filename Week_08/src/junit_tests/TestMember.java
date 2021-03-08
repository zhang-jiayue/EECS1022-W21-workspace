package junit_tests;

import static org.junit.Assert.*;

import org.junit.Test;

import model.Facility;
import model.Member;

public class TestMember {

	@Test
	public void test_1a() {
		Facility f1 = new Facility("Spinning class", 2.5, 1);
		Facility f2 = new Facility("Gym", 2.0, 2);
		Facility f3 = new Facility("Locker", 1.5, 3);
		
		Member heeyeon = new Member("Heeyeon");
		assertEquals(0, heeyeon.getNumberOfFacilities());
		heeyeon.addFacility(f1);
		assertEquals(1, heeyeon.getNumberOfFacilities());
		heeyeon.addFacility(f2);
		assertEquals(2, heeyeon.getNumberOfFacilities());
		heeyeon.addFacility(f3);
		assertEquals(3, heeyeon.getNumberOfFacilities());

		
		
	}
	
	
	@Test
	public void test_1b() {
//		Facility f1 = new Facility("Spinning class", 2.5, 1);
//		Facility f2 = new Facility("Gym", 2.0, 2);
//		Facility f3 = new Facility("Locker", 1.5, 3);
		
		Member heeyeon = new Member("Heeyeon");
		assertEquals(0, heeyeon.getNumberOfFacilities());
		/* 
		 * Passing the address of an object being created on the fly
		 * (without first storing its address in a variable)
		 * 
		 */
		heeyeon.addFacility(new Facility("Spinning class", 2.5, 1));
		assertEquals(1, heeyeon.getNumberOfFacilities());
		heeyeon.addFacility(new Facility("Gym", 2.0, 2));
		assertEquals(2, heeyeon.getNumberOfFacilities());
		heeyeon.addFacility(new Facility("Locker", 1.5, 3));
		assertEquals(3, heeyeon.getNumberOfFacilities());
		//cons of anonymous objects: we can not use variable such as f1, f2, f3 to refer to the objects
		// instead, we need to get access to the underlying private 'facilities' array.
		// heeyeon.facilities is invalid because facilities is private and invisible.
		
		
//		assertEquals(11.0, heeyeon.getPaymentDue());
		
		
	}

	
	@Test
	public void test_1c() {
//		Facility f1 = new Facility("Spinning class", 2.5, 1);
//		Facility f2 = new Facility("Gym", 2.0, 2);
//		Facility f3 = new Facility("Locker", 1.5, 3);
//		
		Member heeyeon = new Member("Heeyeon");
		assertEquals(0, heeyeon.getNumberOfFacilities());
		heeyeon.addFacility("Spinning class", 2.5, 1);/* overloaded version */
		assertEquals(1, heeyeon.getNumberOfFacilities());
		heeyeon.addFacility("Gym", 2.0, 2);
		assertEquals(2, heeyeon.getNumberOfFacilities());
		heeyeon.addFacility("Locker", 1.5, 3);
		assertEquals(3, heeyeon.getNumberOfFacilities());

		
		
	}
	
}
