package model;

public class Circle {
	/*
	 * Utility method: not requiring creating of objects in order to use them. 
	 */
	public static double getArea(double radius) {
		double area = 0.0;
		// Correct implementation
		area = 3.14 * radius * radius;
		// Wrong implementation
//		area = 2 * 3.14 * radius; 
		
		return area;
	}
}
