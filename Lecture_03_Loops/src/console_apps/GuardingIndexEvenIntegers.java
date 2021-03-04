package console_apps;
import java.util.Scanner;

public class GuardingIndexEvenIntegers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many integers?");
		int howMany = input.nextInt();
		int [] ns = new int [howMany];
		
		for(int i = 0; i < howMany; i++) {
			System.out.println("Enter an integer:");
			ns[i] = input.nextInt();
		}
		
		System.out.println("Enter an index:");
		int index = input.nextInt();
		
		if(index >= 0 && index < howMany && ns[index] % 2 ==0) {
			System.out.println( ns[index] + " at index " + index + " is even.");
		}
		else {
			//do nothing print out error message
		}
		
	}

}
