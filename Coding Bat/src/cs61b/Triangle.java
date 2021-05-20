package cs61b;

public class Triangle {

	public static void main(String[] args) {
		String printout = "";

		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < i + 1; j++) {
				printout += "*";
			}
			printout += "\n";
		}
		
		System.out.println(printout);
	}

}
