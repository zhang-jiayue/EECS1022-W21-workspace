package model;

public class Record {
	String name;
	double price;
	int units;
	//constructor
	public Record() {
		
	}
	public Record(String name, double price , int units){
		this.name = name;
		this.price = price;
		this.units = units;
	}
	
	//accessor
	public String getItem() {
		return this.name;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public int getQuantity() {
		return this.units;
	}
	
	//mutator
	public void setItem(String newName) {
		this.name = newName;
	}
	
	public void setPrice(double newPrice) {
		this.price = newPrice;
	}
	
	public void setQuantity(int newUnits) {
		this.units = newUnits;
	}
}
