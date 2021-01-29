package model;

public class Utilities {
	/*
	 * Input parameters:
	 * 	- `status` is the filing status (which should be 1 for Single Filing or 2 for Married Filing)
	 *  - `income` is the tax payer's income (an integer value)
	 *  
	 * Assumptions:
	 * 	- `income` passed by user is always positive (> 0)
	 *  
	 * Refer to you lab instructions for what the method should return.
	 * 
	 * See this short tutorial video illustrating how to compute tax:
	 * https://www.youtube.com/watch?v=q2NT5x77hdg&list=PL5dxAmCmjv_7YgI2LgcwjWTHiNZSR-aQX&index=1 
	 */
	public static String getTaxReport(int status, int income) {
		String result = "";

		/* Your implementation of this method starts here. 
		 * Recall from Week 1's tutorial videos:
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, an explicit, final `return` statement is placed for you.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		//For a single filer
		if (status == 1) {
			if (income > 8350){
				double part1 = 8350 * 0.1;
					if (income > 33950) {
						double part2 = ( 33950 - 8350 ) * 0.15;
						double part3 = (income - 33950) * 0.25;
						double total = part1 + part2 + part3;
						result = String.format("Single Filing: $%.2f (Part I: $%.2f, Part II: $%.2f, Part III: $%.2f)", total, part1, part2, part3);
					}
					else {
						double part2 = (income - 8350) * 0.15;
						double total = part1 + part2;
						result = String.format("Single Filing: $%.2f (Part I: $%.2f, Part II: $%.2f)", total, part1, part2);
					}
				}

			else {
				double part1 = income * 0.1;
				result = String.format("Single Filing: $%.2f (Part I: $%.2f)", part1, part1);
			}
		}
		//For a married filer
		else if (status == 2) {
			if (income > 16700){
				double part1 = 16700 * 0.1;
					if (income > 67900) {
						double part2 = ( 67900 - 16700 ) * 0.15;
						double part3 = (income - 67900) * 0.25;
						double total = part1 + part2 + part3;
						result = String.format("Married Filing: $%.2f (Part I: $%.2f, Part II: $%.2f, Part III: $%.2f)", total, part1, part2, part3);
					}
					else {
						double part2 = (income - 16700) * 0.15;
						double total = part1 + part2;
						result = String.format("Married Filing: $%.2f (Part I: $%.2f, Part II: $%.2f)", total, part1, part2);
					}
				}

			else {
				double part1 = income * 0.1;
				result = String.format("Married Filing: $%.2f (Part I: $%.2f)", part1, part1);
			}
		}
			
		// Illegal status
		else {
			result = String.format("Illegal Status: %d", status);
		}
						

		/* Your implementation ends here. */

		return result;
	}
	
	/*
	 * Input parameters:
	 * 	- `p1` is the name of player 1
	 *  - `p2` is the name of player 2
	 *  - `p1r1` is what player 1 plays in round 1 ('R', 'P', or 'S')
	 *  - `p2r1` is what player 2 plays in round 1 ('R', 'P', or 'S')
	 *  - `p1r2` is what player 1 plays in round 2 ('R', 'P', or 'S')
	 *  - `p2r2` is what player 2 plays in round 2 ('R', 'P', or 'S')
	 *  
	 * Assumptions:
	 * 	- `p1r1`, `p2r1`, `p1r2`, or `p2r2` is one of the following characters:
	 *     'R' for rock, 'P' for paper, and 'S' scissors (case-sensitive)
	 *     
	 * Hints:
	 *  - Compare character values using the relational operator ==.
	 *  - Study the 9 test cases in TestUtilites: they are arranged in a systematic (yet not exhaustive) way.
	 *    Q. In order to exhaustively test this game, considering how two players may play in two rounds,
	 *    	 how many tests do we need? (Optionally, you may write extra test yourself as an exercise.)
	 *    
	 * Refer to you lab instructions for what the method should return.
	 */
	public static String getRPSGameReport(String p1, String p2, char p1r1, char p2r1, char p1r2, char p2r2) {
		String result = "";
		
		/* Your implementation of this method starts here. 
		 * Recall from Week 1's tutorial videos:
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, an explicit, final `return` statement is placed for you.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		
		// Round 1
		String w1 = "";
		char wr1 = ' ';
		char lr1 = ' ';
		
		// Tie
		if (p1r1 == p2r1) {
			w1 = "Tie";
			wr1 = p1r1;
			lr1 = p1r1;
		}
		
		// Player 1 wins
		else if (p1r1 == 'P' && p2r1 == 'R' || p1r1 == 'R' && p2r1 == 'S' || p1r1 == 'S' && p2r1 == 'P') {
			w1 = p1 + " wins";
			wr1 = p1r1;
			lr1 = p2r1;
		}
		
		// Player 2 wins
		else if (p2r1 == 'P' && p1r1 == 'R' || p1r1 == 'S' && p2r1 == 'R' || p1r1 == 'P' && p2r1 == 'S') {
			w1 = p2 + " wins";
			wr1 = p2r1;
			lr1 = p1r1;
		}
		
		//Round 2
		String w2 = "";
		char wr2 = ' ';
		char lr2 = ' ';
		// Tie
		if (p1r2 == p2r2) {
			w2 = "Tie";
			wr2 = p1r2;
			lr2 = p2r2;
		}
		
		//player 1 wins
		else if (p1r2 == 'P' && p2r2 == 'R' || p1r2 == 'R' && p2r2 == 'S' || p1r2 == 'S' && p2r2 == 'P') {
			w2 = p1 + " wins";
			wr2 = p1r2;
			lr2 = p2r2;
		}
		
		//player 2 wins
		else if (p2r2 == 'P' && p1r2 == 'R' || p1r2 == 'S' && p2r2 == 'R' || p1r1 == 'P' && p2r1 == 'S') {
			w2 = p2 + " wins";
			wr2 = p2r2;
			lr2 = p1r2;
		}
		
		//final winner
		String winner = "";
		if (w1.equals(w2)){
				winner = w2;
		}
		
		else if(!w1.equals(w2)) {
			if(w1 =="Tie"){winner = w2;}
			else if(w2 =="Tie"){winner = w1;}
			else {winner = "Tie";}
		}
	
		result = String.format("Game over: %s! [Round 1: %s (%c vs. %c) ; Round 2: %s (%c vs. %c)]", winner, w1, wr1, lr1, w2, wr2, lr2);
		/* Your implementation ends here. */

		return result;
	}
}