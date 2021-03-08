package model;

public class Facility {
	private String name;
	private double price; //unit price
	private int units;
	
	public Facility(String name, double price, int units) {
		this.name  = name;
		this.price = price;
		this.units = units;
	}
	
	
	
	//accessor methods
	public double getPrice() {
		return this.price;
	}
	
	public int getUnits() {
		return this.units;
	}
	
	//mutator method
	public void addUnits(int units) {
		this.units += units;
	}
	
		
}
