package model;

public class Customer {
	String name;
	double balance;
	Record [] record = new Record [0];
	int nor;
	
	//constructors
	public Customer(String name) {
		this.name = name;
	}
	public Customer(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}
	
	//accessors
	public String getName() {
		return this.name;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public Record [] getRecords() {
		return record;
	}
	
	public double getAmountDue() {
		double amount = 0.0;
		for(int i = 0; i < record.length; i ++) {
			amount += record[i].price * record[i].units;
		}
		return amount;
	}
	
	public Record[] getRecordsLargerThan(int total){
		int count = 0;
		Record [] rs = new Record[nor]; 
		for(int i = 0; i < this.nor; i++) {
			if (record[i].price * record[i].units > total){
				rs[count] = record[i];
				count += 1;
				}
			}
		Record [] result = new Record[count]; 
		for(int i = 0; i < count; i++) {
			result[i] = rs[i];
		}
		
		return result;
		
	}
	
	//mutators
	
	public void deposit(double deposit) {
		this.balance += deposit;
	}
	
	public void pay(double amount) {
		this.balance -= amount;
	}
	
	public void addRecord(Record order) {
		nor += 1;
		Record [] newRecord = new Record [nor];
		for(int i = 0; i < nor - 1; i ++) {
			newRecord[i] = record[i];
		}
		newRecord[nor - 1] = order;
		record = newRecord;
	}
	
	public void addRecord(String name, double price, int units) {
		nor += 1;
		Record [] newRecord = new Record [nor];
		for(int i = 0; i < nor - 1; i ++) {
			newRecord[i] = record[i];
		}
		newRecord[nor - 1] = new Record(name, price, units);
		record = newRecord;
	}
	
	public void addRecords(Record [] newOrders) {
		nor += newOrders.length;
		Record [] newRecord = new Record [nor];
		for(int i = 0; i < record.length; i ++) {
			newRecord[i] = record[i];
		}
		if(newOrders.length > 0) {
			int j = 0;
			for(int i = record.length; i < nor; i ++) {
				newRecord[i] = newOrders[j];
				j ++;
			}

		}
		record = newRecord;
	}
	
	public void clearRecords() {
		this.record = new Record[0];
	}
}
