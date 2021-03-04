package junit_tests;

import static org.junit.Assert.*;

import org.junit.Test;

import model.Member;

public class TestMember {

	@Test
	public void test_Member_01() {
		Member member1 = new Member(); //default constructor
		Member member2 = new Member();
		//assertEquals(false, member1 == member2);
		assertFalse(member1 == member2);

	}
	
	@Test
	public void test_Member_02() {
		Member member1 = new Member(); //default constructor
		Member member2 = new Member();
		//assertEquals(true, member1 != member2);
		assertTrue(member1 != member2);
	}
	
	@Test
	public void test_Member_03() {
		Member suyeon = new Member(12345, 's', 100.0); //customized constructor
		Member yuna = new Member(12346, 'b', 200.0);
		Member  jihye = new Member("Jihye", 123598, 'g', 300.0);
		assertFalse(suyeon == yuna);
		assertFalse(suyeon == jihye);
		assertFalse(jihye == yuna);

	}
	
	@Test
	public void test_Member_04() {
		Member alan = new Member(85, 175); // constructor
		Member mark = new Member(101, 181);
		//initial measures
		assertEquals(85, alan.getWeight(), 0.1);
		assertEquals(101, mark.getWeight(), 0.1);
		assertEquals("Overweight (27.8)", alan.getBMIReport());
		assertEquals("Obese (30.8)", mark.getBMIReport() );
		
		//Change measures
		alan.changeWeightBy(-13);
		mark.changeWeightBy(-13);
		assertEquals("Normal (23.5)", alan.getBMIReport()); // alan is context object(c.o.); the dot after alan (alan.) is a dereferencing operator
		assertEquals("Overweight (26.9)", mark.getBMIReport());

	}

}
