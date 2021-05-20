package junit_tests;
import static org.junit.Assert.*;

import org.junit.Test;

import model.Planet;
import model.*;
public class TestPlanet {

	@Test
	public void test() {
        Planet p1 = new Planet(1.0, 1.0, 3.0, 4.0, 5.0, "jupiter.gif");
        Planet p2 = new Planet(2.0, 1.0, 3.0, 4.0, 4e11, "jupiter.gif");
        Planet p3 = new Planet(4.0, 5.0, 3.0, 4.0, 5.0, "jupiter.gif");
        double expected1 = p1.calcForceExertedBy(p2);
	    double expected2 = p1.calcForceExertedBy(p3);
	    
        assertEquals(expected1, 133.4, 0.01);
        assertEquals(expected2, 6.67e-11, 0.01);
	}
}
