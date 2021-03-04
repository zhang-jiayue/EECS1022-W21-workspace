package model;
/*
 * A template for member object
 */
public class Member {
 /*
  *  Attributes (class-level variable; all methods can access them)
  */
	// private variables are only accessible within the current class.
	// for other classes to access these private variables, call a public accessor methods(encapsulation).
	private int id;
	private char type; //e.g., 's' for silver, 'b' for bronze(10% discount), 'g' for golden(15%).
	private double balance; //
	
	private String name;
	
	private double weight;
	private double height;
	
	/* Single-valued, reference type attribute */
	Trainer trainer; //Class capitalized, trainer variable stores a single Trainer object address
	
	/*Multi-valued, reference-typed attribute*/
	
	Facility [] facilities; // stores the starting address of some array, 
	//where each index of the array stores the address of some Facility object
	int nof; // number of facilities
	
	
	/*
	 * Exercise: #TODO after reading the written notes, 
	 */
	
	public double getPaymentDue() {
		//go over the facilities of the member, and add up the price * unit of each booked facility
		return -1;
	}
	
 /*
  *  Constructors (create instances of the current class)
  */
  // without declaring any constructor explicitly, a default constructor is available.
	public Member() {// an explicitly default constructor
		//do nothing 
	}
	
	public Member(String name) {
		this.name = name;
	}
	
	public Member (int id, char type, double balance) {
		this.id = id; // LHS: this id denotes the attribute 'id', whereas RHS id denotes the input parameter 'id'.
		this.type = type;
		this.balance = balance;
	}
	
	public Member (String name, int id, char type, double balance) {
		this(id, type, balance); // invoking a helper constructor: calling another constructor Member (int, char, double) 
		this.name = name;
	}
	
	//Assumptions: the weight is in kilograms and height in centimeters
	public Member(double weight, double height) {
		this.weight = weight;
		this.height = height;
	}
 /*
  * Accessor Methods (returning some useful information)
  */
	public double getWeight() {
		return this.weight;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	public String getBMIReport() {
		String result = "";
		
		double heightInMeters = this.height / 100;
		double bmi = this.weight / (heightInMeters * heightInMeters);
		
		String interpretation = "";
		if (bmi < 18.5) {
			interpretation = "Underweight";
		}
		else if (bmi < 25.0) {
			interpretation = "Normal";
		}
		else if (bmi < 30.0) {
			interpretation = "Overweight";
		}
		
		else if (bmi >= 0.0) {
			interpretation = "Obese";
		}
		
		result = interpretation +" (" + String.format("%.1f", bmi) + ")";
		
		return result;
	}
	
	
	public Trainer getTrainer(){/* return the address of some Trainer object */
		return this.trainer;
	}
	
 /*
  * Mutator Methods(not returning anything; modifying attributes)
  */
	// void - you are not allowed to put any return statements
	public void changeWeightBy(double units) {
		this.weight += units;
	}
	
	/* version where there is no clash between parameter t and attribute trainer
	 * therefore, this 'this' keyword is not necessary*/
//	public void registerTrainer(Trainer t) {
//		trainer = t;
//	}
	public void registerTrainer(Trainer trainer) { // variable shadowing
		this.trainer = trainer;
	}
	
	/* 
	 * refer input member 'm''s trainer to the context object. 
	 */
	public void referTrainer(Member m) {
		this.trainer = m.trainer;
	}
	
	
	/*
	 * Exercise: swap the trainer of two members
	 */
	
	public void swapTrainer(Member m) {
		// this .trainer should be m.trainer
		// m. trainer should become this.trainer
		//Write some test for this!
		Trainer swap = this.trainer;
		this.trainer = m.trainer;
		m.trainer = swap;
		
	}
}
