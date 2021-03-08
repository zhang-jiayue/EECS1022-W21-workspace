package model;

public class Registration {
	private String title;
	private int mark;
	private Instructor instructor;
	
	public Registration(String title) {
		this.title = title;
	}
	
	public Registration(String title, Instructor i) {
		this.title = title;
		this.instructor = i;
	}
	
	
	
	public String getTitle() {
		return this.title;
	}
	
	public int getMarks() {
		return this.mark;
	}
	

	
	public Instructor getInstructor() {
		return this.instructor;
	}
	
	public String[] getGradeReport() {
		String [] report = new String [2];
		if(this.mark >= 90 && this.mark <= 100) {
			report[0] = "A+";
			report[1] = "Exceptional";
		}
		else if(this.mark >= 80 && this.mark <= 89) {
			report[0] = "A";
			report[1] = "Excellent";
		}
		else if(this.mark >= 70 && this.mark <= 79) {
			report[0] = "B";
			report[1] = "Good";
		}
		else if(this.mark >= 60 && this.mark <= 69) {
			report[0] = "C";
			report[1] = "Competent";
		}
		else if(this.mark >= 50 && this.mark <= 59) {
			report[0] = "D";
			report[1] = "Passing";
		}
		else if(this.mark >= 0 && this.mark <= 49) {
			report[0] = "F";
			report[1] = "Failing";
		}
		return report;
	}
	
	public String getInformation() {
		String info = "";
		if(this.instructor == null) {
			info = String.format("%s has not yet been assigned an instructor", this.title);
		}
		else {
			info = String.format("%s, taught by %s, is completed with raw marks %d (%s ; %s)",
					this.title, this.instructor.getName(),this.mark, this.getGradeReport()[0], this.getGradeReport()[1]);
		}
		return info;

	}
	
	public int getGradePoint() {
		int gradePoint = 0;
		if(this.mark >= 90 && this.mark <= 100) {
			gradePoint = 9;
		}
		else if(this.mark >= 80 && this.mark <= 89) {
			gradePoint = 8;

		}
		else if(this.mark >= 70 && this.mark <= 79) {
			gradePoint = 7;

		}
		else if(this.mark >= 60 && this.mark <= 69) {
			gradePoint = 6;

		}
		else if(this.mark >= 50 && this.mark <= 59) {
			gradePoint = 5;

		}
		else if(this.mark >= 0 && this.mark <= 49) {
			gradePoint = 0;

		}
		return gradePoint;
	}
	
	/*
	 * Mutators
	 */
	
	public void setInstructor(Instructor name) {
		this.instructor = name;
	}
	
	public void setMarks(int marks) {
		this.mark = marks;
	}
}
