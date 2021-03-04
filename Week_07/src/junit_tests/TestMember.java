package junit_tests;

import static org.junit.Assert.*;

import org.junit.Test;

import model.Member;
import model.Trainer;

public class TestMember {

	@Test
	public void test_aliasing_01a() {
		Member alan = new Member(85, 175); // constructor
		Member mark = new Member(101, 181);
		//initial measures
		assertEquals(85, alan.getWeight(), 0.1);
		assertEquals(101, mark.getWeight(), 0.1);
		assertEquals("Overweight (27.8)", alan.getBMIReport());
		assertEquals("Obese (30.8)", mark.getBMIReport() );
		
		//Change measures
		alan.changeWeightBy(-13);
		assertEquals("Normal (23.5)", alan.getBMIReport()); // alan is context object(c.o.); the dot after alan (alan.) is a dereferencing operator
		assertEquals("Obese (30.8)", mark.getBMIReport() ); // marks's BMI remains the same
	}
	
	@Test
	public void test_aliasing_01b() {
		Member alan = new Member(85, 175); // constructor
		Member mark = new Member(101, 181);
		//initial measures
		assertEquals(85, alan.getWeight(), 0.1);
		assertEquals(101, mark.getWeight(), 0.1);
		assertEquals("Overweight (27.8)", alan.getBMIReport());
		assertEquals("Obese (30.8)", mark.getBMIReport() );
		
		assertFalse(alan == mark);
		mark = alan;
		assertTrue(alan == mark);
		// the Member object mark now stores the same address as Member object alan, and point to the same object.
		// context objects of different names
		//names denoting the same c.o.
		//Change measures
		mark.changeWeightBy(-13);
		assertEquals("Normal (23.5)", alan.getBMIReport()); // alan is context object(c.o.); the dot after alan (alan.) is a dereferencing operator
		//assertEquals("Obese (30.8)", mark.getBMIReport() ); // marks's BMI remains the same
	}
	
	
	@Test
	public void test_aliasing_02() {
		Member alan = new Member(); // constructor
		Member mark = new Member();
		
		Member oldAlan = alan;
		Member oldMark = mark;
		
		
		//swap
		Member tom = alan;
		alan = mark;
		mark = tom;
		
		assertTrue(alan == oldMark);
		assertTrue(mark == oldAlan);

	}
	
	@Test
	public void test_Trainer_01() {
		Member alan = new Member("Alan"); // constructor
		Member mark = new Member("Mark");
		Member tom = new Member("Tom");
		assertTrue(alan.getTrainer() == null);
		assertNull(mark.getTrainer()); //equivalent to mark.getTrianer == null
		assertFalse(tom.getTrainer() != null);
		
		
		Trainer jared = new Trainer("Jared");
		Trainer jon = new Trainer("Jon");
		
		alan.registerTrainer(jared);
		mark.registerTrainer(jon);

		assertTrue(alan.getTrainer() != null && alan.getTrainer() == jared);
		assertTrue(mark.getTrainer() != null && mark.getTrainer() == jon  ); //equivalent to mark.getTrianer == null
		assertFalse(tom.getTrainer() != null);
		
		tom.referTrainer(mark);
		assertTrue(tom.getTrainer() != null & tom.getTrainer() == jon);
		
		tom.referTrainer(alan);
		assertTrue(tom.getTrainer() != null & tom.getTrainer() == jared);

		
	}	
	
	
	@Test
	public void test_swapTrainer_01() {
		Member alan = new Member("Alan"); // constructor
		Member mark = new Member("Mark");
		Member tom = new Member("Tom");
		assertTrue(alan.getTrainer() == null);
		assertNull(mark.getTrainer()); //equivalent to mark.getTrianer == null
		assertFalse(tom.getTrainer() != null);
		
		
		Trainer jared = new Trainer("Jared");
		Trainer jon = new Trainer("Jon");
		
		alan.registerTrainer(jared);
		mark.registerTrainer(jon);
		
		alan.swapTrainer(mark);
		assertTrue(alan.getTrainer() != null & alan.getTrainer() == jon);
		assertTrue(mark.getTrainer() != null & mark.getTrainer() == jared);

		
	}	
	

}
