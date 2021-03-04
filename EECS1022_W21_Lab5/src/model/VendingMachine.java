package model;

public class VendingMachine {
	/* attributes */
	private String status = "Empty VM Started";
	private int coke = 0;
	private int orangeJuice = 0;
	private int kitkat = 0;
	private int chips  = 0;
	
	/* constructor */
	public VendingMachine() {
		
	}
	
	/* accessor methods */
	public String checkStock() {
		String  stockInfo = "";
		stockInfo = String.format("Stock: Coke (%d), Orange Juice (%d), Kitkat Chunky Bar (%d), Lay's Classic Chips (%d)", this.coke, this.orangeJuice, this.kitkat, this.chips);
		
		
		return stockInfo;
	}
	
	public String checkStatus() {
		String  statusInfo = "";
		statusInfo = this.status;
		
		
		return statusInfo;
	}
	public String checkStock(String product){
		String result = "";
		if (product == "Coke" ) {
			int stock = this.coke;
			result = product + " (" + stock + ")";
		}
		else if (product == "Lay's Classic Chips") {
			int stock = this.chips;
			result = product + " (" + stock + ")";
			}
		else if (product == "Kitkat Chunky Bar") {
			int stock = this.kitkat;
			result = product + " (" + stock + ")";
		}
		else if (product == "Orange Juice") {
			int stock = this.orangeJuice;
			result = product + " (" + stock + ")";
		}	
		else {
			result = "Invalid product: " + product;
		}
		return result;

	}
	/* mutator methods */

	public void dispense(String product, int units) {
		if (product == "Lay's Classic Chips") {
			this.chips -= units; 
			this.status = "Product removed: Lay's Classic Chips (" + units+ ")";
			}
		else if (product == "Kitkat Chunky Bar" ) {
			this.kitkat -= units;
			this.status = "Product removed: Kitkat Chunky Bar (" + units+ ")";

			}
		else if (product == "Orange Juice") {
			this.orangeJuice -= units;
			this.status = "Product removed: Orange Juice (" + units+ ")";

			}
		else if (product == "Coke" ) {
			this.coke -= units;
			this.status = "Product removed: Coke (" + units+ ")";

		}
		else {
			this.status = "Invalid product: " + product;
			}
	}
	
	public void add(String product, int units) {
		if (product == "Lay's Classic Chips") {
			this.chips += units; 
			this.status = "Product added: Lay's Classic Chips (" + units+ ")";
			}
		else if (product == "Kitkat Chunky Bar" ) {
			this.kitkat += units;
			this.status = "Product added: Kitkat Chunky Bar (" + units+ ")";

			}
		else if (product == "Orange Juice") {
			this.orangeJuice += units;
			this.status = "Product added: Orange Juice (" + units+ ")";

			}
		else if (product == "Coke" ) {
			this.coke += units;
			this.status = "Product added: Coke (" + units+ ")";

		}
		else {
			this.status = "Invalid product: " + product;
			}
	}
}