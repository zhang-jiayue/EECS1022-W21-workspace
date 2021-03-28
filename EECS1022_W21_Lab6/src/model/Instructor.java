package model;

public class Instructor {
	private String name;
	private int phone;
	private String email;
	
	public Instructor(String name, int phone, String email) {
		this.name = name;
		this.phone = phone;
		this.email = email;
	}
	
	//accssor methods

	public String getName() {
		return this.name;
	}
	
	public int getPhoneExtension() {
		return this.phone;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public String getInformation() {
		String info = String.format("Instructor %s has campus phone extension %d and contact email %s", this.name, this.phone, this.email);
		return info;
	}
	
	//mutator methods
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPhoneExtension(int phone){
		this.phone = phone;
	}
	
	public void setEmail(String mail) {
		this.email = mail;
	}
	
}
