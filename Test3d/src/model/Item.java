package model;

public class Item {
	String name;
	int amount;
	String info;
	
	public Item(String name) {
		this.name = name;
		this.info = String.format("Item: %s (%d)", this.name, this.amount);
	}
	
	public String getTitle() {
		return this.name;
	}
	
	public int getAmount() {
		return this.amount;
	}
	
	public String getInfo() {
		return this.info;
	}
	
	
	public void increaseAmount(int num) {
		if(num <= 0) {
			this.info = String.format("Error: non-positive amount %d", num);
		}
		else {
			this.amount += num;
			this.info = String.format("Item: %s (%d)", this.name, this.amount);
		}
	}
	
	public void decreaseAmount(int num) {
		if(num <= 0) {
			this.info = String.format("Error: non-positive amount %d", num);
		}
		else if(this.amount - num < 0) {
			this.info = String.format("Error: amount is short of %d", num - this.amount);
		}
		else {
			this.amount -= num;
			this.info = String.format("Item: %s (%d)", this.name, this.amount);
		}
	}
}
