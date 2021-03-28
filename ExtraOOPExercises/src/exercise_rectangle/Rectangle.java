package exercise_rectangle;

public class Rectangle {
	double width;
	double height;
	
	public Rectangle() {
		this.width = 1;
		this.height = 1;
	}
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public double getArea() {
		double area = this.width * this.height;
		return area;
	}
	
	public double getPerimeter() {
		double perimeter = (this.width + this.height) * 2;	
		return perimeter;
	}
}
