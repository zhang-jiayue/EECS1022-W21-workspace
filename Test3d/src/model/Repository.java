package model;

public class Repository {
	int noi;
	Item [] items;
	
	public Repository(int num) {
		this.noi = num;
		items = new Item[this.noi];
	}

	public Item [] getItems() {
		int count = 0;
		for(int i = 0; i <this.items.length; i++) {
			if(this.items[i] != null) {
				count +=1;
			}
		}
		Item [] result = new Item[count];
		count = 0;
		for(int i = 0; i <this.items.length; i++) {
			if(this.items[i] != null) {
				result[count] = this.items[i];
				count += 1;
			}
		}

		return result;
	}
	
	public Item [] getItems(String [] titles) {
		int count = 0;
		Item[] result = new Item[0];
		if(items.length > 0 && titles.length > 0) {
			for(int j = 0; j < titles.length; j ++) {
				for(int i = 0; this.items[i] != null && i < this.items.length; i ++) {
					if(this.items[i].getTitle().equals(titles[j])) {
						count += 1;
					}
				}
			}

			result = new Item[count];
			count = 0;
			for(int j = 0; j < titles.length; j ++) {
				for(int i = 0; this.items[i] != null && i < this.items.length; i ++) {
					if(this.items[i].getTitle().equals(titles[j])) {
						result[count] = this.items[i];
						count += 1;
					}
				}
			}
		}
		return result;
	}
	
	public Item [] getItemsOutsideRange(int upper, int lower) {
		int count = 0;
		for(int i = 0; i < this.items.length; i ++) {
			if(this.items[i] != null && (this.items[i].getAmount() > upper || this.items[i].getAmount() < lower)) {
				count += 1;
			}
		}
		Item[] result = new Item[count];
		
		count = 0;
		for(int i = 0; i < this.items.length; i ++) {
			if(this.items[i] != null && (this.items[i].getAmount() > upper || this.items[i].getAmount() < lower)) {
				result[count] = this.items[i];
				count += 1;
				}
			}
				
		return result;
	}
	
	public int getAmount(String item) {
		int count = 0;
		int result = -1;
		for(int i = 0; i < this.items.length; i ++) {
			if(this.items[i] != null && this.items[i].getTitle().equals(item)){
				result = items[i].getAmount();
			}
		if(count > 0) {
			result = count;
			}
		
		}
		return result;
	}
	
	public void addItem(Item item) {
		Boolean inRepository = false;
		for (int i = 0; i < items.length; i++) {
			if(items[i] != null && items[i].getTitle().equals(item.getTitle())) {
				inRepository = true;
				items[i].increaseAmount(item.getAmount());
			}
			
		}
		if(!inRepository) {
			Boolean space = false;
			for(int i = 0; i< items.length; i++) {
				if(this.items[i] == null) {
					space = true;
				}
			}
			if(space) {
			int index = -1;
			for(int i = 0; index == -1 && i < this.items.length; i ++) {
				if(items[i] == null) {
					index = i;
				}
			}
			Item [] newList = new Item[this.items.length];
			for(int i = 0; i < index; i++) {
				newList[i] = this.items[i];
			}
			newList[index] = item;
			
			this.items = newList;
			}

		}

		
	}
	
	
	public void decreaseAmount(String title, int amount) {
		for (int i = 0; i < items.length; i++) {
			if(items[i] != null && items[i].getTitle().equals(title)) {
				items[i].decreaseAmount(amount);
			}
		}
	}
}
