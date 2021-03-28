package model;

public class Shop {
	Customer [] customer;
	int noc;
	//constructor
	public Shop() {
		customer = new Customer [0];
	}
	
	
	
	//accessor
	public Customer [] getCustomers() {
		return this.customer;
	}
	
	
	//mutator
	public void addCustomer(Customer customer) {
		this.noc += 1;
		Customer [] newList = new Customer[noc];
		int j = 0;
		for(int i = 0; i < this.noc - 1; i++) {
			newList[j] = this.customer[i];
			j ++;
		}
		newList[this.noc - 1] = customer;
		this.customer = newList;
	}
	
	public void pay(String name) {
		for(int i = 0; i < this.customer.length;i++) {
			if(this.customer[i].name.equals(name)) {
				double amount = this.customer[i].getAmountDue();
				customer[i].pay(amount);
				customer[i].clearRecords();
			}
		}
	}
}
