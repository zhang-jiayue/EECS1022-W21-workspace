import java.util.Scanner;

public class CompoundLoop {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a radius value:");
		double radius = input.nextDouble();
		
		while (radius <= 0) {
			System.out.println("Enter a radius value:");
			double radius = input.nextDouble();
			System.out.println("Error: negative radius value.");
		}
		
		double area = radius * radius * 3.14; 
		input.close();
	}

}
