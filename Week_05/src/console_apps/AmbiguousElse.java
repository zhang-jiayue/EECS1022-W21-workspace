package console_apps;

import java.util.Scanner;

public class AmbiguousElse {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter x");
		int x = input.nextInt();
		if (x >= 0)
			if (x > 100) {
				System.out.println("x is larger than 100");
			}
		else {
			System.out.println("x is negative");
		}
		input.close();
	}

}
