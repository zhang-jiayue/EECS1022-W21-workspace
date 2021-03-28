package exercise_rectangle;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestRectangle {

	@Test
	public void test() {
		Rectangle r1 = new Rectangle(4, 40);
		Rectangle r2 = new Rectangle(3.5, 35.9);
		assertTrue(r1.getArea() == 160.00);
		assertTrue(r2.getArea() == 125.65);
	}

}
