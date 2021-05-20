package model;

import java.util.ArrayList;

public class BirthdayBookV1 {
	private ArrayList<BirthdayBookEntry> imp;
	
	public BirthdayBookV1() {
		// no need to declare an integer counter to keep track of stored entries anymore
		imp = new ArrayList<>(); //initialize an empty ArrayList
	}
	
	
	/*
	 * Return the number of entries(each of which containing a name and a birthday) in the birthday book.
	 */
	public int getSize() {
		return imp.size();
	}
	
	/*
	 * return the birthday of the person whose name is 'name'
	 * If the input 'name' does not exist, return null
	 */
	public Birthday getBirthday(String name) {
		Birthday result = null;
		
		int index = this.indexOf(name); //helper method indexOf: if String name does not match names of every BBE, return -1
		if(index > -1) {
			result = this.imp.get(index).getBirthday();
		}
		
		return result;
	}
	
	
	/*
	 * Assumption: input'name' does not exist in the birthday book.
	 */
	public void addBirthday(String name, Birthday birthday) {
		this.imp.add(new BirthdayBookEntry(name, birthday));
	}
	
	
	/*
	 * Assumption: input'name' exists in the birthday book.
	 */
	public void removeBirthday(String name) {
		int index = this.indexOf(name);
		if(index >=0) {
			this.imp.remove(index);
		}
	}
	
	public String[] remind(Birthday birthday) {
		String[] temp = new String[this.imp.size()];
		int count = 0;
		for(int i = 0; i < this.imp.size(); i ++){
			Birthday bd = this.imp.get(i).getBirthday();
			if(bd.getMonth() == birthday.getMonth() && bd.getDay() == birthday.getDay()) {
				temp[count] = this.imp.get(i).getName();
				count ++;
			}
		}
		
		String[] result = new String[count];
		for(int i = 0; i < count; i ++) {
			result[i] = temp[i];
		}
		return result;
	}
	
	/*
	 * return the index of BirthdayBookEntry whose name
	 * matches the input 'name'
	 * Return -1 if the input name does not exit in the birthday book
	 */
	
	private int indexOf(String name) {
		int result = -1;
		
		for(int i = 0; i < this.imp.size(); i++) {
			BirthdayBookEntry e = this.imp.get(i); //a[i]
			if(e.getName().equals(name)) {
				result = i;
			}
		}
		
		return result;
	}
	
	
}
