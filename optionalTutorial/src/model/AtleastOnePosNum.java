package model;

public class AtleastOnePosNum {

	public static void main(String[] args) {
		int [] ns = {-2, 3, -25, 4, -5};
		boolean onePos = false;
		for(int i = 0; i < ns.length; i++) {
			onePos = onePos || ns[i] > 0;
		}
		
		System.out.println("All elements in array are positive: " + onePos);
	}

}
