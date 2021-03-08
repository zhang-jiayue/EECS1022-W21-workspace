package model;

public class Participant {
	private String name;
	private Registration [] registration = new Registration[0];
	private int nor = 0; // number of registrations
	private final int MAX_OF_REGISTRATIONS = 5;
	
	public Participant(String name) {
		this.name = name;
	}
	
	public Registration [] getRegistrations() {
		return this.registration;
	}
	
	public String getGPAReport() {
		String report = "";
		if(this.registration.length != 0) {
			double avg = 0;
			report = String.format("%s's GPA of {", this.name);
			for(int i = 0; i < registration.length; i++) {
				report += String.format("%d (%s)", registration[i].getGradePoint(), registration[i].getGradeReport()[0]);
				avg += registration[i].getGradePoint();
				if(i < registration.length - 1) {
					report += ", ";
				}
			}
			avg = avg / registration.length;
			
			report += "}: " + String.format("%.1f", avg);


		}
		else{
			report = String.format("No GPA available yet for %s", this.name);

		}
		
		
		return report;
	}
	
	public int marksOf(String title) {
		int marks = -1;
		for(int i = 0; i < registration.length; i++) {
			if(registration[i].getTitle().equals(title)) {
				marks = registration[i].getMarks();
			}
		}
		
		return marks;
	}
	
	
	/*
	 * mutator methods
	 */
	
	public void addRegistration(Registration r) {
		if(this.nor < MAX_OF_REGISTRATIONS) {
			Registration [] newList= new Registration[this.nor + 1];
			for(int i = 0; i < this.registration.length; i++) {
				newList[i] = this.registration[i];
			}
			newList[this.nor] = r;
			this.registration = newList;
			this.nor ++;
		}

	}
	
	public void addRegistration(String title) {
		if(this.nor < MAX_OF_REGISTRATIONS) {
			Registration [] newList= new Registration[this.nor + 1];
			for(int i = 0; i < this.registration.length; i++) {
				newList[i] = this.registration[i];
			}
			newList[this.nor] = new Registration(title);
			this.registration = newList;
			this.nor ++;
		}
	}
	
	public void updateMarks(String title, int marks) {
		if(registration.length != 0) {
			for(int i = 0; i < registration.length; i++) {
				if(registration[i].getTitle().equals(title)) {
					registration[i].setMarks(marks);
				}
			}
		}

	}
	
	public void clearRegistrations() {
		this.registration = new Registration[0];
		this.nor = 0;
	}
}
