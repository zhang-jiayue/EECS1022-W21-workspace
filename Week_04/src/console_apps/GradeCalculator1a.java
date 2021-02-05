package console_apps;

import java.util.Scanner;

/*
 * Calculate the weighted sum of 5 assignments, each may come with a different weight.
 */
public class GradeCalculator1a {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		/*Stage 1: Prompt user for inputs*/
		System.out.println("Enter your name:");
		String name = input.nextLine();
		/* prompt for assignment 1 */
		double weightedSum = 0.0;
		String report = "";
		for (int i = 1; i <=5; i++) {
			System.out.println(name + ", what is the weight of your Assignment " + i + "?");
			int weight = input.nextInt();
			System.out.println(name + ", what is the marks of your Assignment "+ i +"(out of 100)?");
			int marks= input.nextInt();
			report += "Assignment " + i + "[" + marks + "," + weight + "%]" + "\n";
			if (i <= 4) {
				report += "\n";
			}
			weightedSum = weightedSum + marks *(weight/ 100.0);
		}
		/* Stage 2: Do calculations */
		System.out.println(report);
		System.out.println("Weighted Sum: " + weightedSum);

		/* Stage 3: Output result */
		
		input.close();
	}

}
