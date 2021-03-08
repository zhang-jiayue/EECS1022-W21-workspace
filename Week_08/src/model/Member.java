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
	private final int MAX_NUMBERS_OF_FACILITIES = 6; //Assumption: each member can book for up to 6 facilities
	private Facility [] facilities; // stores the starting address of some array, 
	//where each index of the array stores the address of some Facility object
	private int nof; // number of facilities
	/*
	 * There are two purposes of 'nof' attribute:
	 * 1. Records how many facility object addresses  have been stored in 'facilities' array so far. 
	 * 2. Indicates the index into 'facilities' array for storing the next Facility object's address. 
	 */

	public double getPaymentDue() {
		//go over the facilities of the member, and add up the price * unit of each booked facility
		double paymentDue = 0.0;
		for(int i = 0; i < this.facilities.length; i++) {
			paymentDue += facilities[i].getPrice() * facilities[i].getUnits();
		}
		
		return paymentDue;
	}
	
 /*
  *  Constructors (create instances of the current class)
  */
  // without declaring any constructor explicitly, a default constructor is available.
	public Member() {// an explicitly default constructor
		this.facilities = new Facility[MAX_NUMBERS_OF_FACILITIES]; 
		this.nof = 0; // to help documentation
	}
	
	public Member(String name) {
		this(); // calling the constructor performing default actions, preferred
		this.name = name;
	}
	
	public Member (int id, char type, double balance) {
		this.facilities = new Facility[MAX_NUMBERS_OF_FACILITIES]; 
		this.nof = 0; // to help documentation 
		this.id = id; // LHS: this id denotes the attribute 'id', whereas RHS id denotes the input parameter 'id'.
		this.type = type;
		this.balance = balance;
	}
	
	public Member (String name, int id, char type, double balance) {
		// this(); you can only call a maximum one constructor as the first line.
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
	
	public int getNumberOfFacilities() {
		return this.nof;
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
	
	/* Add a new facility object to the end of the 'facilities' list */
	
	public void addFacility(Facility f) {
		this.facilities[this.nof] = f;
		this.nof ++;
	}
	
	/*
	 * overloaded methods: methods with same name,
	 * but distinguished by their distinct lists of parameter types.
	 */
	
	public void addFacility(String name, double price, int units) {
		Facility f = new Facility(name, price, units);
		this.addFacility(f);//TODO exercise trace
	}
	
	
	public void addUnits(Facility f, int units) {
		for(int i =0; i < facilities.length; i++) {
			if(facilities[i] == f) {
				facilities[i].addUnits(units);
			}
		}
	}
	
	
}
