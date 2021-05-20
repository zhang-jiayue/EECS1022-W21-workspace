package model;

public class Repository {
	private int moi;
	Item [] items;
	
	public Repository(int max) {
		this.moi = max;
		items = new Item [this.moi];
	}
	
	public int getAmount(String title) {
		int amount = -1;
		for(int i = 0; i < items.length;i++) {
			if(items[i].getTitle().equals(title)) {
				amount = items[i].getAmount();
			}
		}
		return amount;
		
	}
	
	public Item[] getItems() {
		int numOfItems = 0;
		for(int i = 0; i < this.moi; i ++) {
			if(items[i] != null) {
				numOfItems += 1;
			}
		}
		Item[] result = new Item[numOfItems];
		for(int i = 0; i < this.moi; i ++) {
			if(items[i] != null) {
				result[i] = items[i];
			}
		}
		
		return result;
	}
	
	public Item[] getItems(String[] titles) {
		int numOfItems = 0;
		for(int i = 0; i < this.moi; i ++) {
			for(int j = 0; j < titles.length; j++) {
				if(items[i] != null & items[i].getTitle().equals(titles[j])) {
					numOfItems += 1;
				}
			}
		}
		Item[] result = new Item[numOfItems];
		numOfItems = 0;
		for(int i = 0; i < this.moi; i ++) {
			for(int j = 0; j < titles.length; j++) {
				if(items[i] != null & items[i].getTitle().equals(titles[j])) {
					result[numOfItems] = items[i];
					numOfItems += 1;
				}
			}
		}
		
		return result;
	}
	
	public Item[] getItemsOutsideRange(int upper, int lower) {
		int numOfItemsOutsideRange = 0;
		
		for(int i = 0; i < items.length; i++) {
			if(items[i] != null & (items[i].getAmount() < lower || items[i].getAmount() > upper)) {
				numOfItemsOutsideRange += 1;
			}
		}
		
		Item [] result = new Item [numOfItemsOutsideRange];
		numOfItemsOutsideRange = 0;
		for(int i = 0; i < items.length; i++) {
			if(items[i] != null & (items[i].getAmount() < lower || items[i].getAmount() > upper)) {
				result[numOfItemsOutsideRange] = items[i];
				numOfItemsOutsideRange += 1;
			}
		}
		
		return result;
	}
	
	public void addItem(Item item) {
		
	}
}
