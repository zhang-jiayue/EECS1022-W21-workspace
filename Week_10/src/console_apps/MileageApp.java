package console_apps;

import java.util.Scanner;

public class MileageApp {
	/* Helper method for returning the corresponding index of a city*/
	
	public static final int CHICAGO = 0;
	public static final int BOSTON = 1;
	public static final int NEW_YORK = 2;
	public static final int ATLANTA = 3;
	public static final int MIAMI = 4;
	public static final int DALLAS = 5;
	public static final int HOUSTON = 6;
	
	public static int indexOf(String city) {
		int index = -1;
		
		if(city.equals("Chicago")) {
			index = MileageApp.CHICAGO;
		}
		else if(city.equals("Boston")) {
			index = MileageApp.BOSTON;
		}
		else if(city.equals("New York")) {
			index = MileageApp.NEW_YORK;
		}
		else if(city.equals("Atlanta")) {
			index = MileageApp.ATLANTA;
		}
		else if(city.equals("Miami")) {
			index = MileageApp.MIAMI;
		}
		else if(city.equals("Dallas")) {
			index = MileageApp.DALLAS;
		}
		else if(city.equals("Houston")) {
			index = MileageApp.HOUSTON;
		}
		
		return index;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] fromChicago = {0   , 983 , 787 , 714 , 1375, 967 , 1087}; 
		int[] fromBoston  = {983 , 0   , 214 , 1102, 1763, 1723, 1842};
		int[] fromNewYork = {787 , 214 , 0   , 888 , 1549, 1548, 1627};
		int[] fromAtlanta = {714 , 1102, 888 , 0   , 661 , 781 , 810};
		int[] fromMiami   = {1375, 1763, 1549, 661 , 0   , 1426, 1187};
		int[] fromDallas  = {967 , 1723, 1548, 781 , 1426, 0   , 239};
		int[] fromHouston = {1087, 1842, 1627, 810 , 1187, 239 , 0};
		
		String[] cities = {"Chicago", "Boston", "New York", "Atlanta", "Miami", "Dallas", "Houston"};
		
		System.out.println("How many cities in your itinerary?");
		int howMany = input.nextInt();
		input.nextLine(); // consume the newline character so that later reading a string would be ok
		
		String[] trip = new String[howMany];
		
		/* Read cities from the user and store them to 'trip'*/
		
		for(int i = 0; i < howMany; i++) {
			System.out.println("Enter a city: ");
			trip[i] = input.nextLine();
		}
		
		int[] tripCode = new int[howMany];
		for(int i = 0; i < howMany; i++) {
			if(trip[i].equals("Chicago")) {
				tripCode[i] = 0;
			}
			else if(trip[i].equals("Boston")) {
				tripCode[i] = 1;
			}
			else if(trip[i].equals("New York")) {
				tripCode[i] = 2;
			}
			else if(trip[i].equals("Atlanta")) {
				tripCode[i] = 3;
			}
			else if(trip[i].equals("Miami")) {
				tripCode[i] = 4;
			}
			else if(trip[i].equals("Dallas")) {
				tripCode[i] = 5;
			}
			else if(trip[i].equals("Houston")) {
				tripCode[i] = 6;
			}
		}
		
		/* Add up departure-to-destination distances*/
		int dist = 0;
		for(int i = 0 ; i < howMany - 1; i++) {
			int dep = tripCode[i];
			int des = tripCode[i + 1];
			String depCity = cities[dep];
			String desCity = cities[des];
			int currentDist = 0;
			if(dep == 0) {
				currentDist = fromChicago[des];
			}
			else if(dep == 0) {
				currentDist = fromBoston[des];
			}
			else if(dep == 1) {
				currentDist = fromNewYork[des];
			}
			else if(dep == 2) {
				currentDist = fromAtlanta[des];
			}
			else if(dep == 3) {
				currentDist = fromMiami[des];
			}
			else if(dep == 4) {
				currentDist = fromDallas[des];
			}
			else if(dep == 5) {
				currentDist = fromHouston[des];
			}
			
			dist += currentDist;
			System.out.println("From " + depCity + " to " + desCity + ": " + currentDist);

		}
		
		System.out.println("Distance: " + dist);
		System.out.println("Bye!");
		
		input.close();

	}

}
