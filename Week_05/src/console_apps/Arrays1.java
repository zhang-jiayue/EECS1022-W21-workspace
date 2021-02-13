package console_apps;

public class Arrays1 {

	public static void main(String[] args) {
		int[] ns = {10, 20, 30}; //initializer expression
		System.out.println("Size of array ns" + ns.length);
		System.out.println("1st element: " + ns[0]);
		System.out.println("2nd element: " + ns[1]);
		System.out.println("3rd element: " + ns[2]);
		
		System.out.println("After changing the elements of the array");
		ns[0] = 23;
		ns[1] = 46;
		ns[2] = 69;

		System.out.println("Size of array ns" + ns.length);
		System.out.println("1st element: " + ns[0]);
		System.out.println("2nd element: " + ns[1]);
		System.out.println("3rd element: " + ns[2]);
		
	}

}
