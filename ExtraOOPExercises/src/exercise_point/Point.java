package exercise_point;

public class Point {
	private double x;
	private double y;
	public Point(char axis, double distance) {
		if(axis =='x'){
			x = distance;
		}
		else if(axis == 'y') {
			y = distance;
		}
		else {
			System.out.println("Error");
		}
		
	}
	
	public double getX() {
		return this.x;
	}
	
	public double getY() {
		return this.y;
	}
}
