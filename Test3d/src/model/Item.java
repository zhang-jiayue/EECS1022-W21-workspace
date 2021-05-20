package model;

public class Item {
	private String title;
	private int amount;
	private String info;
	
	public Item(String name) {
		this.title = name;
	}
	
	
	public String getTitle() {
		return this.title;
	}
	
	public int getAmount() {
		return this.amount;
	}
	

	public String getInfo() {
		return this.info;
	}
	
	public void updateInfo() {
		this.info = String.format("Item: %s (%d)", this.title, this.amount);
	}
	
	public void increaseAmount(int units) {
		if(units <= 0) {
			this.info = String.format("Error: non-positive amount %d", units);
		}
		else {
			this.amount += units;
			this.updateInfo();
		}
	}
	
	public void decreaseAmount(int units) {
		if(units <= 0) {
			this.info = String.format("Error: non-positive amount %d", units);
		}
		else if (this.amount >= units){
			this.amount -= units;
			this.updateInfo();
		}
		else {
			this.info = String.format("Error: amount is short of %d", units);
		}
	}
	
	
	
	

}
