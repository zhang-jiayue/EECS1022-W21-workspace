package console_apps;

public class TwoDimensionalArrayApp1 {

	public static void main(String[] args) {
		int[] list = {1, 2, 3, 4};
		
		int[][] list2a = {
			{1, 2, 3, 4}, 
			{5, 6, 7, 8}, 
			{1, 2, 3, 4},
			{1, 2, 3, 4}
		};
		
		int[] row1 = {1, 2, 3, 4};
		int[] row2 = {5, 6, 7, 8};
		int[] row3 = {1, 2, 3, 4};

		
		int[][] list2b = {
				row1,
				row2,
				row3
		};
		
		for(int r =0; r < list2a.length; r++) {
			System.out.print("Row " + r +": ");
			System.out.print("[");
				for(int c = 0; c < list2a[r].length; c++) {
					System.out.print(list2a[r][c]);
					if(c < list2a[r].length - 1) {
						System.out.print(", ");
					}
				}
				System.out.println("]");
		}
		
		
		
		
		
	}
		

}
