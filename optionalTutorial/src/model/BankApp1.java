package model;

import java.util.Scanner;

public class BankApp1 {

	public static void main(String[] args) {
		/*
		 * Problem:
		 * 1. prompt the user for an initial balance of their bank account.
		 * (0< balance <= 1000)
		 * 2. prompt the user for a transaction
		 * (transaction should be either "d" or "w"(case sensitive); otherwise it's invalid)
		 * 3. prompt the user for an amount
		 *     +( in both cases for transaction and withdraw, the amount should be > 0)
		 *     + in the case of withdraw: amount < balance
		 *     + in the case of deposit: balance + amount <= 1000
		 * 4. perform the transaction accordingly, and output the resulting balance to console.
		 * Note. as soon as an error occurs,  your app shoul print out an error right away, 
		 * 		and terminate the app.
		 */
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a balance (e.g., 200.45):");
		double balance = input.nextDouble();
		input.nextLine();

		if(0 < balance && balance <=1000) {
			/* valid initial balance */
			
		}
		else {
			System.out.println("Error: initial balance " + balance + "is not in (0, 1000].");
		}
		
		System.out.println("Enter a transaction type: \"d\" or \"w\":");
		String type = input.nextLine();
		if(type.equals("w") || type.equals("d")) {
			/* valid transaction type */
		}
		
		else {
			System.out.println("Error: transaction type " + type + "is neither d nor w.");
		}
		
		input.close();
		

	}

}
