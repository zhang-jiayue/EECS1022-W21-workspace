package model;

public class AllPositiveV1 {


	public static void main(String[] args) {
		int [] ns = {2, 3, 25, 4, -5};//{2, 3, -1, 4, 5};
		boolean allPos = true;
		for(int i = 0; allPos && i < ns.length; i++) {
			allPos = ns[i] > 0;
		}
		
		System.out.println("All elements in array are positive: " + allPos);
	}

}
