package model;

import java.util.Hashtable;

public class BirthdayBookV2 {
	
	private Hashtable<String, Birthday> imp;
	public BirthdayBookV2() {
		imp = new Hashtable<>();
	}
	
	
	/*
	 * Return the number of entries(each of which containing a name and a birthday) in the birthday book.
	 */
	public int getSize() {
		return this.imp.size();
	}
	
	/*
	 * return the birthday of the person whose name is 'name'
	 * If the input 'name' does not exist, return null
	 */
	public Birthday getBirthday(String name) {
		return this.imp.get(name);
	}
	
	
	/*
	 * Assumption: input'name' does not exist in the birthday book.
	 */
	public void addBirthday(String name, Birthday birthday) {
		this.imp.put(name, birthday);
	}
	
	
	/*
	 * Assumption: input'name' exists in the birthday book.
	 */
	public void removeBirthday(String name) {
		this.imp.remove(name);
	}
	
	public String[] remind(Birthday birthday) {
		String[] temp = new String[this.imp.size()];
		int count = 0;
		/*
		 * 
		 */
		for(String name : this.imp.keySet()){
			/*
			 * 
			 */
			Birthday bd = this.imp.get(name);
			if(bd.getMonth() == birthday.getMonth() && bd.getDay() == birthday.getDay()) {
				temp[count] = name;
				count ++;
			}
		}
		
		String[] result = new String[count];
		for(int i = 0; i < count; i ++) {
			result[i] = temp[i];
		}
		return result;
	}
	
	
}
